package com.columba_karasu.more_nuggets.world;

import com.columba_karasu.more_nuggets.config.OregenConfig;
import com.columba_karasu.more_nuggets.lists.BlockList;
import com.columba_karasu.more_nuggets.MoreNuggets;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.GenerationStage;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.OreFeatureConfig;
import net.minecraft.world.gen.placement.CountRangeConfig;
import net.minecraft.world.gen.placement.Placement;
import net.minecraftforge.registries.ForgeRegistries;

public class OreGeneration {
    public static void setupOreGeneration() {
        if (OregenConfig.generate_overworld.get()) {
            for (Biome biome : ForgeRegistries.BIOMES) {
                MoreNuggets.LOGGER.info("ore_chance:" + OregenConfig.nuget_ore_chance.get().toString());
                biome.addFeature(
                        GenerationStage.Decoration.UNDERGROUND_ORES,
                        Biome.createDecoratedFeature(
                                Feature.ORE,
                                new OreFeatureConfig(
                                        OreFeatureConfig.FillerBlockType.NETHERRACK,
                                        BlockList.DiamondNuggetOre_NETHER.getDefaultState(),
                                        OregenConfig.nuget_ore_chance.get()),
                                Placement.COUNT_RANGE,
                                new CountRangeConfig(1, 15, 60, 100)));
                biome.addFeature(
                        GenerationStage.Decoration.UNDERGROUND_ORES,
                        Biome.createDecoratedFeature(
                                Feature.ORE,
                                new OreFeatureConfig(
                                        OreFeatureConfig.FillerBlockType.NETHERRACK,
                                        BlockList.IronNuggetOre_NETHER.getDefaultState(),
                                        OregenConfig.nuget_ore_chance.get()),
                                Placement.COUNT_RANGE,
                                new CountRangeConfig(3, 20, 0, 100)));
                biome.addFeature(
                        GenerationStage.Decoration.UNDERGROUND_ORES,
                        Biome.createDecoratedFeature(
                                Feature.ORE,
                                new OreFeatureConfig(
                                        OreFeatureConfig.FillerBlockType.NETHERRACK,
                                        BlockList.GoldNuggetOre_NETHER.getDefaultState(),
                                        OregenConfig.nuget_ore_chance.get()),
                                Placement.COUNT_RANGE,
                                new CountRangeConfig(2, 0, 0, 100)));
                biome.addFeature(
                        GenerationStage.Decoration.UNDERGROUND_ORES,
                        Biome.createDecoratedFeature(
                                Feature.ORE,
                                new OreFeatureConfig(
                                        OreFeatureConfig.FillerBlockType.NATURAL_STONE,
                                        BlockList.GoldNugetOre_OVERWORLD.getDefaultState(),
                                        OregenConfig.nuget_ore_chance.get()),
                                Placement.COUNT_RANGE,
                                new CountRangeConfig(2, 0, 0, 30)));
                biome.addFeature(
                        GenerationStage.Decoration.UNDERGROUND_ORES,
                        Biome.createDecoratedFeature(
                                Feature.ORE,
                                new OreFeatureConfig(
                                        OreFeatureConfig.FillerBlockType.NATURAL_STONE,
                                        BlockList.IronNugetOre_OVERWORLD.getDefaultState(),
                                        OregenConfig.nuget_ore_chance.get()),
                                Placement.COUNT_RANGE,
                                new CountRangeConfig(2, 0, 0, 60)));
                biome.addFeature(
                        GenerationStage.Decoration.UNDERGROUND_ORES,
                        Biome.createDecoratedFeature(
                                Feature.ORE,
                                new OreFeatureConfig(
                                        OreFeatureConfig.FillerBlockType.NATURAL_STONE,
                                        BlockList.DiamondNugetOre_OVERWORLD.getDefaultState(),
                                        OregenConfig.nuget_ore_chance.get()),
                                Placement.COUNT_RANGE,
                                new CountRangeConfig(2, 0, 0, 15)));
            }
        }
    }
}
