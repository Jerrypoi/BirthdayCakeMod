package com.jerrypoi.birthday_cake.setup;

import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.fml.RegistryObject;

public class ModItems {
    public static final String GIANT_BIRTHDAY_CAKE_ITEM_NAME = "giant_birthday_cake";
    public static final RegistryObject<Item> GIANT_BIRTHDAY_CAKE = Registration.ITEMS.
            register(GIANT_BIRTHDAY_CAKE_ITEM_NAME, () -> new Item(new Item.Properties().group(ItemGroup.FOOD)));

    static void register() {

    }
}
