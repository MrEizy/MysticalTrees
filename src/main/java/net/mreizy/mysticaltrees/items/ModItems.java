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
            () -> new Item(new Item.Properties().food(ModFoodProperties.COAL_ACORN)));



    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
