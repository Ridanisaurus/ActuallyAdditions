package de.ellpeck.actuallyadditions.common.util;

import net.minecraft.client.renderer.color.IBlockColor;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

public interface IColorProvidingBlock {

    @OnlyIn(Dist.CLIENT)
    IBlockColor getBlockColor();

}
