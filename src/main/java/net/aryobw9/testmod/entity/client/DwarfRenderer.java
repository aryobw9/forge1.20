package net.aryobw9.testmod.entity.client;

import net.aryobw9.testmod.entity.custom.DwarfEntity;
import net.aryobw9.testmod.testmod;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.resources.ResourceLocation;
import net.minecraftforge.registries.IdMappingEvent;

public class DwarfRenderer extends MobRenderer<DwarfEntity,DwarfModel<DwarfEntity>> {
    public DwarfRenderer(EntityRendererProvider.Context pContext) {
        super(pContext,new DwarfModel<>(pContext.bakeLayer(ModModelLayers.DWARF_LAYER)), 2f);
    }

    @Override
    public ResourceLocation getTextureLocation(DwarfEntity pEntity) {
        return new ResourceLocation(testmod.MODID, "textures/entity/Dwarf.png");
    }
}
