package com.columba_karasu.more_nuggets.config;

import com.columba_karasu.more_nuggets.MoreNuggets;
import net.minecraftforge.common.ForgeConfigSpec;

public class OregenConfig
{
    public static ForgeConfigSpec.IntValue nuget_ore_chance;
    public static ForgeConfigSpec.BooleanValue generate_overworld;

    public static void init(ForgeConfigSpec.Builder server, ForgeConfigSpec.Builder client)
    {
        MoreNuggets.LOGGER.info("OregenConfig init");
        server.comment("Oregen Config");

        nuget_ore_chance = server
                .comment("Maximum number of ore veins of the more nugets that can spawn in one chunk.")
                .defineInRange("oregen.biwako_ore_chance", 20, 1, 1000000);

        generate_overworld = server
                .comment("Decide if you want More Nugets ores to spawn in the overworld")
                .define("oregen.generate_overworld", true);
    }
}
