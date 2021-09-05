package com.columba_karasu.more_nuggets.world.features;

import net.minecraft.block.trees.Tree;
import net.minecraft.world.gen.feature.AbstractTreeFeature;
import net.minecraft.world.gen.feature.NoFeatureConfig;
import javax.annotation.Nullable;
import java.util.Random;

public class crimson_fungus {

    public static class crimson_Fungus extends Tree {
        @Nullable
        protected AbstractTreeFeature<NoFeatureConfig> getTreeFeature(Random random) {
            return new crimson_fungus_feature();
        }
    }
}
