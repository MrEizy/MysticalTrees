package net.mreizy.mysticaltrees.items.custom;

import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.mreizy.mysticaltrees.items.ModItems;

public class KnifeItem extends Item {
    public KnifeItem(Properties properties) {
        super(properties);
    }

    @Override
    public boolean hurtEnemy(ItemStack stack, LivingEntity target, LivingEntity attacker) {
        if (attacker instanceof Player player) {
            handleVialCollection(player, target);
        }
        return super.hurtEnemy(stack, target, attacker);
    }

    private void handleVialCollection(Player player, LivingEntity target) {
        ItemStack offhandItem = player.getOffhandItem();

        // Check if holding empty vial in offhand
        if (offhandItem.getItem() instanceof EmptyVialItem) {
            // Calculate new count (keep remaining empty vials)
            int remainingCount = offhandItem.getCount() - 1;

            // Create blood vial
            ItemStack bloodVial = new ItemStack(ModItems.VIAL_BLOOD.get());
            BloodVialItem.setBloodData(bloodVial, target);

            // Replace empty vial with blood vial
            if (remainingCount > 0) {
                // If multiple empty vials, keep the rest
                offhandItem.shrink(1);
                if (!player.getInventory().add(bloodVial)) {
                    player.drop(bloodVial, false);
                }
            } else {
                // If only one empty vial, replace it directly
                player.getInventory().setItem(player.getInventory().selected + 36, bloodVial); // Offhand slot
            }

            // Play sound effect
            player.level().playSound(null, player.getX(), player.getY(), player.getZ(),
                    SoundEvents.BOTTLE_FILL, SoundSource.PLAYERS, 1.0F, 1.0F);

            // Optional: Add cooldown to prevent spam
            player.getCooldowns().addCooldown(this, 10);
        }
    }
}