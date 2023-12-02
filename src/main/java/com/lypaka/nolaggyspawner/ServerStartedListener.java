package com.lypaka.nolaggyspawner;

import com.pixelmonmod.pixelmon.spawning.PixelmonSpawning;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.server.FMLServerStartingEvent;

import java.util.Timer;
import java.util.TimerTask;

@Mod.EventBusSubscriber(modid = "nolaggyspawner")
public class ServerStartedListener {

    @SubscribeEvent
    public static void onServerStarted (FMLServerStartingEvent event) {

        Timer timer = new Timer();
        timer.schedule(new TimerTask() {

            @Override
            public void run() {

                PixelmonSpawning.coordinator.deactivate();
                NoLaggySpawner.logger.info("Successfully disabled Pixelmon's laggy ass spawner");

            }

        }, 3000);

    }

}
