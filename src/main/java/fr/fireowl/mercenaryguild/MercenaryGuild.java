package fr.fireowl.mercenaryguild;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(MercenaryGuild.MODID)
public class MercenaryGuild {
    public static final String MODID = "mercenaryguild";

    public MercenaryGuild() {
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::setup);
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::clientSetup);

    }

    private void setup(FMLCommonSetupEvent e){

    }

    private void clientSetup(FMLClientSetupEvent e){

    }
}
