package cam72cam.immersiverailroading.thirdparty;

import cam72cam.immersiverailroading.IRBlocks;
import cam72cam.immersiverailroading.ImmersiveRailroading;
import dan200.computercraft.api.peripheral.PeripheralCapability;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.common.capabilities.RegisterCapabilitiesEvent;
import net.minecraftforge.fml.common.Loader;

@Mod.EventBusSubscriber(modid = ImmersiveRailroading.MODID)
public class RegistrySubscriber {
    @SubscribeEvent
    public static void onCapabilityRegister(RegisterCapabilitiesEvent event) {
        if (Loader.isModLoaded("computercraft")) {
            event.registerBlock(PeripheralCapability.get(), ComputerCraft.run.get(),
                                IRBlocks.BLOCK_RAIL.internal, IRBlocks.BLOCK_RAIL_GAG.internal);
        }
    }
}
