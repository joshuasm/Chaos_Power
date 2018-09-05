package com.ChAos.ChAosPower.init;

import java.util.ArrayList;
import java.util.List;

import com.ChAos.ChAosPower.blocks.BlockBase;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class ModBlocks {

	public static final List<Block> BLOCKS = new ArrayList<Block>();
	
	public static final Block CHAOS_BLOCK = new BlockBase("chaos_block", Material.IRON);
	
}
