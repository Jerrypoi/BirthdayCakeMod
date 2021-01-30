package com.jerrypoi.birthday_cake.setup;

import mcp.MethodsReturnNonnullByDefault;
import net.minecraft.block.*;
import net.minecraft.block.material.Material;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.stats.Stats;
import net.minecraft.util.ActionResultType;
import net.minecraft.util.Hand;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.BlockRayTraceResult;
import net.minecraft.world.World;
import net.minecraftforge.fml.RegistryObject;

import javax.annotation.ParametersAreNonnullByDefault;
import java.util.function.Supplier;

public class ModBlocks {
    public static final String BIRTHDAY_CAKE_WHITE_BLOCK_NAME = "birthday_cake_block_white";
    public static final String BIRTHDAY_CAKE_DEEPORANGE_BLOCK_NAME = "birthday_cake_block_deeporange";
    public static final String BIRTHDAY_CAKE_RED_BLOCK_NAME = "birthday_cake_block_red";
    public static final String BIRTHDAY_CAKE_GRAY_BLOCK_NAME = "birthday_cake_block_gray";
    public static final String BIRTHDAY_CAKE_ORANGE_BLOCK_NAME = "birthday_cake_block_orange";

    public static final RegistryObject<Block> BIRTHDAY_CAKE_BLOCK_WHITE = register(BIRTHDAY_CAKE_WHITE_BLOCK_NAME, () ->
            new BirthdayCakeBlock(AbstractBlock.Properties.create(Material.CAKE).
                    hardnessAndResistance(3,10).
                    harvestLevel(1).
                    sound(SoundType.HONEY)));
    public static final RegistryObject<Block> BIRTHDAY_CAKE_BLOCK_DEEPORANGE = register(BIRTHDAY_CAKE_DEEPORANGE_BLOCK_NAME, () ->
            new BirthdayCakeBlock(AbstractBlock.Properties.create(Material.CAKE).
                    hardnessAndResistance(3,10).
                    harvestLevel(1).
                    sound(SoundType.HONEY)));
    public static final RegistryObject<Block> BIRTHDAY_CAKE_BLOCK_RED = register(BIRTHDAY_CAKE_RED_BLOCK_NAME, () ->
            new BirthdayCakeBlock(AbstractBlock.Properties.create(Material.CAKE).
                    hardnessAndResistance(3,10).
                    harvestLevel(1).
                    sound(SoundType.HONEY)));
    public static final RegistryObject<Block> BIRTHDAY_CAKE_BLOCK_GRAY = register(BIRTHDAY_CAKE_GRAY_BLOCK_NAME, () ->
            new BirthdayCakeBlock(AbstractBlock.Properties.create(Material.CAKE).
                    hardnessAndResistance(3,10).
                    harvestLevel(1).
                    sound(SoundType.HONEY)));
    public static final RegistryObject<Block> BIRTHDAY_CAKE_BLOCK_ORANGE = register(BIRTHDAY_CAKE_ORANGE_BLOCK_NAME, () ->
            new BirthdayCakeBlock(AbstractBlock.Properties.create(Material.CAKE).
                    hardnessAndResistance(3,10).
                    harvestLevel(1).
                    sound(SoundType.HONEY)));

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

class BirthdayCakeBlock extends Block {

    public BirthdayCakeBlock(Properties properties) {
        super(properties);
    }

    @Override
    @ParametersAreNonnullByDefault
    @MethodsReturnNonnullByDefault
    public ActionResultType onBlockActivated(BlockState state, World worldIn, BlockPos pos, PlayerEntity player, Hand handIn, BlockRayTraceResult hit) {
        if (player.canEat(true)) {
            player.addStat(Stats.EAT_CAKE_SLICE);
            player.getFoodStats().addStats(2,0.1f);
            worldIn.removeBlock(pos, false);
            return ActionResultType.SUCCESS;
        }
        return ActionResultType.PASS;
    }

}