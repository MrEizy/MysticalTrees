package net.mreizy.mysticaltrees.items.custom;

import net.minecraft.ChatFormatting;
import net.minecraft.core.component.DataComponents;
import net.minecraft.network.chat.Component;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;

import java.util.List;

// Blood Vial Item
public class BloodVialItem extends Item {
    public BloodVialItem(Properties properties) {
        super(properties);
    }

    public static void setBloodData(ItemStack bloodVial, LivingEntity entity) {
        // Store mob information using custom data component
        var customData = bloodVial.getOrDefault(DataComponents.CUSTOM_DATA, net.minecraft.world.item.component.CustomData.EMPTY);
        var tag = customData.copyTag();

        tag.putString("entity", entity.getType().getDescription().getString());
        tag.putString("entityId", entity.getType().toString());

        bloodVial.set(DataComponents.CUSTOM_DATA, net.minecraft.world.item.component.CustomData.of(tag));

        // Set custom name based on mob
        bloodVial.set(DataComponents.CUSTOM_NAME,
                Component.literal("Vial of " + entity.getType().getDescription().getString() + " Blood").withStyle(ChatFormatting.RESET));
    }

    public static String getEntityName(ItemStack bloodVial) {
        var customData = bloodVial.get(DataComponents.CUSTOM_DATA);
        if (customData == null) return "Unknown";

        var tag = customData.copyTag();
        return tag.contains("entity") ? tag.getString("entity") : "Unknown";
    }

    @Override
    public void appendHoverText(ItemStack stack, TooltipContext context, List<Component> tooltip, TooltipFlag flag) {
        super.appendHoverText(stack, context, tooltip, flag);

        String entityName = getEntityName(stack);
        tooltip.add(Component.literal("Contains " + entityName + " DNA").withStyle(ChatFormatting.DARK_RED));
        tooltip.add(Component.literal("Genetic sample collected successfully").withStyle(ChatFormatting.GRAY));
    }
}
