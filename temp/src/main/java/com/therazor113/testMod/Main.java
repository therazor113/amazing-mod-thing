package com.therazor113.testMod;

import com.therazor113.testMod.Proxies.CommonProxy;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Referance.MODID,version = Referance.VERSION,name = Referance.NAME)
public class Main {

    @SidedProxy(clientSide = Referance.Client, serverSide = Referance.Server)
    public static CommonProxy proxy;

    @Mod.EventHandler
    public void PreInit(FMLPreInitializationEvent E){
        this.proxy.PreInit(E);
    }
    @Mod.EventHandler
    public void Init (FMLInitializationEvent E){
        this.proxy.Init(E);
}
    @Mod.EventHandler
    public void PostInit (FMLPostInitializationEvent E){
        this.proxy.PostInit(E);
    }
    










}
