package fr.fireowl.mercenaryguild.init;

import fr.fireowl.mercenaryguild.MercenaryGuild;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Rarity;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ItemInit {

    // allows to Register Items. Each new created item must be registered using the adequate DeferredRegister (ITEMS, BLOCKS...)
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, MercenaryGuild.MODID);

    /*
    For each item :
    => Create the Item (as following)
    => create the .json file in mercenaryguild.models.item (and later mercenaryguild.models.block etc.)
    => Create the texture in mercenaryguild.textures.item (and later .block etc.)
    => Add names / translations in lang.en_us.json and lang.fr_fr.json
     */

    // Create a new Item, with the basic Item Properties (stackable 64 etc.)
    public static final RegistryObject<Item> BRONZE_INGOT = ITEMS.register("bronze_ingot",
            () -> new Item(new Item.Properties()));

    // Create a new item but can only be stacked 1 by 1
    public static final RegistryObject<Item> BRONZE_STICK = ITEMS.register("bronze_stick",
            () -> new Item(new Item.Properties().stacksTo(1) ));

    // Create a new item, stackable up to 60, and is food (with inner properties)
    public static final RegistryObject<Item> CURSED_APPLE = ITEMS.register("cursed_apple",
            () -> new Item(new Item.Properties()
                    .stacksTo(60)
                    .food(new FoodProperties.Builder()
                            .nutrition(2)
                            .saturationMod(0.2f)
                            .effect(() -> new MobEffectInstance(MobEffects.CONFUSION, 200, 2), 1f)
                            .build()).rarity(Rarity.EPIC)
            ));

}
