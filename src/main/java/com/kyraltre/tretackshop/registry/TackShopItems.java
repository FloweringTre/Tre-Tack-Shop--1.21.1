package com.kyraltre.tretackshop.registry;


import com.alaharranhonor.swem.ModRef;
import com.alaharranhonor.swem.community.RackType;
import com.alaharranhonor.swem.community.TackType;
import com.alaharranhonor.swem.community.content.tack.type.*;
import com.alaharranhonor.swem.item.tack.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.alaharranhonor.swem.tack.TackItemDefinition;
import com.alaharranhonor.swem.util.ColorUtil;
import net.minecraft.core.component.DataComponents;
import net.minecraft.world.item.DyeColor;
import net.minecraft.world.item.Item;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.component.ItemContainerContents;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredItem;
import software.bernie.geckolib.util.Color;

public class TackShopItems {
    public static final DeferredRegister.Items REGISTRY;

    static int [][] tretackcolors= { // A collection of RGB colors to reference for blanket racks
            { 236, 226, 226 }, // "tre and moon white" [0]
            //pastel tones [1] - [6]
            { 255, 202, 242 }, {255, 178, 177}, {255, 243, 173}, {188, 255, 188}, {162, 237, 255}, {201, 177, 255},
            // jewel tones [7] - [12]
            {143, 48, 116}, {136, 39, 50}, {221, 153, 52}, {43, 100, 93}, {19, 67, 133}, {72, 20, 58},
            // orange tones [13] - [14]
            {243, 162, 109}, {206, 114, 62},
            {34, 34, 34}, // "tre black" [15]
            {56, 29, 10}, // "tre coffee brown" [16]
            {189, 138, 89}, // "tre latte brown" [17]
            {254, 140, 3}, // "monarch yellow" [18]
            {16, 190, 234}, // "morpho blue" [19]
            {43, 39, 39}, // "moon black" [20]
            {67, 56, 50}, // "moon brown" [21]
            {166, 153, 145} // "moon beige" [22]
    };

/// ════════════════════════════════════ SINGLE ITEMS ════════════════════════════════════ ///
    public static final DeferredItem<Item> BUTTERFLY;
    public static final DeferredItem<Item> BUTTERFLY_MONARCH;
    public static final DeferredItem<Item> PAW_PRINT;
    public static final DeferredItem<Item> RAINBOW_INA_BOTTLE;

/// ════════════════════════════════════ ONE OFF TACK PIECES ════════════════════════════════════ ///
    public static final DeferredItem<TackItem> PELHAM_BRIDLE_BLACK;
    public static final DeferredItem<TackItem> PELHAM_BRIDLE_BROWN;
    public static final DeferredItem<TackItem> MOON_BRIDLE_DOUBLE;
    public static final DeferredItem<TackItem> MEDIEVAL_BRIDLE_BLACK;
    public static final DeferredItem<TackItem> MEDIEVAL_BRIDLE_BROWN;

    public static final DeferredItem<TackItem> BITLESS_BRIDLE;
    public static final DeferredItem<TackItem> BAREBACK_SADDLE_MOON;
    public static final DeferredItem<TackItem> BAREBACK_BLANKET;
    public static final DeferredItem<TackItem> BAREBACK_GIRTH_STRAP_MOON;
    public static final DeferredItem<TackItem> BITLESS_BRIDLE_BROWN;
    public static final DeferredItem<TackItem> BAREBACK_SADDLE_BROWN_MOON;
    public static final DeferredItem<TackItem> BAREBACK_GIRTH_STRAP_BROWN_MOON;
    public static final DeferredItem<TackItem> BITLESS_BRIDLE_BEIGE;
    public static final DeferredItem<TackItem> BAREBACK_SADDLE_BEIGE_MOON;
    public static final DeferredItem<TackItem> BAREBACK_GIRTH_STRAP_BEIGE_MOON;
    public static final DeferredItem<TackItem> BITLESS_BRIDLE_WHITE;
    public static final DeferredItem<TackItem> BAREBACK_SADDLE_BLACK_MOON;
    public static final DeferredItem<TackItem> BAREBACK_GIRTH_STRAP_WHITE_MOON;

    public static final DeferredItem<TackItem> DRESSAGE_SADDLE;
    public static final DeferredItem<TackItem> DRESSAGE_BLANKET;
    public static final DeferredItem<TackItem> DRESSAGE_GIRTH_STRAP;

    public static final DeferredItem<TackItem> RACING_SADDLE_BROWN;
    public static final DeferredItem<TackItem> RACING_SADDLE_BLACK;

    public static final DeferredItem<TackItem> HUNTER_BLANKET;

    public static final DeferredItem<TackItem> ADVENTURE_BRIDLE_TRANS;
    public static final DeferredItem<TackItem> ADVENTURE_SADDLE_TRANS;
    public static final DeferredItem<TackItem> ADVENTURE_BLANKET_TRANS;
    public static final DeferredItem<TackItem> ADVENTURE_GIRTH_STRAP_TRANS;
    public static final DeferredItem<TackItem> ADVENTURE_LEG_WRAPS_TRANS;
    public static final DeferredItem<TackItem> ADVENTURE_BREAST_COLLAR_TRANS;

/// ════════════════════════════════════ ONE OFF AWARD PIECES ════════════════════════════════════ ///
    public static final DeferredItem<Item> MEDAL_1;
    public static final DeferredItem<Item> MEDAL_2;
    public static final DeferredItem<Item> MEDAL_3;

    public static  final DeferredItem<Item> SIGN_COVER_GRAND;
    public static  final DeferredItem<Item> SIGN_COVER_RESERVE;

    public static  final DeferredItem<Item> RIBBON_THREE_TAILS_GRAND;
    public static  final DeferredItem<Item> RIBBON_THREE_TAILS_RESERVE;

    public static final DeferredItem<Item> FIRST_RIBBON_THREE_TAILS;
    public static final DeferredItem<Item> FIRST_RIBBON_TWO_TAILS;
    public static final DeferredItem<Item> FIRST_RIBBON_ONE_TAIL;
    public static final DeferredItem<Item> FIRST_ROSETTE;
    public static final DeferredItem<Item> SECOND_RIBBON_THREE_TAILS;
    public static final DeferredItem<Item> SECOND_RIBBON_TWO_TAILS;
    public static final DeferredItem<Item> SECOND_RIBBON_ONE_TAIL;
    public static final DeferredItem<Item> SECOND_ROSETTE;
    public static final DeferredItem<Item> THIRD_RIBBON_THREE_TAILS;
    public static final DeferredItem<Item> THIRD_RIBBON_TWO_TAILS;
    public static final DeferredItem<Item> THIRD_RIBBON_ONE_TAIL;
    public static final DeferredItem<Item> THIRD_ROSETTE;

    public static  final DeferredItem<Item> SIGN_COVER_HEART_RED;
    public static  final DeferredItem<Item> SIGN_COVER_HEART_PINK;
    public static  final DeferredItem<Item> SIGN_COVER_HEART_BLUE;
    public static  final DeferredItem<Item> SIGN_COVER_SNOWFLAKE;

/// ════════════════════════════════════ MORPHO ════════════════════════════════════ ///
    public static final DeferredItem<Item> FLAG_MORPHO;

    public static  final DeferredItem<Item> SIGN_COVER_MORPHO;
    public static final DeferredItem<Item> RILEY_SIGN_COVER_MORPHO;
    public static final DeferredItem<Item> FABRIC_SIGN_COVER_MORPHO;

    public static final DeferredItem<Item> MORPHO_RIBBON_THREE_TAILS;
    public static final DeferredItem<Item> MORPHO_RIBBON_TWO_TAILS;
    public static final DeferredItem<Item> MORPHO_RIBBON_ONE_TAIL;
    public static final DeferredItem<Item> MORPHO_ROSETTE;

    public static final DeferredItem<TackItem> HALTER_MORPHO;
    public static final DeferredItem<TackItem> FLYMASK_MORPHO;
    public static final DeferredItem<TackItem> PASTURE_BLANKET_MORPHO;
    public static final DeferredItem<TackItem> ADVENTURE_SADDLE_MORPHO;
    public static final DeferredItem<TackItem> ADVENTURE_BRIDLE_MORPHO;
    public static final DeferredItem<TackItem> ADVENTURE_BREAST_COLLAR_MORPHO;
    public static final DeferredItem<TackItem> ADVENTURE_GIRTH_STRAP_MORPHO;
    public static final DeferredItem<TackItem> ADVENTURE_BLANKET_MORPHO;
    public static final DeferredItem<TackItem> ADVENTURE_LEG_WRAPS_MORPHO;
    public static final DeferredItem<TackItem> CLOTH_HORSE_ARMOR_MORPHO;
    public static final DeferredItem<TackItem> AMETHYST_HORSE_ARMOR_MORPHO;
    public static final DeferredItem<SaddlebagItem> SADDLE_BAG_MORPHO;
    public static final DeferredItem<TackItem> WESTERN_SADDLE_MORPHO;
    public static final DeferredItem<TackItem> WESTERN_BRIDLE_MORPHO;
    public static final DeferredItem<TackItem> WESTERN_BREAST_COLLAR_MORPHO;
    public static final DeferredItem<TackItem> WESTERN_GIRTH_STRAP_MORPHO;
    public static final DeferredItem<TackItem> WESTERN_BLANKET_MORPHO;
    public static final DeferredItem<TackItem> WESTERN_LEG_WRAPS_MORPHO;
    public static final DeferredItem<TackItem> ENGLISH_SADDLE_MORPHO;
    public static final DeferredItem<TackItem> ENGLISH_BRIDLE_MORPHO;
    public static final DeferredItem<TackItem> ENGLISH_BREAST_COLLAR_MORPHO;
    public static final DeferredItem<TackItem> ENGLISH_GIRTH_STRAP_MORPHO;
    public static final DeferredItem<TackItem> ENGLISH_BLANKET_MORPHO;
    public static final DeferredItem<TackItem> ENGLISH_LEG_WRAPS_MORPHO;
    public static final DeferredItem<TackItem> QUARTER_SHEET_MORPHO;
    public static final DeferredItem<TackItem> BAREBACK_SADDLE_MORPHO;
    public static final DeferredItem<TackItem> BITLESS_BRIDLE_MORPHO;
    public static final DeferredItem<TackItem> BAREBACK_GIRTH_STRAP_MORPHO;
    public static final DeferredItem<TackItem> BAREBACK_BLANKET_MORPHO;

/// ════════════════════════════════════ MONARCH ════════════════════════════════════ ///
    public static final DeferredItem<Item> FLAG_MONARCH;

    public static  final DeferredItem<Item> SIGN_COVER_MONARCH;
    public static final DeferredItem<Item> RILEY_SIGN_COVER_MONARCH;
    public static final DeferredItem<Item> FABRIC_SIGN_COVER_MONARCH;

    public static final DeferredItem<Item> MONARCH_RIBBON_THREE_TAILS;
    public static final DeferredItem<Item> MONARCH_RIBBON_TWO_TAILS;
    public static final DeferredItem<Item> MONARCH_RIBBON_ONE_TAIL;
    public static final DeferredItem<Item> MONARCH_ROSETTE;

    public static final DeferredItem<TackItem> HALTER_MONARCH;
    public static final DeferredItem<TackItem> FLYMASK_MONARCH;
    public static final DeferredItem<TackItem> PASTURE_BLANKET_MONARCH;
    public static final DeferredItem<TackItem> ADVENTURE_SADDLE_MONARCH;
    public static final DeferredItem<TackItem> ADVENTURE_BRIDLE_MONARCH;
    public static final DeferredItem<TackItem> ADVENTURE_BREAST_COLLAR_MONARCH;
    public static final DeferredItem<TackItem> ADVENTURE_GIRTH_STRAP_MONARCH;
    public static final DeferredItem<TackItem> ADVENTURE_BLANKET_MONARCH;
    public static final DeferredItem<TackItem> ADVENTURE_LEG_WRAPS_MONARCH;
    public static final DeferredItem<TackItem> CLOTH_HORSE_ARMOR_MONARCH;
    public static final DeferredItem<TackItem> AMETHYST_HORSE_ARMOR_MONARCH;
    public static final DeferredItem<SaddlebagItem> SADDLE_BAG_MONARCH;
    public static final DeferredItem<TackItem> WESTERN_SADDLE_MONARCH;
    public static final DeferredItem<TackItem> WESTERN_BRIDLE_MONARCH;
    public static final DeferredItem<TackItem> WESTERN_BREAST_COLLAR_MONARCH;
    public static final DeferredItem<TackItem> WESTERN_GIRTH_STRAP_MONARCH;
    public static final DeferredItem<TackItem> WESTERN_BLANKET_MONARCH;
    public static final DeferredItem<TackItem> WESTERN_LEG_WRAPS_MONARCH;
    public static final DeferredItem<TackItem> ENGLISH_SADDLE_MONARCH;
    public static final DeferredItem<TackItem> ENGLISH_BRIDLE_MONARCH;
    public static final DeferredItem<TackItem> ENGLISH_BREAST_COLLAR_MONARCH;
    public static final DeferredItem<TackItem> ENGLISH_GIRTH_STRAP_MONARCH;
    public static final DeferredItem<TackItem> ENGLISH_BLANKET_MONARCH;
    public static final DeferredItem<TackItem> ENGLISH_LEG_WRAPS_MONARCH;
    public static final DeferredItem<TackItem> QUARTER_SHEET_MONARCH;
    public static final DeferredItem<TackItem> BAREBACK_SADDLE_MONARCH;
    public static final DeferredItem<TackItem> BITLESS_BRIDLE_MONARCH;
    public static final DeferredItem<TackItem> BAREBACK_GIRTH_STRAP_MONARCH;
    public static final DeferredItem<TackItem> BAREBACK_BLANKET_MONARCH;

/// ════════════════════════════════════ RAINBOW ════════════════════════════════════ ///
    public static final DeferredItem<Item> FLAG_RAINBOW;

    public static final DeferredItem<Item> SIGN_COVER_RILEY_RAINBOW;
    public static final DeferredItem<Item> SIGN_COVER_FABRIC_RAINBOW;
    public static final DeferredItem<Item> SIGN_COVER_FLORAL_RAINBOW;
    public static final DeferredItem<Item> SIGN_COVER_SWIRL_RAINBOW;
    public static final DeferredItem<Item> SIGN_COVER_LOOPED_RAINBOW;
    public static final DeferredItem<Item> SIGN_COVER_CHECKERED_RAINBOW;

    public static final DeferredItem<Item> RAINBOW_RIBBON_THREE_TAILS;
    public static final DeferredItem<Item> RAINBOW_RIBBON_TWO_TAILS;
    public static final DeferredItem<Item> RAINBOW_RIBBON_ONE_TAIL;
    public static final DeferredItem<Item> RAINBOW_ROSETTE;

    public static final DeferredItem<TackItem> HALTER_RAINBOW;
    public static final DeferredItem<TackItem> FLYMASK_RAINBOW;
    public static final DeferredItem<TackItem> PASTURE_BLANKET_RAINBOW;
    public static final DeferredItem<TackItem> PASTURE_BLANKET_RAINBOW_ARMORED;
    public static final DeferredItem<TackItem> ADVENTURE_SADDLE_RAINBOW;
    public static final DeferredItem<TackItem> ADVENTURE_BRIDLE_RAINBOW;
    public static final DeferredItem<TackItem> ADVENTURE_BREAST_COLLAR_RAINBOW;
    public static final DeferredItem<TackItem> ADVENTURE_GIRTH_STRAP_RAINBOW;
    public static final DeferredItem<TackItem> ADVENTURE_BLANKET_RAINBOW;
    public static final DeferredItem<TackItem> ADVENTURE_LEG_WRAPS_RAINBOW;
    public static final DeferredItem<TackItem> IRON_HORSE_ARMOR_RAINBOW;
    public static final DeferredItem<TackItem> AMETHYST_HORSE_ARMOR_RAINBOW;
    public static final DeferredItem<SaddlebagItem> SADDLE_BAG_RAINBOW;
    public static final DeferredItem<TackItem> WESTERN_SADDLE_RAINBOW;
    public static final DeferredItem<TackItem> WESTERN_BRIDLE_RAINBOW;
    public static final DeferredItem<TackItem> WESTERN_BREAST_COLLAR_RAINBOW;
    public static final DeferredItem<TackItem> WESTERN_GIRTH_STRAP_RAINBOW;
    public static final DeferredItem<TackItem> WESTERN_BLANKET_RAINBOW;
    public static final DeferredItem<TackItem> WESTERN_LEG_WRAPS_RAINBOW;
    public static final DeferredItem<TackItem> ENGLISH_SADDLE_RAINBOW;
    public static final DeferredItem<TackItem> ENGLISH_BRIDLE_RAINBOW;
    public static final DeferredItem<TackItem> ENGLISH_BREAST_COLLAR_RAINBOW;
    public static final DeferredItem<TackItem> ENGLISH_GIRTH_STRAP_RAINBOW;
    public static final DeferredItem<TackItem> ENGLISH_BLANKET_RAINBOW;
    public static final DeferredItem<TackItem> ENGLISH_LEG_WRAPS_RAINBOW;
    public static final DeferredItem<TackItem> QUARTER_SHEET_BLACK_RAINBOW;
    public static final DeferredItem<TackItem> QUARTER_SHEET_WHITE_RAINBOW;
    public static final DeferredItem<TackItem> CLOTH_BITLESS_BRIDLE_RAINBOW;
    public static final DeferredItem<TackItem> BAREBACK_BLANKET_RAINBOW;


/// ════════════════════════════════════ HOUND ════════════════════════════════════ ///
    public static final DeferredItem<Item> FLAG_HOUND;

    public static final DeferredItem<Item> RILEY_SIGN_COVER_HOUND;
    public static final DeferredItem<Item> FABRIC_SIGN_COVER_HOUND;

    public static final DeferredItem<Item> HOUND_RIBBON_THREE_TAILS;
    public static final DeferredItem<Item> HOUND_RIBBON_TWO_TAILS;
    public static final DeferredItem<Item> HOUND_RIBBON_ONE_TAIL;
    public static final DeferredItem<Item> HOUND_ROSETTE;

