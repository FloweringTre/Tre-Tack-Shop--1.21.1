//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package com.kyraltre.tretackshop.registry;

import com.alaharranhonor.swem.block.*;
import com.alaharranhonor.swem.item.TackBoxBlockItem;
import com.alaharranhonor.swem.block.GrainBinBlock;
import com.alaharranhonor.swem.block.entity.GrainBinBE;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour.Properties;
import net.minecraft.world.level.block.state.properties.BlockSetType;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredBlock;


import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Supplier;

public class TackShopBlockRegistry {
    public static final DeferredRegister.Blocks BLOCKS;

    /// ════════════════════════════════════ ONE OFF TROPHIES ════════════════════════════════════ ///
    public static final List<DeferredBlock<TrophyBlock>> FLORAL_GOLD;
    public static final List<DeferredBlock<TrophyBlock>> FLORAL_SILVER;
    public static final List<DeferredBlock<TrophyBlock>> FLORAL_BRONZE;
    public static final List<DeferredBlock<TrophyBlock>> SUN_TROPHY;
    public static final List<DeferredBlock<TrophyBlock>> MOON_TROPHY;
    public static final List<DeferredBlock<TrophyBlock>> PUMPKIN_GRAND;
    public static final List<DeferredBlock<TrophyBlock>> PUMPKIN_RESERVE;
    public static final List<DeferredBlock<TrophyBlock>> HEART_GRAND;
    public static final List<DeferredBlock<TrophyBlock>> HEART_RESERVE;
    public static final List<DeferredBlock<TrophyBlock>> CLOVER_GRAND;
    public static final List<DeferredBlock<TrophyBlock>> CLOVER_RESERVE;
    public static final List<DeferredBlock<TrophyBlock>> SNOWFLAKE_GRAND;
    public static final List<DeferredBlock<TrophyBlock>> SNOWFLAKE_RESERVE;


/// ════════════════════════════════════ ONE OFF TACK BOXES ════════════════════════════════════ ///
    public static final List<DeferredBlock<TackBoxBlock>> TACK_BOX_BAMBOO;
    public static final List<DeferredBlock<TackBoxBlock>> TACK_BOX_SWDM_BAMBOO;
    public static final List<DeferredBlock<TackBoxBlock>> TACK_BOX_WHITEWASH;
    public static final List<DeferredBlock<TackBoxBlock>> TACK_BOX_THATCH;
    public static final List<DeferredBlock<TackBoxBlock>> TACK_BOX_MANGROVE;
    public static final List<DeferredBlock<TackBoxBlock>> TACK_BOX_CHERRY;
    public static final List<DeferredBlock<TackBoxBlock>> TACK_BOX_ACACIA;
    public static final List<DeferredBlock<TackBoxBlock>> TACK_BOX_BIRCH;
    public static final List<DeferredBlock<TackBoxBlock>> TACK_BOX_CRIMSON;
    public static final List<DeferredBlock<TackBoxBlock>> TACK_BOX_JUNGLE;
    public static final List<DeferredBlock<TackBoxBlock>> TACK_BOX_DARK_OAK;
    public static final List<DeferredBlock<TackBoxBlock>> TACK_BOX_OAK;
    public static final List<DeferredBlock<TackBoxBlock>> TACK_BOX_SPRUCE;
    public static final List<DeferredBlock<TackBoxBlock>> TACK_BOX_WARPED;
    public static final List<DeferredBlock<TackBoxBlock>> TACK_BOX_PALE_OAK;

/// ════════════════════════════════════ MORPHO ════════════════════════════════════ ///
    public static final List<DeferredBlock<TackBoxBlock>> TACK_BOX_MORPHO;
    public static final List<DeferredBlock<Block>> CONE_MORPHO;
    public static final List<DeferredBlock<WheelBarrowBlock>> WHEELBARROW_MORPHO;
    public static final List<DeferredBlock<SlowFeederBlock>> SLOW_FEEDER_MORPHO;
    public static final List<DeferredBlock<SeparatorBlock>> SEPARATOR_MORPHO;
    public static final List<DeferredBlock<GrainFeederBlock>> GRAIN_FEEDER_MORPHO;
    public static final List<DeferredBlock<HorseDoorBlock>> PASTURE_GATE_HORSE_MORPHO;
    public static final List<DeferredBlock<CareDoorBlock>> PASTURE_GATE_CARE_MORPHO;
    public static final List<DeferredBlock<CareDoorHalfBlock>> WEB_GUARD_CARE_MORPHO;
    public static final List<DeferredBlock<HorseDoorHalfBlock>> WEB_GUARD_HORSE_MORPHO;
    public static final List<DeferredBlock<HalfDoorBlock>> WEB_GUARD_RIDER_MORPHO;
    public static final List<DeferredBlock<HalfBarrelBlock>> HALF_BARREL_MORPHO;
    public static final List<DeferredBlock<GrainBinBlock>> BIN_GRAIN_MORPHO;

/// ════════════════════════════════════ MONARCH ════════════════════════════════════ ///
    public static final List<DeferredBlock<TackBoxBlock>> TACK_BOX_MONARCH;
    public static final List<DeferredBlock<Block>> CONE_MONARCH;
    public static final List<DeferredBlock<WheelBarrowBlock>> WHEELBARROW_MONARCH;
    public static final List<DeferredBlock<SlowFeederBlock>> SLOW_FEEDER_MONARCH;
    public static final List<DeferredBlock<SeparatorBlock>> SEPARATOR_MONARCH;
    public static final List<DeferredBlock<GrainFeederBlock>> GRAIN_FEEDER_MONARCH;
    public static final List<DeferredBlock<HorseDoorBlock>> PASTURE_GATE_HORSE_MONARCH;
    public static final List<DeferredBlock<CareDoorBlock>> PASTURE_GATE_CARE_MONARCH;
    public static final List<DeferredBlock<CareDoorHalfBlock>> WEB_GUARD_CARE_MONARCH;
    public static final List<DeferredBlock<HorseDoorHalfBlock>> WEB_GUARD_HORSE_MONARCH;
    public static final List<DeferredBlock<HalfDoorBlock>> WEB_GUARD_RIDER_MONARCH;
    public static final List<DeferredBlock<HalfBarrelBlock>> HALF_BARREL_MONARCH;
    public static final List<DeferredBlock<GrainBinBlock>> BIN_GRAIN_MONARCH;

/// ════════════════════════════════════ RAINBOW ════════════════════════════════════ ///
public static final List<DeferredBlock<TackBoxBlock>> TACK_BOX_RAINBOW;
    public static final List<DeferredBlock<Block>> CONE_RAINBOW;
//    public static final List<DeferredBlock<WheelBarrowBlock>> WHEELBARROW_RAINBOW;
//    public static final List<DeferredBlock<SlowFeederBlock>> SLOW_FEEDER_RAINBOW;
//    public static final List<DeferredBlock<SeparatorBlock>> SEPARATOR_RAINBOW;
//    public static final List<DeferredBlock<GrainFeederBlock>> GRAIN_FEEDER_RAINBOW;
//    public static final List<DeferredBlock<HorseDoorBlock>> PASTURE_GATE_HORSE_RAINBOW;
//    public static final List<DeferredBlock<CareDoorBlock>> PASTURE_GATE_CARE_RAINBOW;
//    public static final List<DeferredBlock<CareDoorHalfBlock>> WEB_GUARD_CARE_RAINBOW;
//    public static final List<DeferredBlock<HorseDoorHalfBlock>> WEB_GUARD_HORSE_RAINBOW;
//    public static final List<DeferredBlock<HalfDoorBlock>> WEB_GUARD_RIDER_RAINBOW;
//    public static final List<DeferredBlock<HalfBarrelBlock>> HALF_BARREL_RAINBOW;
//    public static final List<DeferredBlock<GrainBinBlock>> BIN_GRAIN_RAINBOW;

/// ════════════════════════════════════ HOUND ════════════════════════════════════ ///
public static final List<DeferredBlock<TackBoxBlock>> TACK_BOX_HOUND;
    public static final List<DeferredBlock<Block>> CONE_HOUND;
    public static final List<DeferredBlock<WheelBarrowBlock>> WHEELBARROW_HOUND;
    public static final List<DeferredBlock<SlowFeederBlock>> SLOW_FEEDER_HOUND;
    public static final List<DeferredBlock<SeparatorBlock>> SEPARATOR_HOUND;
    public static final List<DeferredBlock<GrainFeederBlock>> GRAIN_FEEDER_HOUND;
    public static final List<DeferredBlock<HorseDoorBlock>> PASTURE_GATE_HORSE_HOUND;
    public static final List<DeferredBlock<CareDoorBlock>> PASTURE_GATE_CARE_HOUND;
    public static final List<DeferredBlock<CareDoorHalfBlock>> WEB_GUARD_CARE_HOUND;
    public static final List<DeferredBlock<HorseDoorHalfBlock>> WEB_GUARD_HORSE_HOUND;
    public static final List<DeferredBlock<HalfDoorBlock>> WEB_GUARD_RIDER_HOUND;
    public static final List<DeferredBlock<HalfBarrelBlock>> HALF_BARREL_HOUND;
    public static final List<DeferredBlock<GrainBinBlock>> BIN_GRAIN_HOUND;

/// ════════════════════════════════════ CRAFTABLE NUMBERED (Tackshop Colors) ════════════════════════════════════ ///
    public static final List<DeferredBlock<TackBoxBlock>> TACK_BOXES;
    public static final List<DeferredBlock<Block>> CONES;
    public static final List<DeferredBlock<WheelBarrowBlock>> WHEELBARROWS;
    public static final List<DeferredBlock<SlowFeederBlock>> SLOW_FEEDERS;
    public static final List<DeferredBlock<SeparatorBlock>> SEPARATORS;
    public static final List<DeferredBlock<GrainFeederBlock>> GRAIN_FEEDERS;
    public static final List<DeferredBlock<HorseDoorBlock>> PASTURE_GATE_HORSES;
    public static final List<DeferredBlock<CareDoorBlock>> PASTURE_GATE_CARES;
    public static final List<DeferredBlock<CareDoorHalfBlock>> WEB_GUARD_CARES;
    public static final List<DeferredBlock<HorseDoorHalfBlock>> WEB_GUARD_HORSES;
    public static final List<DeferredBlock<HalfDoorBlock>> WEB_GUARD_RIDERS;
    public static final List<DeferredBlock<HalfBarrelBlock>> HALF_BARRELS;
    public static final List<DeferredBlock<GrainBinBlock>> BIN_GRAINS;

