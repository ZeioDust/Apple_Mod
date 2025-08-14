package net.zeio.applemod;

import net.zeio.applemod.item.ModItems;
import org.slf4j.Logger;
import com.mojang.logging.LogUtils;
import net.minecraft.world.item.CreativeModeTabs;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.config.ModConfig;
import net.neoforged.fml.ModContainer;
import net.neoforged.neoforge.common.NeoForge;
import net.neoforged.neoforge.event.BuildCreativeModeTabContentsEvent;
import net.neoforged.neoforge.event.server.ServerStartingEvent;

@Mod(AppleMod.MOD_ID)
public class AppleMod {

    public static final String MOD_ID = "applemod";
    public static final Logger LOGGER = LogUtils.getLogger();
    public AppleMod(IEventBus modEventBus, ModContainer modContainer) {

        NeoForge.EVENT_BUS.register(this);
        ModItems.register(modEventBus);
        modEventBus.addListener(this::addCreative);
        modContainer.registerConfig(ModConfig.Type.COMMON, Config.SPEC);
    }

    private void addCreative(BuildCreativeModeTabContentsEvent event) {
        if (event.getTabKey() == CreativeModeTabs.FOOD_AND_DRINKS) {
            event.accept(ModItems.COAL_APPLE);
            event.accept(ModItems.IRON_APPLE);
            event.accept(ModItems.DIAMOND_APPLE);
            event.accept(ModItems.EMERALD_APPLE);
            event.accept(ModItems.WITHER_APPLE);
            event.accept(ModItems.NETHERITE_APPLE);
            event.accept(ModItems.CHARCOAL_APPLE);
            event.accept(ModItems.CORE_APPLE);
            event.accept(ModItems.GLOW_APPLE);
            event.accept(ModItems.HEART_APPLE);
            event.accept(ModItems.HEALING_APPLE);
            event.accept(ModItems.HUNGER_APPLE);
        }
    }

    @SubscribeEvent
    public void onServerStarting(ServerStartingEvent event) {
    }
}