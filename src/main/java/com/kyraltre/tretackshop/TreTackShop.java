package com.kyraltre.tretackshop;

import com.kyraltre.tretackshop.compat.SwemBlockEntityCompat;
import com.kyraltre.tretackshop.compat.SwemWaterColorCompat;
import com.kyraltre.tretackshop.item.AwardShopCreativeModTab;
import com.kyraltre.tretackshop.item.TackShopCreativeModTab;
import com.kyraltre.tretackshop.registry.*;
//import com.kyraltre.tretackshop.compat.*;
import com.mojang.logging.LogUtils;
import net.minecraft.resources.ResourceLocation;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.neoforge.common.NeoForge;
import net.neoforged.neoforge.event.BuildCreativeModeTabContentsEvent;
import net.neoforged.neoforge.event.server.ServerStartingEvent;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.bus.api.SubscribeEvent;
//import net.neoforged.fml.ModList;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.event.lifecycle.FMLClientSetupEvent;
import net.neoforged.fml.event.lifecycle.FMLCommonSetupEvent;

import org.slf4j.Logger;
import net.minecraft.client.renderer.ItemBlockRenderTypes;
import net.minecraft.client.renderer.RenderType;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(TreTackShop.MOD_ID)
public class TreTackShop {
    public static final String MOD_ID = "tretackshop";
    public static final Logger LOGGER = LogUtils.getLogger();

    public static ResourceLocation resloc(String name) {
        return ResourceLocation.fromNamespaceAndPath(MOD_ID, name);
    }

    public static ResourceLocation swresloc(String name) {
        return ResourceLocation.fromNamespaceAndPath("swem", name);
    }

    public TreTackShop(IEventBus modEventBus) {
        TackShopCreativeModTab.init(modEventBus);
        AwardShopCreativeModTab.init(modEventBus);

        TackShopBlockRegistry.init(modEventBus);
        TackShopItems.init(modEventBus);
        AwardShopBlockRegistry.init(modEventBus);
        AwardShopItems.init(modEventBus);
        MissingMappingHandler.init();

        modEventBus.addListener(this::commonSetup);

        NeoForge.EVENT_BUS.register(this);
        modEventBus.addListener(this::addCreative);

//        if (ModList.get().isLoaded("ssedeco")) {
//            SSECCompat.init(modEventBus);
//        }
    }

    private void commonSetup(final FMLCommonSetupEvent event) {
        LOGGER.info("Tre says plant a tree <3");
        LOGGER.info(24 + " Award Sets Loaded.");
        SwemBlockEntityCompat.apply();
    }


    // Add the example block item to the building blocks tab
    private void addCreative(BuildCreativeModeTabContentsEvent event) {

    }

    // You can use SubscribeEvent and let the Event Bus discover methods to call
    @SubscribeEvent
    public void onServerStarting(ServerStartingEvent event) {

    }

}