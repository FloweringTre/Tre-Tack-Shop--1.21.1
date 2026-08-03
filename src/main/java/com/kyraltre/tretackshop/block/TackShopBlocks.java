package com.kyraltre.tretackshop.block;

import com.alaharranhonor.swem.block.ConeBase;
import com.kyraltre.tretackshop.TreTackShop;
import com.kyraltre.tretackshop.block.custom.*;
import com.kyraltre.tretackshop.registry.AwardShopItems;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.properties.*;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;

import java.util.function.Function;
import java.util.function.Supplier;

public class TackShopBlocks {
    //public static final DeferredRegister.Blocks REGISTRY = DeferredRegister.createBlocks("tretackshop");
    public static final DeferredRegister.Blocks BLOCKS =
            DeferredRegister.createBlocks(TreTackShop.MOD_ID);

//    public static final DeferredBlock<Block> CONE_1 = registerBlock("cone_1",
//            () -> new ConeBase());
//    public static final DeferredBlock<Block> CONE_2 = registerBlock("cone_2",
//            () -> new ConeBase());
//    public static final DeferredBlock<Block> CONE_3 = registerBlock("cone_3",
//            () -> new ConeBase());
//    public static final DeferredBlock<Block> CONE_4 = registerBlock("cone_4",
//            () -> new ConeBase());
//    public static final DeferredBlock<Block> CONE_5 = registerBlock("cone_5",
//            () -> new ConeBase());
//    public static final DeferredBlock<Block> CONE_6 = registerBlock("cone_6",
//            () -> new ConeBase());
//    public static final DeferredBlock<Block> CONE_7 = registerBlock("cone_7",
//            () -> new ConeBase());
//    public static final DeferredBlock<Block> CONE_8 = registerBlock("cone_8",
//            () -> new ConeBase());
//    public static final DeferredBlock<Block> CONE_9 = registerBlock("cone_9",
//            () -> new ConeBase());
//    public static final DeferredBlock<Block> CONE_10 = registerBlock("cone_10",
//            () -> new ConeBase());
//    public static final DeferredBlock<Block> CONE_11 = registerBlock("cone_11",
//            () -> new ConeBase());
//    public static final DeferredBlock<Block> CONE_12 = registerBlock("cone_12",
//            () -> new ConeBase());
//    public static final DeferredBlock<Block> CONE_13 = registerBlock("cone_13",
//            () -> new ConeBase());
//    public static final DeferredBlock<Block> CONE_14 = registerBlock("cone_14",
//            () -> new ConeBase());
//    public static final DeferredBlock<Block> CONE_MONARCH = registerBlock("cone_monarch",
//            () -> new ConeBase());
//    public static final DeferredBlock<Block> CONE_MORPHO = registerBlock("cone_morpho",
//            () -> new ConeBase());
    public static final DeferredBlock<ConeBase> CONE_RAINBOW = registerBlock("cone_rainbow",
            (properties -> new ConeBase()));

    public static final DeferredBlock<PumpkinTrophy> PUMPKIN_GRAND = registerBlock("pumpkin_grand",
            (properties -> new PumpkinTrophy(properties.strength(1.0F))));
    public static final DeferredBlock<PumpkinTrophy> PUMPKIN_RESERVE= registerBlock("pumpkin_reserve",
            (properties -> new PumpkinTrophy(properties.strength(1.0F))));

    public static final DeferredBlock<SnowflakeTrophy> SNOWFLAKE_GRAND = registerBlock("snowflake_grand",
            (properties -> new SnowflakeTrophy(properties.strength(1.0F))));
    public static final DeferredBlock<SnowflakeTrophy> SNOWFLAKE_RESERVE = registerBlock("snowflake_reserve",
            (properties -> new SnowflakeTrophy(properties.strength(1.0F))));

    public static final DeferredBlock<HeartTrophy> HEART_GRAND = registerBlock("heart_grand",
            (properties -> new HeartTrophy(properties.strength(1.0F))));
    public static final DeferredBlock<HeartTrophy> HEART_RESERVE = registerBlock("heart_reserve",
            (properties -> new HeartTrophy(properties.strength(1.0F))));

    public static final DeferredBlock<CloverTrophy> CLOVER_GRAND = registerBlock("clover_grand",
            (properties -> new CloverTrophy(properties.strength(1.0F))));
    public static final DeferredBlock<CloverTrophy> CLOVER_RESERVE = registerBlock("clover_reserve",
            (properties -> new CloverTrophy(properties.strength(1.0F))));

    public static final DeferredBlock<EggTrophy> EGG_TROPHY_THICK_1 = registerBlock("e_g_g_trophy_thick_1",
            (properties -> new EggTrophy(properties.strength(1.0F))));
    public static final DeferredBlock<EggTrophy> EGG_TROPHY_THICK_2 = registerBlock("e_g_g_trophy_thick_2",
            (properties -> new EggTrophy(properties.strength(1.0F))));
    public static final DeferredBlock<EggTrophy> EGG_TROPHY_THICK_3 = registerBlock("e_g_g_trophy_thick_3",
            (properties -> new EggTrophy(properties.strength(1.0F))));
    public static final DeferredBlock<EggTrophy> EGG_TROPHY_THIN_1 = registerBlock("e_g_g_trophy_thin_1",
            (properties -> new EggTrophy(properties.strength(1.0F))));
    public static final DeferredBlock<EggTrophy> EGG_TROPHY_THIN_2 = registerBlock("e_g_g_trophy_thin_2",
            (properties -> new EggTrophy(properties.strength(1.0F))));
    public static final DeferredBlock<EggTrophy> EGG_TROPHY_THIN_3 = registerBlock("e_g_g_trophy_thin_3",
            (properties -> new EggTrophy(properties.strength(1.0F))));
    public static final DeferredBlock<EggTrophy> EGG_TROPHY_CHEV_1 = registerBlock("e_g_g_trophy_chev_1",
            (properties -> new EggTrophy(properties.strength(1.0F))));
    public static final DeferredBlock<EggTrophy> EGG_TROPHY_CHEV_2 = registerBlock("e_g_g_trophy_chev_2",
            (properties -> new EggTrophy(properties.strength(1.0F))));
    public static final DeferredBlock<EggTrophy> EGG_TROPHY_CHEV_3 = registerBlock("e_g_g_trophy_chev_3",
            (properties -> new EggTrophy(properties.strength(1.0F))));


    private static <T extends Block> DeferredBlock<T> registerBlock(String name, Function<BlockBehaviour.Properties, T> function) {
        DeferredBlock<T> toReturn = BLOCKS.registerBlock(name, function);
        registerBlockItem(name, toReturn);
        return toReturn;
    }

    private static <T extends Block> void registerBlockItem(String name, DeferredBlock<T> block) {
        AwardShopItems.REGISTRY.registerItem(name, (properties) -> new BlockItem(block.get(), new Item.Properties()));
    }
    //private static <T extends Block> DeferredBlock<Item> registerBlockItem(String name, DeferredBlock<T> block) {
    //    return AwardShopItems.REGISTRY.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
    //}

    public static void register(IEventBus eventBus){
        BLOCKS.register(eventBus);
    }
}
