package com.columba_karasu.more_nuggets;

import com.columba_karasu.more_nuggets.blocks.trees.CrimsonFungusSapling;
import com.columba_karasu.more_nuggets.lists.BlockList;
import com.columba_karasu.more_nuggets.lists.ItemList;
import com.columba_karasu.more_nuggets.world.OreGeneration;
import com.columba_karasu.more_nuggets.world.TreeGeneration;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.material.MaterialColor;
import net.minecraft.item.*;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import com.columba_karasu.more_nuggets.world.features.crimson_fungus.crimson_Fungus;
import com.columba_karasu.more_nuggets.world.features.warped_fungus.warped_Fungus;

@Mod(MoreNuggets.MOD_ID)
public class MoreNuggets {
    public static final String MOD_ID = "more_nuggets";

    public static final Logger LOGGER = LogManager.getLogger(MOD_ID);

    public static final ItemGroup ItemGroup_More_Nugets = new MoreNuggetItemGroup();

    public MoreNuggets() {
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::setup);
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::doClientStuff);
        MinecraftForge.EVENT_BUS.register(this);
    }

    private void setup(final FMLCommonSetupEvent event) {
        OreGeneration.setupOreGeneration();
        LOGGER.info("HELLO FROM PREINIT");

        //TreeGeneration.setup();
        
    }

    private void doClientStuff(final FMLClientSetupEvent event) {
        LOGGER.info("HELLO FROM Client Setup");
    }

    @Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
    public static class RegistryEvents {
        @SubscribeEvent
        public static void onItemsRegistry(final RegistryEvent.Register<Item> itemRegistryEvent) {
            LOGGER.info("HELLO from Register Item");
            itemRegistryEvent.getRegistry().registerAll(
                    // Items
                    ItemList.More_Nuget_LIST = new Item(new Item.Properties().group(ItemGroup_More_Nugets))
                            .setRegistryName(new ResourceLocation(MOD_ID, "diamond_nugget")),
                    ItemList.DiamondNuggetOre = new BlockItem(BlockList.DiamondNuggetOre_NETHER, new Item.Properties().group(ItemGroup_More_Nugets))
                            .setRegistryName(BlockList.DiamondNuggetOre_NETHER.getRegistryName()),
                    ItemList.IronNuggetOre = new BlockItem(BlockList.IronNuggetOre_NETHER, new Item.Properties().group(ItemGroup_More_Nugets))
                            .setRegistryName(BlockList.IronNuggetOre_NETHER.getRegistryName()),
                    ItemList.GoldNuggetOre = new BlockItem(BlockList.GoldNuggetOre_NETHER, new Item.Properties().group(ItemGroup_More_Nugets))
                            .setRegistryName(BlockList.GoldNuggetOre_NETHER.getRegistryName()),
                    ItemList.DiamondNugetOre_OVERWORLD = new BlockItem(BlockList.DiamondNugetOre_OVERWORLD, new Item.Properties().group(ItemGroup_More_Nugets))
                            .setRegistryName(BlockList.DiamondNugetOre_OVERWORLD.getRegistryName()),
                    ItemList.IronNugetOre_OVERWORLD = new BlockItem(BlockList.IronNugetOre_OVERWORLD, new Item.Properties().group(ItemGroup_More_Nugets))
                            .setRegistryName(BlockList.IronNugetOre_OVERWORLD.getRegistryName()),
                    ItemList.GoldNugetOre_OVERWORLD = new BlockItem(BlockList.GoldNugetOre_OVERWORLD, new Item.Properties().group(ItemGroup_More_Nugets))
                            .setRegistryName(BlockList.GoldNugetOre_OVERWORLD.getRegistryName()),
                    ItemList.CrimsonStem = new BlockItem(BlockList.CrimsonStem, new Item.Properties().group(ItemGroup_More_Nugets))
                            .setRegistryName(BlockList.CrimsonStem.getRegistryName()),
                    ItemList.WarpedStem = new BlockItem(BlockList.WarpedStem, new Item.Properties().group(ItemGroup_More_Nugets))
                            .setRegistryName(BlockList.WarpedStem.getRegistryName()),
                    ItemList.WarpedWartBlock = new BlockItem(BlockList.WarpedWartBlock, new Item.Properties().group(ItemGroup_More_Nugets))
                            .setRegistryName(BlockList.WarpedWartBlock.getRegistryName())

            );
        }

        @SubscribeEvent
        public static void onBlocksRegistry(final RegistryEvent.Register<Block> blockRegistryEvent) {
            LOGGER.info("HELLO from Register Block");
            blockRegistryEvent.getRegistry().registerAll(
                    BlockList.DiamondNuggetOre_NETHER = new Block(Block.Properties.create(Material.IRON,MaterialColor.NETHERRACK)
                            .hardnessAndResistance(3.0f, 3.0f)
                            .sound(SoundType.METAL))
                            .setRegistryName(new ResourceLocation(MOD_ID, "diamond_nugget_ore")),
                    BlockList.IronNuggetOre_NETHER = new Block(Block.Properties.create(Material.ROCK,MaterialColor.NETHERRACK)
                            .hardnessAndResistance(3.0f, 3.0f))
                            .setRegistryName(new ResourceLocation(MOD_ID, "iron_nugget_ore")),
                    BlockList.GoldNuggetOre_NETHER = new Block(Block.Properties.create(Material.ROCK,MaterialColor.NETHERRACK)
                            .sound(SoundType.STONE)
                            .hardnessAndResistance(3.0f, 3.0f))
                            .setRegistryName(new ResourceLocation(MOD_ID, "gold_nugget_ore")),
                    BlockList.DiamondNugetOre_OVERWORLD = new Block(Block.Properties.create(Material.ROCK,MaterialColor.STONE)
                            .sound(SoundType.STONE)
                            .hardnessAndResistance(2.0f, 3.0f))
                            .setRegistryName(new ResourceLocation(MOD_ID, "diamond_nugget_ore_stone")),
                    BlockList.IronNugetOre_OVERWORLD = new Block(Block.Properties.create(Material.ROCK,MaterialColor.STONE)
                            .sound(SoundType.STONE)
                            .hardnessAndResistance(2.0f, 3.0f))
                            .setRegistryName(new ResourceLocation(MOD_ID, "iron_nugget_ore_stone")),
                    BlockList.GoldNugetOre_OVERWORLD = new Block(Block.Properties.create(Material.ROCK,MaterialColor.STONE)
                            .sound(SoundType.STONE)
                            .hardnessAndResistance(2.0f, 3.0f))
                            .setRegistryName(new ResourceLocation(MOD_ID, "gold_nugget_ore_stone")),
                    BlockList.CrimsonStem = new Block(Block.Properties.create(Material.WOOD,MaterialColor.NETHERRACK)
                            .hardnessAndResistance(2.0f, 3.0f))
                            .setRegistryName(new ResourceLocation(MOD_ID, "crimson_stem")),
                    BlockList.WarpedStem = new Block(Block.Properties.create(Material.WOOD,MaterialColor.NETHERRACK)
                            .hardnessAndResistance(2.0f, 3.0f))
                            .setRegistryName(new ResourceLocation(MOD_ID, "warped_stem")),
                    BlockList.WarpedWartBlock = new Block(Block.Properties.create(Material.WOOD,MaterialColor.NETHERRACK)
                            .hardnessAndResistance(2.0f, 3.0f))
                            .setRegistryName(new ResourceLocation(MOD_ID, "warped_wart_block"))

            );
        }

        public static Block CrimsonFungus = new CrimsonFungusSapling(
                new crimson_Fungus(),
                Block.Properties.create(Material.PLANTS)
                        .doesNotBlockMovement()
                        .tickRandomly()
                        .hardnessAndResistance(0.0F)
                        .sound(SoundType.PLANT))
                .setRegistryName(new ResourceLocation(MOD_ID, "crimson_fungus"));

        public static Block WarpedFungus = new CrimsonFungusSapling(
                new warped_Fungus(),
                Block.Properties.create(Material.PLANTS)
                        .doesNotBlockMovement()
                        .tickRandomly()
                        .hardnessAndResistance(0.0F)
                        .sound(SoundType.PLANT))
                .setRegistryName(new ResourceLocation(MOD_ID, "warped_fungus"));

        @SubscribeEvent
        public static void registerBlocks(RegistryEvent.Register<Block> event) {
            event.getRegistry().registerAll(
                    CrimsonFungus,
                    WarpedFungus
            );

        }

        @SubscribeEvent
        public static void registerBlockItems(RegistryEvent.Register<Item> event) {
            event.getRegistry().registerAll(
                    new BlockItem(CrimsonFungus, new Item.Properties().group(ItemGroup_More_Nugets))
                            .setRegistryName(new ResourceLocation(MOD_ID, "crimson_fungus")),
                    new BlockItem(WarpedFungus, new Item.Properties().group(ItemGroup_More_Nugets))
                            .setRegistryName(new ResourceLocation(MOD_ID, "warped_fungus"))
            );
        }
    }
}
