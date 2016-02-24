package com.lyrakitsune.orbis.main;

import com.lyrakitsune.orbis.proxy.CommonProxy;
import com.lyrakitsune.orbis.registry.Metals;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;


@Mod(modid = Lib.MOD_ID, name = Lib.MOD_NAME, version = Lib.VERSION)
public class Orbis {

	@SidedProxy(clientSide = Lib.CLIENT_PROXY, serverSide = Lib.SERVER_PROXY)
	public static CommonProxy proxy;
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent event)
	{
		
	}
	
	@EventHandler
	public void Init(FMLInitializationEvent event)
	{
		proxy.registerRenders();

	}
	@EventHandler
	public void postInit(FMLPostInitializationEvent event)
		{
			
			
		}
	public static CreativeTabs tabOrbis = new CreativeTabs("tabOrbis") {
		@Override
		public Item getTabIconItem(){
			return new ItemStack(Metals.ingotCopper).getItem();
		}
	};
}
	



