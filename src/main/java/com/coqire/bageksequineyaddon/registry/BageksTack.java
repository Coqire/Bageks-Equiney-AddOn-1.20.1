package com.coqire.bageksequineyaddon.registry;


import com.alaharranhonor.swem.forge.items.SWEMHorseArmorItem;
import com.alaharranhonor.swem.forge.items.tack.*;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries.Keys;
import net.minecraftforge.registries.RegistryObject;

import java.util.ArrayList;
import java.util.List;

public class BageksTack {

    public static DeferredRegister<Item> REGISTRY;
    public static final List<RegistryObject<HalterItem>> HALTER_BAGEK;
    public static final List<RegistryObject<HalterItem>> HALTER_FLUFFY_BAGEK;
    public static final List<RegistryObject<PastureBlanketItem>> PASTURE_BLANKET_BAGEK;
    public static final List<RegistryObject<EnglishBlanketItem>> ENGLISH_BLANKET_BAGEK;
    public static final List<RegistryObject<EnglishLegWraps>> ENGLISH_LEG_WRAPS_BAGEK;
    public static final List<RegistryObject<HalterItem>> FLYMASK_BAGEK;
    public static final List<RegistryObject<EnglishBreastCollar>> QUARTERSHEET_BAGEK;
    public static final List<RegistryObject<WesternBlanketItem>> WESTERN_BLANKET_BAGEK;
    public static final List<RegistryObject<WesternLegWraps>> WESTERN_LEG_WRAPS_BAGEK;
    public static final List<RegistryObject<WesternBreastCollarItem>> WESTERN_BREAST_COLLAR_BAGEK;
    public static final List<RegistryObject<EnglishLegWraps>> TRAVEL_BOOTS_BAGEK;
    public static final List<RegistryObject<EnglishLegWraps>> ENGLISH_LEG_WRAPS_ENGLISH_BAGEK;
    public static final List<RegistryObject<EnglishBlanketItem>> ENGLISH_BLANKET_ENGLISH_BAGEK;
    public static final List<RegistryObject<PastureBlanketItem>> PASTURE_BLANKET_BAGEK_FLYSHEET;
    public static final List<RegistryObject<EnglishLegWraps>> ENGLISH_LEG_WRAPS_TENDON_BAGEK;
    public static final List<RegistryObject<EnglishSaddleItem>> ENGLISH_SADDLE_XC_BAGEK;
    public static final List<RegistryObject<EnglishBridleItem>> ENGLISH_BRIDLE_XC_BAGEK;
    public static final List<RegistryObject<EnglishLegWraps>> ENGLISH_LEG_WRAPS_TENDON_FLUFFY_BAGEK;
    public static final List<RegistryObject<WesternBreastCollarItem>> QUARTERSHEET_BREASTCOLLAR_BAGEK;


    public BageksTack() {
    }

    public static void init(IEventBus eventBus) {
        REGISTRY.register(eventBus);
    }

