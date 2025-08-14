package net.zeio.applemod.item;

import net.minecraft.core.registries.Registries;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Rarity;
import net.minecraft.core.component.DataComponents;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModItems {

    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems("applemod");


    public static final DeferredItem<Item> COAL_APPLE = ITEMS.registerItem("coal_apple",
            COAL_APPLE -> new Item(COAL_APPLE.food(ModFoods.COAL_APPLE)
                    .component(DataComponents.CONSUMABLE, ModConsumables.COAL_APPLE)
                    .rarity(Rarity.RARE)
            ));

    public static final DeferredItem<Item> IRON_APPLE = ITEMS.registerItem("iron_apple",
            IRON_APPLE -> new Item(IRON_APPLE.food(ModFoods.IRON_APPLE)
                    .component(DataComponents.CONSUMABLE, ModConsumables.IRON_APPLE)
                    .rarity(Rarity.RARE)
            ));

    public static final DeferredItem<Item> NETHERITE_APPLE = ITEMS.registerItem("netherite_apple",
            NETHERITE_APPLE -> new Item(NETHERITE_APPLE.food(ModFoods.NETHERITE_APPLE)
                    .component(DataComponents.CONSUMABLE, ModConsumables.NETHERITE_APPLE)
                    .rarity(Rarity.RARE)
            ));

    public static final DeferredItem<Item> GLOW_APPLE = ITEMS.registerItem("glow_apple",
            GLOW_APPLE -> new Item(GLOW_APPLE.food(ModFoods.GLOW_APPLE)
                    .component(DataComponents.CONSUMABLE, ModConsumables.GLOW_APPLE)
                    .rarity(Rarity.RARE)
            ));

    public static final DeferredItem<Item> CHARCOAL_APPLE = ITEMS.registerItem("charcoal_apple",
            CHARCOAL_APPLE -> new Item(CHARCOAL_APPLE.food(ModFoods.CHARCOAL_APPLE)
                    .component(DataComponents.CONSUMABLE, ModConsumables.CHARCOAL_APPLE)
                    .rarity(Rarity.RARE)
            ));

    public static final DeferredItem<Item> DIAMOND_APPLE = ITEMS.registerItem("diamond_apple",
            DIAMOND_APPLE -> new Item(DIAMOND_APPLE.food(ModFoods.DIAMOND_APPLE)
                    .component(DataComponents.CONSUMABLE, ModConsumables.DIAMOND_APPLE)
                    .rarity(Rarity.RARE)
            ));

    public static final DeferredItem<Item> WITHER_APPLE = ITEMS.registerItem("wither_apple",
            WITHER_APPLE -> new Item(WITHER_APPLE.food(ModFoods.WITHER_APPLE)
                    .component(DataComponents.CONSUMABLE, ModConsumables.WITHER_APPLE)
                    .rarity(Rarity.RARE)
            ));

    public static final DeferredItem<Item> EMERALD_APPLE = ITEMS.registerItem("emerald_apple",
            EMERALD_APPLE -> new Item(EMERALD_APPLE.food(ModFoods.EMERALD_APPLE)
                    .component(DataComponents.CONSUMABLE, ModConsumables.EMERALD_APPLE)
                    .rarity(Rarity.RARE)
            ));

    public static final DeferredItem<Item> CORE_APPLE = ITEMS.registerItem("core_apple",
            CORE_APPLE -> new Item(CORE_APPLE.food(ModFoods.CORE_APPLE)
                    .component(DataComponents.CONSUMABLE, ModConsumables.CORE_APPLE)
                    .rarity(Rarity.RARE)
            ));

    public static final DeferredItem<Item> HEART_APPLE = ITEMS.registerItem("heart_apple",
            HEART_APPLE -> new Item(HEART_APPLE.food(ModFoods.HEART_APPLE)
                    .component(DataComponents.CONSUMABLE, ModConsumables.HEART_APPLE)
                    .rarity(Rarity.RARE)
            ));
    public static final DeferredItem<Item> HEALING_APPLE = ITEMS.registerItem("healing_apple",
            HEALING_APPLE -> new Item(HEALING_APPLE.food(ModFoods.HEALING_APPLE)
                    .component(DataComponents.CONSUMABLE, ModConsumables.HEALING_APPLE)
                    .rarity(Rarity.RARE)
            ));

    public static final DeferredItem<Item> HUNGER_APPLE = ITEMS.registerItem("hunger_apple",
            HUNGER_APPLE -> new Item(HUNGER_APPLE.food(ModFoods.HUNGER_APPLE)
                    .component(DataComponents.CONSUMABLE, ModConsumables.HUNGER_APPLE)
                    .rarity(Rarity.RARE)
            ));



        public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }

}