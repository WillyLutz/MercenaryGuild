package fr.fireowl.mercenaryguild.init;

import com.google.common.collect.ImmutableSet;
import fr.fireowl.mercenaryguild.MercenaryGuild;
import net.minecraft.world.entity.ai.village.poi.PoiManager;
import net.minecraft.world.entity.ai.village.poi.PoiTypes;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.GrassBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraftforge.client.event.RegisterColorHandlersEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.util.ObfuscationReflectionHelper;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraft.world.entity.npc.VillagerProfession;
import net.minecraft.world.entity.ai.village.poi.PoiType;
import net.minecraftforge.registries.RegistryObject;
import net.minecraft.world.item.Item;

import java.lang.reflect.InvocationTargetException;

public class VillagerInit {
    public static final DeferredRegister<PoiType> POINT_OF_INTEREST_TYPE = DeferredRegister.create(ForgeRegistries.POI_TYPES, MercenaryGuild.MODID);
    public static final DeferredRegister<VillagerProfession> VILLAGER_PROFESSIONS = DeferredRegister.create(ForgeRegistries.VILLAGER_PROFESSIONS, MercenaryGuild.MODID);

    //TODO : continue to adapt https://www.google.com/search?q=how+to+make+a+custom+villager+minecraft+1.19&rlz=1C1VDKB_frFR1060FR1060&sxsrf=APwXEdemS1pXf2GnZQsqo0jNyTEMdF5caA%3A1687211721830&ei=yc6QZKywMrqgkdUPntqnkAo&ved=0ahUKEwjsuNy6qdD_AhU6UKQEHR7tCaIQ4dUDCA8&uact=5&oq=how+to+make+a+custom+villager+minecraft+1.19&gs_lcp=Cgxnd3Mtd2l6LXNlcnAQAzIGCAAQFhAeMgYIABAWEB46BAgjECdKBAhBGAFQsAVYrQtg3Q1oAXAAeACAATOIAa8BkgEBNJgBAKABAcABAQ&sclient=gws-wiz-serp#fpstate=ive&vld=cid:73a40760,vid:Kuldy9sXDL8
    public static final RegistryObject<PoiType> TEST_BLOCK = POINT_OF_INTEREST_TYPE.register("Test_block",
            () -> new PoiType(ImmutableSet.of(Blocks.GRASS_BLOCK.defaultBlockState()), 1, 1));
    public static void registerPOIs(){
        try{
            ObfuscationReflectionHelper.findMethod(PoiType.class,
                    "registerBlockStates", PoiType.class).invoke(null, TEST_BLOCK.get());
        } catch (InvocationTargetException | IllegalAccessException exception) {
            exception.printStackTrace();
        }
    }

    public static void register(IEventBus bus){
        POINT_OF_INTEREST_TYPE.register(bus);
        VILLAGER_PROFESSIONS.register(bus);
    }

//    public static final RegistryObject<PoiType> TEST_1 = POINT_OF_INTEREST_TYPE.register("test_1",
//            ()->new PoiType("test_1", PoiTypes))
}
