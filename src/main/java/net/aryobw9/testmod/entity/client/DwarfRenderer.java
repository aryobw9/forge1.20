package net.aryobw9.testmod.entity.client;

import com.mojang.blaze3d.vertex.PoseStack;
import net.aryobw9.testmod.entity.custom.DwarfEntity;
import net.aryobw9.testmod.testmod;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.resources.ResourceLocation;


public class DwarfRenderer extends MobRenderer<DwarfEntity,DwarfModel<DwarfEntity>> {
    public DwarfRenderer(EntityRendererProvider.Context pContext) {
        super(pContext,new DwarfModel<>(pContext.bakeLayer(ModModelLayers.DWARF_LAYER)), 0.5f);
    }

    @Override
    public ResourceLocation getTextureLocation(DwarfEntity pEntity) {
        return new ResourceLocation(testmod.MODID, "textures/entity/dwarf.png");
    }
    @Override
    public void render(DwarfEntity pEntity, float pEntityYaw, float pPartialTicks, PoseStack pMatrixStack,
                       MultiBufferSource pBuffer, int pPackedLight) {
        if(pEntity.isBaby()) {
            pMatrixStack.scale(0.5f, 0.5f, 0.5f);
        }

        super.render(pEntity, pEntityYaw, pPartialTicks, pMatrixStack, pBuffer, pPackedLight);
    }
}
