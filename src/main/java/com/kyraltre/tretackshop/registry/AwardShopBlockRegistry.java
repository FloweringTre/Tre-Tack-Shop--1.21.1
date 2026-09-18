//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package com.kyraltre.tretackshop.registry;

import com.alaharranhonor.swem.block.*;
import com.alaharranhonor.swem.item.TackBoxBlockItem;
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

public class AwardShopBlockRegistry {
    public static final DeferredRegister.Blocks BLOCKS;
/// ════════════════════════════════════ AWARD SETS (Blank Sets) ════════════════════════════════════ ///
    public static final List<DeferredBlock<TackBoxBlock>> AWARD_TACK_BOXES;
    public static final List<DeferredBlock<Block>> AWARD_CONES;
    public static final List<DeferredBlock<WheelBarrowBlock>> AWARD_WHEELBARROWS;
    public static final List<DeferredBlock<SlowFeederBlock>> AWARD_SLOW_FEEDERS;
    public static final List<DeferredBlock<SeparatorBlock>> AWARD_SEPARATORS;
    public static final List<DeferredBlock<GrainFeederBlock>> AWARD_GRAIN_FEEDERS;
    public static final List<DeferredBlock<HorseDoorBlock>> AWARD_PASTURE_GATE_HORSES;
    public static final List<DeferredBlock<CareDoorBlock>> AWARD_PASTURE_GATE_CARES;
    public static final List<DeferredBlock<CareDoorHalfBlock>> AWARD_WEB_GUARD_CARES;
    public static final List<DeferredBlock<HorseDoorHalfBlock>> AWARD_WEB_GUARD_HORSES;
    public static final List<DeferredBlock<HalfDoorBlock>> AWARD_WEB_GUARD_RIDERS;
    public static final List<DeferredBlock<HalfBarrelBlock>> AWARD_HALF_BARRELS;
    public static final List<DeferredBlock<GrainBinBlock>> AWARD_BIN_GRAINS;

    public AwardShopBlockRegistry() {
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
        AwardShopItems.REGISTRY.register(name, registryName -> itemCreator.apply(ret).get());
        return ret;
    }

    private static <T extends Block> DeferredBlock<T> registerNoItem(
            String name,
            java.util.function.Function<Properties, ? extends T> factory) {
        return BLOCKS.registerBlock(name, factory);
    }


