package net.mreizy.mysticaltrees.commands;

import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.arguments.DoubleArgumentType;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.Commands;
import net.minecraft.commands.arguments.EntityArgument;
import net.minecraft.core.BlockPos;
import net.minecraft.network.chat.Component;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.world.level.chunk.ChunkAccess;
import net.mreizy.mysticaltrees.ether.EtherData;
import net.mreizy.mysticaltrees.util.ModAttachments;

import java.math.BigDecimal;

public class EtherCommand {

    public static void register(CommandDispatcher<CommandSourceStack> dispatcher) {
        dispatcher.register(Commands.literal("ether")
                .requires(source -> source.hasPermission(2)) // OP level 2
                .then(Commands.literal("check")
                        .executes(EtherCommand::checkOwnEther)
                        .then(Commands.argument("target", EntityArgument.player())
                                .executes(EtherCommand::checkTargetEther)))
                .then(Commands.literal("add")
                        .then(Commands.argument("amount", DoubleArgumentType.doubleArg(0))
                                .executes(EtherCommand::addEther)))
                .then(Commands.literal("remove")
                        .then(Commands.argument("amount", DoubleArgumentType.doubleArg(0))
                                .executes(EtherCommand::removeEther)))
                .then(Commands.literal("set")
                        .then(Commands.argument("amount", DoubleArgumentType.doubleArg(0))
                                .executes(EtherCommand::setEther))));
    }

    private static int checkOwnEther(CommandContext<CommandSourceStack> context) throws CommandSyntaxException {
        ServerPlayer player = context.getSource().getPlayerOrException();
        return checkEtherAtPos(context, player, player.blockPosition());
    }

    private static int checkTargetEther(CommandContext<CommandSourceStack> context) throws CommandSyntaxException {
        ServerPlayer target = EntityArgument.getPlayer(context, "target");
        return checkEtherAtPos(context, target, target.blockPosition());
    }

    private static int checkEtherAtPos(CommandContext<CommandSourceStack> context, ServerPlayer player, BlockPos pos) {
        ChunkAccess chunk = player.level().getChunk(pos);
        EtherData data = chunk.getData(ModAttachments.CHUNK_ETHER_DATA);
        BigDecimal ether = data.getEther();

        context.getSource().sendSuccess(() ->
                        Component.literal("§bEther in chunk §7[" + chunk.getPos().x + ", " + chunk.getPos().z + "]§b: §a" + ether.toPlainString()),
                false);

        return 1;
    }

    private static int addEther(CommandContext<CommandSourceStack> context) throws CommandSyntaxException {
        double amount = DoubleArgumentType.getDouble(context, "amount");
        ServerPlayer player = context.getSource().getPlayerOrException();

        ChunkAccess chunk = player.level().getChunk(player.blockPosition());
        EtherData data = chunk.getData(ModAttachments.CHUNK_ETHER_DATA);

        BigDecimal current = data.getEther();
        data.setEther(current.add(BigDecimal.valueOf(amount)));
        chunk.setUnsaved(true);

        context.getSource().sendSuccess(() ->
                        Component.literal("§aAdded §e" + amount + " §aether to chunk. New total: §e" + data.getEther().toPlainString()),
                true);

        return 1;
    }

    private static int removeEther(CommandContext<CommandSourceStack> context) throws CommandSyntaxException {
        double amount = DoubleArgumentType.getDouble(context, "amount");
        ServerPlayer player = context.getSource().getPlayerOrException();

        ChunkAccess chunk = player.level().getChunk(player.blockPosition());
        EtherData data = chunk.getData(ModAttachments.CHUNK_ETHER_DATA);

        BigDecimal current = data.getEther();
        BigDecimal toRemove = BigDecimal.valueOf(amount);

        if (current.compareTo(toRemove) < 0) {
            context.getSource().sendFailure(
                    Component.literal("§cCannot remove " + amount + " ether. Only " + current.toPlainString() + " available."));
            return 0;
        }

        data.setEther(current.subtract(toRemove));
        chunk.setUnsaved(true);

        context.getSource().sendSuccess(() ->
                        Component.literal("§aRemoved §e" + amount + " §aether from chunk. Remaining: §e" + data.getEther().toPlainString()),
                true);

        return 1;
    }

    private static int setEther(CommandContext<CommandSourceStack> context) throws CommandSyntaxException {
        double amount = DoubleArgumentType.getDouble(context, "amount");
        ServerPlayer player = context.getSource().getPlayerOrException();

        ChunkAccess chunk = player.level().getChunk(player.blockPosition());
        EtherData data = chunk.getData(ModAttachments.CHUNK_ETHER_DATA);

        data.setEther(BigDecimal.valueOf(amount));
        chunk.setUnsaved(true);

        context.getSource().sendSuccess(() ->
                        Component.literal("§aSet chunk ether to §e" + amount),
                true);

        return 1;
    }
}
