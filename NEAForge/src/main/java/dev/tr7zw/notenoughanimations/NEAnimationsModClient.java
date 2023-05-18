package dev.tr7zw.notenoughanimations;

import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.ConfigScreenHandler;
import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, modid = NEAnimationsModForge.MOD_ID, value = Dist.CLIENT)
public class NEAnimationsModClient extends NEAnimationsLoader {
    public NEAnimationsModClient() {
        onEnable();
        ModLoadingContext.get().registerExtensionPoint(ConfigScreenHandler.ConfigScreenFactory.class, () -> new ConfigScreenHandler.ConfigScreenFactory((mc, screen) -> {
            return createConfigScreen(screen);
        }));
    }
}
