package net.mreizy.mysticaltrees.items;

import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.mreizy.mysticaltrees.MysticalTrees;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(MysticalTrees.MOD_ID);

    public static final DeferredItem<Item> COAL_RESIN = ITEMS.register("coal_resin",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> COAL_ACORN = ITEMS.register("coal_acorn",
            () -> new Item(new Item.Properties().food(ModFoodProperties.ACORNS)));
    public static final DeferredItem<Item> COPPER_RESIN = ITEMS.register("copper_resin",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> COPPER_ACORN = ITEMS.register("copper_acorn",
            () -> new Item(new Item.Properties().food(ModFoodProperties.ACORNS)));

    public static final DeferredItem<Item> IRON_RESIN = ITEMS.register("iron_resin",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> IRON_ACORN = ITEMS.register("iron_acorn",
            () -> new Item(new Item.Properties().food(ModFoodProperties.ACORNS)));
    public static final DeferredItem<Item> GOLD_RESIN = ITEMS.register("gold_resin",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> GOLD_ACORN = ITEMS.register("gold_acorn",
            () -> new Item(new Item.Properties().food(ModFoodProperties.ACORNS)));
    public static final DeferredItem<Item> DIAMOND_RESIN = ITEMS.register("diamond_resin",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> DIAMOND_ACORN = ITEMS.register("diamond_acorn",
            () -> new Item(new Item.Properties().food(ModFoodProperties.ACORNS)));
    public static final DeferredItem<Item> NETHERITE_RESIN = ITEMS.register("netherite_resin",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> NETHERITE_ACORN = ITEMS.register("netherite_acorn",
            () -> new Item(new Item.Properties().food(ModFoodProperties.ACORNS)));
    public static final DeferredItem<Item> EMERALD_RESIN = ITEMS.register("emerald_resin",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> EMERALD_ACORN = ITEMS.register("emerald_acorn",
            () -> new Item(new Item.Properties().food(ModFoodProperties.ACORNS)));
    public static final DeferredItem<Item> AMETHYST_RESIN = ITEMS.register("amethyst_resin",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> AMETHYST_ACORN = ITEMS.register("amethyst_acorn",
            () -> new Item(new Item.Properties().food(ModFoodProperties.ACORNS)));
    public static final DeferredItem<Item> LAPIS_RESIN = ITEMS.register("lapis_resin",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> LAPIS_ACORN = ITEMS.register("lapis_acorn",
            () -> new Item(new Item.Properties().food(ModFoodProperties.ACORNS)));
    public static final DeferredItem<Item> QUARTZ_RESIN = ITEMS.register("quartz_resin",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> QUARTZ_ACORN = ITEMS.register("quartz_acorn",
            () -> new Item(new Item.Properties().food(ModFoodProperties.ACORNS)));
    public static final DeferredItem<Item> REDSTONE_RESIN = ITEMS.register("redstone_resin",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> REDSTONE_ACORN = ITEMS.register("redstone_acorn",
            () -> new Item(new Item.Properties().food(ModFoodProperties.ACORNS)));



    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
