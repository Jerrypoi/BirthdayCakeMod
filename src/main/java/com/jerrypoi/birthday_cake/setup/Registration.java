package com.jerrypoi.birthday_cake.setup;

import com.jerrypoi.birthday_cake.BirthdayCakeMod;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class Registration {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, BirthdayCakeMod.MOD_ID);
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, BirthdayCakeMod.MOD_ID);
    public static final ItemGroup ITEM_GROUP = new ItemGroup(ItemGroup.getGroupCountSafe(), "Birthday Cake") {
        @Override
        public ItemStack createIcon() {
            return new ItemStack(Blocks.CAKE);
        }
    };
    public static void register() {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();
        BLOCKS.register(modEventBus);
        ITEMS.register(modEventBus);

        ModItems.register();
        ModBlocks.register();
    }

}