    public static final DeferredItem<TackItem> HALTER_HOUND;
    public static final DeferredItem<TackItem> FLYMASK_HOUND;
    public static final DeferredItem<TackItem> PASTURE_BLANKET_HOUND;
    public static final DeferredItem<TackItem> PASTURE_BLANKET_HOUND_ARMORED;
    public static final DeferredItem<TackItem> ADVENTURE_SADDLE_HOUND;
    public static final DeferredItem<TackItem> ADVENTURE_BRIDLE_HOUND;
    public static final DeferredItem<TackItem> ADVENTURE_BREAST_COLLAR_HOUND;
    public static final DeferredItem<TackItem> ADVENTURE_GIRTH_STRAP_HOUND;
    public static final DeferredItem<TackItem> ADVENTURE_BLANKET_HOUND;
    public static final DeferredItem<TackItem> ADVENTURE_LEG_WRAPS_HOUND;
    public static final DeferredItem<TackItem> CLOTH_HORSE_ARMOR_HOUND;
    public static final DeferredItem<TackItem> AMETHYST_HORSE_ARMOR_HOUND;
    public static final DeferredItem<SaddlebagItem> SADDLE_BAG_HOUND;
    public static final DeferredItem<TackItem> WESTERN_SADDLE_HOUND;
    public static final DeferredItem<TackItem> WESTERN_BRIDLE_HOUND;
    public static final DeferredItem<TackItem> WESTERN_BREAST_COLLAR_HOUND;
    public static final DeferredItem<TackItem> WESTERN_GIRTH_STRAP_HOUND;
    public static final DeferredItem<TackItem> WESTERN_BLANKET_HOUND;
    public static final DeferredItem<TackItem> WESTERN_LEG_WRAPS_HOUND;
    public static final DeferredItem<TackItem> ENGLISH_SADDLE_HOUND;
    public static final DeferredItem<TackItem> ENGLISH_BRIDLE_HOUND;
    public static final DeferredItem<TackItem> ENGLISH_BREAST_COLLAR_HOUND;
    public static final DeferredItem<TackItem> ENGLISH_GIRTH_STRAP_HOUND;
    public static final DeferredItem<TackItem> ENGLISH_BLANKET_HOUND;
    public static final DeferredItem<TackItem> ENGLISH_LEG_WRAPS_HOUND;
    public static final DeferredItem<TackItem> QUARTER_SHEET_HOUND;
    public static final DeferredItem<TackItem> BAREBACK_SADDLE_HOUND;
    public static final DeferredItem<TackItem> BITLESS_BRIDLE_HOUND;
    public static final DeferredItem<TackItem> BAREBACK_GIRTH_STRAP_HOUND;
    public static final DeferredItem<TackItem> BAREBACK_BLANKET_HOUND;


/// ════════════════════════════════════ CRAFTABLE NUMBERED (Tackshop Colors) ════════════════════════════════════ ///
    public static final List<DeferredItem<Item>> DYES;
    public static final List<DeferredItem<Item>> FLAGS;
    public static final List<DeferredItem<Item>> FLAGS_BUTTERFLY;

    public static final List<DeferredItem<Item>> SIGN_COVERS_RILEY;
    public static final List<DeferredItem<Item>> SIGN_COVERS_FABRIC;
    public static final List<DeferredItem<Item>> SIGN_COVERS_FLORAL;
    public static final List<DeferredItem<Item>> SIGN_COVERS_SWIRL;
    public static final List<DeferredItem<Item>> SIGN_COVERS_LOOPED;
    public static final List<DeferredItem<Item>> SIGN_COVERS_CHECKERED;

    public static final List<DeferredItem<Item>> TRE_RIBBON_THREE_TAILS;
    public static final List<DeferredItem<Item>> TRE_RIBBON_TWO_TAILS;
    public static final List<DeferredItem<Item>> TRE_RIBBON_ONE_TAIL;
    public static final List<DeferredItem<Item>> TRE_ROSETTE;

    public static final List<DeferredItem<TackItem>> HALTERS;
    public static final List<DeferredItem<TackItem>> FLYMASKS;
    public static final List<DeferredItem<TackItem>> PASTURE_BLANKETS;
    public static final List<DeferredItem<TackItem>> PASTURE_BLANKETS_ARMORED;
    public static final List<DeferredItem<TackItem>> ADVENTURE_SADDLES;
    public static final List<DeferredItem<TackItem>> ADVENTURE_BRIDLES;
    public static final List<DeferredItem<TackItem>> ADVENTURE_BREAST_COLLARS;
    public static final List<DeferredItem<TackItem>> ADVENTURE_GIRTH_STRAPS;
    public static final List<DeferredItem<TackItem>> ADVENTURE_BLANKETS;
    public static final List<DeferredItem<TackItem>> ADVENTURE_LEG_WRAPS;
    public static final List<DeferredItem<TackItem>> CLOTH_HORSE_ARMORS;
    public static final List<DeferredItem<TackItem>> AMETHYST_HORSE_ARMORS;
    public static final List<DeferredItem<SaddlebagItem>> SADDLE_BAGS;
    public static final List<DeferredItem<TackItem>> WESTERN_SADDLES;
    public static final List<DeferredItem<TackItem>> WESTERN_BRIDLES;
    public static final List<DeferredItem<TackItem>> WESTERN_BREAST_COLLARS;
    public static final List<DeferredItem<TackItem>> WESTERN_GIRTH_STRAPS;
    public static final List<DeferredItem<TackItem>> WESTERN_BLANKETS;
    public static final List<DeferredItem<TackItem>> WESTERN_LEG_WRAPS;
    public static final List<DeferredItem<TackItem>> ENGLISH_SADDLES_BLACK;
    public static final List<DeferredItem<TackItem>> ENGLISH_SADDLES_BROWN;
    public static final List<DeferredItem<TackItem>> ENGLISH_BRIDLES_BLACK;
    public static final List<DeferredItem<TackItem>> ENGLISH_BRIDLES_BROWN;
    public static final List<DeferredItem<TackItem>> CLOTH_BRIDLES;
    public static final List<DeferredItem<TackItem>> ENGLISH_BREAST_COLLARS_BLACK;
    public static final List<DeferredItem<TackItem>> ENGLISH_BREAST_COLLARS_BROWN;
    public static final List<DeferredItem<TackItem>> CLOTH_BREAST_COLLARS;
    public static final List<DeferredItem<TackItem>> ENGLISH_GIRTH_STRAPS_BLACK;
    public static final List<DeferredItem<TackItem>> ENGLISH_GIRTH_STRAPS_BROWN;
    public static final List<DeferredItem<TackItem>> CLOTH_GIRTH_STRAPS;
    public static final List<DeferredItem<TackItem>> ENGLISH_BLANKETS;
    public static final List<DeferredItem<TackItem>> ENGLISH_LEG_WRAPS;
    public static final List<DeferredItem<TackItem>> QUARTER_SHEETS;
    public static final List<DeferredItem<TackItem>> BAREBACK_SADDLES;
    public static final List<DeferredItem<TackItem>> CLOTH_BITLESS_BRIDLES;
    public static final List<DeferredItem<TackItem>> BAREBACK_GIRTH_STRAPS;
    public static final List<DeferredItem<TackItem>> BAREBACK_BLANKETS;

/// ════════════════════════════════════ CRAFTABLE DYED (SWEM Colors) ════════════════════════════════════ ///
    public static final List<DeferredItem<Item>> FLAGS_DYED;

    public static final List<DeferredItem<Item>> SIGN_COVERS_RILEY_DYED;
    public static final List<DeferredItem<Item>> SIGN_COVERS_FABRIC_DYED;
    public static final List<DeferredItem<Item>> SIGN_COVERS_FLORAL_DYED;
    public static final List<DeferredItem<Item>> SIGN_COVERS_SWIRL_DYED;
    public static final List<DeferredItem<Item>> SIGN_COVERS_LOOPED_DYED;
    public static final List<DeferredItem<Item>> SIGN_COVERS_CHECKERED_DYED;

    public static final List<DeferredItem<Item>> RIBBON_THREE_TAILS;
    public static final List<DeferredItem<Item>> RIBBON_TWO_TAILS;
    public static final List<DeferredItem<Item>> RIBBON_ONE_TAIL;
    public static final List<DeferredItem<Item>> ROSETTE;

    public static final List<DeferredItem<TackItem>> FLYMASKS_DYED;
    public static final List<DeferredItem<TackItem>> ADVENTURE_SADDLES_DYED;
    public static final List<DeferredItem<TackItem>> ADVENTURE_BRIDLES_DYED;
    public static final List<DeferredItem<TackItem>> ADVENTURE_BREAST_COLLARS_DYED;
    public static final List<DeferredItem<TackItem>> ADVENTURE_GIRTH_STRAPS_DYED;
    public static final List<DeferredItem<TackItem>> ADVENTURE_BLANKETS_DYED;
    public static final List<DeferredItem<TackItem>> ADVENTURE_LEG_WRAPS_DYED;
    public static final List<DeferredItem<TackItem>> CLOTH_HORSE_ARMORS_DYED;
    public static final List<DeferredItem<TackItem>> AMETHYST_HORSE_ARMORS_DYED;
    public static final List<DeferredItem<TackItem>> ENGLISH_SADDLES_BLACK_DYED;
    public static final List<DeferredItem<TackItem>> ENGLISH_SADDLES_BROWN_DYED;
    public static final List<DeferredItem<TackItem>> ENGLISH_BRIDLES_BLACK_DYED;
    public static final List<DeferredItem<TackItem>> ENGLISH_BRIDLES_BROWN_DYED;
    public static final List<DeferredItem<TackItem>> CLOTH_BRIDLES_DYED;
    public static final List<DeferredItem<TackItem>> ENGLISH_BREAST_COLLARS_BLACK_DYED;
    public static final List<DeferredItem<TackItem>> ENGLISH_BREAST_COLLARS_BROWN_DYED;
    public static final List<DeferredItem<TackItem>> CLOTH_BREAST_COLLARS_DYED;
    public static final List<DeferredItem<TackItem>> ENGLISH_GIRTH_STRAPS_BLACK_DYED;
    public static final List<DeferredItem<TackItem>> ENGLISH_GIRTH_STRAPS_BROWN_DYED;
    public static final List<DeferredItem<TackItem>> CLOTH_GIRTH_STRAPS_DYED;
    public static final List<DeferredItem<TackItem>> QUARTER_SHEETS_DYED;
    public static final List<DeferredItem<TackItem>> BAREBACK_SADDLES_DYED;
    public static final List<DeferredItem<TackItem>> CLOTH_BITLESS_BRIDLES_DYED;
    public static final List<DeferredItem<TackItem>> BAREBACK_GIRTH_STRAPS_DYED;
    public static final List<DeferredItem<TackItem>> BAREBACK_BLANKETS_DYED;

    public TackShopItems() {
    }
    public static void init(IEventBus eventBus) {  REGISTRY.register(eventBus); }

