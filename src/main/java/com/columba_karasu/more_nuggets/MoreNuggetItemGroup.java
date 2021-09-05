package com.columba_karasu.more_nuggets;

import com.columba_karasu.more_nuggets.lists.ItemList;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

public class MoreNuggetItemGroup extends ItemGroup {
    public MoreNuggetItemGroup(){
        super("MoreNuggetItemGroup");
    }

    @Override
    public ItemStack createIcon() {
        return new ItemStack(ItemList.More_Nuget_LIST);
    }
}
