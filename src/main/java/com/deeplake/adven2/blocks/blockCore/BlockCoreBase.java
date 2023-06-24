package com.deeplake.adven2.blocks.blockCore;

import com.deeplake.adven2.blocks.BlockBase;
import net.minecraft.block.material.Material;

public class BlockCoreBase extends BlockBase {
    public BlockCoreBase(String name, Material material) {
        super(name, material);
        setHarvestLevel("pickaxe",0);
        setHardness(10f);
        setResistance(-1);
    }

    
}
