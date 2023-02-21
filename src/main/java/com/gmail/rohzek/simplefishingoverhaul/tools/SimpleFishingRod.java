package com.gmail.rohzek.simplefishingoverhaul.tools;

import net.minecraft.world.item.FishingRodItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.common.ToolAction;

public class SimpleFishingRod extends FishingRodItem
{
	public SimpleFishingRod() 
	{
		super(new Item.Properties());
	}
	
	@Override
	public boolean canPerformAction(ItemStack stack, ToolAction action) 
	{
		boolean test = true;
		
		// Only allow cast if a hook is equipped
		if(test) 
		{
			return super.canPerformAction(stack, action);
		}
		else
		{
			return false;
		}
	}
	
	/*
	@Override
	public @Nullable ICapabilityProvider initCapabilities(ItemStack stack, @Nullable CompoundTag nbt) 
	{
		if(nbt != null) 
		{
		}
		
		return stack;
	}
	
	@Override
	public void appendHoverText(ItemStack stack, Level world, List<Component> components, TooltipFlag flag) 
	{
		super.appendHoverText(stack, world, components, flag);
	}
	*/
}
