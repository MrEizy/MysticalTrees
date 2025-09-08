package net.mreizy.mysticaltrees.guis;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.mreizy.mysticaltrees.MysticalTrees;
import net.mreizy.mysticaltrees.blocks.ModBlocks;
import net.mreizy.mysticaltrees.items.ModItems;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TAB =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, MysticalTrees.MOD_ID);

    public static final Supplier<CreativeModeTab> ASCENSION_ITEMS_TAB = CREATIVE_MODE_TAB.register("mysticaltrees_main",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.COAL_RESIN.get()))
                    .title(Component.translatable("creativetab.mysticaltrees.root"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModBlocks.COAL_OAK_LOG);
                        output.accept(ModBlocks.COAL_OAK_WOOD);
                        output.accept(ModBlocks.COAL_OAK_LEAVES);
                        output.accept(ModBlocks.COAL_AMBER);
                        output.accept(ModBlocks.COAL_OAK_SAPLING);
                        output.accept(ModItems.COAL_RESIN);
                        output.accept(ModItems.COAL_ACORN);
                    }).build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TAB.register(eventBus);
    }
}
