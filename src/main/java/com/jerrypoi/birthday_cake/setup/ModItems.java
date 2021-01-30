package com.jerrypoi.birthday_cake.setup;

import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.fml.RegistryObject;

public class ModItems {
    public static final RegistryObject<Item> GIANT_BIRTHDAY_CAKE = Registration.ITEMS.
            register("giant_birthday_cake", () -> new Item(new Item.Properties().group(ItemGroup.FOOD)));

    static void register() {

    }
}
