package com.columba_karasu.more_nuggets.world.features;

import net.minecraft.block.trees.Tree;
import net.minecraft.world.gen.feature.AbstractTreeFeature;
import net.minecraft.world.gen.feature.NoFeatureConfig;
import javax.annotation.Nullable;
import java.util.Random;

public class warped_fungus {

    public static class warped_Fungus extends Tree {
        @Nullable
        protected AbstractTreeFeature<NoFeatureConfig> getTreeFeature(Random random) {
            return new warped_fungus_feature();
        }
    }
}
