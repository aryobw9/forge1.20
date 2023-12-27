package net.aryobw9.testmod.event;

import net.aryobw9.testmod.entity.ModEntities;
import net.aryobw9.testmod.entity.custom.DwarfEntity;
import net.aryobw9.testmod.testmod;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid= testmod.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModEventbusEvents {
    @SubscribeEvent
    public static void  registerAttributes(EntityAttributeCreationEvent event){
        event.put(ModEntities.DWARF.get(), DwarfEntity.createAttribute().build());
    }
}
