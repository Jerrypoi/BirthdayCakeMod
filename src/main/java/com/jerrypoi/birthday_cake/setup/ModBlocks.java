package com.jerrypoi.birthday_cake.setup;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.fml.RegistryObject;

import java.util.function.Supplier;

public class ModBlocks {
    public static final RegistryObject<Block> BIRTHDAY_CAKE = register("birthday_cake", () ->
            new Block(AbstractBlock.Properties.create(Material.ROCK).
                    hardnessAndResistance(3,10).
                    harvestLevel(1).
                    sound(SoundType.STONE)));

    private static<T extends Block> RegistryObject<T> registerNoItem(String name, Supplier<T> block) {
        return Registration.BLOCKS.register(name, block);
    }
    private static<T extends Block> RegistryObject<T> register(String name, Supplier<T> block) {
        RegistryObject<T> ret = registerNoItem(name, block);
        Registration.ITEMS.register(name, ()-> new BlockItem(ret.get(), new Item.Properties().group(ItemGroup.FOOD)));
        return ret;
    }
    static void register() {

    }
}
