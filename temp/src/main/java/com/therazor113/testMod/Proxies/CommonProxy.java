package com.therazor113.testMod.Proxies;


import com.therazor113.testMod.TestItems.TestModItems;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

public class CommonProxy {

    public void PreInit(FMLPreInitializationEvent E){
        TestModItems.createItems();
    }

    public void Init(FMLInitializationEvent E){

    }

    public void PostInit(FMLPostInitializationEvent E){

    }









}