    static {
        BLOCKS = DeferredRegister.createBlocks("tretackshop");
/// ════════════════════════════════════ AWARD SETS (Blank Sets) ════════════════════════════════════ ///
        AWARD_TACK_BOXES = new ArrayList<>();
        AWARD_CONES = new ArrayList();
        AWARD_WHEELBARROWS = new ArrayList();
        AWARD_SLOW_FEEDERS = new ArrayList();
        AWARD_SEPARATORS = new ArrayList();
        AWARD_GRAIN_FEEDERS = new ArrayList();
        AWARD_PASTURE_GATE_HORSES = new ArrayList();
        AWARD_PASTURE_GATE_CARES = new ArrayList();
        AWARD_WEB_GUARD_CARES = new ArrayList();
        AWARD_WEB_GUARD_HORSES = new ArrayList();
        AWARD_WEB_GUARD_RIDERS = new ArrayList();
        AWARD_HALF_BARRELS = new ArrayList();
        AWARD_BIN_GRAINS = new ArrayList();


        int var5 = 24;
        for (int var2 = 0; var2 < var5; ++var2) {
            int counter = var2+1;
            AWARD_TACK_BOXES.add(register("award_tack_box_" + counter, props -> {
                return new TackBoxBlock(props.noOcclusion().sound(SoundType.WOOD).strength(2.0F, 3.0F), 1);
            }, (block) -> {
                return () -> {
                    return new TackBoxBlockItem((Block) block.get());
                };
            }));
            AWARD_CONES.add(register("award_cone_" + counter, props -> {
                return new ConeBase();
            }, (block) -> {
                return () -> {
                    return new ConeBlockItem((Block) block.get());
                };
            }));
            AWARD_WHEELBARROWS.add(register("award_wheelbarrow_" + counter, props -> {
                return new WheelBarrowBlock(props.noOcclusion().sound(SoundType.METAL).strength(2.0F, 3.0F), null);
            }, (block) -> {
                return () -> {
                    return new BlockItemBase((Block)block.get());
                };
            }));
            AWARD_SLOW_FEEDERS.add(register("award_slow_feeder_" + counter, props -> {
                return new SlowFeederBlock(props.noOcclusion().sound(SoundType.METAL).strength(2.0F, 3.0F), null);
            }, (block) -> {
                return () -> {
                    return new BlockItemBase((Block)block.get());
                };
            }));
            AWARD_SEPARATORS.add(register("award_separator_" + counter, props -> {
                return new SeparatorBlock(props.noOcclusion().sound(SoundType.METAL).strength(2.0F, 3.0F), null);
            }, (block) -> {
                return () -> {
                    return new BlockItemBase((Block)block.get());
                };
            }));
            AWARD_GRAIN_FEEDERS.add(register("award_grain_feeder_" + counter, props -> {
                return new GrainFeederBlock(props.noOcclusion().sound(SoundType.METAL).strength(2.0F, 3.0F), null);
            }, (block) -> {
                return () -> {
                    return new BlockItemBase((Block)block.get());
                };
            }));
            AWARD_PASTURE_GATE_HORSES.add(register("award_pasture_gate_horse_" + counter, props -> {
                return new HorseDoorBlock(props.noOcclusion().sound(SoundType.METAL).strength(2.0F, 3.0F), BlockSetType.OAK,null);
            }, (block) -> {
                return () -> {
                    return new BlockItemBase((Block)block.get());
                };
            }));
            AWARD_PASTURE_GATE_CARES.add(register("award_pasture_gate_care_" + counter, props -> {
                return new CareDoorBlock(props.noOcclusion().sound(SoundType.METAL).strength(2.0F, 3.0F), BlockSetType.OAK,null);
            }, (block) -> {
                return () -> {
                    return new BlockItemBase((Block)block.get());
                };
            }));
            AWARD_WEB_GUARD_CARES.add(register("award_web_guard_care_" + counter, props -> {
                return new CareDoorHalfBlock(props.noOcclusion().sound(SoundType.METAL).strength(2.0F, 3.0F), BlockSetType.OAK,null);
            }, (block) -> {
                return () -> {
                    return new BlockItemBase((Block)block.get());
                };
            }));
            AWARD_WEB_GUARD_HORSES.add(register("award_web_guard_horse_" + counter, props -> {
                return new HorseDoorHalfBlock(props.noOcclusion().sound(SoundType.METAL).strength(2.0F, 3.0F), BlockSetType.OAK,null);
            }, (block) -> {
                return () -> {
                    return new BlockItemBase((Block)block.get());
                };
            }));
            AWARD_WEB_GUARD_RIDERS.add(register("award_web_guard_rider_" + counter, props -> {
                return new HalfDoorBlock(props.noOcclusion().sound(SoundType.METAL).strength(2.0F, 3.0F), null);
            }, (block) -> {
                return () -> {
                    return new BlockItemBase((Block)block.get());
                };
            }));
            AWARD_HALF_BARRELS.add(register("award_half_barrel_" + counter, props -> {
                return new HalfBarrelBlock(props.noOcclusion().sound(SoundType.METAL).strength(2.0F, 3.0F));
            }, (block) -> {
                return () -> {
                    return new BlockItemBase((Block)block.get());
                };
            }));
            AWARD_BIN_GRAINS.add(register("award_bin_grain_" + counter, props -> {
                return new GrainBinBlock(props.strength(1.0F, 2.0F).noOcclusion());
            }, (block) -> {
                return () -> {
                    return new BlockItemBase((Block)block.get());
                };
            }));
       }
    }

}
