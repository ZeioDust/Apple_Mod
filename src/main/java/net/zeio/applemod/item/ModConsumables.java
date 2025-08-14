package net.zeio.applemod.item;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.item.component.Consumable;
import net.minecraft.world.item.consume_effects.ApplyStatusEffectsConsumeEffect;

import java.util.List;

import static net.minecraft.world.item.component.Consumables.defaultFood;

public class ModConsumables {
    public static final Consumable COAL_APPLE;
    public static final Consumable IRON_APPLE;
    public static final Consumable NETHERITE_APPLE;
    public static final Consumable GLOW_APPLE;
    public static final Consumable CHARCOAL_APPLE;
    public static final Consumable DIAMOND_APPLE;
    public static final Consumable EMERALD_APPLE;
    public static final Consumable WITHER_APPLE;
    public static final Consumable CORE_APPLE;
    public static final Consumable HEART_APPLE;
    public static final Consumable HEALING_APPLE;
    public static final Consumable HUNGER_APPLE;

    static {
       COAL_APPLE = defaultFood().onConsume(new ApplyStatusEffectsConsumeEffect(List.of
               (new MobEffectInstance(MobEffects.NIGHT_VISION, 1200, 0)))).build();

       IRON_APPLE = defaultFood().onConsume(new ApplyStatusEffectsConsumeEffect(List.of
               (new MobEffectInstance(MobEffects.HASTE, 3600, 0)))).build();

        NETHERITE_APPLE = defaultFood().onConsume(new ApplyStatusEffectsConsumeEffect(List.of
               (new MobEffectInstance(MobEffects.SPEED, 600, 4),
                       new MobEffectInstance(MobEffects.STRENGTH, 1200, 2)
                       ,new MobEffectInstance(MobEffects.INSTANT_DAMAGE, 1, 3)
                       ,new MobEffectInstance(MobEffects.JUMP_BOOST, 600, 2)))).build();

        GLOW_APPLE = defaultFood().onConsume(new ApplyStatusEffectsConsumeEffect(List.of
               (new MobEffectInstance(MobEffects.GLOWING, MobEffectInstance.INFINITE_DURATION, 0)))).build();

        CHARCOAL_APPLE = defaultFood().onConsume(new ApplyStatusEffectsConsumeEffect(List.of
                (new MobEffectInstance(MobEffects.NIGHT_VISION, 12000, 0)))).build();

        DIAMOND_APPLE = defaultFood().onConsume(new ApplyStatusEffectsConsumeEffect(List.of
                (new MobEffectInstance(MobEffects.HASTE, 1200, 4),
                        new MobEffectInstance(MobEffects.ABSORPTION, 2400, 4)))).build();

       EMERALD_APPLE = defaultFood().onConsume(new ApplyStatusEffectsConsumeEffect(List.of
               (new MobEffectInstance(MobEffects.HERO_OF_THE_VILLAGE, 1800, 9)))).build();

        WITHER_APPLE = defaultFood().onConsume(new ApplyStatusEffectsConsumeEffect(List.of
                (new MobEffectInstance(MobEffects.WITHER, 60, 1),
                        new MobEffectInstance(MobEffects.HASTE, 600, 9)
                        ,new MobEffectInstance(MobEffects.STRENGTH, 900, 9)))).build();

       CORE_APPLE = defaultFood().onConsume(new ApplyStatusEffectsConsumeEffect(List.of
               (new MobEffectInstance(MobEffects.SPEED, MobEffectInstance.INFINITE_DURATION, 0),
                       new MobEffectInstance(MobEffects.RESISTANCE, 1200, 9),
                       new MobEffectInstance(MobEffects.JUMP_BOOST, 1200, 9)))).build();

            HEART_APPLE = defaultFood().onConsume(new ApplyStatusEffectsConsumeEffect(List.of
                (new MobEffectInstance(MobEffects.HEALTH_BOOST, MobEffectInstance.INFINITE_DURATION, 4)))).build();

        HEALING_APPLE = defaultFood().onConsume(new ApplyStatusEffectsConsumeEffect(List.of
                (new MobEffectInstance(MobEffects.REGENERATION, 100, 3),
                        new MobEffectInstance(MobEffects.HEALTH_BOOST, 1200, 4)))).build();

        HUNGER_APPLE = defaultFood().onConsume(new ApplyStatusEffectsConsumeEffect(List.of
                (new MobEffectInstance(MobEffects.HUNGER, MobEffectInstance.INFINITE_DURATION, 0)))).build();

   }

}
