package com.columba_karasu.more_nuggets.world.features;

import com.columba_karasu.more_nuggets.lists.BlockList;
import net.minecraft.block.Blocks;
import net.minecraft.world.gen.feature.NoFeatureConfig;
import net.minecraft.world.gen.feature.TreeFeature;
import net.minecraftforge.common.IPlantable;

public class crimson_fungus_feature extends TreeFeature {

    public crimson_fungus_feature() {
        super(NoFeatureConfig::deserialize, false, 4, BlockList.CrimsonStem.getDefaultState(), Blocks.NETHER_WART_BLOCK.getDefaultState(), false);
        setSapling((IPlantable) BlockList.Crimson_Fungus);
    }
}

