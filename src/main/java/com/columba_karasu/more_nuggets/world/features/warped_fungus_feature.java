package com.columba_karasu.more_nuggets.world.features;

import com.columba_karasu.more_nuggets.lists.BlockList;
import net.minecraft.world.gen.feature.NoFeatureConfig;
import net.minecraft.world.gen.feature.TreeFeature;
import net.minecraftforge.common.IPlantable;

public class warped_fungus_feature extends TreeFeature {

    public warped_fungus_feature() {
        super(NoFeatureConfig::deserialize, false, 4, BlockList.WarpedStem.getDefaultState(), BlockList.WarpedWartBlock.getDefaultState(), false);
        setSapling((IPlantable) BlockList.Warped_Fungus);
    }
}

