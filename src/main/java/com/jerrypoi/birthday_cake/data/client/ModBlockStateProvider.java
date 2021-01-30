package com.jerrypoi.birthday_cake.data.client;

import com.jerrypoi.birthday_cake.BirthdayCakeMod;
import com.jerrypoi.birthday_cake.setup.ModBlocks;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.common.data.ExistingFileHelper;

public class ModBlockStateProvider extends BlockStateProvider {
    public ModBlockStateProvider(DataGenerator gen, ExistingFileHelper exFileHelper) {
        super(gen, BirthdayCakeMod.MOD_ID, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {
        simpleBlock(ModBlocks.BIRTHDAY_CAKE_BLOCK_WHITE.get());
        simpleBlock(ModBlocks.BIRTHDAY_CAKE_BLOCK_GRAY.get());
        simpleBlock(ModBlocks.BIRTHDAY_CAKE_BLOCK_RED.get());
        simpleBlock(ModBlocks.BIRTHDAY_CAKE_BLOCK_DEEPORANGE.get());
        simpleBlock(ModBlocks.BIRTHDAY_CAKE_BLOCK_ORANGE.get());
    }
}