    public static final List<DeferredBlock<TrophyBlock>> EGG_TROPHY_THICK;
    public static final List<DeferredBlock<TrophyBlock>> EGG_TROPHY_THIN;
    public static final List<DeferredBlock<TrophyBlock>> EGG_TROPHY_CHEVRON;

    public TackShopBlockRegistry() {
    }

    public static void init(IEventBus modBus) {
        BLOCKS.register(modBus);
    }

    private static <T extends Block> DeferredBlock<T> register(
            String name,
            java.util.function.Function<Properties, ? extends T> factory) {
        return BLOCKS.registerBlock(name, factory);
    }

    private static <T extends Block> DeferredBlock<T> register(
            String name,
            java.util.function.Function<Properties, ? extends T> factory,
            Function<DeferredBlock<T>, Supplier<? extends Item>> itemCreator) {
        DeferredBlock<T> ret = BLOCKS.registerBlock(name, factory);
        TackShopItems.REGISTRY.register(name, registryName -> itemCreator.apply(ret).get());
        return ret;
    }

    private static <T extends Block> DeferredBlock<T> registerNoItem(
            String name,
            java.util.function.Function<Properties, ? extends T> factory) {
        return BLOCKS.registerBlock(name, factory);
    }


    static {
        BLOCKS = DeferredRegister.createBlocks("tretackshop");
/// ════════════════════════════════════ ONE OFF TROPHIES ════════════════════════════════════ ///
        FLORAL_GOLD = new ArrayList();
        FLORAL_SILVER = new ArrayList();
        FLORAL_BRONZE = new ArrayList();
        SUN_TROPHY = new ArrayList();
        MOON_TROPHY = new ArrayList();
        PUMPKIN_GRAND = new ArrayList();
        PUMPKIN_RESERVE = new ArrayList();
        HEART_GRAND = new ArrayList();
        HEART_RESERVE = new ArrayList();
        CLOVER_GRAND = new ArrayList();
        CLOVER_RESERVE = new ArrayList();
        SNOWFLAKE_GRAND = new ArrayList();
        SNOWFLAKE_RESERVE = new ArrayList();

        FLORAL_GOLD.add(register("floral_gold", props -> {
            return new TrophyBlock(props.strength(1.0F).noOcclusion());
        }, (block) -> {
            return () -> {
                return new BlockItemBase((Block)block.get());
            };
        }));
        FLORAL_SILVER.add(register("floral_silver", props -> {
            return new TrophyBlock(props.strength(1.0F).noOcclusion());
        }, (block) -> {
            return () -> {
                return new BlockItemBase((Block)block.get());
            };
        }));
        FLORAL_BRONZE.add(register("floral_bronze", props -> {
            return new TrophyBlock(props.strength(1.0F).noOcclusion());
        }, (block) -> {
            return () -> {
                return new BlockItemBase((Block)block.get());
            };
        }));
        SUN_TROPHY.add(register("sun_trophy", props -> {
            return new TrophyBlock(props.strength(1.0F).noOcclusion());
        }, (block) -> {
            return () -> {
                return new BlockItemBase((Block)block.get());
            };
        }));
        MOON_TROPHY.add(register("moon_trophy", props -> {
            return new TrophyBlock(props.strength(1.0F).noOcclusion());
        }, (block) -> {
            return () -> {
                return new BlockItemBase((Block)block.get());
            };
        }));
        PUMPKIN_GRAND.add(register("pumpkin_grand", props -> {
            return new TrophyBlock(props.strength(1.0F).noOcclusion());
        }, (block) -> {
            return () -> {
                return new BlockItemBase((Block)block.get());
            };
        }));
        PUMPKIN_RESERVE.add(register("pumpkin_reserve", props -> {
            return new TrophyBlock(props.strength(1.0F).noOcclusion());
        }, (block) -> {
            return () -> {
                return new BlockItemBase((Block)block.get());
            };
        }));
        HEART_GRAND.add(register("heart_grand", props -> {
            return new TrophyBlock(props.strength(1.0F).noOcclusion());
        }, (block) -> {
            return () -> {
                return new BlockItemBase((Block)block.get());
            };
        }));
        HEART_RESERVE.add(register("heart_reserve", props -> {
            return new TrophyBlock(props.strength(1.0F).noOcclusion());
        }, (block) -> {
            return () -> {
                return new BlockItemBase((Block)block.get());
            };
        }));
        CLOVER_GRAND.add(register("clover_grand", props -> {
            return new TrophyBlock(props.strength(1.0F).noOcclusion());
        }, (block) -> {
            return () -> {
                return new BlockItemBase((Block)block.get());
            };
        }));
        CLOVER_RESERVE.add(register("clover_reserve", props -> {
            return new TrophyBlock(props.strength(1.0F).noOcclusion());
        }, (block) -> {
            return () -> {
                return new BlockItemBase((Block)block.get());
            };
        }));
        SNOWFLAKE_GRAND.add(register("snowflake_grand", props -> {
            return new TrophyBlock(props.strength(1.0F).noOcclusion());
        }, (block) -> {
            return () -> {
                return new BlockItemBase((Block)block.get());
            };
        }));
        SNOWFLAKE_RESERVE.add(register("snowflake_reserve", props -> {
            return new TrophyBlock(props.strength(1.0F).noOcclusion());
        }, (block) -> {
            return () -> {
                return new BlockItemBase((Block)block.get());
            };
        }));


/// ════════════════════════════════════ ONE OFF TACK BOXES ════════════════════════════════════ ///
        TACK_BOX_BAMBOO = new ArrayList();
        TACK_BOX_SWDM_BAMBOO = new ArrayList();
        TACK_BOX_CHERRY = new ArrayList();
        TACK_BOX_MANGROVE = new ArrayList();
        TACK_BOX_THATCH = new ArrayList();
        TACK_BOX_WHITEWASH  = new ArrayList();
        TACK_BOX_ACACIA = new ArrayList();
        TACK_BOX_BIRCH = new ArrayList();
        TACK_BOX_CRIMSON = new ArrayList();
        TACK_BOX_DARK_OAK = new ArrayList();
        TACK_BOX_JUNGLE = new ArrayList();
        TACK_BOX_OAK = new ArrayList();
        TACK_BOX_SPRUCE = new ArrayList();
        TACK_BOX_WARPED = new ArrayList<>();
        TACK_BOX_PALE_OAK = new ArrayList<>();

        TACK_BOX_ACACIA.add(register("tack_box_" + "acacia", props -> {
            return new TackBoxBlock(props.noOcclusion().sound(SoundType.WOOD).strength(2.0F, 3.0F), 1);
        }, (block) -> {
            return () -> {
                return new TackBoxBlockItem((Block) block.get());
            };
        }));
        TACK_BOX_BIRCH.add(register("tack_box_" + "birch", props -> {
            return new TackBoxBlock(props.noOcclusion().sound(SoundType.WOOD).strength(2.0F, 3.0F), 1);
        }, (block) -> {
            return () -> {
                return new TackBoxBlockItem((Block) block.get());
            };
        }));
        TACK_BOX_CRIMSON.add(register("tack_box_" + "crimson", props -> {
            return new TackBoxBlock(props.noOcclusion().sound(SoundType.WOOD).strength(2.0F, 3.0F), 1);
        }, (block) -> {
            return () -> {
                return new TackBoxBlockItem((Block) block.get());
            };
        }));
        TACK_BOX_DARK_OAK.add(register("tack_box_" + "dark_oak", props -> {
            return new TackBoxBlock(props.noOcclusion().sound(SoundType.WOOD).strength(2.0F, 3.0F), 1);
        }, (block) -> {
            return () -> {
                return new TackBoxBlockItem((Block) block.get());
            };
        }));
        TACK_BOX_JUNGLE.add(register("tack_box_" + "jungle", props -> {
            return new TackBoxBlock(props.noOcclusion().sound(SoundType.WOOD).strength(2.0F, 3.0F), 1);
        }, (block) -> {
            return () -> {
                return new TackBoxBlockItem((Block) block.get());
            };
        }));
        TACK_BOX_OAK.add(register("tack_box_" + "oak", props -> {
            return new TackBoxBlock(props.noOcclusion().sound(SoundType.WOOD).strength(2.0F, 3.0F), 1);
        }, (block) -> {
            return () -> {
                return new TackBoxBlockItem((Block) block.get());
            };
        }));
        TACK_BOX_SPRUCE.add(register("tack_box_" + "spruce", props -> {
            return new TackBoxBlock(props.noOcclusion().sound(SoundType.WOOD).strength(2.0F, 3.0F), 1);
        }, (block) -> {
            return () -> {
                return new TackBoxBlockItem((Block) block.get());
            };
        }));
        TACK_BOX_WARPED.add(register("tack_box_" + "warped", props -> {
            return new TackBoxBlock(props.noOcclusion().sound(SoundType.WOOD).strength(2.0F, 3.0F), 1);
        }, (block) -> {
            return () -> {
                return new TackBoxBlockItem((Block) block.get());
            };
        }));

        TACK_BOX_SWDM_BAMBOO.add(register("tack_box_" + "swdm_bamboo", props -> {
            return new TackBoxBlock(props.noOcclusion().sound(SoundType.WOOD).strength(2.0F, 3.0F), 1);
        }, (block) -> {
            return () -> {
                return new TackBoxBlockItem((Block) block.get());
            };
        }));
        TACK_BOX_CHERRY.add(register("tack_box_" + "cherry", props -> {
            return new TackBoxBlock(props.noOcclusion().sound(SoundType.WOOD).strength(2.0F, 3.0F), 1);
        }, (block) -> {
            return () -> {
                return new TackBoxBlockItem((Block) block.get());
            };
        }));
        TACK_BOX_BAMBOO.add(register("tack_box_" + "bamboo", props -> {
            return new TackBoxBlock(props.noOcclusion().sound(SoundType.WOOD).strength(2.0F, 3.0F), 1);
        }, (block) -> {
            return () -> {
                return new TackBoxBlockItem((Block) block.get());
            };
        }));
        TACK_BOX_MANGROVE.add(register("tack_box_" + "mangrove", props -> {
            return new TackBoxBlock(props.noOcclusion().sound(SoundType.WOOD).strength(2.0F, 3.0F), 1);
        }, (block) -> {
            return () -> {
                return new TackBoxBlockItem((Block) block.get());
            };
        }));
        TACK_BOX_THATCH.add(register("tack_box_" + "thatch", props -> {
            return new TackBoxBlock(props.noOcclusion().sound(SoundType.WOOD).strength(2.0F, 3.0F), 1);
        }, (block) -> {
            return () -> {
                return new TackBoxBlockItem((Block) block.get());
            };
        }));
        TACK_BOX_WHITEWASH.add(register("tack_box_" + "whitewash", props -> {
            return new TackBoxBlock(props.noOcclusion().sound(SoundType.WOOD).strength(2.0F, 3.0F), 1);
        }, (block) -> {
            return () -> {
                return new TackBoxBlockItem((Block) block.get());
            };
        }));
        TACK_BOX_PALE_OAK.add(register("tack_box_" + "pale_oak", props -> {
            return new TackBoxBlock(props.noOcclusion().sound(SoundType.WOOD).strength(2.0F, 3.0F), 1);
        }, (block) -> {
            return () -> {
                return new TackBoxBlockItem((Block) block.get());
            };
        }));


/// ════════════════════════════════════ MORPHO ════════════════════════════════════ ///
        TACK_BOX_MORPHO = new ArrayList();
        CONE_MORPHO = new ArrayList();
        WHEELBARROW_MORPHO = new ArrayList();
        SLOW_FEEDER_MORPHO = new ArrayList();
        SEPARATOR_MORPHO = new ArrayList();
        GRAIN_FEEDER_MORPHO = new ArrayList();
        PASTURE_GATE_HORSE_MORPHO = new ArrayList();
        PASTURE_GATE_CARE_MORPHO = new ArrayList();
        WEB_GUARD_CARE_MORPHO = new ArrayList();
        WEB_GUARD_HORSE_MORPHO = new ArrayList();
        WEB_GUARD_RIDER_MORPHO = new ArrayList();
        HALF_BARREL_MORPHO = new ArrayList();
        BIN_GRAIN_MORPHO = new ArrayList();

        TACK_BOX_MORPHO.add(register("tack_box_" + "morpho", props -> {
            return new TackBoxBlock(props.noOcclusion().sound(SoundType.WOOD).strength(2.0F, 3.0F), 1);
        }, (block) -> {
            return () -> {
                return new TackBoxBlockItem((Block) block.get());
            };
        }));
        CONE_MORPHO.add(register("cone_" + "morpho", props -> {
            return new ConeBase();
        }, (block) -> {
            return () -> {
                return new ConeBlockItem((Block) block.get());
            };
        }));
        WHEELBARROW_MORPHO.add(register("wheelbarrow_" + "morpho", props -> {
            return new WheelBarrowBlock(props.noOcclusion().sound(SoundType.METAL).strength(2.0F, 3.0F), null);
        }, (block) -> {
            return () -> {
                return new BlockItemBase((Block)block.get());
            };
        }));
        SLOW_FEEDER_MORPHO.add(register("slow_feeder_" + "morpho", props -> {
            return new SlowFeederBlock(props.noOcclusion().sound(SoundType.METAL).strength(2.0F, 3.0F), null);
        }, (block) -> {
            return () -> {
                return new BlockItemBase((Block)block.get());
            };
        }));
        SEPARATOR_MORPHO.add(register("separator_" + "morpho", props -> {
            return new SeparatorBlock(props.noOcclusion().sound(SoundType.METAL).strength(2.0F, 3.0F), null);
        }, (block) -> {
            return () -> {
                return new BlockItemBase((Block)block.get());
            };
        }));
        GRAIN_FEEDER_MORPHO.add(register("grain_feeder_" + "morpho", props -> {
            return new GrainFeederBlock(props.noOcclusion().sound(SoundType.METAL).strength(2.0F, 3.0F), null);
        }, (block) -> {
            return () -> {
                return new BlockItemBase((Block)block.get());
            };
        }));
        PASTURE_GATE_HORSE_MORPHO.add(register("pasture_gate_horse_" + "morpho", props -> {
            return new HorseDoorBlock(props.noOcclusion().sound(SoundType.METAL).strength(2.0F, 3.0F), BlockSetType.OAK,null);
        }, (block) -> {
            return () -> {
                return new BlockItemBase((Block)block.get());
            };
        }));
        PASTURE_GATE_CARE_MORPHO.add(register("pasture_gate_care_" + "morpho", props -> {
            return new CareDoorBlock(props.noOcclusion().sound(SoundType.METAL).strength(2.0F, 3.0F), BlockSetType.OAK,null);
        }, (block) -> {
            return () -> {
                return new BlockItemBase((Block)block.get());
            };
        }));
        WEB_GUARD_CARE_MORPHO.add(register("web_guard_care_" + "morpho", props -> {
            return new CareDoorHalfBlock(props.noOcclusion().sound(SoundType.METAL).strength(2.0F, 3.0F), BlockSetType.OAK,null);
        }, (block) -> {
            return () -> {
                return new BlockItemBase((Block)block.get());
            };
        }));
        WEB_GUARD_HORSE_MORPHO.add(register("web_guard_horse_" + "morpho", props -> {
            return new HorseDoorHalfBlock(props.noOcclusion().sound(SoundType.METAL).strength(2.0F, 3.0F), BlockSetType.OAK,null);
        }, (block) -> {
            return () -> {
                return new BlockItemBase((Block)block.get());
            };
        }));
        WEB_GUARD_RIDER_MORPHO.add(register("web_guard_rider_" + "morpho", props -> {
            return new HalfDoorBlock(props.noOcclusion().sound(SoundType.METAL).strength(2.0F, 3.0F), null);
        }, (block) -> {
            return () -> {
                return new BlockItemBase((Block)block.get());
            };
        }));
        HALF_BARREL_MORPHO.add(register("half_barrel_" + "morpho", props -> {
            return new HalfBarrelBlock(props.noOcclusion().sound(SoundType.METAL).strength(2.0F, 3.0F));
        }, (block) -> {
            return () -> {
                return new BlockItemBase((Block)block.get());
            };
        }));
        BIN_GRAIN_MORPHO.add(register("bin_grain_" + "morpho", props -> {
            return new GrainBinBlock(props.strength(1.0F, 2.0F).noOcclusion());
        }, (block) -> {
            return () -> {
                return new BlockItemBase((Block)block.get());
            };
        }));


/// ════════════════════════════════════ MONARCH ════════════════════════════════════ ///
        TACK_BOX_MONARCH = new ArrayList();
        CONE_MONARCH = new ArrayList();
        WHEELBARROW_MONARCH = new ArrayList();
        SLOW_FEEDER_MONARCH = new ArrayList();
        SEPARATOR_MONARCH = new ArrayList();
        GRAIN_FEEDER_MONARCH = new ArrayList();
        PASTURE_GATE_HORSE_MONARCH = new ArrayList();
        PASTURE_GATE_CARE_MONARCH = new ArrayList();
        WEB_GUARD_CARE_MONARCH = new ArrayList();
        WEB_GUARD_HORSE_MONARCH = new ArrayList();
        WEB_GUARD_RIDER_MONARCH = new ArrayList();
        HALF_BARREL_MONARCH = new ArrayList();
        BIN_GRAIN_MONARCH = new ArrayList();

        TACK_BOX_MONARCH.add(register("tack_box_" + "monarch", props -> {
            return new TackBoxBlock(props.noOcclusion().sound(SoundType.WOOD).strength(2.0F, 3.0F), 1);
        }, (block) -> {
            return () -> {
                return new TackBoxBlockItem((Block) block.get());
            };
        }));
        CONE_MONARCH.add(register("cone_" + "monarch", props -> {
            return new ConeBase();
        }, (block) -> {
            return () -> {
                return new ConeBlockItem((Block) block.get());
            };
        }));
        WHEELBARROW_MONARCH.add(register("wheelbarrow_" + "monarch", props -> {
            return new WheelBarrowBlock(props.noOcclusion().sound(SoundType.METAL).strength(2.0F, 3.0F), null);
        }, (block) -> {
            return () -> {
                return new BlockItemBase((Block)block.get());
            };
        }));
        SLOW_FEEDER_MONARCH.add(register("slow_feeder_" + "monarch", props -> {
            return new SlowFeederBlock(props.noOcclusion().sound(SoundType.METAL).strength(2.0F, 3.0F), null);
        }, (block) -> {
            return () -> {
                return new BlockItemBase((Block)block.get());
            };
        }));
        SEPARATOR_MONARCH.add(register("separator_" + "monarch", props -> {
            return new SeparatorBlock(props.noOcclusion().sound(SoundType.METAL).strength(2.0F, 3.0F), null);
        }, (block) -> {
            return () -> {
                return new BlockItemBase((Block)block.get());
            };
        }));
        GRAIN_FEEDER_MONARCH.add(register("grain_feeder_" + "monarch", props -> {
            return new GrainFeederBlock(props.noOcclusion().sound(SoundType.METAL).strength(2.0F, 3.0F), null);
        }, (block) -> {
            return () -> {
                return new BlockItemBase((Block)block.get());
            };
        }));
        PASTURE_GATE_HORSE_MONARCH.add(register("pasture_gate_horse_" + "monarch", props -> {
            return new HorseDoorBlock(props.noOcclusion().sound(SoundType.METAL).strength(2.0F, 3.0F), BlockSetType.OAK,null);
        }, (block) -> {
            return () -> {
                return new BlockItemBase((Block)block.get());
            };
        }));
        PASTURE_GATE_CARE_MONARCH.add(register("pasture_gate_care_" + "monarch", props -> {
            return new CareDoorBlock(props.noOcclusion().sound(SoundType.METAL).strength(2.0F, 3.0F), BlockSetType.OAK,null);
        }, (block) -> {
            return () -> {
                return new BlockItemBase((Block)block.get());
            };
        }));
        WEB_GUARD_CARE_MONARCH.add(register("web_guard_care_" + "monarch", props -> {
            return new CareDoorHalfBlock(props.noOcclusion().sound(SoundType.METAL).strength(2.0F, 3.0F), BlockSetType.OAK,null);
        }, (block) -> {
            return () -> {
                return new BlockItemBase((Block)block.get());
            };
        }));
        WEB_GUARD_HORSE_MONARCH.add(register("web_guard_horse_" + "monarch", props -> {
            return new HorseDoorHalfBlock(props.noOcclusion().sound(SoundType.METAL).strength(2.0F, 3.0F), BlockSetType.OAK,null);
        }, (block) -> {
            return () -> {
                return new BlockItemBase((Block)block.get());
            };
        }));
        WEB_GUARD_RIDER_MONARCH.add(register("web_guard_rider_" + "monarch", props -> {
            return new HalfDoorBlock(props.noOcclusion().sound(SoundType.METAL).strength(2.0F, 3.0F), null);
        }, (block) -> {
            return () -> {
                return new BlockItemBase((Block)block.get());
            };
        }));
        HALF_BARREL_MONARCH.add(register("half_barrel_" + "monarch", props -> {
            return new HalfBarrelBlock(props.noOcclusion().sound(SoundType.METAL).strength(2.0F, 3.0F));
        }, (block) -> {
            return () -> {
                return new BlockItemBase((Block)block.get());
            };
        }));
        BIN_GRAIN_MONARCH.add(register("bin_grain_" + "monarch", props -> {
            return new GrainBinBlock(props.strength(1.0F, 2.0F).noOcclusion());
        }, (block) -> {
            return () -> {
                return new BlockItemBase((Block)block.get());
            };
        }));

/// ════════════════════════════════════ RAINBOW ════════════════════════════════════ ///
        TACK_BOX_RAINBOW = new ArrayList();
        CONE_RAINBOW = new ArrayList();
//        WHEELBARROW_RAINBOW = new ArrayList();
//        SLOW_FEEDER_RAINBOW = new ArrayList();
//        SEPARATOR_RAINBOW = new ArrayList();
//        GRAIN_FEEDER_RAINBOW = new ArrayList();
//        PASTURE_GATE_HORSE_RAINBOW = new ArrayList();
//        PASTURE_GATE_CARE_RAINBOW = new ArrayList();
//        WEB_GUARD_CARE_RAINBOW = new ArrayList();
//        WEB_GUARD_HORSE_RAINBOW = new ArrayList();
//        WEB_GUARD_RIDER_RAINBOW = new ArrayList();
//        HALF_BARREL_RAINBOW = new ArrayList();
//        BIN_GRAIN_RAINBOW = new ArrayList();

        TACK_BOX_RAINBOW.add(register("tack_box_" + "rainbow", props -> {
            return new TackBoxBlock(props.noOcclusion().sound(SoundType.WOOD).strength(2.0F, 3.0F), 1);
        }, (block) -> {
            return () -> {
                return new TackBoxBlockItem((Block) block.get());
            };
        }));
        CONE_RAINBOW.add(register("cone_" + "rainbow", props -> {
            return new ConeBase();
        }, (block) -> {
            return () -> {
                return new ConeBlockItem((Block) block.get());
            };
        }));
//        WHEELBARROW_RAINBOW.add(register("wheelbarrow_" + "rainbow", props -> {
//            return new WheelBarrowBlock(props.noOcclusion().sound(SoundType.METAL).strength(2.0F, 3.0F), null);
//        }, (block) -> {
//            return () -> {
//                return new BlockItemBase((Block)block.get());
//            };
//        }));
//        SLOW_FEEDER_RAINBOW.add(register("slow_feeder_" + "rainbow", props -> {
//            return new SlowFeederBlock(props.noOcclusion().sound(SoundType.METAL).strength(2.0F, 3.0F), null);
//        }, (block) -> {
//            return () -> {
//                return new BlockItemBase((Block)block.get());
//            };
//        }));
//        SEPARATOR_RAINBOW.add(register("separator_" + "rainbow", props -> {
//            return new SeparatorBlock(props.noOcclusion().sound(SoundType.METAL).strength(2.0F, 3.0F), null);
//        }, (block) -> {
//            return () -> {
//                return new BlockItemBase((Block)block.get());
//            };
//        }));
//        GRAIN_FEEDER_RAINBOW.add(register("grain_feeder_" + "rainbow", props -> {
//            return new GrainFeederBlock(props.noOcclusion().sound(SoundType.METAL).strength(2.0F, 3.0F), null);
//        }, (block) -> {
//            return () -> {
//                return new BlockItemBase((Block)block.get());
//            };
//        }));
//        PASTURE_GATE_HORSE_RAINBOW.add(register("pasture_gate_horse_" + "rainbow", props -> {
//            return new HorseDoorBlock(props.noOcclusion().sound(SoundType.METAL).strength(2.0F, 3.0F), BlockSetType.OAK,null);
//        }, (block) -> {
//            return () -> {
//                return new BlockItemBase((Block)block.get());
//            };
//        }));
//        PASTURE_GATE_CARE_RAINBOW.add(register("pasture_gate_care_" + "rainbow", props -> {
//            return new CareDoorBlock(props.noOcclusion().sound(SoundType.METAL).strength(2.0F, 3.0F), BlockSetType.OAK,null);
//        }, (block) -> {
//            return () -> {
//                return new BlockItemBase((Block)block.get());
//            };
//        }));
//        WEB_GUARD_CARE_RAINBOW.add(register("web_guard_care_" + "rainbow", props -> {
//            return new CareDoorHalfBlock(props.noOcclusion().sound(SoundType.METAL).strength(2.0F, 3.0F), BlockSetType.OAK,null);
//        }, (block) -> {
//            return () -> {
//                return new BlockItemBase((Block)block.get());
//            };
//        }));
//        WEB_GUARD_HORSE_RAINBOW.add(register("web_guard_horse_" + "rainbow", props -> {
//            return new HorseDoorHalfBlock(props.noOcclusion().sound(SoundType.METAL).strength(2.0F, 3.0F), BlockSetType.OAK,null);
//        }, (block) -> {
//            return () -> {
//                return new BlockItemBase((Block)block.get());
//            };
//        }));
//        WEB_GUARD_RIDER_RAINBOW.add(register("web_guard_rider_" + "rainbow", props -> {
//            return new HalfDoorBlock(props.noOcclusion().sound(SoundType.METAL).strength(2.0F, 3.0F), null);
//        }, (block) -> {
//            return () -> {
//                return new BlockItemBase((Block)block.get());
//            };
//        }));
//        HALF_BARREL_RAINBOW.add(register("half_barrel_" + "rainbow", props -> {
//            return new HalfBarrelBlock(props.noOcclusion().sound(SoundType.METAL).strength(2.0F, 3.0F));
//        }, (block) -> {
//            return () -> {
//                return new BlockItemBase((Block)block.get());
//            };
//        }));
//        BIN_GRAIN_RAINBOW.add(register("bin_grain_" + "rainbow", props -> {
//            return new GrainBinBlock(props.strength(1.0F, 2.0F).noOcclusion());
//        }, (block) -> {
//            return () -> {
//                return new BlockItemBase((Block)block.get());
//            };
//        }));

/// ════════════════════════════════════ HOUND ════════════════════════════════════ ///
        TACK_BOX_HOUND = new ArrayList();
        CONE_HOUND = new ArrayList();
        WHEELBARROW_HOUND = new ArrayList();
        SLOW_FEEDER_HOUND = new ArrayList();
        SEPARATOR_HOUND = new ArrayList();
        GRAIN_FEEDER_HOUND = new ArrayList();
        PASTURE_GATE_HORSE_HOUND = new ArrayList();
        PASTURE_GATE_CARE_HOUND = new ArrayList();
        WEB_GUARD_CARE_HOUND = new ArrayList();
        WEB_GUARD_HORSE_HOUND = new ArrayList();
        WEB_GUARD_RIDER_HOUND = new ArrayList();
        HALF_BARREL_HOUND = new ArrayList();
        BIN_GRAIN_HOUND = new ArrayList();

        TACK_BOX_HOUND.add(register("tack_box_" + "hound", props -> {
            return new TackBoxBlock(props.noOcclusion().sound(SoundType.WOOD).strength(2.0F, 3.0F), 1);
        }, (block) -> {
            return () -> {
                return new TackBoxBlockItem((Block) block.get());
            };
        }));
        CONE_HOUND.add(register("cone_" + "hound", props -> {
            return new ConeBase();
        }, (block) -> {
            return () -> {
                return new ConeBlockItem((Block) block.get());
            };
        }));
        WHEELBARROW_HOUND.add(register("wheelbarrow_" + "hound", props -> {
            return new WheelBarrowBlock(props.noOcclusion().sound(SoundType.METAL).strength(2.0F, 3.0F), null);
        }, (block) -> {
            return () -> {
                return new BlockItemBase((Block)block.get());
            };
        }));
        SLOW_FEEDER_HOUND.add(register("slow_feeder_" + "hound", props -> {
            return new SlowFeederBlock(props.noOcclusion().sound(SoundType.METAL).strength(2.0F, 3.0F), null);
        }, (block) -> {
            return () -> {
                return new BlockItemBase((Block)block.get());
            };
        }));
        SEPARATOR_HOUND.add(register("separator_" + "hound", props -> {
            return new SeparatorBlock(props.noOcclusion().sound(SoundType.METAL).strength(2.0F, 3.0F), null);
        }, (block) -> {
            return () -> {
                return new BlockItemBase((Block)block.get());
            };
        }));
        GRAIN_FEEDER_HOUND.add(register("grain_feeder_" + "hound", props -> {
            return new GrainFeederBlock(props.noOcclusion().sound(SoundType.METAL).strength(2.0F, 3.0F), null);
        }, (block) -> {
            return () -> {
                return new BlockItemBase((Block)block.get());
            };
        }));
        PASTURE_GATE_HORSE_HOUND.add(register("pasture_gate_horse_" + "hound", props -> {
            return new HorseDoorBlock(props.noOcclusion().sound(SoundType.METAL).strength(2.0F, 3.0F), BlockSetType.OAK,null);
        }, (block) -> {
            return () -> {
                return new BlockItemBase((Block)block.get());
            };
        }));
        PASTURE_GATE_CARE_HOUND.add(register("pasture_gate_care_" + "hound", props -> {
            return new CareDoorBlock(props.noOcclusion().sound(SoundType.METAL).strength(2.0F, 3.0F), BlockSetType.OAK,null);
        }, (block) -> {
            return () -> {
                return new BlockItemBase((Block)block.get());
            };
        }));
        WEB_GUARD_CARE_HOUND.add(register("web_guard_care_" + "hound", props -> {
            return new CareDoorHalfBlock(props.noOcclusion().sound(SoundType.METAL).strength(2.0F, 3.0F), BlockSetType.OAK,null);
        }, (block) -> {
            return () -> {
                return new BlockItemBase((Block)block.get());
            };
        }));
        WEB_GUARD_HORSE_HOUND.add(register("web_guard_horse_" + "hound", props -> {
            return new HorseDoorHalfBlock(props.noOcclusion().sound(SoundType.METAL).strength(2.0F, 3.0F), BlockSetType.OAK,null);
        }, (block) -> {
            return () -> {
                return new BlockItemBase((Block)block.get());
            };
        }));
        WEB_GUARD_RIDER_HOUND.add(register("web_guard_rider_" + "hound", props -> {
            return new HalfDoorBlock(props.noOcclusion().sound(SoundType.METAL).strength(2.0F, 3.0F), null);
        }, (block) -> {
            return () -> {
                return new BlockItemBase((Block)block.get());
            };
        }));
        HALF_BARREL_HOUND.add(register("half_barrel_" + "hound", props -> {
            return new HalfBarrelBlock(props.noOcclusion().sound(SoundType.METAL).strength(2.0F, 3.0F));
        }, (block) -> {
            return () -> {
                return new BlockItemBase((Block)block.get());
            };
        }));
        BIN_GRAIN_HOUND.add(register("bin_grain_" + "hound", props -> {
            return new GrainBinBlock(props.strength(1.0F, 2.0F).noOcclusion());
        }, (block) -> {
            return () -> {
                return new BlockItemBase((Block)block.get());
            };
        }));

/// ════════════════════════════════════ CRAFTABLE NUMBERED (Tackshop Colors) ════════════════════════════════════ ///
        TACK_BOXES = new ArrayList<>();
        CONES = new ArrayList();
        WHEELBARROWS = new ArrayList();
        SLOW_FEEDERS = new ArrayList();
        SEPARATORS = new ArrayList();
        GRAIN_FEEDERS = new ArrayList();
        PASTURE_GATE_HORSES = new ArrayList();
        PASTURE_GATE_CARES = new ArrayList();
        WEB_GUARD_CARES = new ArrayList();
        WEB_GUARD_HORSES = new ArrayList();
        WEB_GUARD_RIDERS = new ArrayList();
        HALF_BARRELS = new ArrayList();
        BIN_GRAINS = new ArrayList();
        EGG_TROPHY_THICK = new ArrayList<>();
        EGG_TROPHY_THIN = new ArrayList<>();
        EGG_TROPHY_CHEVRON = new ArrayList<>();

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


            TACK_BOXES.add(register("tack_box_" + counter, props -> {
                return new TackBoxBlock(props.noOcclusion().sound(SoundType.WOOD).strength(2.0F, 3.0F), 1);
            }, (block) -> {
                return () -> {
                    return new TackBoxBlockItem((Block) block.get());
                };
            }));
            CONES.add(register("cone_" + counter, props -> {
                return new ConeBase();
            }, (block) -> {
                return () -> {
                    return new ConeBlockItem((Block) block.get());
                };
            }));
            WHEELBARROWS.add(register("wheelbarrow_" + counter, props -> {
                return new WheelBarrowBlock(props.noOcclusion().sound(SoundType.METAL).strength(2.0F, 3.0F), null);
            }, (block) -> {
                return () -> {
                    return new BlockItemBase((Block)block.get());
                };
            }));
            SLOW_FEEDERS.add(register("slow_feeder_" + counter, props -> {
                return new SlowFeederBlock(props.noOcclusion().sound(SoundType.METAL).strength(2.0F, 3.0F), null);
            }, (block) -> {
                return () -> {
                    return new BlockItemBase((Block)block.get());
                };
            }));
            SEPARATORS.add(register("separator_" + counter, props -> {
                return new SeparatorBlock(props.noOcclusion().sound(SoundType.METAL).strength(2.0F, 3.0F), null);
            }, (block) -> {
                return () -> {
                    return new BlockItemBase((Block)block.get());
                };
            }));
            GRAIN_FEEDERS.add(register("grain_feeder_" + counter, props -> {
                return new GrainFeederBlock(props.noOcclusion().sound(SoundType.METAL).strength(2.0F, 3.0F), null);
            }, (block) -> {
                return () -> {
                    return new BlockItemBase((Block)block.get());
                };
            }));
            PASTURE_GATE_HORSES.add(register("pasture_gate_horse_" + counter, props -> {
                return new HorseDoorBlock(props.noOcclusion().sound(SoundType.METAL).strength(2.0F, 3.0F), BlockSetType.OAK,null);
            }, (block) -> {
                return () -> {
                    return new BlockItemBase((Block)block.get());
                };
            }));
            PASTURE_GATE_CARES.add(register("pasture_gate_care_" + counter, props -> {
                return new CareDoorBlock(props.noOcclusion().sound(SoundType.METAL).strength(2.0F, 3.0F), BlockSetType.OAK,null);
            }, (block) -> {
                return () -> {
                    return new BlockItemBase((Block)block.get());
                };
            }));
            WEB_GUARD_CARES.add(register("web_guard_care_" + counter, props -> {
                return new CareDoorHalfBlock(props.noOcclusion().sound(SoundType.METAL).strength(2.0F, 3.0F), BlockSetType.OAK,null);
            }, (block) -> {
                return () -> {
                    return new BlockItemBase((Block)block.get());
                };
            }));
            WEB_GUARD_HORSES.add(register("web_guard_horse_" + counter, props -> {
                return new HorseDoorHalfBlock(props.noOcclusion().sound(SoundType.METAL).strength(2.0F, 3.0F), BlockSetType.OAK,null);
            }, (block) -> {
                return () -> {
                    return new BlockItemBase((Block)block.get());
                };
            }));
            WEB_GUARD_RIDERS.add(register("web_guard_rider_" + counter, props -> {
                return new HalfDoorBlock(props.noOcclusion().sound(SoundType.METAL).strength(2.0F, 3.0F), null);
            }, (block) -> {
                return () -> {
                    return new BlockItemBase((Block)block.get());
                };
            }));
            HALF_BARRELS.add(register("half_barrel_" + counter, props -> {
                return new HalfBarrelBlock(props.noOcclusion().sound(SoundType.METAL).strength(2.0F, 3.0F));
            }, (block) -> {
                return () -> {
                    return new BlockItemBase((Block)block.get());
                };
            }));
            BIN_GRAINS.add(register("bin_grain_" + counter, props -> {
                return new GrainBinBlock(props.strength(1.0F, 2.0F).noOcclusion());
            }, (block) -> {
                return () -> {
                    return new BlockItemBase((Block)block.get());
                };
            }));

            EGG_TROPHY_THICK.add(register("egg_trophy_thick_" + counter, props -> {
                return new TrophyBlock(props.strength(1.0F).noOcclusion());
            }, (block) -> {
                return () -> {
                    return new BlockItemBase((Block)block.get());
                };
            }));
            EGG_TROPHY_THIN.add(register("egg_trophy_thin_" + counter, props -> {
                return new TrophyBlock(props.strength(1.0F).noOcclusion());
            }, (block) -> {
                return () -> {
                    return new BlockItemBase((Block)block.get());
                };
            }));
            EGG_TROPHY_CHEVRON.add(register("egg_trophy_chev_" + counter, props -> {
                return new TrophyBlock(props.strength(1.0F).noOcclusion());
            }, (block) -> {
                return () -> {
                    return new BlockItemBase((Block)block.get());
                };
            }));

            ++rContext.var2;
        }
    }

}
