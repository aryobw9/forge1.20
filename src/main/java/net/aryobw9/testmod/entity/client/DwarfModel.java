package net.aryobw9.testmod.entity.client;// Made with Blockbench 4.9.2
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports


import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.EntityModel;
import net.minecraft.client.model.HierarchicalModel;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.Entity;

public class DwarfModel<T extends Entity> extends HierarchicalModel<T> {

	private final ModelPart Dwarf;
	private final ModelPart Head;

	public DwarfModel(ModelPart root) {
		this.Dwarf = root.getChild("Dwarf");
		this.Head = Dwarf.getChild("Main_Head");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition Dwarf = partdefinition.addOrReplaceChild("Dwarf", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 1.0F));

		PartDefinition Main_Body = Dwarf.addOrReplaceChild("Main_Body", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition pickaxe = Main_Body.addOrReplaceChild("pickaxe", CubeListBuilder.create().texOffs(37, 56).addBox(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 0.5F, new CubeDeformation(0.0F))
				.texOffs(38, 55).addBox(1.0F, 1.0F, 0.0F, 1.0F, 1.0F, 0.5F, new CubeDeformation(0.0F))
				.texOffs(41, 52).addBox(2.0F, 2.0F, 0.0F, 1.0F, 1.0F, 0.5F, new CubeDeformation(0.0F))
				.texOffs(44, 49).addBox(3.0F, 3.0F, 0.0F, 1.0F, 1.0F, 0.5F, new CubeDeformation(0.0F))
				.texOffs(47, 46).addBox(4.0F, 4.0F, 0.0F, 1.0F, 1.0F, 0.5F, new CubeDeformation(0.0F))
				.texOffs(50, 43).addBox(5.0F, 5.0F, 0.0F, 1.0F, 1.0F, 0.5F, new CubeDeformation(0.0F))
				.texOffs(51, 43).addBox(5.0F, 4.5F, 0.0F, 0.5F, 0.5F, 0.5F, new CubeDeformation(0.0F))
				.texOffs(51, 43).addBox(6.0F, 5.5F, 0.0F, 0.5F, 0.5F, 0.5F, new CubeDeformation(0.0F))
				.texOffs(51, 43).addBox(4.0F, 3.5F, 0.0F, 0.5F, 0.5F, 0.5F, new CubeDeformation(0.0F))
				.texOffs(51, 43).addBox(3.0F, 2.5F, 0.0F, 0.5F, 0.5F, 0.5F, new CubeDeformation(0.0F))
				.texOffs(51, 43).addBox(2.0F, 1.5F, 0.0F, 0.5F, 0.5F, 0.5F, new CubeDeformation(0.0F))
				.texOffs(51, 43).addBox(1.0F, 0.5F, 0.0F, 0.5F, 0.5F, 0.5F, new CubeDeformation(0.0F))
				.texOffs(51, 46).addBox(0.5F, 1.0F, 0.0F, 0.5F, 0.5F, 0.5F, new CubeDeformation(0.0F))
				.texOffs(51, 46).addBox(1.5F, 2.0F, 0.0F, 0.5F, 0.5F, 0.5F, new CubeDeformation(0.0F))
				.texOffs(51, 46).addBox(2.5F, 3.0F, 0.0F, 0.5F, 0.5F, 0.5F, new CubeDeformation(0.0F))
				.texOffs(51, 46).addBox(3.5F, 4.0F, 0.0F, 0.5F, 0.5F, 0.5F, new CubeDeformation(0.0F))
				.texOffs(51, 46).addBox(4.5F, 5.0F, 0.0F, 0.5F, 0.5F, 0.5F, new CubeDeformation(0.0F))
				.texOffs(51, 46).addBox(5.5F, 6.0F, 0.0F, 0.5F, 0.5F, 0.5F, new CubeDeformation(0.0F))
				.texOffs(57, 44).addBox(7.5F, 6.0F, 0.0F, 1.5F, -2.25F, 0.5F, new CubeDeformation(0.0F))
				.texOffs(53, 40).addBox(6.0F, 6.0F, 0.0F, 2.5F, 2.5F, 0.5F, new CubeDeformation(0.0F)), PartPose.offset(-4.75F, -12.75F, -1.0F));

		PartDefinition pick_sar2_r1 = pickaxe.addOrReplaceChild("pick_sar2_r1", CubeListBuilder.create().texOffs(57, 44).addBox(-1.375F, -0.245F, -0.25F, 1.5F, -2.25F, 0.5F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(6.25F, 7.625F, 0.25F, 0.0F, 0.0F, -1.5708F));

		PartDefinition right_hand = Main_Body.addOrReplaceChild("right_hand", CubeListBuilder.create().texOffs(14, 21).addBox(-1.0F, -1.0F, -4.0F, 2.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(-3.0F, -11.0F, 0.0F));

		PartDefinition left_hand = Main_Body.addOrReplaceChild("left_hand", CubeListBuilder.create().texOffs(16, 13).addBox(-1.0F, -1.0F, -4.0F, 2.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(3.0F, -11.0F, 0.0F));

		PartDefinition right_leg = Main_Body.addOrReplaceChild("right_leg", CubeListBuilder.create().texOffs(0, 23).addBox(0.0F, -1.0F, -5.0F, 2.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(-2.0F, -5.0F, 1.0F));

		PartDefinition left_leg = Main_Body.addOrReplaceChild("left_leg", CubeListBuilder.create().texOffs(22, 19).addBox(-1.0F, -1.0F, -5.0F, 2.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(1.0F, -5.0F, 1.0F));

		PartDefinition body = Main_Body.addOrReplaceChild("body", CubeListBuilder.create().texOffs(0, 13).addBox(-2.0F, -12.0F, -5.0F, 4.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition Main_Head = Dwarf.addOrReplaceChild("Main_Head", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition helmet = Main_Head.addOrReplaceChild("helmet", CubeListBuilder.create().texOffs(28, 11).addBox(-3.25F, -19.0F, -6.25F, 6.5F, 1.0F, 6.5F, new CubeDeformation(0.0F))
				.texOffs(29, 25).addBox(-3.0F, -20.0F, -6.0F, 6.0F, 1.0F, 6.0F, new CubeDeformation(0.0F))
				.texOffs(19, 32).addBox(-1.0F, -20.25F, -6.25F, 2.0F, 1.25F, 6.5F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition head = Main_Head.addOrReplaceChild("head", CubeListBuilder.create(), PartPose.offset(0.0F, -8.0F, 0.0F));

		PartDefinition head_r1 = head.addOrReplaceChild("head_r1", CubeListBuilder.create().texOffs(0, 0).addBox(-3.0F, -4.0F, 4.0F, 6.0F, 6.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, -2.0F, 1.5708F, 0.0F, 0.0F));

		PartDefinition nose = Main_Head.addOrReplaceChild("nose", CubeListBuilder.create(), PartPose.offset(0.0F, -9.0F, -4.0F));

		PartDefinition nose_r1 = nose.addOrReplaceChild("nose_r1", CubeListBuilder.create().texOffs(0, 0).addBox(-1.0F, -15.0F, -6.25F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 9.0F, 2.0F, -0.0873F, 0.0F, 0.0F));

		PartDefinition moustache = Main_Head.addOrReplaceChild("moustache", CubeListBuilder.create().texOffs(22, 2).addBox(-2.0F, -13.0F, -7.0F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(25, 1).addBox(2.0F, -14.0F, -7.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(24, 0).addBox(-2.0F, -13.5F, -7.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(24, 0).addBox(1.0F, -13.5F, -7.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(25, 1).addBox(-3.0F, -14.0F, -7.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(24, 0).addBox(3.0F, -13.5F, -7.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(24, 0).addBox(-4.0F, -13.5F, -7.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 64, 64);
	}

	@Override
	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {

	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		Dwarf.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	@Override
	public ModelPart root() {
		return Dwarf;
	}
}