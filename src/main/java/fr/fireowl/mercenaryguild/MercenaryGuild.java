package fr.fireowl.mercenaryguild;

import fr.fireowl.mercenaryguild.init.ItemInit;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(MercenaryGuild.MODID)
public class MercenaryGuild {
    public static final String MODID = "mercenaryguild";

    public MercenaryGuild() {
        // for future use
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::setup);
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::clientSetup);

        // Create a bus, that for each type of Item (ITEMS, BLOCKS...) must be created. Makes the game know of the created items.
        IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
        ItemInit.ITEMS.register(bus);
    }

    private void setup(FMLCommonSetupEvent e){

    }

    private void clientSetup(FMLClientSetupEvent e){

    }
}
