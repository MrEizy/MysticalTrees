package net.mreizy.mysticaltrees;

import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.event.config.ModConfigEvent;
import net.neoforged.neoforge.common.ModConfigSpec;

public class Config
{
    public static final ModConfigSpec.Builder BUILDER = new ModConfigSpec.Builder();
    public static ModConfigSpec SPEC;

    public static class Common
    {
        public static ModConfigSpec.BooleanValue USE_ETHER_MECHANICS;

        public Common(ModConfigSpec.Builder builder) {
            builder.push("EtherSaplingOptions");
            USE_ETHER_MECHANICS = builder
                    .comment("Whether Saplings uses Ether-Based mechanics (§2True§f) or behaves like a normal Saplings (§4False§f)")
                    .translation("mysticaltrees.config.useEtherMechanics")
                    .define("useEtherMechanics", true);
            builder.pop();
        }
    }

    static
    {
        new Common(BUILDER);
        SPEC = BUILDER.build();
    }

    private static boolean useEtherMechanics;

    @SubscribeEvent
    static void onLoad(final ModConfigEvent event)
    {
        useEtherMechanics = Common.USE_ETHER_MECHANICS.get();
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