    static {
        REGISTRY = DeferredRegister.create(Keys.ITEMS, "bageksequineyaddon");

        HALTER_BAGEK = new ArrayList();
        for(int var1 = 0; var1 < 25; ++var1) {
            int counter = var1 + 1;
            HALTER_BAGEK.add(REGISTRY.register("halter_bagek_" + counter, () ->
                    new HalterItem("halter_bagek_" + counter, (new Item.Properties())
                            .stacksTo(16))
            ));
        }

        FLYMASK_BAGEK = new ArrayList<>();
        for(int var1 = 0; var1 < 25; ++var1) {
            int counter = var1 + 1;
            FLYMASK_BAGEK.add(REGISTRY.register("flymask_bagek_" + counter, () ->
                    new HalterItem("flymask_bagek_" + counter, (new Item.Properties())
                            .stacksTo(16))
            ));
        }

            ENGLISH_BLANKET_BAGEK = new ArrayList();
            for(int var1 = 0; var1 < 25; ++var1) {
                int counter = var1 + 1;
                ENGLISH_BLANKET_BAGEK.add(REGISTRY.register("english_blanket_bagek_" + counter, () ->
                        new EnglishBlanketItem("english_blanket_bagek_" + counter, (new Item.Properties())
                                .stacksTo(16))
                ));
            }

        ENGLISH_LEG_WRAPS_BAGEK = new ArrayList();
            for(int var1 = 0; var1 < 25; ++var1) {
                int counter = var1 + 1;
                ENGLISH_LEG_WRAPS_BAGEK.add(REGISTRY.register("english_leg_wraps_bagek_" + counter, () ->
                        new EnglishLegWraps("english_leg_wraps_bagek_" + counter, (new Item.Properties())
                                .stacksTo(16))
                ));
            }

        PASTURE_BLANKET_BAGEK = new ArrayList();
            for(int var1 = 0; var1 < 25; ++var1) {
                int counter = var1 + 1;
                PASTURE_BLANKET_BAGEK.add(REGISTRY.register("pasture_blanket_bagek_" + counter, () ->
                        new PastureBlanketItem(SWEMHorseArmorItem.HorseArmorTier.NONE, 0,
                                "pasture_blanket_bagek_" + counter, (new Item.Properties())
                                .stacksTo(16))
                ));
            }

        QUARTERSHEET_BAGEK = new ArrayList<>();
            for(int var1 = 0; var1 < 25; ++var1) {
                int counter = var1 + 1;
                QUARTERSHEET_BAGEK.add(REGISTRY.register("quartersheet_bagek_" + counter, () ->
                        new EnglishBreastCollar("quartersheet_bagek_" + counter, (new Item.Properties())
                                .stacksTo(16))
                ));
            }

        HALTER_FLUFFY_BAGEK = new ArrayList<>();
            for(int var1 = 0; var1 < 25; ++var1) {
                int counter = var1 + 1;
                HALTER_FLUFFY_BAGEK.add(REGISTRY.register("halter_fluffy_bagek_" + counter, () ->
                        new HalterItem("halter_fluffy_bagek_" + counter, (new Item.Properties())
                                .stacksTo(16))
                ));
            }

        WESTERN_LEG_WRAPS_BAGEK = new ArrayList();
            for(int var1 = 0; var1 < 25; ++var1) {
                int counter = var1 + 1;
                WESTERN_LEG_WRAPS_BAGEK.add(REGISTRY.register("western_leg_wraps_bagek_" + counter, () ->
                        new WesternLegWraps("western_leg_wraps_bagek_" + counter, (new Item.Properties())
                                .stacksTo(16))
                ));
            }

        WESTERN_BLANKET_BAGEK = new ArrayList();
            for(int var1 = 0; var1 < 25; ++var1) {
                int counter = var1 + 1;
                WESTERN_BLANKET_BAGEK.add(REGISTRY.register("western_blanket_bagek_" + counter, () ->
                        new WesternBlanketItem("western_blanket_bagek_" + counter, (new Item.Properties())
                                .stacksTo(16))
                ));
            }

        WESTERN_BREAST_COLLAR_BAGEK = new ArrayList();
            for(int var1 = 0; var1 < 25; ++var1) {
                int counter = var1 + 1;
                WESTERN_BREAST_COLLAR_BAGEK.add(REGISTRY.register("western_breast_collar_bagek_" + counter, () ->
                        new WesternBreastCollarItem("western_breast_collar_bagek_" + counter, (new Item.Properties())
                                .stacksTo(16))
                ));
            }

        TRAVEL_BOOTS_BAGEK = new ArrayList();
            for(int var1 = 0; var1 < 25; ++var1) {
                int counter = var1 + 1;
                TRAVEL_BOOTS_BAGEK.add(REGISTRY.register("english_leg_wraps_travel_bagek_" + counter, () ->
                        new EnglishLegWraps("english_leg_wraps_travel_bagek_" + counter, (new Item.Properties())
                                .stacksTo(16))
                ));
            }

        ENGLISH_LEG_WRAPS_ENGLISH_BAGEK = new ArrayList();
            for(int var1 = 0; var1 < 25; ++var1) {
                int counter = var1 + 1;
                ENGLISH_LEG_WRAPS_ENGLISH_BAGEK.add(REGISTRY.register("english_leg_wraps_english_bagek_" + counter, () ->
                        new EnglishLegWraps("english_leg_wraps_english_bagek_" + counter, (new Item.Properties())
                                .stacksTo(16))
                ));
            }

        ENGLISH_BLANKET_ENGLISH_BAGEK = new ArrayList();
            for(int var1 = 0; var1 < 25; ++var1) {
                int counter = var1 + 1;
                ENGLISH_BLANKET_ENGLISH_BAGEK.add(REGISTRY.register("english_blanket_english_bagek_" + counter, () ->
                        new EnglishBlanketItem("english_blanket_english_bagek_" + counter, (new Item.Properties())
                                .stacksTo(16))
                ));
            }

        ENGLISH_LEG_WRAPS_TENDON_BAGEK = new ArrayList();
        for (int var1 = 0; var1 < 8; ++var1) {
            int counter = var1 + 1;
            ENGLISH_LEG_WRAPS_TENDON_BAGEK.add(REGISTRY.register("english_leg_wraps_tendon_bagek_" + counter, () ->
                    new EnglishLegWraps("english_leg_wraps_tendon_bagek_" + counter, (new Item.Properties())
                            .stacksTo(64))
            ));
        }

        ENGLISH_LEG_WRAPS_TENDON_FLUFFY_BAGEK = new ArrayList();
        for (int var1 = 0; var1 < 8; ++var1) {
            int counter = var1 + 1;
            ENGLISH_LEG_WRAPS_TENDON_FLUFFY_BAGEK.add(REGISTRY.register("english_leg_wraps_tendon_bagek_fp" + counter, () ->
                    new EnglishLegWraps("english_leg_wraps_tendon_bagek_fp" + counter, (new Item.Properties())
                            .stacksTo(64))
            ));
        }

        ENGLISH_SADDLE_XC_BAGEK = new ArrayList();
        for (int var1 = 0; var1 < 8; ++var1) {
            int counter = var1 + 1;
            ENGLISH_SADDLE_XC_BAGEK.add(REGISTRY.register("english_saddle_xc_bagek_" + counter, () ->
                    new EnglishSaddleItem("english_saddle_xc_bagek_" + counter, (new Item.Properties())
                            .stacksTo(64))
            ));
        }

        ENGLISH_BRIDLE_XC_BAGEK = new ArrayList();
        for (int var1 = 0; var1 < 8; ++var1) {
            int counter = var1 + 1;
            ENGLISH_BRIDLE_XC_BAGEK.add(REGISTRY.register("english_bridle_xc_bagek_" + counter, () ->
                    new EnglishBridleItem("english_bridle_xc_bagek_" + counter, (new Item.Properties())
                            .stacksTo(64))
            ));
        }

        QUARTERSHEET_BREASTCOLLAR_BAGEK = new ArrayList<>();
        for (int var1 = 0; var1 < 8; ++var1) {
            int counter = var1 + 1;
            QUARTERSHEET_BREASTCOLLAR_BAGEK.add(REGISTRY.register("quartersheet_breastcollar_bagek_" + counter, () ->
                    new WesternBreastCollarItem("quartersheet_breastcollar_bagek_" + counter, (new Item.Properties())
                            .stacksTo(64))
            ));
        }

        PASTURE_BLANKET_BAGEK_FLYSHEET = new ArrayList();
        for (int var1 = 0; var1 < 8; ++var1) {
            int counter = var1 + 1;
            PASTURE_BLANKET_BAGEK_FLYSHEET.add(REGISTRY.register("pasture_blanket_flysheet_bagek_" + counter, () ->
                    new PastureBlanketItem(SWEMHorseArmorItem.HorseArmorTier.NONE, 0,
                            "pasture_blanket_flysheet_bagek_" + counter, (new Item.Properties())
                            .stacksTo(64))
            ));
        }

        }

    }
