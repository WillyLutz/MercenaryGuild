package fr.fireowl.mercenaryguild;

import fr.fireowl.mercenaryguild.init.ItemInit;
import fr.fireowl.mercenaryguild.init.VillagerInit;
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


        // Villager implementation *in development*
//        VillagerInit.register(bus);
//        VillagerInit.VILLAGER_PROFESSIONS.register(bus);
//        VillagerInit.POINT_OF_INTEREST_TYPE.register(bus);

    }

    private void setup(FMLCommonSetupEvent e){
//        e.enqueueWork(() -> {
//            VillagerInit.registerPOIs();
//        });

    }

    private void clientSetup(FMLClientSetupEvent e){

    }
}