    static {
        REGISTRY = DeferredRegister.createItems("tretackshop");

/// ════════════════════════════════════ SINGLE ITEMS ════════════════════════════════════ ///
        BUTTERFLY = REGISTRY.registerItem("butterfly", Item::new);
        BUTTERFLY_MONARCH = REGISTRY.registerItem("butterfly_monarch", Item::new);
        PAW_PRINT = REGISTRY.registerItem("paw_print", Item::new);
        RAINBOW_INA_BOTTLE = REGISTRY.registerItem("rainbow_ina_bottle", Item::new);

/// ════════════════════════════════════ ONE OFF TACK PIECES ════════════════════════════════════ ///
        PELHAM_BRIDLE_BLACK = REGISTRY.registerItem("pelham_bridle_black",
                props -> new TackItem(TackItemDefinition.builder(TackType.BRIDLE).withData(
                        new BridleTypeData(false, Collections.emptySet(),
                                Color.ofRGB(tretackcolors[15][0], tretackcolors[15][1], tretackcolors[15][2])
                                , "western")).build(),
                        props.stacksTo(64)));
        PELHAM_BRIDLE_BROWN = REGISTRY.registerItem("pelham_bridle_brown",
                props -> new TackItem(TackItemDefinition.builder(TackType.BRIDLE).withData(
                        new BridleTypeData(false, Collections.emptySet(),
                                Color.ofRGB(tretackcolors[16][0], tretackcolors[16][1], tretackcolors[16][2])
                                , "western")).build(),
                        props.stacksTo(64)));
        MOON_BRIDLE_DOUBLE = REGISTRY.registerItem("moon_bridle_double",
                props -> new TackItem(TackItemDefinition.builder(TackType.BRIDLE).withData(
                        new BridleTypeData(false, Collections.emptySet(),
                                Color.ofRGB(tretackcolors[20][0], tretackcolors[20][1], tretackcolors[20][2])
                                , "western")).build(),
                        props.stacksTo(64)));
        MEDIEVAL_BRIDLE_BLACK = REGISTRY.registerItem("medieval_bridle_black",
                props -> new TackItem(TackItemDefinition.builder(TackType.BRIDLE).withData(
                        new BridleTypeData(false, Collections.emptySet(),
                                Color.ofRGB(tretackcolors[20][0], tretackcolors[20][1], tretackcolors[20][2])
                                , "western")).build(),
                        props.stacksTo(64)));
        MEDIEVAL_BRIDLE_BROWN = REGISTRY.registerItem("medieval_bridle_brown",
                props -> new TackItem(TackItemDefinition.builder(TackType.BRIDLE).withData(
                        new BridleTypeData(false, Collections.emptySet(),
                                Color.ofRGB(tretackcolors[21][0], tretackcolors[21][1], tretackcolors[21][2])
                                , "western")).build(),
                        props.stacksTo(64)));

        BITLESS_BRIDLE = REGISTRY.registerItem("english_bridle_bitless",
                props -> new TackItem(TackItemDefinition.builder(TackType.BRIDLE).withData(
                        new BridleTypeData(false, Collections.emptySet(),
                                Color.ofRGB(tretackcolors[20][0], tretackcolors[20][1], tretackcolors[20][2])
                                , "english")).build(),
                        props.stacksTo(64)));
        BAREBACK_SADDLE_BLACK_MOON = REGISTRY.registerItem("bareback_saddle_black_moon",
                props -> new TackItem(TackItemDefinition.builder(TackType.SADDLE).withData(new SaddleTypeData(
                        false, Collections.emptySet(), Color.ofRGB(tretackcolors[20][0], tretackcolors[20][1], tretackcolors[20][2]),
                        "western")).build(), props.stacksTo(64)));
        BAREBACK_BLANKET = REGISTRY.registerItem("bareback_blanket",
                props -> new TackItem(TackItemDefinition.builder(TackType.BLANKET)
                        .rackTexture(RackType.SADDLE, ModRef.res("textures/entity/rack/saddle/bareback_blanket.png"))
                        .rackTexture(RackType.BLANKET_5, ModRef.res("textures/entity/rack/blanket_5/bareback_blanket.png"))
                        .withData(new TackTypeData(false, Collections.emptySet(),
                                ColorUtil.ofDyeColor(DyeColor.WHITE))).build(),
                        props.stacksTo(64)));
        BAREBACK_GIRTH_STRAP_MOON = REGISTRY.registerItem("bareback_girth_strap_moon",
                props -> new TackItem(TackItemDefinition.builder(TackType.GIRTH_STRAP).withData(
                                new GirthStrapTypeData(false, Collections.emptySet(),
                                        Color.ofRGB(tretackcolors[20][0], tretackcolors[20][1], tretackcolors[20][2]),
                                        Color.ofRGB(tretackcolors[20][0], tretackcolors[20][1], tretackcolors[20][2])))
                        .rackTexture(RackType.SADDLE,
                                ModRef.res("textures/entity/rack/saddle/tre_girth_strap.png")).build(),
                        props.stacksTo(64)));
        BITLESS_BRIDLE_BROWN = REGISTRY.registerItem("english_bridle_bitless_brown",
                props -> new TackItem(TackItemDefinition.builder(TackType.BRIDLE).withData(
                        new BridleTypeData(false, Collections.emptySet(),
                                Color.ofRGB(tretackcolors[21][0], tretackcolors[21][1], tretackcolors[21][2])
                                , "english")).build(),
                        props.stacksTo(64)));
        BAREBACK_SADDLE_BROWN_MOON = REGISTRY.registerItem("bareback_saddle_brown_moon",
                props -> new TackItem(TackItemDefinition.builder(TackType.SADDLE).withData(new SaddleTypeData(
                        false, Collections.emptySet(), Color.ofRGB(tretackcolors[21][0], tretackcolors[21][1], tretackcolors[21][2]),
                        "western")).build(), props.stacksTo(64)));
        BAREBACK_GIRTH_STRAP_BROWN_MOON = REGISTRY.registerItem("bareback_girth_strap_brown_moon",
                props -> new TackItem(TackItemDefinition.builder(TackType.GIRTH_STRAP).withData(
                                new GirthStrapTypeData(false, Collections.emptySet(),
                                        Color.ofRGB(tretackcolors[21][0], tretackcolors[21][1], tretackcolors[21][2]),
                                        Color.ofRGB(tretackcolors[21][0], tretackcolors[21][1], tretackcolors[21][2])))
                        .rackTexture(RackType.SADDLE,
                                ModRef.res("textures/entity/rack/saddle/tre_girth_strap.png")).build(),
                        props.stacksTo(64)));
        BITLESS_BRIDLE_BEIGE = REGISTRY.registerItem("english_bridle_bitless_beige",
                props -> new TackItem(TackItemDefinition.builder(TackType.BRIDLE).withData(
                        new BridleTypeData(false, Collections.emptySet(),
                                Color.ofRGB(tretackcolors[22][0], tretackcolors[22][1], tretackcolors[22][2])
                                , "english")).build(),
                        props.stacksTo(64)));
        BAREBACK_SADDLE_BEIGE_MOON = REGISTRY.registerItem("bareback_saddle_beige_moon",
                props -> new TackItem(TackItemDefinition.builder(TackType.SADDLE).withData(new SaddleTypeData(
                        false, Collections.emptySet(), Color.ofRGB(tretackcolors[22][0], tretackcolors[22][1], tretackcolors[22][2]),
                        "western")).build(), props.stacksTo(64)));
        BAREBACK_GIRTH_STRAP_BEIGE_MOON = REGISTRY.registerItem("bareback_girth_strap_beige_moon",
                props -> new TackItem(TackItemDefinition.builder(TackType.GIRTH_STRAP).withData(
                                new GirthStrapTypeData(false, Collections.emptySet(),
                                        Color.ofRGB(tretackcolors[22][0], tretackcolors[22][1], tretackcolors[22][2]),
                                        Color.ofRGB(tretackcolors[22][0], tretackcolors[22][1], tretackcolors[22][2])))
                        .rackTexture(RackType.SADDLE,
                                ModRef.res("textures/entity/rack/saddle/tre_girth_strap.png")).build(),
                        props.stacksTo(64)));
        BITLESS_BRIDLE_WHITE = REGISTRY.registerItem("english_bridle_bitless_white",
                props -> new TackItem(TackItemDefinition.builder(TackType.BRIDLE).withData(
                        new BridleTypeData(false, Collections.emptySet(),
                                ColorUtil.ofDyeColor(DyeColor.WHITE)
                                , "english")).build(),
                        props.stacksTo(64)));
        BAREBACK_SADDLE_MOON = REGISTRY.registerItem("bareback_saddle_moon",
                props -> new TackItem(TackItemDefinition.builder(TackType.SADDLE).withData(new SaddleTypeData(
                        false, Collections.emptySet(), ColorUtil.ofDyeColor(DyeColor.WHITE),
                        "western")).build(), props.stacksTo(64)));
        BAREBACK_GIRTH_STRAP_WHITE_MOON = REGISTRY.registerItem("bareback_girth_strap_white_moon",
                props -> new TackItem(TackItemDefinition.builder(TackType.GIRTH_STRAP).withData(
                                new GirthStrapTypeData(false, Collections.emptySet(),
                                        Color.ofRGB(tretackcolors[0][0], tretackcolors[0][1], tretackcolors[0][2]),
                                        Color.ofRGB(tretackcolors[0][0], tretackcolors[0][1], tretackcolors[0][2])))
                        .rackTexture(RackType.SADDLE,
                                ModRef.res("textures/entity/rack/saddle/tre_girth_strap.png")).build(),
                        props.stacksTo(64)));

        DRESSAGE_SADDLE = REGISTRY.registerItem("dressage_saddle",
                props -> new TackItem(TackItemDefinition.builder(TackType.SADDLE).withData(new SaddleTypeData(
                        false, Collections.emptySet(), Color.ofRGB(tretackcolors[15][0], tretackcolors[15][1], tretackcolors[15][2]),
                        "western")).build(), props.stacksTo(64)));
        DRESSAGE_BLANKET = REGISTRY.registerItem("dressage_blanket",
                props -> new TackItem(TackItemDefinition.builder(TackType.BLANKET)
                        .rackTexture(RackType.SADDLE, ModRef.res("textures/entity/rack/saddle/dressage_blanket.png"))
                        .rackTexture(RackType.BLANKET_5, ModRef.res("textures/entity/rack/blanket_5/dressage_blanket.png"))
                        .withData(new TackTypeData(false, Collections.emptySet(),
                                ColorUtil.ofDyeColor(DyeColor.WHITE))).build(),
                        props.stacksTo(64)));
        DRESSAGE_GIRTH_STRAP = REGISTRY.registerItem("dressage_girth_strap",
                props -> new TackItem(TackItemDefinition.builder(TackType.GIRTH_STRAP).withData(
                                new GirthStrapTypeData(false, Collections.emptySet(),
                                        Color.ofRGB(tretackcolors[0][0], tretackcolors[0][1], tretackcolors[0][2]),
                                        Color.ofRGB(tretackcolors[15][0], tretackcolors[15][1], tretackcolors[15][2])))
                        .rackTexture(RackType.SADDLE,
                                ModRef.res("textures/entity/rack/saddle/tre_girth_strap.png")).build(),
                        props.stacksTo(64)));

        RACING_SADDLE_BROWN = REGISTRY.registerItem("racing_saddle_brown",
                props -> new TackItem(TackItemDefinition.builder(TackType.SADDLE).withData(new SaddleTypeData(
                        false, Collections.emptySet(), Color.ofRGB(tretackcolors[16][0], tretackcolors[16][1], tretackcolors[16][2]),
                        "english")).build(), props.stacksTo(64)));
        RACING_SADDLE_BLACK = REGISTRY.registerItem("racing_saddle_black",
                props -> new TackItem(TackItemDefinition.builder(TackType.SADDLE).withData(new SaddleTypeData(
                        false, Collections.emptySet(), Color.ofRGB(tretackcolors[15][0], tretackcolors[15][1], tretackcolors[15][2]),
                        "english")).build(), props.stacksTo(64)));

        HUNTER_BLANKET = REGISTRY.registerItem("hunter_blanket",
                props -> new TackItem(TackItemDefinition.builder(TackType.BLANKET)
                        .rackTexture(RackType.SADDLE, ModRef.res("textures/entity/rack/saddle/hunter_blanket.png"))
                        .rackTexture(RackType.BLANKET_5, ModRef.res("textures/entity/rack/blanket_5/hunter_blanket.png"))
                        .withData(new TackTypeData(false, Collections.emptySet(),
                                ColorUtil.ofDyeColor(DyeColor.WHITE))).build(),
                        props.stacksTo(64)));

        ADVENTURE_BRIDLE_TRANS = REGISTRY.registerItem("adventure_bridle_trans",
                props -> new TackItem(TackItemDefinition.builder(TackType.BRIDLE).withData(
                        new BridleTypeData(true, Collections.emptySet(),
                                ColorUtil.ofDyeColor(DyeColor.WHITE)
                                , "western")).build(),
                        props.stacksTo(64)));
        ADVENTURE_SADDLE_TRANS = REGISTRY.registerItem("adventure_saddle_trans",
                props -> new TackItem(TackItemDefinition.builder(TackType.SADDLE).withData(new SaddleTypeData(
                        true, Collections.emptySet(), ColorUtil.ofDyeColor(DyeColor.WHITE),
                        "adventure")).build(), props.stacksTo(64)));
        ADVENTURE_BLANKET_TRANS = REGISTRY.registerItem("adventure_blanket_trans",
                props -> new TackItem(TackItemDefinition.builder(TackType.BLANKET)
                        .rackTexture(RackType.SADDLE, ModRef.res("textures/entity/rack/saddle/trans_adventure_blanket.png"))
                        .rackTexture(RackType.BLANKET_5, ModRef.res("textures/entity/rack/blanket_5/trans_adventure_blanket.png"))
                        .withData(new TackTypeData(true, Collections.emptySet(),
                                ColorUtil.ofDyeColor(DyeColor.WHITE))).build(),
                        props.stacksTo(64)));
        ADVENTURE_GIRTH_STRAP_TRANS = REGISTRY.registerItem("adventure_girth_strap_trans",
                props -> new TackItem(TackItemDefinition.builder(TackType.GIRTH_STRAP).withData(
                                new GirthStrapTypeData(true, Collections.emptySet(),
                                        ColorUtil.ofDyeColor(DyeColor.WHITE),
                                        ColorUtil.ofDyeColor(DyeColor.WHITE)))
                        .rackTexture(RackType.SADDLE,
                                ModRef.res("textures/entity/rack/saddle/trans_girth_strap.png")).build(),
                        props.stacksTo(64)));
        ADVENTURE_LEG_WRAPS_TRANS = REGISTRY.registerItem("adventure_leg_wraps_trans",
                props -> new TackItem(TackItemDefinition.builder(TackType.LEG_WRAPS).withData(new TackTypeData(
                        true, Collections.emptySet(), ColorUtil.ofDyeColor(DyeColor.WHITE))).build(),
                        props.stacksTo(64)));
        ADVENTURE_BREAST_COLLAR_TRANS = REGISTRY.registerItem("adventure_breast_collar_trans",
                props -> new TackItem(TackItemDefinition.builder(TackType.BREAST_COLLAR).withData(new TackTypeData(
                        true, Collections.emptySet(), ColorUtil.ofDyeColor(DyeColor.WHITE))).build(),
                        props.stacksTo(64)));


/// ════════════════════════════════════ ONE OFF AWARD PIECES ════════════════════════════════════ ///
        MEDAL_1 =  REGISTRY.registerItem("medal_1", Item::new);
        MEDAL_2 =  REGISTRY.registerItem("medal_2", Item::new);
        MEDAL_3 =  REGISTRY.registerItem("medal_3", Item::new);

        SIGN_COVER_GRAND = REGISTRY.registerItem("sign_cover_champ", Item::new);
        SIGN_COVER_RESERVE = REGISTRY.registerItem("sign_cover_champ_res", Item::new);

        RIBBON_THREE_TAILS_GRAND =  REGISTRY.registerItem("ribbon_three_tails_grand", Item::new);
        RIBBON_THREE_TAILS_RESERVE =  REGISTRY.registerItem("ribbon_three_tails_reserve", Item::new);

        FIRST_RIBBON_THREE_TAILS = REGISTRY.registerItem("ribbon_three_tails_first", Item::new);
        FIRST_RIBBON_TWO_TAILS = REGISTRY.registerItem("ribbon_two_tails_first", Item::new);
        FIRST_RIBBON_ONE_TAIL = REGISTRY.registerItem("ribbon_one_tail_first", Item::new);
        FIRST_ROSETTE = REGISTRY.registerItem("rosette_first", Item::new);
        SECOND_RIBBON_THREE_TAILS = REGISTRY.registerItem("ribbon_three_tails_second", Item::new);
        SECOND_RIBBON_TWO_TAILS = REGISTRY.registerItem("ribbon_two_tails_second", Item::new);
        SECOND_RIBBON_ONE_TAIL = REGISTRY.registerItem("ribbon_one_tail_second", Item::new);
        SECOND_ROSETTE = REGISTRY.registerItem("rosette_second", Item::new);
        THIRD_RIBBON_THREE_TAILS = REGISTRY.registerItem("ribbon_three_tails_third", Item::new);
        THIRD_RIBBON_TWO_TAILS = REGISTRY.registerItem("ribbon_two_tails_third", Item::new);
        THIRD_RIBBON_ONE_TAIL = REGISTRY.registerItem("ribbon_one_tail_third", Item::new);
        THIRD_ROSETTE = REGISTRY.registerItem("rosette_third", Item::new);

        SIGN_COVER_HEART_RED = REGISTRY.registerItem("sign_cover_heart_red", Item::new);
        SIGN_COVER_HEART_PINK = REGISTRY.registerItem("sign_cover_heart_pink", Item::new);
        SIGN_COVER_HEART_BLUE = REGISTRY.registerItem("sign_cover_heart_blue", Item::new);
        SIGN_COVER_SNOWFLAKE = REGISTRY.registerItem("sign_cover_snowflake", Item::new);

/// ════════════════════════════════════ MORPHO ════════════════════════════════════ ///
        FLAG_MORPHO = REGISTRY.registerItem("flag_morpho", Item::new);

        SIGN_COVER_MORPHO = REGISTRY.registerItem("sign_cover_morpho", Item::new);
        RILEY_SIGN_COVER_MORPHO = REGISTRY.registerItem("sign_cover_riley_morpho", Item::new);
        FABRIC_SIGN_COVER_MORPHO = REGISTRY.registerItem("sign_cover_fabric_morpho", Item::new);

        MORPHO_RIBBON_THREE_TAILS = REGISTRY.registerItem("ribbon_three_tails_morpho", Item::new);
        MORPHO_RIBBON_TWO_TAILS = REGISTRY.registerItem("ribbon_two_tails_morpho", Item::new);
        MORPHO_RIBBON_ONE_TAIL = REGISTRY.registerItem("ribbon_one_tail_morpho", Item::new);
        MORPHO_ROSETTE = REGISTRY.registerItem("rosette_morpho", Item::new);

        HALTER_MORPHO = REGISTRY.registerItem("halter_morpho",
                props -> new TackItem(TackItemDefinition.builder(TackType.HALTER).withData(new TackTypeData
                        (false, Collections.emptySet(), ColorUtil.ofDyeColor(DyeColor.WHITE))).build(),
                        props.stacksTo(64)));
        FLYMASK_MORPHO = REGISTRY.registerItem("flymask_morpho",
                props -> new TackItem(TackItemDefinition.builder(TackType.HALTER).withData(new TackTypeData
                        (false, Collections.emptySet(), ColorUtil.ofDyeColor(DyeColor.WHITE))).build(),
                        props.stacksTo(64)));
        PASTURE_BLANKET_MORPHO = REGISTRY.registerItem("pasture_blanket_morpho",
                props -> new TackItem(TackItemDefinition.builder(TackType.PASTURE_BLANKET).withData(
                                new PastureBlanketTypeData(false, Collections.emptySet(),
                                        ColorUtil.ofDyeColor(DyeColor.WHITE), false))
                        .rackTexture(RackType.PASTURE_BLANKET_SHORT_3,
                                ModRef.res("textures/entity/rack/pasture_blanket/rack_pasture_blanket_morpho_3_short.png"))
                        .rackTexture(RackType.PASTURE_BLANKET_LONG_5,
                                ModRef.res("textures/entity/rack/pasture_blanket/rack_pasture_blanket_morpho_5_long.png"))
                        .build(), props.stacksTo(64)));
        ADVENTURE_SADDLE_MORPHO = REGISTRY.registerItem("adventure_saddle_morpho",
                props -> new TackItem(TackItemDefinition.builder(TackType.SADDLE).withData(new SaddleTypeData(
                        true, Collections.emptySet(), ColorUtil.ofDyeColor(DyeColor.WHITE),
                        "adventure")).build(), props.stacksTo(64)));
        ADVENTURE_BRIDLE_MORPHO = REGISTRY.registerItem("adventure_bridle_morpho",
                props -> new TackItem(TackItemDefinition.builder(TackType.BRIDLE).withData(
                        new BridleTypeData(true, Collections.emptySet(),
                                ColorUtil.ofDyeColor(DyeColor.WHITE)
                                , "western")).build(),
                        props.stacksTo(64)));
        ADVENTURE_BREAST_COLLAR_MORPHO = REGISTRY.registerItem("adventure_breast_collar_morpho",
                props -> new TackItem(TackItemDefinition.builder(TackType.BREAST_COLLAR).withData(new TackTypeData(
                        true, Collections.emptySet(), ColorUtil.ofDyeColor(DyeColor.WHITE))).build(),
                        props.stacksTo(64)));
        ADVENTURE_GIRTH_STRAP_MORPHO = REGISTRY.registerItem("adventure_girth_strap_morpho",
                props -> new TackItem(TackItemDefinition.builder(TackType.GIRTH_STRAP).withData(
                                new GirthStrapTypeData(true, Collections.emptySet(),
                                        ColorUtil.ofDyeColor(DyeColor.WHITE),
                                        ColorUtil.ofDyeColor(DyeColor.WHITE)))
                        .rackTexture(RackType.SADDLE,
                                ModRef.res("textures/entity/rack/saddle/morpho_girth_strap_adventure.png")).build(),
                        props.stacksTo(64)));
        ADVENTURE_BLANKET_MORPHO = REGISTRY.registerItem("adventure_blanket_morpho",
                props -> new TackItem(TackItemDefinition.builder(TackType.BLANKET)
                        .rackTexture(RackType.SADDLE, ModRef.res("textures/entity/rack/saddle/morpho_adventure_blanket.png"))
                        .rackTexture(RackType.BLANKET_5, ModRef.res("textures/entity/rack/blanket_5/morpho_adventure_blanket.png"))
                        .withData(new TackTypeData(true, Collections.emptySet(),
                                ColorUtil.ofDyeColor(DyeColor.WHITE))).build(),
                        props.stacksTo(64)));
        ADVENTURE_LEG_WRAPS_MORPHO = REGISTRY.registerItem("adventure_leg_wraps_morpho",
                props -> new TackItem(TackItemDefinition.builder(TackType.LEG_WRAPS).withData(new TackTypeData(
                        true, Collections.emptySet(), ColorUtil.ofDyeColor(DyeColor.WHITE))).build(),
                        props.stacksTo(64)));
        CLOTH_HORSE_ARMOR_MORPHO = REGISTRY.registerItem("cloth_horse_armor_morpho",
                props -> new TackItem(TackItemDefinition.builder(TackType.HORSE_ARMOR).withData(new HorseArmorTypeData(
                        true, Collections.emptySet(), ColorUtil.ofDyeColor(DyeColor.WHITE),
                        HorseArmorTier.CLOTH.getTierName())).build(), props.stacksTo(64)));
        AMETHYST_HORSE_ARMOR_MORPHO = REGISTRY.registerItem("amethyst_horse_armor_morpho",
                props -> new TackItem(TackItemDefinition.builder(TackType.HORSE_ARMOR).withData(new HorseArmorTypeData(
                        true, Collections.emptySet(), ColorUtil.ofDyeColor(DyeColor.WHITE),
                        HorseArmorTier.AMETHYST.getTierName())).build(), props.stacksTo(64)));
        SADDLE_BAG_MORPHO = REGISTRY.registerItem("saddle_bag_morpho",
                props -> new SaddlebagItem(TackItemDefinition.builder(TackType.SADDLE_BAG).withData(new TackTypeData(
                        true, Collections.emptySet(),
                        ColorUtil.ofDyeColor(DyeColor.WHITE))).build(),
                        props.stacksTo(64).component(DataComponents.CONTAINER, ItemContainerContents.EMPTY)));
        WESTERN_SADDLE_MORPHO = REGISTRY.registerItem("western_saddle_morpho",
                props -> new TackItem(TackItemDefinition.builder(TackType.SADDLE).withData(new SaddleTypeData(
                        false, Collections.emptySet(), ColorUtil.ofDyeColor(DyeColor.WHITE),
                        "western")).build(), props.stacksTo(64)));
        WESTERN_BRIDLE_MORPHO = REGISTRY.registerItem("western_bridle_morpho",
                props -> new TackItem(TackItemDefinition.builder(TackType.BRIDLE).withData(
                        new BridleTypeData(false, Collections.emptySet(),
                                ColorUtil.ofDyeColor(DyeColor.WHITE)
                                , "western")).build(),
                        props.stacksTo(64)));
        WESTERN_BREAST_COLLAR_MORPHO = REGISTRY.registerItem("western_breast_collar_morpho",
                props -> new TackItem(TackItemDefinition.builder(TackType.BREAST_COLLAR).withData(new TackTypeData(
                        false, Collections.emptySet(), ColorUtil.ofDyeColor(DyeColor.WHITE))).build(),
                        props.stacksTo(64)));
        WESTERN_GIRTH_STRAP_MORPHO = REGISTRY.registerItem("western_girth_strap_morpho",
                props -> new TackItem(TackItemDefinition.builder(TackType.GIRTH_STRAP).withData(
                                new GirthStrapTypeData(false, Collections.emptySet(),
                                        ColorUtil.ofDyeColor(DyeColor.WHITE),
                                        ColorUtil.ofDyeColor(DyeColor.WHITE)))
                        .rackTexture(RackType.SADDLE,
                                ModRef.res("textures/entity/rack/saddle/morpho_girth_strap_western.png")).build(),
                        props.stacksTo(64)));
        WESTERN_BLANKET_MORPHO = REGISTRY.registerItem("western_blanket_morpho",
                props -> new TackItem(TackItemDefinition.builder(TackType.BLANKET)
                        .rackTexture(RackType.SADDLE, ModRef.res("textures/entity/rack/saddle/morpho_western_blanket.png"))
                        .rackTexture(RackType.BLANKET_5, ModRef.res("textures/entity/rack/blanket_5/morpho_western_blanket.png"))
                        .withData(new TackTypeData(false, Collections.emptySet(),
                                ColorUtil.ofDyeColor(DyeColor.WHITE))).build(),
                        props.stacksTo(64)));
        WESTERN_LEG_WRAPS_MORPHO = REGISTRY.registerItem("western_leg_wraps_morpho",
                props -> new TackItem(TackItemDefinition.builder(TackType.LEG_WRAPS).withData(new TackTypeData(
                        false, Collections.emptySet(), ColorUtil.ofDyeColor(DyeColor.WHITE))).build(),
                        props.stacksTo(64)));
        ENGLISH_SADDLE_MORPHO = REGISTRY.registerItem("english_saddle_morpho",
                props -> new TackItem(TackItemDefinition.builder(TackType.SADDLE).withData(new SaddleTypeData(
                        false, Collections.emptySet(), ColorUtil.ofDyeColor(DyeColor.WHITE),
                        "english")).build(), props.stacksTo(64)));
        ENGLISH_BRIDLE_MORPHO = REGISTRY.registerItem("english_bridle_morpho",
                props -> new TackItem(TackItemDefinition.builder(TackType.BRIDLE).withData(
                        new BridleTypeData(false, Collections.emptySet(),
                                ColorUtil.ofDyeColor(DyeColor.WHITE)
                                , "english")).build(),
                        props.stacksTo(64)));
        ENGLISH_BREAST_COLLAR_MORPHO = REGISTRY.registerItem("english_breast_collar_morpho",
                props -> new TackItem(TackItemDefinition.builder(TackType.BREAST_COLLAR).withData(new TackTypeData(
                        false, Collections.emptySet(), ColorUtil.ofDyeColor(DyeColor.WHITE))).build(),
                        props.stacksTo(64)));
        ENGLISH_GIRTH_STRAP_MORPHO = REGISTRY.registerItem("english_girth_strap_morpho",
                props -> new TackItem(TackItemDefinition.builder(TackType.GIRTH_STRAP).withData(
                                new GirthStrapTypeData(false, Collections.emptySet(),
                                        ColorUtil.ofDyeColor(DyeColor.WHITE),
                                        ColorUtil.ofDyeColor(DyeColor.WHITE)))
                        .rackTexture(RackType.SADDLE,
                                ModRef.res("textures/entity/rack/saddle/morpho_girth_strap_english.png")).build(),
                        props.stacksTo(64)));
        ENGLISH_BLANKET_MORPHO = REGISTRY.registerItem("english_blanket_morpho",
                props -> new TackItem(TackItemDefinition.builder(TackType.BLANKET)
                        .rackTexture(RackType.SADDLE, ModRef.res("textures/entity/rack/saddle/morpho_english_blanket.png"))
                        .rackTexture(RackType.BLANKET_5, ModRef.res("textures/entity/rack/blanket_5/morpho_english_blanket.png"))
                        .withData(new TackTypeData(false, Collections.emptySet(),
                                ColorUtil.ofDyeColor(DyeColor.WHITE))).build(),
                        props.stacksTo(64)));
        ENGLISH_LEG_WRAPS_MORPHO = REGISTRY.registerItem("english_leg_wraps_morpho",
                props -> new TackItem(TackItemDefinition.builder(TackType.LEG_WRAPS).withData(new TackTypeData(
                        false, Collections.emptySet(), ColorUtil.ofDyeColor(DyeColor.WHITE))).build(),
                        props.stacksTo(64)));
        QUARTER_SHEET_MORPHO = REGISTRY.registerItem("quarter_sheet_morpho",
                props -> new TackItem(TackItemDefinition.builder(TackType.BREAST_COLLAR).withData(new TackTypeData(
                        false, Collections.emptySet(), ColorUtil.ofDyeColor(DyeColor.WHITE))).build(),
                        props.stacksTo(64)));
        BAREBACK_SADDLE_MORPHO = REGISTRY.registerItem("bareback_saddle_morpho",
                props -> new TackItem(TackItemDefinition.builder(TackType.SADDLE).withData(new SaddleTypeData(
                        false, Collections.emptySet(), Color.ofRGB(tretackcolors[20][0], tretackcolors[20][1], tretackcolors[20][2]),
                        "western")).build(), props.stacksTo(64)));
        BITLESS_BRIDLE_MORPHO = REGISTRY.registerItem("english_bridle_bitless_morpho",
                props -> new TackItem(TackItemDefinition.builder(TackType.BRIDLE).withData(
                        new BridleTypeData(false, Collections.emptySet(),
                                ColorUtil.ofDyeColor(DyeColor.WHITE)
                                , "english")).build(),
                        props.stacksTo(64)));
        BAREBACK_GIRTH_STRAP_MORPHO = REGISTRY.registerItem("bareback_girth_strap_morpho",
                props -> new TackItem(TackItemDefinition.builder(TackType.GIRTH_STRAP).withData(
                                new GirthStrapTypeData(false, Collections.emptySet(),
                                        ColorUtil.ofDyeColor(DyeColor.WHITE),
                                        ColorUtil.ofDyeColor(DyeColor.WHITE)))
                        .rackTexture(RackType.SADDLE,
                                ModRef.res("textures/entity/rack/saddle/tre_girth_strap.png")).build(),
                        props.stacksTo(64)));
        BAREBACK_BLANKET_MORPHO = REGISTRY.registerItem("bareback_blanket_morpho",
                props -> new TackItem(TackItemDefinition.builder(TackType.BLANKET)
                        .rackTexture(RackType.SADDLE, ModRef.res("textures/entity/rack/saddle/morpho_bareback_blanket.png"))
                        .rackTexture(RackType.BLANKET_5, ModRef.res("textures/entity/rack/blanket_5/morpho_bareback_blanket.png"))
                        .withData(new TackTypeData(false, Collections.emptySet(),
                                ColorUtil.ofDyeColor(DyeColor.WHITE))).build(),
                        props.stacksTo(64)));


/// ════════════════════════════════════ MONARCH ════════════════════════════════════ ///
        FLAG_MONARCH = REGISTRY.registerItem("flag_monarch", Item::new);

        SIGN_COVER_MONARCH = REGISTRY.registerItem("sign_cover_monarch", Item::new);
        RILEY_SIGN_COVER_MONARCH = REGISTRY.registerItem("sign_cover_riley_monarch", Item::new);
        FABRIC_SIGN_COVER_MONARCH = REGISTRY.registerItem("sign_cover_fabric_monarch", Item::new);

        MONARCH_RIBBON_THREE_TAILS = REGISTRY.registerItem("ribbon_three_tails_monarch", Item::new);
        MONARCH_RIBBON_TWO_TAILS = REGISTRY.registerItem("ribbon_two_tails_monarch", Item::new);
        MONARCH_RIBBON_ONE_TAIL = REGISTRY.registerItem("ribbon_one_tail_monarch", Item::new);
        MONARCH_ROSETTE = REGISTRY.registerItem("rosette_monarch", Item::new);

        HALTER_MONARCH = REGISTRY.registerItem("halter_monarch",
                props -> new TackItem(TackItemDefinition.builder(TackType.HALTER).withData(new TackTypeData
                        (false, Collections.emptySet(), ColorUtil.ofDyeColor(DyeColor.WHITE))).build(),
                        props.stacksTo(64)));
        FLYMASK_MONARCH = REGISTRY.registerItem("flymask_monarch",
                props -> new TackItem(TackItemDefinition.builder(TackType.HALTER).withData(new TackTypeData
                        (false, Collections.emptySet(), ColorUtil.ofDyeColor(DyeColor.WHITE))).build(),
                        props.stacksTo(64)));
        PASTURE_BLANKET_MONARCH = REGISTRY.registerItem("pasture_blanket_monarch",
                props -> new TackItem(TackItemDefinition.builder(TackType.PASTURE_BLANKET).withData(
                                new PastureBlanketTypeData(false, Collections.emptySet(),
                                        ColorUtil.ofDyeColor(DyeColor.WHITE), false))
                        .rackTexture(RackType.PASTURE_BLANKET_SHORT_3,
                                ModRef.res("textures/entity/rack/pasture_blanket/rack_pasture_blanket_monarch_3_short.png"))
                        .rackTexture(RackType.PASTURE_BLANKET_LONG_5,
                                ModRef.res("textures/entity/rack/pasture_blanket/rack_pasture_blanket_monarch_5_long.png"))
                        .build(), props.stacksTo(64)));
        ADVENTURE_SADDLE_MONARCH = REGISTRY.registerItem("adventure_saddle_monarch",
                props -> new TackItem(TackItemDefinition.builder(TackType.SADDLE).withData(new SaddleTypeData(
                        true, Collections.emptySet(), ColorUtil.ofDyeColor(DyeColor.WHITE),
                        "adventure")).build(), props.stacksTo(64)));
        ADVENTURE_BRIDLE_MONARCH = REGISTRY.registerItem("adventure_bridle_monarch",
                props -> new TackItem(TackItemDefinition.builder(TackType.BRIDLE).withData(
                        new BridleTypeData(true, Collections.emptySet(),
                                ColorUtil.ofDyeColor(DyeColor.WHITE)
                                , "western")).build(),
                        props.stacksTo(64)));
        ADVENTURE_BREAST_COLLAR_MONARCH = REGISTRY.registerItem("adventure_breast_collar_monarch",
                props -> new TackItem(TackItemDefinition.builder(TackType.BREAST_COLLAR).withData(new TackTypeData(
                        true, Collections.emptySet(), ColorUtil.ofDyeColor(DyeColor.WHITE))).build(),
                        props.stacksTo(64)));
        ADVENTURE_GIRTH_STRAP_MONARCH = REGISTRY.registerItem("adventure_girth_strap_monarch",
                props -> new TackItem(TackItemDefinition.builder(TackType.GIRTH_STRAP).withData(
                                new GirthStrapTypeData(true, Collections.emptySet(),
                                        ColorUtil.ofDyeColor(DyeColor.WHITE),
                                        ColorUtil.ofDyeColor(DyeColor.WHITE)))
                        .rackTexture(RackType.SADDLE,
                                ModRef.res("textures/entity/rack/saddle/monarch_girth_strap_adventure.png")).build(),
                        props.stacksTo(64)));
        ADVENTURE_BLANKET_MONARCH = REGISTRY.registerItem("adventure_blanket_monarch",
                props -> new TackItem(TackItemDefinition.builder(TackType.BLANKET)
                        .rackTexture(RackType.SADDLE, ModRef.res("textures/entity/rack/saddle/monarch_adventure_blanket.png"))
                        .rackTexture(RackType.BLANKET_5, ModRef.res("textures/entity/rack/blanket_5/monarch_adventure_blanket.png"))
                        .withData(new TackTypeData(true, Collections.emptySet(),
                                ColorUtil.ofDyeColor(DyeColor.WHITE))).build(),
                        props.stacksTo(64)));
        ADVENTURE_LEG_WRAPS_MONARCH = REGISTRY.registerItem("adventure_leg_wraps_monarch",
                props -> new TackItem(TackItemDefinition.builder(TackType.LEG_WRAPS).withData(new TackTypeData(
                        true, Collections.emptySet(), ColorUtil.ofDyeColor(DyeColor.WHITE))).build(),
                        props.stacksTo(64)));
        CLOTH_HORSE_ARMOR_MONARCH = REGISTRY.registerItem("cloth_horse_armor_monarch",
                props -> new TackItem(TackItemDefinition.builder(TackType.HORSE_ARMOR).withData(new HorseArmorTypeData(
                        true, Collections.emptySet(), ColorUtil.ofDyeColor(DyeColor.WHITE),
                        HorseArmorTier.CLOTH.getTierName())).build(), props.stacksTo(64)));
        AMETHYST_HORSE_ARMOR_MONARCH = REGISTRY.registerItem("amethyst_horse_armor_monarch",
                props -> new TackItem(TackItemDefinition.builder(TackType.HORSE_ARMOR).withData(new HorseArmorTypeData(
                        true, Collections.emptySet(), ColorUtil.ofDyeColor(DyeColor.WHITE),
                        HorseArmorTier.AMETHYST.getTierName())).build(), props.stacksTo(64)));
        SADDLE_BAG_MONARCH = REGISTRY.registerItem("saddle_bag_monarch",
                props -> new SaddlebagItem(TackItemDefinition.builder(TackType.SADDLE_BAG).withData(new TackTypeData(
                        true, Collections.emptySet(),
                        ColorUtil.ofDyeColor(DyeColor.WHITE))).build(),
                        props.stacksTo(64).component(DataComponents.CONTAINER, ItemContainerContents.EMPTY)));
        WESTERN_SADDLE_MONARCH = REGISTRY.registerItem("western_saddle_monarch",
                props -> new TackItem(TackItemDefinition.builder(TackType.SADDLE).withData(new SaddleTypeData(
                        false, Collections.emptySet(), ColorUtil.ofDyeColor(DyeColor.WHITE),
                        "western")).build(), props.stacksTo(64)));
        WESTERN_BRIDLE_MONARCH = REGISTRY.registerItem("western_bridle_monarch",
                props -> new TackItem(TackItemDefinition.builder(TackType.BRIDLE).withData(
                        new BridleTypeData(false, Collections.emptySet(),
                                ColorUtil.ofDyeColor(DyeColor.WHITE)
                                , "western")).build(),
                        props.stacksTo(64)));
        WESTERN_BREAST_COLLAR_MONARCH = REGISTRY.registerItem("western_breast_collar_monarch",
                props -> new TackItem(TackItemDefinition.builder(TackType.BREAST_COLLAR).withData(new TackTypeData(
                        false, Collections.emptySet(), ColorUtil.ofDyeColor(DyeColor.WHITE))).build(),
                        props.stacksTo(64)));
        WESTERN_GIRTH_STRAP_MONARCH = REGISTRY.registerItem("western_girth_strap_monarch",
                props -> new TackItem(TackItemDefinition.builder(TackType.GIRTH_STRAP).withData(
                                new GirthStrapTypeData(false, Collections.emptySet(),
                                        ColorUtil.ofDyeColor(DyeColor.WHITE),
                                        ColorUtil.ofDyeColor(DyeColor.WHITE)))
                        .rackTexture(RackType.SADDLE,
                                ModRef.res("textures/entity/rack/saddle/monarch_girth_strap_western.png")).build(),
                        props.stacksTo(64)));
        WESTERN_BLANKET_MONARCH = REGISTRY.registerItem("western_blanket_monarch",
                props -> new TackItem(TackItemDefinition.builder(TackType.BLANKET)
                        .rackTexture(RackType.SADDLE, ModRef.res("textures/entity/rack/saddle/monarch_western_blanket.png"))
                        .rackTexture(RackType.BLANKET_5, ModRef.res("textures/entity/rack/blanket_5/monarch_western_blanket.png"))
                        .withData(new TackTypeData(false, Collections.emptySet(),
                                ColorUtil.ofDyeColor(DyeColor.WHITE))).build(),
                        props.stacksTo(64)));
        WESTERN_LEG_WRAPS_MONARCH = REGISTRY.registerItem("western_leg_wraps_monarch",
                props -> new TackItem(TackItemDefinition.builder(TackType.LEG_WRAPS).withData(new TackTypeData(
                        false, Collections.emptySet(), ColorUtil.ofDyeColor(DyeColor.WHITE))).build(),
                        props.stacksTo(64)));
        ENGLISH_SADDLE_MONARCH = REGISTRY.registerItem("english_saddle_monarch",
                props -> new TackItem(TackItemDefinition.builder(TackType.SADDLE).withData(new SaddleTypeData(
                        false, Collections.emptySet(), ColorUtil.ofDyeColor(DyeColor.WHITE),
                        "english")).build(), props.stacksTo(64)));
        ENGLISH_BRIDLE_MONARCH = REGISTRY.registerItem("english_bridle_monarch",
                props -> new TackItem(TackItemDefinition.builder(TackType.BRIDLE).withData(
                        new BridleTypeData(false, Collections.emptySet(),
                                ColorUtil.ofDyeColor(DyeColor.WHITE)
                                , "english")).build(),
                        props.stacksTo(64)));
        ENGLISH_BREAST_COLLAR_MONARCH = REGISTRY.registerItem("english_breast_collar_monarch",
                props -> new TackItem(TackItemDefinition.builder(TackType.BREAST_COLLAR).withData(new TackTypeData(
                        false, Collections.emptySet(), ColorUtil.ofDyeColor(DyeColor.WHITE))).build(),
                        props.stacksTo(64)));
        ENGLISH_GIRTH_STRAP_MONARCH = REGISTRY.registerItem("english_girth_strap_monarch",
                props -> new TackItem(TackItemDefinition.builder(TackType.GIRTH_STRAP).withData(
                                new GirthStrapTypeData(false, Collections.emptySet(),
                                        ColorUtil.ofDyeColor(DyeColor.WHITE),
                                        ColorUtil.ofDyeColor(DyeColor.WHITE)))
                        .rackTexture(RackType.SADDLE,
                                ModRef.res("textures/entity/rack/saddle/monarch_girth_strap_english.png")).build(),
                        props.stacksTo(64)));
        ENGLISH_BLANKET_MONARCH = REGISTRY.registerItem("english_blanket_monarch",
                props -> new TackItem(TackItemDefinition.builder(TackType.BLANKET)
                        .rackTexture(RackType.SADDLE, ModRef.res("textures/entity/rack/saddle/monarch_english_blanket.png"))
                        .rackTexture(RackType.BLANKET_5, ModRef.res("textures/entity/rack/blanket_5/monarch_english_blanket.png"))
                        .withData(new TackTypeData(false, Collections.emptySet(),
                                ColorUtil.ofDyeColor(DyeColor.WHITE))).build(),
                        props.stacksTo(64)));
        ENGLISH_LEG_WRAPS_MONARCH = REGISTRY.registerItem("english_leg_wraps_monarch",
                props -> new TackItem(TackItemDefinition.builder(TackType.LEG_WRAPS).withData(new TackTypeData(
                        false, Collections.emptySet(), ColorUtil.ofDyeColor(DyeColor.WHITE))).build(),
                        props.stacksTo(64)));
        QUARTER_SHEET_MONARCH = REGISTRY.registerItem("quarter_sheet_monarch",
                props -> new TackItem(TackItemDefinition.builder(TackType.BREAST_COLLAR).withData(new TackTypeData(
                        false, Collections.emptySet(), ColorUtil.ofDyeColor(DyeColor.WHITE))).build(),
                        props.stacksTo(64)));
        BAREBACK_SADDLE_MONARCH = REGISTRY.registerItem("bareback_saddle_monarch",
                props -> new TackItem(TackItemDefinition.builder(TackType.SADDLE).withData(new SaddleTypeData(
                        false, Collections.emptySet(), Color.ofRGB(tretackcolors[20][0], tretackcolors[20][1], tretackcolors[20][2]),
                        "western")).build(), props.stacksTo(64)));
        BITLESS_BRIDLE_MONARCH = REGISTRY.registerItem("english_bridle_bitless_monarch",
                props -> new TackItem(TackItemDefinition.builder(TackType.BRIDLE).withData(
                        new BridleTypeData(false, Collections.emptySet(),
                                ColorUtil.ofDyeColor(DyeColor.WHITE)
                                , "english")).build(),
                        props.stacksTo(64)));
        BAREBACK_GIRTH_STRAP_MONARCH = REGISTRY.registerItem("bareback_girth_strap_monarch",
                props -> new TackItem(TackItemDefinition.builder(TackType.GIRTH_STRAP).withData(
                                new GirthStrapTypeData(false, Collections.emptySet(),
                                        ColorUtil.ofDyeColor(DyeColor.WHITE),
                                        ColorUtil.ofDyeColor(DyeColor.WHITE)))
                        .rackTexture(RackType.SADDLE,
                                ModRef.res("textures/entity/rack/saddle/tre_girth_strap.png")).build(),
                        props.stacksTo(64)));
        BAREBACK_BLANKET_MONARCH = REGISTRY.registerItem("bareback_blanket_monarch",
                props -> new TackItem(TackItemDefinition.builder(TackType.BLANKET)
                        .rackTexture(RackType.SADDLE, ModRef.res("textures/entity/rack/saddle/monarch_bareback_blanket.png"))
                        .rackTexture(RackType.BLANKET_5, ModRef.res("textures/entity/rack/blanket_5/monarch_bareback_blanket.png"))
                        .withData(new TackTypeData(false, Collections.emptySet(),
                                ColorUtil.ofDyeColor(DyeColor.WHITE))).build(),
                        props.stacksTo(64)));


/// ════════════════════════════════════ RAINBOW ════════════════════════════════════ ///
        FLAG_RAINBOW = REGISTRY.registerItem("flag_rainbow", Item::new);

        SIGN_COVER_RILEY_RAINBOW = REGISTRY.registerItem("sign_cover_riley_rainbow", Item::new);
        SIGN_COVER_FABRIC_RAINBOW = REGISTRY.registerItem("sign_cover_fabric_rainbow", Item::new);
        SIGN_COVER_FLORAL_RAINBOW = REGISTRY.registerItem("sign_cover_floral_rainbow", Item::new);
        SIGN_COVER_SWIRL_RAINBOW = REGISTRY.registerItem("sign_cover_swirl_rainbow", Item::new);
        SIGN_COVER_LOOPED_RAINBOW = REGISTRY.registerItem("sign_cover_looped_rainbow", Item::new);
        SIGN_COVER_CHECKERED_RAINBOW = REGISTRY.registerItem("sign_cover_checkered_rainbow", Item::new);

        RAINBOW_RIBBON_THREE_TAILS = REGISTRY.registerItem("ribbon_three_tails_rainbow", Item::new);
        RAINBOW_RIBBON_TWO_TAILS = REGISTRY.registerItem("ribbon_two_tails_rainbow", Item::new);
        RAINBOW_RIBBON_ONE_TAIL = REGISTRY.registerItem("ribbon_one_tail_rainbow", Item::new);
        RAINBOW_ROSETTE = REGISTRY.registerItem("rosette_rainbow", Item::new);

        HALTER_RAINBOW =  REGISTRY.registerItem("halter_rainbow",
                props -> new TackItem(TackItemDefinition.builder(TackType.HALTER).withData(new TackTypeData
                        (false, Collections.emptySet(), ColorUtil.ofDyeColor(DyeColor.WHITE))).build(),
                        props.stacksTo(64)));
        FLYMASK_RAINBOW =  REGISTRY.registerItem("flymask_rainbow",
                props -> new TackItem(TackItemDefinition.builder(TackType.HALTER).withData(new TackTypeData
                        (false, Collections.emptySet(), ColorUtil.ofDyeColor(DyeColor.WHITE))).build(),
                        props.stacksTo(64)));
        PASTURE_BLANKET_RAINBOW =  REGISTRY.registerItem("pasture_blanket_rainbow",
                props -> new TackItem(TackItemDefinition.builder(TackType.PASTURE_BLANKET).withData(
                                new PastureBlanketTypeData(false, Collections.emptySet(),
                                        ColorUtil.ofDyeColor(DyeColor.WHITE), false))
                        .rackTexture(RackType.PASTURE_BLANKET_SHORT_3,
                                ModRef.res("textures/entity/rack/pasture_blanket/rack_pasture_blanket_rainbow_3_short.png"))
                        .rackTexture(RackType.PASTURE_BLANKET_LONG_5,
                                ModRef.res("textures/entity/rack/pasture_blanket/rack_pasture_blanket_rainbow_5_long.png"))
                        .build(), props.stacksTo(64)));
        PASTURE_BLANKET_RAINBOW_ARMORED =  REGISTRY.registerItem("pasture_blanket_rainbow_armored",
                props -> new TackItem(TackItemDefinition.builder(TackType.PASTURE_BLANKET)
                        .rackTexture(RackType.PASTURE_BLANKET_SHORT_3,
                                ModRef.res("textures/entity/rack/pasture_blanket/rack_pasture_blanket_rainbow_armored_3_short.png"))
                        .rackTexture(RackType.PASTURE_BLANKET_LONG_5,
                                ModRef.res("textures/entity/rack/pasture_blanket/rack_pasture_blanket_rainbow_armored_5_long.png"))
                        .withData(new PastureBlanketTypeData(false, Collections.emptySet(),
                                ColorUtil.ofDyeColor(DyeColor.WHITE), true)).build(),
                        props.stacksTo(64)));
        ADVENTURE_SADDLE_RAINBOW =  REGISTRY.registerItem("adventure_saddle_rainbow",
                props -> new TackItem(TackItemDefinition.builder(TackType.SADDLE).withData(new SaddleTypeData(
                        true, Collections.emptySet(), Color.ofRGB(tretackcolors[21][0], tretackcolors[21][1], tretackcolors[21][2]),
                        "adventure")).build(), props.stacksTo(64)));
        ADVENTURE_BRIDLE_RAINBOW = REGISTRY.registerItem("adventure_bridle_rainbow",
                props -> new TackItem(TackItemDefinition.builder(TackType.BRIDLE).withData(
                        new BridleTypeData(true, Collections.emptySet(),
                                Color.ofRGB(tretackcolors[21][0], tretackcolors[21][1], tretackcolors[21][2])
                                , "western")).build(),
                        props.stacksTo(64)));
        ADVENTURE_BREAST_COLLAR_RAINBOW =  REGISTRY.registerItem("adventure_breast_collar_rainbow",
                props -> new TackItem(TackItemDefinition.builder(TackType.BREAST_COLLAR).withData(new TackTypeData(
                        true, Collections.emptySet(), Color.ofRGB(tretackcolors[21][0], tretackcolors[21][1], tretackcolors[21][2]))).build(),
                        props.stacksTo(64)));
        ADVENTURE_GIRTH_STRAP_RAINBOW = REGISTRY.registerItem("adventure_girth_strap_rainbow",
                props -> new TackItem(TackItemDefinition.builder(TackType.GIRTH_STRAP).withData(
                                new GirthStrapTypeData(true, Collections.emptySet(),
                                        ColorUtil.ofDyeColor(DyeColor.WHITE),
                                        ColorUtil.ofDyeColor(DyeColor.WHITE)))
                        .rackTexture(RackType.SADDLE,
                                ModRef.res("textures/entity/rack/saddle/rainbow_girth_strap_adventure.png")).build(),
                        props.stacksTo(64)));
        ADVENTURE_BLANKET_RAINBOW =  REGISTRY.registerItem("adventure_blanket_rainbow",
                props -> new TackItem(TackItemDefinition.builder(TackType.BLANKET)
                        .rackTexture(RackType.SADDLE, ModRef.res("textures/entity/rack/saddle/rainbow_adventure_blanket.png"))
                        .rackTexture(RackType.BLANKET_5, ModRef.res("textures/entity/rack/blanket_5/rainbow_adventure_blanket.png"))
                        .withData(new TackTypeData(true, Collections.emptySet(),
                                ColorUtil.ofDyeColor(DyeColor.WHITE))).build(),
                        props.stacksTo(64)));
        ADVENTURE_LEG_WRAPS_RAINBOW =  REGISTRY.registerItem("adventure_leg_wraps_rainbow",
                props -> new TackItem(TackItemDefinition.builder(TackType.LEG_WRAPS).withData(new TackTypeData(
                        true, Collections.emptySet(), ColorUtil.ofDyeColor(DyeColor.WHITE))).build(),
                        props.stacksTo(64)));
        SADDLE_BAG_RAINBOW = REGISTRY.registerItem("saddle_bag_rainbow",
                props -> new SaddlebagItem(TackItemDefinition.builder(TackType.SADDLE_BAG).withData(new TackTypeData(
                        true, Collections.emptySet(),
                        Color.ofRGB(tretackcolors[21][0], tretackcolors[21][1], tretackcolors[21][2]))).build(),
                        props.stacksTo(64).component(DataComponents.CONTAINER, ItemContainerContents.EMPTY)));
        IRON_HORSE_ARMOR_RAINBOW = REGISTRY.registerItem("iron_horse_armor_rainbow",
                props -> new TackItem(TackItemDefinition.builder(TackType.HORSE_ARMOR).withData(new HorseArmorTypeData(
                        true, Collections.emptySet(), ColorUtil.ofDyeColor(DyeColor.WHITE),
                        HorseArmorTier.IRON.getTierName())).build(), props.stacksTo(64)));
        AMETHYST_HORSE_ARMOR_RAINBOW = REGISTRY.registerItem("amethyst_horse_armor_rainbow",
                props -> new TackItem(TackItemDefinition.builder(TackType.HORSE_ARMOR).withData(new HorseArmorTypeData(
                        true, Collections.emptySet(), ColorUtil.ofDyeColor(DyeColor.WHITE),
                        HorseArmorTier.AMETHYST.getTierName())).build(), props.stacksTo(64)));
        WESTERN_SADDLE_RAINBOW =  REGISTRY.registerItem("western_saddle_rainbow",
                props -> new TackItem(TackItemDefinition.builder(TackType.SADDLE).withData(new SaddleTypeData(
                        false, Collections.emptySet(), Color.ofRGB(tretackcolors[21][0], tretackcolors[21][1], tretackcolors[21][2]),
                        "western")).build(), props.stacksTo(64)));
        WESTERN_BRIDLE_RAINBOW = REGISTRY.registerItem("western_bridle_rainbow",
                props -> new TackItem(TackItemDefinition.builder(TackType.BRIDLE).withData(
                        new BridleTypeData(false, Collections.emptySet(),
                                Color.ofRGB(tretackcolors[21][0], tretackcolors[21][1], tretackcolors[21][2])
                                , "western")).build(),
                        props.stacksTo(64)));
        WESTERN_BREAST_COLLAR_RAINBOW =  REGISTRY.registerItem("western_breast_collar_rainbow",
                props -> new TackItem(TackItemDefinition.builder(TackType.BREAST_COLLAR).withData(new TackTypeData(
                        false, Collections.emptySet(), Color.ofRGB(tretackcolors[21][0], tretackcolors[21][1], tretackcolors[21][2]))).build(),
                        props.stacksTo(64)));
        WESTERN_GIRTH_STRAP_RAINBOW = REGISTRY.registerItem("western_girth_strap_rainbow",
                props -> new TackItem(TackItemDefinition.builder(TackType.GIRTH_STRAP).withData(
                                new GirthStrapTypeData(false, Collections.emptySet(),
                                        ColorUtil.ofDyeColor(DyeColor.WHITE),
                                        ColorUtil.ofDyeColor(DyeColor.WHITE)))
                        .rackTexture(RackType.SADDLE,
                                ModRef.res("textures/entity/rack/saddle/rainbow_girth_strap_western.png")).build(),
                        props.stacksTo(64)));
        WESTERN_BLANKET_RAINBOW =  REGISTRY.registerItem("western_blanket_rainbow",
                props -> new TackItem(TackItemDefinition.builder(TackType.BLANKET)
                        .rackTexture(RackType.SADDLE, ModRef.res("textures/entity/rack/saddle/rainbow_western_blanket.png"))
                        .rackTexture(RackType.BLANKET_5, ModRef.res("textures/entity/rack/blanket_5/rainbow_western_blanket.png"))
                        .withData(new TackTypeData(false, Collections.emptySet(),
                                ColorUtil.ofDyeColor(DyeColor.WHITE))).build(),
                        props.stacksTo(64)));
        WESTERN_LEG_WRAPS_RAINBOW =  REGISTRY.registerItem("western_leg_wraps_rainbow",
                props -> new TackItem(TackItemDefinition.builder(TackType.LEG_WRAPS).withData(new TackTypeData(
                        false, Collections.emptySet(), ColorUtil.ofDyeColor(DyeColor.WHITE))).build(),
                        props.stacksTo(64)));
        ENGLISH_SADDLE_RAINBOW =  REGISTRY.registerItem("english_saddle_rainbow",
                props -> new TackItem(TackItemDefinition.builder(TackType.SADDLE).withData(new SaddleTypeData(
                        false, Collections.emptySet(), Color.ofRGB(tretackcolors[20][0], tretackcolors[20][1], tretackcolors[20][2]),
                        "english")).build(), props.stacksTo(64)));
        ENGLISH_BRIDLE_RAINBOW = REGISTRY.registerItem("english_bridle_rainbow",
                props -> new TackItem(TackItemDefinition.builder(TackType.BRIDLE).withData(
                        new BridleTypeData(false, Collections.emptySet(),
                                Color.ofRGB(tretackcolors[20][0], tretackcolors[20][1], tretackcolors[20][2])
                                , "english")).build(),
                        props.stacksTo(64)));
        ENGLISH_BREAST_COLLAR_RAINBOW =  REGISTRY.registerItem("english_breast_collar_rainbow",
                props -> new TackItem(TackItemDefinition.builder(TackType.BREAST_COLLAR).withData(new TackTypeData(
                        false, Collections.emptySet(), Color.ofRGB(tretackcolors[20][0], tretackcolors[20][1], tretackcolors[20][2]))).build(),
                        props.stacksTo(64)));
        ENGLISH_GIRTH_STRAP_RAINBOW = REGISTRY.registerItem("english_girth_strap_rainbow",
                props -> new TackItem(TackItemDefinition.builder(TackType.GIRTH_STRAP).withData(
                                new GirthStrapTypeData(false, Collections.emptySet(),
                                        ColorUtil.ofDyeColor(DyeColor.WHITE),
                                        ColorUtil.ofDyeColor(DyeColor.WHITE)))
                        .rackTexture(RackType.SADDLE,
                                ModRef.res("textures/entity/rack/saddle/rainbow_girth_strap_english.png")).build(),
                        props.stacksTo(64)));
        ENGLISH_BLANKET_RAINBOW =  REGISTRY.registerItem("english_blanket_rainbow",
                props -> new TackItem(TackItemDefinition.builder(TackType.BLANKET)
                        .rackTexture(RackType.SADDLE, ModRef.res("textures/entity/rack/saddle/rainbow_english_blanket.png"))
                        .rackTexture(RackType.BLANKET_5, ModRef.res("textures/entity/rack/blanket_5/rainbow_english_blanket.png"))
                        .withData(new TackTypeData(false, Collections.emptySet(),
                                ColorUtil.ofDyeColor(DyeColor.WHITE))).build(),
                        props.stacksTo(64)));
        ENGLISH_LEG_WRAPS_RAINBOW =  REGISTRY.registerItem("english_leg_wraps_rainbow",
                props -> new TackItem(TackItemDefinition.builder(TackType.LEG_WRAPS).withData(new TackTypeData(
                        false, Collections.emptySet(), ColorUtil.ofDyeColor(DyeColor.WHITE))).build(),
                        props.stacksTo(64)));
        QUARTER_SHEET_BLACK_RAINBOW = REGISTRY.registerItem("quarter_sheet_black_rainbow",
                props -> new TackItem(TackItemDefinition.builder(TackType.BREAST_COLLAR).withData(new TackTypeData(
                        false, Collections.emptySet(), Color.ofRGB(tretackcolors[20][0], tretackcolors[20][1], tretackcolors[20][2]))).build(),
                        props.stacksTo(64)));
        QUARTER_SHEET_WHITE_RAINBOW = REGISTRY.registerItem("quarter_sheet_white_rainbow",
                props -> new TackItem(TackItemDefinition.builder(TackType.BREAST_COLLAR).withData(new TackTypeData(
                        false, Collections.emptySet(), ColorUtil.ofDyeColor(DyeColor.WHITE))).build(),
                        props.stacksTo(64)));
        CLOTH_BITLESS_BRIDLE_RAINBOW = REGISTRY.registerItem("cloth_bitless_bridle_rainbow",
                props -> new TackItem(TackItemDefinition.builder(TackType.BRIDLE).withData(
                        new BridleTypeData(false, Collections.emptySet(),
                                ColorUtil.ofDyeColor(DyeColor.WHITE)
                                , "english")).build(),
                        props.stacksTo(64)));
        BAREBACK_BLANKET_RAINBOW = REGISTRY.registerItem("bareback_blanket_rainbow",
                props -> new TackItem(TackItemDefinition.builder(TackType.BLANKET)
                        .rackTexture(RackType.SADDLE, ModRef.res("textures/entity/rack/saddle/rainbow_bareback_blanket.png"))
                        .rackTexture(RackType.BLANKET_5, ModRef.res("textures/entity/rack/blanket_5/rainbow_bareback_blanket.png"))
                        .withData(new TackTypeData(false, Collections.emptySet(),
                                ColorUtil.ofDyeColor(DyeColor.WHITE))).build(),
                        props.stacksTo(64)));


/// ════════════════════════════════════ HOUND ════════════════════════════════════ ///
        FLAG_HOUND = REGISTRY.registerItem("flag_hound", Item::new);

        RILEY_SIGN_COVER_HOUND = REGISTRY.registerItem("sign_cover_riley_hound", Item::new);
        FABRIC_SIGN_COVER_HOUND = REGISTRY.registerItem("sign_cover_fabric_hound", Item::new);

        HOUND_RIBBON_THREE_TAILS = REGISTRY.registerItem("ribbon_three_tails_hound", Item::new);
        HOUND_RIBBON_TWO_TAILS = REGISTRY.registerItem("ribbon_two_tails_hound", Item::new);
        HOUND_RIBBON_ONE_TAIL = REGISTRY.registerItem("ribbon_one_tail_hound", Item::new);
        HOUND_ROSETTE = REGISTRY.registerItem("rosette_hound", Item::new);

        HALTER_HOUND = REGISTRY.registerItem("halter_hound",
                props -> new TackItem(TackItemDefinition.builder(TackType.HALTER).withData(new TackTypeData
                        (false, Collections.emptySet(), ColorUtil.ofDyeColor(DyeColor.WHITE))).build(),
                        props.stacksTo(64)));
        FLYMASK_HOUND = REGISTRY.registerItem("flymask_hound",
                props -> new TackItem(TackItemDefinition.builder(TackType.HALTER).withData(new TackTypeData
                        (false, Collections.emptySet(), ColorUtil.ofDyeColor(DyeColor.WHITE))).build(),
                        props.stacksTo(64)));
        PASTURE_BLANKET_HOUND = REGISTRY.registerItem("pasture_blanket_hound",
                props -> new TackItem(TackItemDefinition.builder(TackType.PASTURE_BLANKET).withData(
                                new PastureBlanketTypeData(false, Collections.emptySet(),
                                        ColorUtil.ofDyeColor(DyeColor.WHITE), false))
                        .rackTexture(RackType.PASTURE_BLANKET_SHORT_3,
                                ModRef.res("textures/entity/rack/pasture_blanket/rack_pasture_blanket_hound_3_short.png"))
                        .rackTexture(RackType.PASTURE_BLANKET_LONG_5,
                                ModRef.res("textures/entity/rack/pasture_blanket/rack_pasture_blanket_hound_5_long.png"))
                        .build(), props.stacksTo(64)));
        PASTURE_BLANKET_HOUND_ARMORED =  REGISTRY.registerItem("pasture_blanket_hound_armored",
                props -> new TackItem(TackItemDefinition.builder(TackType.PASTURE_BLANKET)
                        .rackTexture(RackType.PASTURE_BLANKET_SHORT_3,
                                ModRef.res("textures/entity/rack/pasture_blanket/rack_pasture_blanket_hound_armored_3_short.png"))
                        .rackTexture(RackType.PASTURE_BLANKET_LONG_5,
                                ModRef.res("textures/entity/rack/pasture_blanket/rack_pasture_blanket_hound_armored_5_long.png"))
                        .withData(new PastureBlanketTypeData(false, Collections.emptySet(),
                                ColorUtil.ofDyeColor(DyeColor.WHITE), true)).build(),
                        props.stacksTo(64)));
        ADVENTURE_SADDLE_HOUND = REGISTRY.registerItem("adventure_saddle_hound",
                props -> new TackItem(TackItemDefinition.builder(TackType.SADDLE).withData(new SaddleTypeData(
                        true, Collections.emptySet(), ColorUtil.ofDyeColor(DyeColor.WHITE),
                        "adventure")).build(), props.stacksTo(64)));
        ADVENTURE_BRIDLE_HOUND = REGISTRY.registerItem("adventure_bridle_hound",
                props -> new TackItem(TackItemDefinition.builder(TackType.BRIDLE).withData(
                        new BridleTypeData(true, Collections.emptySet(),
                                ColorUtil.ofDyeColor(DyeColor.WHITE)
                                , "western")).build(),
                        props.stacksTo(64)));
        ADVENTURE_BREAST_COLLAR_HOUND = REGISTRY.registerItem("adventure_breast_collar_hound",
                props -> new TackItem(TackItemDefinition.builder(TackType.BREAST_COLLAR).withData(new TackTypeData(
                        true, Collections.emptySet(), ColorUtil.ofDyeColor(DyeColor.WHITE))).build(),
                        props.stacksTo(64)));
        ADVENTURE_GIRTH_STRAP_HOUND = REGISTRY.registerItem("adventure_girth_strap_hound",
                props -> new TackItem(TackItemDefinition.builder(TackType.GIRTH_STRAP).withData(
                                new GirthStrapTypeData(true, Collections.emptySet(),
                                        ColorUtil.ofDyeColor(DyeColor.WHITE),
                                        ColorUtil.ofDyeColor(DyeColor.WHITE)))
                        .rackTexture(RackType.SADDLE,
                                ModRef.res("textures/entity/rack/saddle/hound_girth_strap_adventure.png")).build(),
                        props.stacksTo(64)));
        ADVENTURE_BLANKET_HOUND = REGISTRY.registerItem("adventure_blanket_hound",
                props -> new TackItem(TackItemDefinition.builder(TackType.BLANKET)
                        .rackTexture(RackType.SADDLE, ModRef.res("textures/entity/rack/saddle/hound_adventure_blanket.png"))
                        .rackTexture(RackType.BLANKET_5, ModRef.res("textures/entity/rack/blanket_5/hound_adventure_blanket.png"))
                        .withData(new TackTypeData(true, Collections.emptySet(),
                                ColorUtil.ofDyeColor(DyeColor.WHITE))).build(),
                        props.stacksTo(64)));
        ADVENTURE_LEG_WRAPS_HOUND = REGISTRY.registerItem("adventure_leg_wraps_hound",
                props -> new TackItem(TackItemDefinition.builder(TackType.LEG_WRAPS).withData(new TackTypeData(
                        true, Collections.emptySet(), ColorUtil.ofDyeColor(DyeColor.WHITE))).build(),
                        props.stacksTo(64)));
        CLOTH_HORSE_ARMOR_HOUND = REGISTRY.registerItem("cloth_horse_armor_hound",
                props -> new TackItem(TackItemDefinition.builder(TackType.HORSE_ARMOR).withData(new HorseArmorTypeData(
                        true, Collections.emptySet(), ColorUtil.ofDyeColor(DyeColor.WHITE),
                        HorseArmorTier.CLOTH.getTierName())).build(), props.stacksTo(64)));
        AMETHYST_HORSE_ARMOR_HOUND = REGISTRY.registerItem("amethyst_horse_armor_hound",
                props -> new TackItem(TackItemDefinition.builder(TackType.HORSE_ARMOR).withData(new HorseArmorTypeData(
                        true, Collections.emptySet(), ColorUtil.ofDyeColor(DyeColor.WHITE),
                        HorseArmorTier.AMETHYST.getTierName())).build(), props.stacksTo(64)));
        SADDLE_BAG_HOUND = REGISTRY.registerItem("saddle_bag_hound",
                props -> new SaddlebagItem(TackItemDefinition.builder(TackType.SADDLE_BAG).withData(new TackTypeData(
                        true, Collections.emptySet(),
                        ColorUtil.ofDyeColor(DyeColor.WHITE))).build(),
                        props.stacksTo(64).component(DataComponents.CONTAINER, ItemContainerContents.EMPTY)));
        WESTERN_SADDLE_HOUND = REGISTRY.registerItem("western_saddle_hound",
                props -> new TackItem(TackItemDefinition.builder(TackType.SADDLE).withData(new SaddleTypeData(
                        false, Collections.emptySet(), ColorUtil.ofDyeColor(DyeColor.WHITE),
                        "western")).build(), props.stacksTo(64)));
        WESTERN_BRIDLE_HOUND = REGISTRY.registerItem("western_bridle_hound",
                props -> new TackItem(TackItemDefinition.builder(TackType.BRIDLE).withData(
                        new BridleTypeData(false, Collections.emptySet(),
                                ColorUtil.ofDyeColor(DyeColor.WHITE)
                                , "western")).build(),
                        props.stacksTo(64)));
        WESTERN_BREAST_COLLAR_HOUND = REGISTRY.registerItem("western_breast_collar_hound",
                props -> new TackItem(TackItemDefinition.builder(TackType.BREAST_COLLAR).withData(new TackTypeData(
                        false, Collections.emptySet(), ColorUtil.ofDyeColor(DyeColor.WHITE))).build(),
                        props.stacksTo(64)));
        WESTERN_GIRTH_STRAP_HOUND = REGISTRY.registerItem("western_girth_strap_hound",
                props -> new TackItem(TackItemDefinition.builder(TackType.GIRTH_STRAP).withData(
                                new GirthStrapTypeData(false, Collections.emptySet(),
                                        ColorUtil.ofDyeColor(DyeColor.WHITE),
                                        ColorUtil.ofDyeColor(DyeColor.WHITE)))
                        .rackTexture(RackType.SADDLE,
                                ModRef.res("textures/entity/rack/saddle/hound_girth_strap_western.png")).build(),
                        props.stacksTo(64)));
        WESTERN_BLANKET_HOUND = REGISTRY.registerItem("western_blanket_hound",
                props -> new TackItem(TackItemDefinition.builder(TackType.BLANKET)
                        .rackTexture(RackType.SADDLE, ModRef.res("textures/entity/rack/saddle/hound_western_blanket.png"))
                        .rackTexture(RackType.BLANKET_5, ModRef.res("textures/entity/rack/blanket_5/hound_western_blanket.png"))
                        .withData(new TackTypeData(false, Collections.emptySet(),
                                ColorUtil.ofDyeColor(DyeColor.WHITE))).build(),
                        props.stacksTo(64)));
        WESTERN_LEG_WRAPS_HOUND = REGISTRY.registerItem("western_leg_wraps_hound",
                props -> new TackItem(TackItemDefinition.builder(TackType.LEG_WRAPS).withData(new TackTypeData(
                        false, Collections.emptySet(), ColorUtil.ofDyeColor(DyeColor.WHITE))).build(),
                        props.stacksTo(64)));
        ENGLISH_SADDLE_HOUND = REGISTRY.registerItem("english_saddle_hound",
                props -> new TackItem(TackItemDefinition.builder(TackType.SADDLE).withData(new SaddleTypeData(
                        false, Collections.emptySet(), ColorUtil.ofDyeColor(DyeColor.WHITE),
                        "english")).build(), props.stacksTo(64)));
        ENGLISH_BRIDLE_HOUND = REGISTRY.registerItem("english_bridle_hound",
                props -> new TackItem(TackItemDefinition.builder(TackType.BRIDLE).withData(
                        new BridleTypeData(false, Collections.emptySet(),
                                ColorUtil.ofDyeColor(DyeColor.WHITE)
                                , "english")).build(),
                        props.stacksTo(64)));
        ENGLISH_BREAST_COLLAR_HOUND = REGISTRY.registerItem("english_breast_collar_hound",
                props -> new TackItem(TackItemDefinition.builder(TackType.BREAST_COLLAR).withData(new TackTypeData(
                        false, Collections.emptySet(), ColorUtil.ofDyeColor(DyeColor.WHITE))).build(),
                        props.stacksTo(64)));
        ENGLISH_GIRTH_STRAP_HOUND = REGISTRY.registerItem("english_girth_strap_hound",
                props -> new TackItem(TackItemDefinition.builder(TackType.GIRTH_STRAP).withData(
                                new GirthStrapTypeData(false, Collections.emptySet(),
                                        ColorUtil.ofDyeColor(DyeColor.WHITE),
                                        ColorUtil.ofDyeColor(DyeColor.WHITE)))
                        .rackTexture(RackType.SADDLE,
                                ModRef.res("textures/entity/rack/saddle/hound_girth_strap_english.png")).build(),
                        props.stacksTo(64)));
        ENGLISH_BLANKET_HOUND = REGISTRY.registerItem("english_blanket_hound",
                props -> new TackItem(TackItemDefinition.builder(TackType.BLANKET)
                        .rackTexture(RackType.SADDLE, ModRef.res("textures/entity/rack/saddle/hound_english_blanket.png"))
                        .rackTexture(RackType.BLANKET_5, ModRef.res("textures/entity/rack/blanket_5/hound_english_blanket.png"))
                        .withData(new TackTypeData(false, Collections.emptySet(),
                                ColorUtil.ofDyeColor(DyeColor.WHITE))).build(),
                        props.stacksTo(64)));
        ENGLISH_LEG_WRAPS_HOUND = REGISTRY.registerItem("english_leg_wraps_hound",
                props -> new TackItem(TackItemDefinition.builder(TackType.LEG_WRAPS).withData(new TackTypeData(
                        false, Collections.emptySet(), ColorUtil.ofDyeColor(DyeColor.WHITE))).build(),
                        props.stacksTo(64)));
        QUARTER_SHEET_HOUND = REGISTRY.registerItem("quarter_sheet_hound",
                props -> new TackItem(TackItemDefinition.builder(TackType.BREAST_COLLAR).withData(new TackTypeData(
                        false, Collections.emptySet(), ColorUtil.ofDyeColor(DyeColor.WHITE))).build(),
                        props.stacksTo(64)));
        BAREBACK_SADDLE_HOUND = REGISTRY.registerItem("bareback_saddle_hound",
                props -> new TackItem(TackItemDefinition.builder(TackType.SADDLE).withData(new SaddleTypeData(
                        false, Collections.emptySet(), Color.ofRGB(tretackcolors[20][0], tretackcolors[20][1], tretackcolors[20][2]),
                        "western")).build(), props.stacksTo(64)));
        BITLESS_BRIDLE_HOUND = REGISTRY.registerItem("english_bridle_bitless_hound",
                props -> new TackItem(TackItemDefinition.builder(TackType.BRIDLE).withData(
                        new BridleTypeData(false, Collections.emptySet(),
                                ColorUtil.ofDyeColor(DyeColor.WHITE)
                                , "english")).build(),
                        props.stacksTo(64)));
        BAREBACK_GIRTH_STRAP_HOUND = REGISTRY.registerItem("bareback_girth_strap_hound",
                props -> new TackItem(TackItemDefinition.builder(TackType.GIRTH_STRAP).withData(
                                new GirthStrapTypeData(false, Collections.emptySet(),
                                        ColorUtil.ofDyeColor(DyeColor.WHITE),
                                        ColorUtil.ofDyeColor(DyeColor.WHITE)))
                        .rackTexture(RackType.SADDLE,
                                ModRef.res("textures/entity/rack/saddle/tre_girth_strap.png")).build(),
                        props.stacksTo(64)));
        BAREBACK_BLANKET_HOUND = REGISTRY.registerItem("bareback_blanket_hound",
                props -> new TackItem(TackItemDefinition.builder(TackType.BLANKET)
                        .rackTexture(RackType.SADDLE, ModRef.res("textures/entity/rack/saddle/hound_bareback_blanket.png"))
                        .rackTexture(RackType.BLANKET_5, ModRef.res("textures/entity/rack/blanket_5/hound_bareback_blanket.png"))
                        .withData(new TackTypeData(false, Collections.emptySet(),
                                ColorUtil.ofDyeColor(DyeColor.WHITE))).build(),
                        props.stacksTo(64)));



/// ════════════════════════════════════ CRAFTABLE NUMBERED (Tackshop Colors) ════════════════════════════════════ ///
        DYES = new ArrayList<>();
        FLAGS = new ArrayList<>();
        FLAGS_BUTTERFLY = new ArrayList<>();

        SIGN_COVERS_RILEY = new ArrayList<>();
        SIGN_COVERS_FABRIC = new ArrayList<>();
        SIGN_COVERS_FLORAL = new ArrayList<>();
        SIGN_COVERS_SWIRL = new ArrayList<>();
        SIGN_COVERS_LOOPED = new ArrayList<>();
        SIGN_COVERS_CHECKERED = new ArrayList<>();

        TRE_RIBBON_THREE_TAILS = new ArrayList<>();
        TRE_RIBBON_TWO_TAILS = new ArrayList<>();
        TRE_RIBBON_ONE_TAIL = new ArrayList<>();
        TRE_ROSETTE = new ArrayList<>();

        HALTERS = new ArrayList<>();
        FLYMASKS = new ArrayList<>();
        PASTURE_BLANKETS = new ArrayList<>();
        PASTURE_BLANKETS_ARMORED = new ArrayList<>();
        ADVENTURE_SADDLES = new ArrayList<>();
        ADVENTURE_BRIDLES = new ArrayList<>();
        ADVENTURE_BREAST_COLLARS = new ArrayList<>();
        ADVENTURE_GIRTH_STRAPS = new ArrayList<>();
        ADVENTURE_BLANKETS = new ArrayList<>();
        ADVENTURE_LEG_WRAPS = new ArrayList<>();
        CLOTH_HORSE_ARMORS = new ArrayList<>();
        AMETHYST_HORSE_ARMORS = new ArrayList<>();
        SADDLE_BAGS = new ArrayList<>();
        WESTERN_SADDLES = new ArrayList<>();
        WESTERN_BRIDLES = new ArrayList<>();
        WESTERN_BREAST_COLLARS = new ArrayList<>();
        WESTERN_GIRTH_STRAPS = new ArrayList<>();
        WESTERN_BLANKETS = new ArrayList<>();
        WESTERN_LEG_WRAPS = new ArrayList<>();
        ENGLISH_SADDLES_BLACK = new ArrayList<>();
        ENGLISH_SADDLES_BROWN = new ArrayList<>();
        ENGLISH_BRIDLES_BLACK = new ArrayList<>();
        ENGLISH_BRIDLES_BROWN = new ArrayList<>();
        CLOTH_BRIDLES = new ArrayList<>();
        ENGLISH_BREAST_COLLARS_BLACK = new ArrayList<>();
        ENGLISH_BREAST_COLLARS_BROWN = new ArrayList<>();
        CLOTH_BREAST_COLLARS = new ArrayList<>();
        ENGLISH_GIRTH_STRAPS_BLACK = new ArrayList<>();
        ENGLISH_GIRTH_STRAPS_BROWN = new ArrayList<>();
        CLOTH_GIRTH_STRAPS = new ArrayList<>();
        ENGLISH_BLANKETS = new ArrayList<>();
        ENGLISH_LEG_WRAPS = new ArrayList<>();
        QUARTER_SHEETS = new ArrayList<>();
        BAREBACK_SADDLES = new ArrayList<>();
        CLOTH_BITLESS_BRIDLES = new ArrayList<>();
        BAREBACK_GIRTH_STRAPS = new ArrayList<>();
        BAREBACK_BLANKETS = new ArrayList<>();

        int var1 = 15;

        var rContext = new Object() {
            int var2 = 1;
        };
        var rEngBlackColor = new Object() {
            final int varE = 1;
        };
        var rEngBrownColor = new Object() {
            final int varEO = 1;
        };
        var rWestColor = new Object() {
            final int varW = 1;
        };

        while (rContext.var2 < var1) {
            int temp_english_black_color_value = rEngBlackColor.varE;
            int temp_western_color_value = rWestColor.varW;
            int temp_english_brown_color_value = rEngBrownColor.varEO;
            int counter = rContext.var2;
            boolean a = counter < 7;
            boolean b = counter > 6;
            boolean c = counter == 13;
            boolean d = counter == 14;
            if (a) {
                temp_english_black_color_value = 15;
                temp_western_color_value = 16;
                temp_english_brown_color_value = 16;
            }
            if (b) {
                temp_english_black_color_value = 16;
                temp_western_color_value = 17;
                temp_english_brown_color_value = 15;
            }
            if (c) {
                temp_english_black_color_value = 15;
                temp_western_color_value = 16;
                temp_english_brown_color_value = 16;
            }
            if (d) {
                temp_english_black_color_value = 16;
                temp_western_color_value = 17;
                temp_english_brown_color_value = 15;
            }
            int final_western_color_value = temp_western_color_value;
            int final_english_black_color_value = temp_english_black_color_value;
            int final_english_brown_color_value = temp_english_brown_color_value;

            DYES.add(REGISTRY.registerItem("dye_" + counter, props ->
                    new Item(props)
            ));
            FLAGS.add(REGISTRY.registerItem("flag_" + counter, props ->
                    new Item(props)));
            FLAGS_BUTTERFLY.add(REGISTRY.registerItem("flag_butterfly_" + counter, props ->
                    new Item(props)));

            SIGN_COVERS_RILEY.add(REGISTRY.registerItem("sign_cover_riley_" + counter, props ->
                    new Item(props)));
            SIGN_COVERS_FABRIC.add(REGISTRY.registerItem("sign_cover_fabric_" + counter, props ->
                    new Item(props)));
            SIGN_COVERS_FLORAL.add(REGISTRY.registerItem("sign_cover_floral_" + counter, props ->
                    new Item(props)));
            SIGN_COVERS_SWIRL.add(REGISTRY.registerItem("sign_cover_swirl_" + counter, props ->
                    new Item(props)));
            SIGN_COVERS_LOOPED.add(REGISTRY.registerItem("sign_cover_looped_" + counter, props ->
                    new Item(props)));
            SIGN_COVERS_CHECKERED.add(REGISTRY.registerItem("sign_cover_checkered_" + counter, props ->
                    new Item(props)));

            TRE_RIBBON_THREE_TAILS.add(REGISTRY.registerItem("ribbon_three_tails_" + counter, props ->
                    new Item(props)
            ));
            TRE_RIBBON_TWO_TAILS.add(REGISTRY.registerItem("ribbon_two_tails_" + counter, props ->
                    new Item(props)
            ));
            TRE_RIBBON_ONE_TAIL.add(REGISTRY.registerItem("ribbon_one_tail_" + counter, props ->
                    new Item(props)
            ));
            TRE_ROSETTE.add(REGISTRY.registerItem("rosette_" + counter, props ->
                    new Item(props)
            ));

            HALTERS.add( REGISTRY.registerItem("halter_" + counter, props ->
                    new TackItem(TackItemDefinition.builder(TackType.HALTER).withData(new TackTypeData
                            (false, Collections.emptySet(), Color.ofRGB(tretackcolors[counter][0], tretackcolors[counter][1], tretackcolors[counter][2]))).build(),
                            props.stacksTo(64))
            ));
            FLYMASKS.add( REGISTRY.registerItem("flymask_" + counter, props ->
                    new TackItem(TackItemDefinition.builder(TackType.HALTER).withData(new TackTypeData
                            (false, Collections.emptySet(), Color.ofRGB(tretackcolors[counter][0], tretackcolors[counter][1], tretackcolors[counter][2]))).build(),
                            props.stacksTo(64))
            ));
            PASTURE_BLANKETS.add( REGISTRY.registerItem("pasture_blanket_" + counter, props ->
                    new TackItem(TackItemDefinition.builder(TackType.PASTURE_BLANKET).withData(
                                    new PastureBlanketTypeData(false, Collections.emptySet(),
                                            Color.ofRGB(tretackcolors[counter][0], tretackcolors[counter][1], tretackcolors[counter][2])
                                            , false))
                            .rackTexture(RackType.PASTURE_BLANKET_SHORT_3,
                                    ModRef.res("textures/entity/rack/pasture_blanket/rack_tre_pasture_blanket_3_short.png"))
                            .rackTexture(RackType.PASTURE_BLANKET_LONG_5,
                                    ModRef.res("textures/entity/rack/pasture_blanket/rack_tre_pasture_blanket_5_long.png"))
                            .build(), props.stacksTo(64))
            ));
            PASTURE_BLANKETS_ARMORED.add( REGISTRY.registerItem("pasture_blanket_" + counter + "_armored", props ->
                    new TackItem(TackItemDefinition.builder(TackType.PASTURE_BLANKET)
                            .rackTexture(RackType.PASTURE_BLANKET_SHORT_3,
                                    ModRef.res("textures/entity/rack/pasture_blanket/rack_tre_pasture_blanket_armored_3_short.png"))
                            .rackTexture(RackType.PASTURE_BLANKET_LONG_5,
                                    ModRef.res("textures/entity/rack/pasture_blanket/rack_tre_pasture_blanket_armored_5_long.png"))
                            .withData(new PastureBlanketTypeData(false, Collections.emptySet(),
                                    Color.ofRGB(tretackcolors[counter][0], tretackcolors[counter][1], tretackcolors[counter][2]),
                                    true)).build(), props.stacksTo(64))
            ));
            ADVENTURE_SADDLES.add( REGISTRY.registerItem("adventure_saddle_" + counter, props ->
                    new TackItem(TackItemDefinition.builder(TackType.SADDLE).withData(new SaddleTypeData(
                            true, Collections.emptySet(), Color.ofRGB(tretackcolors[counter][0], tretackcolors[counter][1], tretackcolors[counter][2]),
                            "adventure")).build(), props.stacksTo(64))
            ));
            ADVENTURE_BRIDLES.add(REGISTRY.registerItem("adventure_bridle_" + counter,
                    props -> new TackItem(TackItemDefinition.builder(TackType.BRIDLE).withData(
                            new BridleTypeData(true, Collections.emptySet(),
                                    Color.ofRGB(tretackcolors[counter][0], tretackcolors[counter][1], tretackcolors[counter][2])
                                    , "western")).build(),
                            props.stacksTo(64))
            ));
            ADVENTURE_BREAST_COLLARS.add( REGISTRY.registerItem("adventure_breast_collar_" + counter, props ->
                    new TackItem(TackItemDefinition.builder(TackType.BREAST_COLLAR).withData(new TackTypeData(
                            true, Collections.emptySet(), Color.ofRGB(tretackcolors[counter][0], tretackcolors[counter][1], tretackcolors[counter][2]))).build(),
                            props.stacksTo(64))
            ));
            ADVENTURE_GIRTH_STRAPS.add(REGISTRY.registerItem("adventure_girth_strap_" + counter,
                    props -> new TackItem(TackItemDefinition.builder(TackType.GIRTH_STRAP).withData(
                                    new GirthStrapTypeData(true, Collections.emptySet(),
                                            Color.ofRGB(tretackcolors[counter][0], tretackcolors[counter][1], tretackcolors[counter][2]),
                                            Color.ofRGB(tretackcolors[17][0], tretackcolors[17][1], tretackcolors[17][2])))
                            .rackTexture(RackType.SADDLE,
                                    ModRef.res("textures/entity/rack/saddle/tre_girth_strap.png")).build(),
                            props.stacksTo(64))
            ));
            ADVENTURE_BLANKETS.add( REGISTRY.registerItem("adventure_blanket_" + counter, props ->
                    new TackItem(TackItemDefinition.builder(TackType.BLANKET)
                            .rackTexture(RackType.SADDLE, ModRef.res("textures/entity/rack/saddle/tre_adventure_blanket.png"))
                            .rackTexture(RackType.BLANKET_5, ModRef.res("textures/entity/rack/blanket_5/tre_adventure_blanket.png"))
                            .withData(new TackTypeData(true, Collections.emptySet(),
                                    Color.ofRGB(tretackcolors[counter][0], tretackcolors[counter][1], tretackcolors[counter][2]))).build(),
                            props.stacksTo(64))
            ));
            ADVENTURE_LEG_WRAPS.add( REGISTRY.registerItem("adventure_leg_wraps_" + counter, props ->
                    new TackItem(TackItemDefinition.builder(TackType.LEG_WRAPS).withData(new TackTypeData(
                            true, Collections.emptySet(), Color.ofRGB(tretackcolors[counter][0], tretackcolors[counter][1], tretackcolors[counter][2]))).build(),
                            props.stacksTo(64))
            ));
            CLOTH_HORSE_ARMORS.add(REGISTRY.registerItem("cloth_horse_armor_" + counter,
                    props -> new TackItem(TackItemDefinition.builder(TackType.HORSE_ARMOR).withData(new HorseArmorTypeData(
                            true, Collections.emptySet(), Color.ofRGB(tretackcolors[counter][0], tretackcolors[counter][1], tretackcolors[counter][2]),
                            HorseArmorTier.CLOTH.getTierName())).build(), props.stacksTo(64))
            ));
            AMETHYST_HORSE_ARMORS.add(REGISTRY.registerItem("amethyst_horse_armor_" + counter,
                    props -> new TackItem(TackItemDefinition.builder(TackType.HORSE_ARMOR).withData(new HorseArmorTypeData(
                            true, Collections.emptySet(), ColorUtil.ofDyeColor(DyeColor.WHITE),
                            HorseArmorTier.AMETHYST.getTierName())).build(), props.stacksTo(64))
            ));
            SADDLE_BAGS.add(REGISTRY.registerItem("saddle_bag_" + counter, props ->
                    new SaddlebagItem(TackItemDefinition.builder(TackType.SADDLE_BAG).withData(new TackTypeData(
                            true, Collections.emptySet(),
                            Color.ofRGB(tretackcolors[counter][0], tretackcolors[counter][1], tretackcolors[counter][2]))).build(),
                            props.stacksTo(64).component(DataComponents.CONTAINER, ItemContainerContents.EMPTY))));
            WESTERN_SADDLES.add( REGISTRY.registerItem("western_saddle_" + counter, props ->
                    new TackItem(TackItemDefinition.builder(TackType.SADDLE).withData(new SaddleTypeData(
                            false, Collections.emptySet(), Color.ofRGB(tretackcolors[counter][0], tretackcolors[counter][1], tretackcolors[counter][2]),
                            "western")).build(), props.stacksTo(64))
            ));
            WESTERN_BRIDLES.add(REGISTRY.registerItem("western_bridle_" + counter,
                    props -> new TackItem(TackItemDefinition.builder(TackType.BRIDLE).withData(
                            new BridleTypeData(false, Collections.emptySet(),
                                    Color.ofRGB(tretackcolors[counter][0], tretackcolors[counter][1], tretackcolors[counter][2])
                                    , "western")).build(),
                            props.stacksTo(64))
            ));
            WESTERN_BREAST_COLLARS.add( REGISTRY.registerItem("western_breast_collar_" + counter, props ->
                    new TackItem(TackItemDefinition.builder(TackType.BREAST_COLLAR).withData(new TackTypeData(
                            false, Collections.emptySet(), Color.ofRGB(tretackcolors[counter][0], tretackcolors[counter][1], tretackcolors[counter][2]))).build(),
                            props.stacksTo(64))
            ));
            WESTERN_GIRTH_STRAPS.add(REGISTRY.registerItem("western_girth_strap_" + counter,
                    props -> new TackItem(TackItemDefinition.builder(TackType.GIRTH_STRAP).withData(
                                    new GirthStrapTypeData(false, Collections.emptySet(),
                                            Color.ofRGB(tretackcolors[counter][0], tretackcolors[counter][1], tretackcolors[counter][2]),
                                            Color.ofRGB(tretackcolors[final_western_color_value][0], tretackcolors[final_western_color_value][1], tretackcolors[final_western_color_value][2])))
                            .rackTexture(RackType.SADDLE,
                                    ModRef.res("textures/entity/rack/saddle/tre_girth_strap.png")).build(),
                            props.stacksTo(64))
            ));
            WESTERN_BLANKETS.add( REGISTRY.registerItem("western_blanket_" + counter, props ->
                    new TackItem(TackItemDefinition.builder(TackType.BLANKET)
                            .rackTexture(RackType.SADDLE, ModRef.res("textures/entity/rack/saddle/tre_western_blanket.png"))
                            .rackTexture(RackType.BLANKET_5, ModRef.res("textures/entity/rack/blanket_5/tre_western_blanket.png"))
                            .withData(new TackTypeData(false, Collections.emptySet(),
                                    Color.ofRGB(tretackcolors[counter][0], tretackcolors[counter][1], tretackcolors[counter][2]))).build(),
                            props.stacksTo(64))
            ));
            WESTERN_LEG_WRAPS.add( REGISTRY.registerItem("western_leg_wraps_" + counter, props ->
                    new TackItem(TackItemDefinition.builder(TackType.LEG_WRAPS).withData(new TackTypeData(
                            false, Collections.emptySet(), Color.ofRGB(tretackcolors[counter][0], tretackcolors[counter][1], tretackcolors[counter][2]))).build(),
                            props.stacksTo(64))
            ));
            ENGLISH_SADDLES_BLACK.add( REGISTRY.registerItem("english_saddle_black_" + counter, props ->
                    new TackItem(TackItemDefinition.builder(TackType.SADDLE).withData(new SaddleTypeData(
                            false, Collections.emptySet(), Color.ofRGB(tretackcolors[counter][0], tretackcolors[counter][1], tretackcolors[counter][2]),
                            "english")).build(), props.stacksTo(64))
            ));
            ENGLISH_SADDLES_BROWN.add( REGISTRY.registerItem("english_saddle_brown_" + counter, props ->
                    new TackItem(TackItemDefinition.builder(TackType.SADDLE).withData(new SaddleTypeData(
                            false, Collections.emptySet(), Color.ofRGB(tretackcolors[counter][0], tretackcolors[counter][1], tretackcolors[counter][2]),
                            "english")).build(), props.stacksTo(64))
            ));
            ENGLISH_BRIDLES_BLACK.add(REGISTRY.registerItem("english_bridle_black_" + counter,
                    props -> new TackItem(TackItemDefinition.builder(TackType.BRIDLE).withData(
                            new BridleTypeData(false, Collections.emptySet(),
                                    Color.ofRGB(tretackcolors[counter][0], tretackcolors[counter][1], tretackcolors[counter][2])
                                    , "english")).build(),
                            props.stacksTo(64))
            ));
            ENGLISH_BRIDLES_BROWN.add(REGISTRY.registerItem("english_bridle_brown_" + counter,
                    props -> new TackItem(TackItemDefinition.builder(TackType.BRIDLE).withData(
                            new BridleTypeData(false, Collections.emptySet(),
                                    Color.ofRGB(tretackcolors[counter][0], tretackcolors[counter][1], tretackcolors[counter][2])
                                    , "english")).build(),
                            props.stacksTo(64))
            ));
            CLOTH_BRIDLES.add(REGISTRY.registerItem("cloth_bridle_" + counter,
                    props -> new TackItem(TackItemDefinition.builder(TackType.BRIDLE).withData(
                            new BridleTypeData(false, Collections.emptySet(),
                                    Color.ofRGB(tretackcolors[counter][0], tretackcolors[counter][1], tretackcolors[counter][2])
                                    , "english")).build(),
                            props.stacksTo(64))
            ));
            ENGLISH_BREAST_COLLARS_BLACK.add( REGISTRY.registerItem("english_breast_collar_black_" + counter, props ->
                    new TackItem(TackItemDefinition.builder(TackType.BREAST_COLLAR).withData(new TackTypeData(
                            false, Collections.emptySet(), Color.ofRGB(tretackcolors[counter][0], tretackcolors[counter][1], tretackcolors[counter][2]))).build(),
                            props.stacksTo(64))
            ));
            ENGLISH_BREAST_COLLARS_BROWN.add( REGISTRY.registerItem("english_breast_collar_brown_" + counter, props ->
                    new TackItem(TackItemDefinition.builder(TackType.BREAST_COLLAR).withData(new TackTypeData(
                            false, Collections.emptySet(), Color.ofRGB(tretackcolors[counter][0], tretackcolors[counter][1], tretackcolors[counter][2]))).build(),
                            props.stacksTo(64))
            ));
            CLOTH_BREAST_COLLARS.add( REGISTRY.registerItem("cloth_breast_collar_" + counter, props ->
                    new TackItem(TackItemDefinition.builder(TackType.BREAST_COLLAR).withData(new TackTypeData(
                            false, Collections.emptySet(), Color.ofRGB(tretackcolors[counter][0], tretackcolors[counter][1], tretackcolors[counter][2]))).build(),
                            props.stacksTo(64))
            ));
            ENGLISH_GIRTH_STRAPS_BLACK.add(REGISTRY.registerItem("english_girth_strap_black_" + counter,
                    props -> new TackItem(TackItemDefinition.builder(TackType.GIRTH_STRAP).withData(
                                    new GirthStrapTypeData(false, Collections.emptySet(),
                                            Color.ofRGB(tretackcolors[counter][0], tretackcolors[counter][1], tretackcolors[counter][2]),
                                            Color.ofRGB(tretackcolors[final_english_black_color_value][0], tretackcolors[final_english_black_color_value][1], tretackcolors[final_english_black_color_value][2])))
                            .rackTexture(RackType.SADDLE,
                                    ModRef.res("textures/entity/rack/saddle/tre_girth_strap.png")).build(),
                            props.stacksTo(64))
            ));
            ENGLISH_GIRTH_STRAPS_BROWN.add(REGISTRY.registerItem("english_girth_strap_brown_" + counter,
                    props -> new TackItem(TackItemDefinition.builder(TackType.GIRTH_STRAP).withData(
                                    new GirthStrapTypeData(false, Collections.emptySet(),
                                            Color.ofRGB(tretackcolors[counter][0], tretackcolors[counter][1], tretackcolors[counter][2]),
                                            Color.ofRGB(tretackcolors[final_english_brown_color_value][0], tretackcolors[final_english_brown_color_value][1], tretackcolors[final_english_brown_color_value][2])))
                            .rackTexture(RackType.SADDLE,
                                    ModRef.res("textures/entity/rack/saddle/tre_girth_strap.png")).build(),
                            props.stacksTo(64))
            ));
            CLOTH_GIRTH_STRAPS.add(REGISTRY.registerItem("cloth_girth_strap_" + counter,
                    props -> new TackItem(TackItemDefinition.builder(TackType.GIRTH_STRAP).withData(
                                    new GirthStrapTypeData(false, Collections.emptySet(),
                                            Color.ofRGB(tretackcolors[counter][0], tretackcolors[counter][1], tretackcolors[counter][2]),
                                            Color.ofRGB(tretackcolors[final_english_black_color_value][0], tretackcolors[final_english_black_color_value][1], tretackcolors[final_english_black_color_value][2])))
                            .rackTexture(RackType.SADDLE,
                                    ModRef.res("textures/entity/rack/saddle/tre_girth_strap.png")).build(),
                            props.stacksTo(64))
            ));
            ENGLISH_BLANKETS.add( REGISTRY.registerItem("english_blanket_" + counter, props ->
                    new TackItem(TackItemDefinition.builder(TackType.BLANKET)
                            .rackTexture(RackType.SADDLE, ModRef.res("textures/entity/rack/saddle/tre_english_blanket.png"))
                            .rackTexture(RackType.BLANKET_5, ModRef.res("textures/entity/rack/blanket_5/tre_english_blanket.png"))
                            .withData(new TackTypeData(false, Collections.emptySet(),
                                    Color.ofRGB(tretackcolors[counter][0], tretackcolors[counter][1], tretackcolors[counter][2]))).build(),
                            props.stacksTo(64))
            ));
            ENGLISH_LEG_WRAPS.add( REGISTRY.registerItem("english_leg_wraps_" + counter, props ->
                    new TackItem(TackItemDefinition.builder(TackType.LEG_WRAPS).withData(new TackTypeData(
                            false, Collections.emptySet(), Color.ofRGB(tretackcolors[counter][0], tretackcolors[counter][1], tretackcolors[counter][2]))).build(),
                            props.stacksTo(64))
            ));
            QUARTER_SHEETS.add(REGISTRY.registerItem("quarter_sheet_" + counter, props ->
                    new TackItem(TackItemDefinition.builder(TackType.BREAST_COLLAR).withData(new TackTypeData(
                            false, Collections.emptySet(), Color.ofRGB(tretackcolors[counter][0], tretackcolors[counter][1], tretackcolors[counter][2]))).build(),
                            props.stacksTo(64))
            ));
            BAREBACK_SADDLES.add( REGISTRY.registerItem("bareback_saddle_" + counter, props ->
                    new TackItem(TackItemDefinition.builder(TackType.SADDLE).withData(new SaddleTypeData(
                            false, Collections.emptySet(), Color.ofRGB(tretackcolors[counter][0], tretackcolors[counter][1], tretackcolors[counter][2]),
                            "western")).build(), props.stacksTo(64))
            ));
            CLOTH_BITLESS_BRIDLES.add(REGISTRY.registerItem("cloth_bitless_bridle_" + counter,
                    props -> new TackItem(TackItemDefinition.builder(TackType.BRIDLE).withData(
                            new BridleTypeData(false, Collections.emptySet(),
                                    Color.ofRGB(tretackcolors[counter][0], tretackcolors[counter][1], tretackcolors[counter][2])
                                    , "english")).build(),
                            props.stacksTo(64))
            ));
            BAREBACK_GIRTH_STRAPS.add(REGISTRY.registerItem("bareback_girth_strap_" + counter,
                    props -> new TackItem(TackItemDefinition.builder(TackType.GIRTH_STRAP).withData(
                                    new GirthStrapTypeData(false, Collections.emptySet(),
                                            Color.ofRGB(tretackcolors[counter][0], tretackcolors[counter][1], tretackcolors[counter][2]),
                                            Color.ofRGB(tretackcolors[counter][0], tretackcolors[counter][1], tretackcolors[counter][2])))
                            .rackTexture(RackType.SADDLE,
                                    ModRef.res("textures/entity/rack/saddle/tre_girth_strap.png")).build(),
                            props.stacksTo(64))
            ));
            BAREBACK_BLANKETS.add(REGISTRY.registerItem("bareback_blanket_" + counter, props ->
                    new TackItem(TackItemDefinition.builder(TackType.BLANKET)
                            .rackTexture(RackType.SADDLE, ModRef.res("textures/entity/rack/saddle/tre_bareback_blanket.png"))
                            .rackTexture(RackType.BLANKET_5, ModRef.res("textures/entity/rack/blanket_5/tre_bareback_blanket.png"))
                            .withData(new TackTypeData(false, Collections.emptySet(),
                                    Color.ofRGB(tretackcolors[counter][0], tretackcolors[counter][1], tretackcolors[counter][2]))).build(),
                            props.stacksTo(64))
            ));

            ++rContext.var2;
        }

/// ════════════════════════════════════ CRAFTABLE DYED (SWEM Colors) ════════════════════════════════════ ///
            FLAGS_DYED = new ArrayList<>();

            SIGN_COVERS_RILEY_DYED = new ArrayList<>();
            SIGN_COVERS_FABRIC_DYED = new ArrayList<>();
            SIGN_COVERS_FLORAL_DYED = new ArrayList<>();
            SIGN_COVERS_SWIRL_DYED = new ArrayList<>();
            SIGN_COVERS_LOOPED_DYED = new ArrayList<>();
            SIGN_COVERS_CHECKERED_DYED = new ArrayList<>();

            RIBBON_THREE_TAILS = new ArrayList<>();
            RIBBON_TWO_TAILS = new ArrayList<>();
            RIBBON_ONE_TAIL = new ArrayList<>();
            ROSETTE = new ArrayList<>();

            FLYMASKS_DYED = new ArrayList<>();
            ADVENTURE_SADDLES_DYED = new ArrayList<>();
            ADVENTURE_BRIDLES_DYED = new ArrayList<>();
            ADVENTURE_BREAST_COLLARS_DYED = new ArrayList<>();
            ADVENTURE_GIRTH_STRAPS_DYED = new ArrayList<>();
            ADVENTURE_BLANKETS_DYED = new ArrayList<>();
            ADVENTURE_LEG_WRAPS_DYED  = new ArrayList<>();
            CLOTH_HORSE_ARMORS_DYED  = new ArrayList<>();
            AMETHYST_HORSE_ARMORS_DYED  = new ArrayList<>();
            ENGLISH_SADDLES_BLACK_DYED = new ArrayList<>();
            ENGLISH_SADDLES_BROWN_DYED = new ArrayList<>();
            ENGLISH_BRIDLES_BLACK_DYED = new ArrayList<>();
            ENGLISH_BRIDLES_BROWN_DYED = new ArrayList<>();
            CLOTH_BRIDLES_DYED = new ArrayList<>();
            ENGLISH_BREAST_COLLARS_BLACK_DYED = new ArrayList<>();
            ENGLISH_BREAST_COLLARS_BROWN_DYED = new ArrayList<>();
            CLOTH_BREAST_COLLARS_DYED = new ArrayList<>();
            ENGLISH_GIRTH_STRAPS_BLACK_DYED = new ArrayList<>();
            ENGLISH_GIRTH_STRAPS_BROWN_DYED = new ArrayList<>();
            CLOTH_GIRTH_STRAPS_DYED = new ArrayList<>();
            QUARTER_SHEETS_DYED = new ArrayList<>();
            BAREBACK_SADDLES_DYED = new ArrayList<>();
            CLOTH_BITLESS_BRIDLES_DYED = new ArrayList<>();
            BAREBACK_GIRTH_STRAPS_DYED = new ArrayList<>();
            BAREBACK_BLANKETS_DYED = new ArrayList<>();

        DyeColor[] var0 = DyeColor.values();
        int var3 = var0.length;

        for (int var2 = 0; var2 < var3; ++var2) {
            DyeColor color = var0[var2];
            FLAGS_DYED.add(REGISTRY.registerItem("flag_" + color.getName(), props ->
                    new Item(props)));

            SIGN_COVERS_RILEY_DYED.add(REGISTRY.registerItem("sign_cover_riley_" + color.getName(), props ->
                    new Item(props)));
            SIGN_COVERS_FABRIC_DYED.add(REGISTRY.registerItem("sign_cover_fabric_" + color.getName(), props ->
                    new Item(props)));
            SIGN_COVERS_FLORAL_DYED.add(REGISTRY.registerItem("sign_cover_floral_" + color.getName(), props ->
                    new Item(props)));
            SIGN_COVERS_SWIRL_DYED.add(REGISTRY.registerItem("sign_cover_swirl_" + color.getName(), props ->
                    new Item(props)));
            SIGN_COVERS_LOOPED_DYED.add(REGISTRY.registerItem("sign_cover_looped_" + color.getName(), props ->
                    new Item(props)));
            SIGN_COVERS_CHECKERED_DYED.add(REGISTRY.registerItem("sign_cover_checkered_" + color.getName(), props ->
                    new Item(props)));

            RIBBON_THREE_TAILS.add(REGISTRY.registerItem("ribbon_three_tails_" + color.getName(), props ->
                    new Item(props)
            ));
            RIBBON_TWO_TAILS.add(REGISTRY.registerItem("ribbon_two_tails_" + color.getName(), props ->
                    new Item(props)
            ));
            RIBBON_ONE_TAIL.add(REGISTRY.registerItem("ribbon_one_tail_" + color.getName(), props ->
                    new Item(props)
            ));
            ROSETTE.add(REGISTRY.registerItem("rosette_" + color.getName(), props ->
                    new Item(props)
            ));

            FLYMASKS.add( REGISTRY.registerItem("flymask_" + color.getName(), props ->
                    new TackItem(TackItemDefinition.builder(TackType.HALTER).withData(new TackTypeData
                            (false, Collections.emptySet(),  ColorUtil.ofDyeColor(color))).build(),
                            props.stacksTo(64))
            ));
            ADVENTURE_SADDLES_DYED.add(REGISTRY.registerItem("adventure_saddle_" + color.getName(), props ->
                    new TackItem(TackItemDefinition.builder(TackType.SADDLE).withData(new SaddleTypeData(
                            true, Collections.emptySet(), ColorUtil.ofDyeColor(color),
                            "adventure")).build(), props.stacksTo(64))
            ));
            ADVENTURE_BRIDLES_DYED.add(REGISTRY.registerItem("adventure_bridle_" + color.getName(),
                    props -> new TackItem(TackItemDefinition.builder(TackType.BRIDLE).withData(
                            new BridleTypeData(true, Collections.emptySet(),
                                    ColorUtil.ofDyeColor(color)
                                    , "western")).build(),
                            props.stacksTo(64))
            ));
            ADVENTURE_BREAST_COLLARS_DYED.add(REGISTRY.registerItem("adventure_breast_collar_" + color.getName(), props ->
                    new TackItem(TackItemDefinition.builder(TackType.BREAST_COLLAR).withData(new TackTypeData(
                            true, Collections.emptySet(), ColorUtil.ofDyeColor(color))).build(),
                            props.stacksTo(64))
            ));
            ADVENTURE_GIRTH_STRAPS_DYED.add(REGISTRY.registerItem("adventure_girth_strap_" + color.getName(),
                    props -> new TackItem(TackItemDefinition.builder(TackType.GIRTH_STRAP).withData(
                                    new GirthStrapTypeData(true, Collections.emptySet(),
                                            ColorUtil.ofDyeColor(color),
                                            ColorUtil.ofDyeColor(DyeColor.BROWN)))
                            .rackTexture(RackType.SADDLE,
                                    ModRef.res("textures/entity/rack/saddle/tre_girth_strap.png")).build(),
                            props.stacksTo(64))
            ));
            ADVENTURE_BLANKETS_DYED.add(REGISTRY.registerItem("adventure_blanket_" + color.getName(), props ->
                    new TackItem(TackItemDefinition.builder(TackType.BLANKET)
                            .rackTexture(RackType.SADDLE, ModRef.res("textures/entity/rack/saddle/tre_adventure_blanket.png"))
                            .rackTexture(RackType.BLANKET_5, ModRef.res("textures/entity/rack/blanket_5/tre_adventure_blanket.png"))
                            .withData(new TackTypeData(true, Collections.emptySet(),
                                    ColorUtil.ofDyeColor(color))).build(),
                            props.stacksTo(64))
            ));
            ADVENTURE_LEG_WRAPS_DYED.add(REGISTRY.registerItem("adventure_leg_wraps_" + color.getName(), props ->
                    new TackItem(TackItemDefinition.builder(TackType.LEG_WRAPS).withData(new TackTypeData(
                            false, Collections.emptySet(), ColorUtil.ofDyeColor(color))).build(),
                            props.stacksTo(64))
            ));
            CLOTH_HORSE_ARMORS_DYED.add(REGISTRY.registerItem("cloth_horse_armor_" + color.getName(),
                    props -> new TackItem(TackItemDefinition.builder(TackType.HORSE_ARMOR).withData(new HorseArmorTypeData(
                            true, Collections.emptySet(), ColorUtil.ofDyeColor(color),
                            HorseArmorTier.CLOTH.getTierName())).build(), props.stacksTo(64))
            ));
            AMETHYST_HORSE_ARMORS_DYED.add(REGISTRY.registerItem("amethyst_horse_armor_" + color.getName(),
                    props -> new TackItem(TackItemDefinition.builder(TackType.HORSE_ARMOR).withData(new HorseArmorTypeData(
                            true, Collections.emptySet(), ColorUtil.ofDyeColor(DyeColor.WHITE),
                            HorseArmorTier.AMETHYST.getTierName())).build(), props.stacksTo(64))
            ));
            ENGLISH_SADDLES_BLACK_DYED.add(REGISTRY.registerItem("english_saddle_black_" + color.getName(), props ->
                    new TackItem(TackItemDefinition.builder(TackType.SADDLE).withData(new SaddleTypeData(
                            false, Collections.emptySet(), ColorUtil.ofDyeColor(color),
                            "english")).build(), props.stacksTo(64))
            ));
            ENGLISH_SADDLES_BROWN_DYED.add(REGISTRY.registerItem("english_saddle_brown_" + color.getName(), props ->
                    new TackItem(TackItemDefinition.builder(TackType.SADDLE).withData(new SaddleTypeData(
                            false, Collections.emptySet(), ColorUtil.ofDyeColor(color),
                            "english")).build(), props.stacksTo(64))
            ));
            ENGLISH_BRIDLES_BLACK_DYED.add(REGISTRY.registerItem("english_bridle_black_" + color.getName(),
                    props -> new TackItem(TackItemDefinition.builder(TackType.BRIDLE).withData(
                            new BridleTypeData(false, Collections.emptySet(),
                                    ColorUtil.ofDyeColor(color)
                                    , "english")).build(),
                            props.stacksTo(64))
            ));
            ENGLISH_BRIDLES_BROWN_DYED.add(REGISTRY.registerItem("english_bridle_brown_" + color.getName(),
                    props -> new TackItem(TackItemDefinition.builder(TackType.BRIDLE).withData(
                            new BridleTypeData(false, Collections.emptySet(),
                                    ColorUtil.ofDyeColor(color)
                                    , "english")).build(),
                            props.stacksTo(64))
            ));
            CLOTH_BRIDLES_DYED.add(REGISTRY.registerItem("cloth_bridle_" + color.getName(),
                    props -> new TackItem(TackItemDefinition.builder(TackType.BRIDLE).withData(
                            new BridleTypeData(false, Collections.emptySet(),
                                    ColorUtil.ofDyeColor(color)
                                    , "english")).build(),
                            props.stacksTo(64))
            ));
            ENGLISH_BREAST_COLLARS_BLACK_DYED.add(REGISTRY.registerItem("english_breast_collar_black_" + color.getName(), props ->
                    new TackItem(TackItemDefinition.builder(TackType.BREAST_COLLAR).withData(new TackTypeData(
                            false, Collections.emptySet(), ColorUtil.ofDyeColor(color))).build(),
                            props.stacksTo(64))
            ));
            ENGLISH_BREAST_COLLARS_BROWN_DYED.add(REGISTRY.registerItem("english_breast_collar_brown_" + color.getName(), props ->
                    new TackItem(TackItemDefinition.builder(TackType.BREAST_COLLAR).withData(new TackTypeData(
                            false, Collections.emptySet(), ColorUtil.ofDyeColor(color))).build(),
                            props.stacksTo(64))
            ));
            CLOTH_BREAST_COLLARS_DYED.add(REGISTRY.registerItem("cloth_breast_collar_" + color.getName(), props ->
                    new TackItem(TackItemDefinition.builder(TackType.BREAST_COLLAR).withData(new TackTypeData(
                            false, Collections.emptySet(), ColorUtil.ofDyeColor(color))).build(),
                            props.stacksTo(64))
            ));
            ENGLISH_GIRTH_STRAPS_BLACK_DYED.add(REGISTRY.registerItem("english_girth_strap_black_" + color.getName(),
                    props -> new TackItem(TackItemDefinition.builder(TackType.GIRTH_STRAP).withData(
                                    new GirthStrapTypeData(false, Collections.emptySet(),
                                            ColorUtil.ofDyeColor(color),
                                            ColorUtil.ofDyeColor(DyeColor.BLACK)))
                            .rackTexture(RackType.SADDLE,
                                    ModRef.res("textures/entity/rack/saddle/tre_girth_strap.png")).build(),
                            props.stacksTo(64))
            ));
            ENGLISH_GIRTH_STRAPS_BROWN_DYED.add(REGISTRY.registerItem("english_girth_strap_brown_" + color.getName(),
                    props -> new TackItem(TackItemDefinition.builder(TackType.GIRTH_STRAP).withData(
                                    new GirthStrapTypeData(false, Collections.emptySet(),
                                            ColorUtil.ofDyeColor(color),
                                            ColorUtil.ofDyeColor(DyeColor.BROWN)))
                            .rackTexture(RackType.SADDLE,
                                    ModRef.res("textures/entity/rack/saddle/tre_girth_strap.png")).build(),
                            props.stacksTo(64))
            ));
            CLOTH_GIRTH_STRAPS_DYED.add(REGISTRY.registerItem("cloth_girth_strap_" + color.getName(),
                    props -> new TackItem(TackItemDefinition.builder(TackType.GIRTH_STRAP).withData(
                                    new GirthStrapTypeData(false, Collections.emptySet(),
                                            ColorUtil.ofDyeColor(color),
                                            ColorUtil.ofDyeColor(color)))
                            .rackTexture(RackType.SADDLE,
                                    ModRef.res("textures/entity/rack/saddle/tre_girth_strap.png")).build(),
                            props.stacksTo(64))
            ));
            QUARTER_SHEETS_DYED.add(REGISTRY.registerItem("quarter_sheet_" + color.getName(), props ->
                    new TackItem(TackItemDefinition.builder(TackType.BREAST_COLLAR).withData(new TackTypeData(
                            false, Collections.emptySet(), ColorUtil.ofDyeColor(color))).build(),
                            props.stacksTo(64))
            ));
            BAREBACK_SADDLES_DYED.add(REGISTRY.registerItem("bareback_saddle_" + color.getName(), props ->
                    new TackItem(TackItemDefinition.builder(TackType.SADDLE).withData(new SaddleTypeData(
                            false, Collections.emptySet(), ColorUtil.ofDyeColor(color),
                            "western")).build(), props.stacksTo(64))
            ));
            CLOTH_BITLESS_BRIDLES.add(REGISTRY.registerItem("cloth_bitless_bridle_" + color.getName(),
                    props -> new TackItem(TackItemDefinition.builder(TackType.BRIDLE).withData(
                            new BridleTypeData(false, Collections.emptySet(),
                                    ColorUtil.ofDyeColor(color)
                                    , "english")).build(),
                            props.stacksTo(64))
            ));
            BAREBACK_GIRTH_STRAPS_DYED.add(REGISTRY.registerItem("bareback_girth_strap_" + color.getName(),
                    props -> new TackItem(TackItemDefinition.builder(TackType.GIRTH_STRAP).withData(
                                    new GirthStrapTypeData(false, Collections.emptySet(),
                                            ColorUtil.ofDyeColor(color),
                                            ColorUtil.ofDyeColor(DyeColor.BLACK)))
                            .rackTexture(RackType.SADDLE,
                                    ModRef.res("textures/entity/rack/saddle/tre_girth_strap.png")).build(),
                            props.stacksTo(64))
            ));
            BAREBACK_BLANKETS_DYED.add(REGISTRY.registerItem("bareback_blanket_" + color.getName(), props ->
                    new TackItem(TackItemDefinition.builder(TackType.BLANKET)
                            .rackTexture(RackType.SADDLE, ModRef.res("textures/entity/rack/saddle/tre_bareback_blanket.png"))
                            .rackTexture(RackType.BLANKET_5, ModRef.res("textures/entity/rack/blanket_5/tre_bareback_blanket.png"))
                            .withData(new TackTypeData(false, Collections.emptySet(),
                                    ColorUtil.ofDyeColor(color))).build(),
                            props.stacksTo(64))
            ));
        }
    }
}