package com.deeplake.adven2.item.consumables;

import com.deeplake.adven2.util.CommonFunctions;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumHand;
import net.minecraft.world.World;
import net.minecraft.world.biome.Biome;

public class ItemRainCall extends ItemConsumableBase {
    public ItemRainCall(String name) {
        super(name);
    }

    /**
     * Called when the equipped item is right clicked.
     */
    public ActionResult<ItemStack> onItemRightClick(World worldIn, EntityPlayer playerIn, EnumHand handIn)
    {
        ItemStack stack = playerIn.getHeldItem(handIn);
        Biome biome = worldIn.getBiome(playerIn.getPosition());

        if (biome.canRain() && !worldIn.isRaining())
        {
            worldIn.setRainStrength(100f);
            return super.onItemRightClick(worldIn, playerIn, handIn);
        }
        else {
            if (playerIn instanceof EntityPlayerMP)
            {
                CommonFunctions.SendMsgToPlayer((EntityPlayerMP) playerIn, "adven2.msg.cannot_rain");
            }
            return new ActionResult<ItemStack>(EnumActionResult.FAIL,stack);
        }
    }
}
