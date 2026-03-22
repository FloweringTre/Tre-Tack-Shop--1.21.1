package com.kyraltre.tretackshop;

import com.kyraltre.tretackshop.block.TackShopBlocks;
import com.kyraltre.tretackshop.item.AwardShopCreativeModTab;
import com.kyraltre.tretackshop.item.BlockShopCreativeModTab;
import com.kyraltre.tretackshop.item.TackShopCreativeModTab;
import com.kyraltre.tretackshop.registry.*;
import org.slf4j.Logger;

import com.mojang.logging.LogUtils;

import net.neoforged.bus.api.IEventBus;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.config.ModConfig;
import net.neoforged.fml.ModContainer;
import net.neoforged.fml.event.lifecycle.FMLCommonSetupEvent;
import net.neoforged.neoforge.common.NeoForge;
import net.neoforged.neoforge.event.BuildCreativeModeTabContentsEvent;
import net.neoforged.neoforge.event.server.ServerStartingEvent;
import net.minecraft.resources.ResourceLocation;

// The value here should match an entry in the META-INF/neoforge.mods.toml file
@Mod(TreTackShop.MOD_ID)
public class TreTackShop {
    // Define mod id in a common place for everything to reference
    public static final String MOD_ID = "tretackshop";
    // Directly reference a slf4j logger
    public static final Logger LOGGER = LogUtils.getLogger();

    public static ResourceLocation resloc(String name) {return ResourceLocation.fromNamespaceAndPath("tretackshop", name);}

    public static ResourceLocation swresloc(String name) {return ResourceLocation.fromNamespaceAndPath("swem", name);}

    // The constructor for the mod class is the first code that is run when your mod is loaded.
    // FML will recognize some parameter types like IEventBus or ModContainer and pass them in automatically.
    public TreTackShop(ModContainer container, IEventBus modBus) {  //IEventBus modEventBus, ModContainer modContainer
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();
//        ModLoadingContext.get().registerConfig(ModConfig.Type.COMMON, TackShopCommonConfigs.SPEC, "tretackshop-common.toml");
        TackShopCreativeModTab.init(modBus);
        AwardShopCreativeModTab.init(modBus);
        BlockShopCreativeModTab.init(modBus);

        TackShopBlocks.register(modBus);
        TackShopBlockRegistry.init(modBus);
        AwardShopBlockRegistry.init(modBus);
        TackShopItems.init(modBus);
        AwardShopItems.init(modBus);
        DecorShopItems.init(modBus);

        // Register the commonSetup method for modloading
        modEventBus.addListener(this::commonSetup);

        // Register ourselves for server and other game events we are interested in.
        // Note that this is necessary if and only if we want *this* class (ExampleMod) to respond directly to events.
        // Do not add this line if there are no @SubscribeEvent-annotated functions in this class, like onServerStarting() below.
        NeoForge.EVENT_BUS.register(this);

        // Register the item to a creative tab
        modEventBus.addListener(this::addCreative);

        // Register our mod's ModConfigSpec so that FML can create and load the config file for us
        //modContainer.registerConfig(ModConfig.Type.COMMON, Config.SPEC);
    }

    private void commonSetup(FMLCommonSetupEvent event) {
        // Some common setup code
        LOGGER.info("Tre says plant a tree <3");
        //LOGGER.info(14 + " Award Sets Loaded.");
    }

    // Add the example block item to the building blocks tab
    private void addCreative(BuildCreativeModeTabContentsEvent event) {
    }

    // You can use SubscribeEvent and let the Event Bus discover methods to call
    @SubscribeEvent
    public void onServerStarting(ServerStartingEvent event) {
        // Do something when the server starts
        LOGGER.info("Tre says make your world a rainbow of color");
    }
}
