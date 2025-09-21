package net.mreizy.mysticaltrees;

import net.mreizy.mysticaltrees.blocks.ModBlockEntities;
import net.mreizy.mysticaltrees.blocks.entity.renderer.PedestalBlockEntityRenderer;
import net.mreizy.mysticaltrees.blocks.entity.renderer.SidePedestalBlockEntityRenderer;
import net.mreizy.mysticaltrees.screen.ModMenuTypes;
import net.mreizy.mysticaltrees.screen.custom.PedestalScreen;
import net.mreizy.mysticaltrees.screen.custom.SidePedestalScreen;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.fml.common.Mod;
import net.neoforged.neoforge.client.event.EntityRenderersEvent;
import net.neoforged.neoforge.client.event.RegisterMenuScreensEvent;

@Mod(value = MysticalTrees.MOD_ID, dist = Dist.CLIENT)
@EventBusSubscriber(modid = MysticalTrees.MOD_ID, value = Dist.CLIENT)
public class MysticalTreesClient {



    @SubscribeEvent
    public static void registerBER(EntityRenderersEvent.RegisterRenderers event) {
        event.registerBlockEntityRenderer(ModBlockEntities.MAIN_PEDESTAL_BE.get(), PedestalBlockEntityRenderer::new);
        event.registerBlockEntityRenderer(ModBlockEntities.SIDE_PEDESTAL_BE.get(), SidePedestalBlockEntityRenderer::new);
    }


    @SubscribeEvent
    public static void registerScreens(RegisterMenuScreensEvent event) {
        event.register(ModMenuTypes.PEDESTAL_MENU.get(), PedestalScreen::new);
        event.register(ModMenuTypes.SIDE_PEDESTAL_MENU.get(), SidePedestalScreen::new);
    }
}
