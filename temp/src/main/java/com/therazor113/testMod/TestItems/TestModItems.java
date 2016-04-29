package com.therazor113.testMod.TestItems;


import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

public final class TestModItems {

    public static Item tutorialItem;

    public static void createItems(){
        GameRegistry.registerItem(tutorialItem = new BasicItem("Name"), tutorialItem.getUnlocalizedName().substring(5));
    }










}
