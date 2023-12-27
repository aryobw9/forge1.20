package net.aryobw9.testmod.event;

import net.aryobw9.testmod.entity.client.DwarfModel;
import net.aryobw9.testmod.entity.client.ModModelLayers;
import net.aryobw9.testmod.testmod;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

import java.security.PublicKey;

@Mod.EventBusSubscriber(modid= testmod.MODID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class ModEventbusClientEvents {
    @SubscribeEvent
    public static void registerLayer(EntityRenderersEvent.RegisterLayerDefinitions event){
        event.registerLayerDefinition(ModModelLayers.DWARF_LAYER, DwarfModel::createBodyLayer);
    }
}
