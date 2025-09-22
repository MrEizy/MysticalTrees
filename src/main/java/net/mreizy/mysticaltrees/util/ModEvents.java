package net.mreizy.mysticaltrees.util;

import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.mreizy.mysticaltrees.items.custom.EmptyVialItem;
import net.mreizy.mysticaltrees.items.custom.KnifeItem;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.event.entity.player.AttackEntityEvent;

@EventBusSubscriber
public class ModEvents {

    @SubscribeEvent
    public static void onEntityAttack(AttackEntityEvent event) {
        Player player = event.getEntity();
        Entity target = event.getTarget();
        ItemStack mainHand = player.getMainHandItem();
        ItemStack offHand = player.getOffhandItem();

        // Check if player is holding knife in mainhand and empty vial in offhand
        if (mainHand.getItem() instanceof KnifeItem && offHand.getItem() instanceof EmptyVialItem) {
            if (target instanceof LivingEntity livingTarget) {
                // Prevent the event from canceling normal attack
                // The vial collection will be handled in hurtEnemy method
            }
        }
    }
}
