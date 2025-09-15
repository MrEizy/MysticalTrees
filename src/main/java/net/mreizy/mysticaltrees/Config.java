package net.mreizy.mysticaltrees;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.fml.event.config.ModConfigEvent;
import net.neoforged.neoforge.common.ModConfigSpec;

@EventBusSubscriber(modid = MysticalTrees.MOD_ID, bus = EventBusSubscriber.Bus.MOD)
public class Config
{
    private static final ModConfigSpec.Builder BUILDER = new ModConfigSpec.Builder();

    private static final ModConfigSpec.BooleanValue USE_ETHER_MECHANICS = BUILDER
            .comment("Whether EtherSapling uses ether-based mechanics (true) or behaves like a normal sapling (false)")
            .define("useEtherMechanics", true);

    static final ModConfigSpec SPEC = BUILDER.build();

    private static boolean logDirtBlock;
    private static boolean useEtherMechanics;

    @SubscribeEvent
    static void onLoad(final ModConfigEvent event)
    {
        useEtherMechanics = USE_ETHER_MECHANICS.get();
    }

    public static boolean isLogDirtBlock()
    {
        return logDirtBlock;
    }

    public static boolean isUseEtherMechanics()
    {
        return useEtherMechanics;
    }

    private static boolean validateItemName(final Object obj)
    {
        return obj instanceof String itemName && BuiltInRegistries.ITEM.containsKey(ResourceLocation.parse(itemName));
    }
}