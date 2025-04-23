package org.acm.onu;

import dev.architectury.registry.registries.DeferredRegister;
import dev.architectury.registry.registries.RegistrySupplier;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.food.Foods;
import net.minecraft.world.item.BowItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;

public final class ExampleMod {
    public static final String MOD_ID = "acmexamplemod";

    //ITEM REGISTRY
    //This is just a thing that needs to exist to store stuff
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(
            MOD_ID,
            Registries.ITEM
    );

    //Blocks are basically the same for making the basics but you replace `item` with block
    //It also gets to be BlockBehavior instead of Item.Properties
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(
            MOD_ID,
            Registries.BLOCK
    );
    //This is how you can create an item
    public static final RegistrySupplier<Item> COTC = ITEMS.register(
            //String ID for the item
            //NOTE: Minecraft requires things be lowercase
            "cotc",
            //It needs a supplier, so Lambdas will be fun
            () -> new Item((new Item.Properties()).food(Foods.COOKED_PORKCHOP))
    );

    public static final RegistrySupplier<Item> GUN = ITEMS.register(
            "gun",
            () -> new BowItem((new Item.Properties()).durability(384).stacksTo(1)).
    )

    public static void init() {
        // Write common init code here.
        // We will make most of our code here and in new Java files in this folder.
        ITEMS.register();
    }
}
