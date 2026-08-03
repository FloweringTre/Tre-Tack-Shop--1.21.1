//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package com.kyraltre.tretackshop.item;

import com.kyraltre.tretackshop.registry.TackShopItems;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;

import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;

public class TackShopCreativeModTab {
    public static final DeferredRegister<CreativeModeTab> REGISTRY;
    public static final DeferredHolder<CreativeModeTab, CreativeModeTab> MAIN;

    public TackShopCreativeModTab() {
    }

    public static void init(IEventBus bus) {REGISTRY.register(bus);
    }

    static {
        REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, "tretacktab");
        MAIN = REGISTRY.register("main", () -> CreativeModeTab.builder().title(Component.translatable("creativetab.tretack_tab")).icon(() -> new ItemStack(TackShopItems.BUTTERFLY.get()))
            .displayItems((pParameters, pOutput) -> TackShopItems.REGISTRY.getEntries().forEach((registeredItem) -> {
                Item item = registeredItem.get();
                pOutput.accept(item);
            })).withSearchBar().build());
    }
}
