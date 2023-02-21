package com.gmail.rohzek.simplefishingoverhaul.tools;

import com.gmail.rohzek.simplefishingoverhaul.lib.Reference;

import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class SimpleFishingTools 
{
	public static final DeferredRegister<Item> TOOLS = DeferredRegister.create(ForgeRegistries.ITEMS, Reference.MODID);
	
	public static final RegistryObject<SimpleFishingRod> SIMPLE_FISHING_ROD = TOOLS.register("simple_fishing_rod", () -> new SimpleFishingRod());
	
	public static void register(IEventBus bus) 
	{
		TOOLS.register(bus);
	}
}
