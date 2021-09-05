package com.columba_karasu.more_nuggets.world;

import com.columba_karasu.more_nuggets.world.features.crimson_fungus_feature;
import com.columba_karasu.more_nuggets.world.features.warped_fungus_feature;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.GenerationStage;
import net.minecraft.world.gen.feature.IFeatureConfig;
import net.minecraft.world.gen.placement.AtSurfaceWithExtraConfig;
import net.minecraft.world.gen.placement.Placement;
import net.minecraftforge.registries.ForgeRegistries;

public class TreeGeneration {

    public static void setup() {
        addCrimson_FungusToOverworld(new crimson_fungus_feature());
        addWarped_FungusToOverworld(new warped_fungus_feature());
    }

    private static void addCrimson_FungusToOverworld(crimson_fungus_feature featureIn) {
        for(Biome biome : ForgeRegistries.BIOMES) {
            if (!biome.getCategory().equals(Biome.Category.NETHER) && !biome.getCategory().equals(Biome.Category.THEEND)) {
                biome.addFeature(
                        GenerationStage.Decoration.VEGETAL_DECORATION,
                        Biome.createDecoratedFeature(
                                featureIn,
                                IFeatureConfig.NO_FEATURE_CONFIG,
                                Placement.COUNT_EXTRA_HEIGHTMAP,
                                new AtSurfaceWithExtraConfig(2, 0.1F, 1)
                        )
                );
            }
        }
    }

    private static void addWarped_FungusToOverworld(warped_fungus_feature featureIn) {
        for(Biome biome : ForgeRegistries.BIOMES) {
            if (!biome.getCategory().equals(Biome.Category.NETHER) && !biome.getCategory().equals(Biome.Category.THEEND)) {
                biome.addFeature(
                        GenerationStage.Decoration.VEGETAL_DECORATION,
                        Biome.createDecoratedFeature(
                                featureIn,
                                IFeatureConfig.NO_FEATURE_CONFIG,
                                Placement.COUNT_EXTRA_HEIGHTMAP,
                                new AtSurfaceWithExtraConfig(2, 0.1F, 1)
                        )
                );
            }
        }
    }
}