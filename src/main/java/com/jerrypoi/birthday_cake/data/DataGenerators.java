package com.jerrypoi.birthday_cake.data;

import com.jerrypoi.birthday_cake.BirthdayCakeMod;
import com.jerrypoi.birthday_cake.data.client.ModBlockStateProvider;
import com.jerrypoi.birthday_cake.data.client.ModItemModelProvider;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.GatherDataEvent;

@Mod.EventBusSubscriber(modid = BirthdayCakeMod.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public final class DataGenerators {
    private DataGenerators() {
    }

    @SubscribeEvent
    public static void gatherData(GatherDataEvent event) {
        DataGenerator gen = event.getGenerator();
        gen.addProvider(new ModBlockStateProvider(gen, event.getExistingFileHelper()));
        gen.addProvider(new ModItemModelProvider(gen, event.getExistingFileHelper()));

    }

}
