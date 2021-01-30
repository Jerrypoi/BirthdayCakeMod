package com.jerrypoi.birthday_cake.data.client;
import com.jerrypoi.birthday_cake.BirthdayCakeMod;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.client.model.generators.ItemModelBuilder;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.client.model.generators.ModelFile;
import net.minecraftforge.common.data.ExistingFileHelper;


import static com.jerrypoi.birthday_cake.setup.ModBlocks.BIRTHDAY_CAKE_WHITE_BLOCK_NAME;
import static com.jerrypoi.birthday_cake.setup.ModItems.GIANT_BIRTHDAY_CAKE_ITEM_NAME;

public class ModItemModelProvider extends ItemModelProvider {
    public ModItemModelProvider(DataGenerator generator, ExistingFileHelper existingFileHelper) {
        super(generator, BirthdayCakeMod.MOD_ID, existingFileHelper);
    }
    @Override
    protected void registerModels() {
//        withExistingParent(BIRTHDAY_CAKE_WHITE_BLOCK_NAME, modLoc("block/sliver_block"));


        ModelFile itemGenerated = getExistingFile(mcLoc("item/generated"));

        builder(itemGenerated, GIANT_BIRTHDAY_CAKE_ITEM_NAME);

    }
    private ItemModelBuilder builder(ModelFile itemGenerated, String name) {
        return getBuilder(name).parent(itemGenerated).texture("layer0", "item/" + name);
    }
}
