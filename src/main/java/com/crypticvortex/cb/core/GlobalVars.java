package com.crypticvortex.cb.core;

import java.util.Map;
import java.util.HashMap;

public class GlobalVars {
    // Application related global variables like update rate
    public final static Integer UPDATE_RATE = 1000;
    public final static Integer PAUSED_UPDATE_RATE = 100;

    // Any external file related global vars
    public static String CURRENT_SAVE = "";

    // Game related global variables like money and resources
    public static Integer MONEY = 0;
    public static Integer TIMBER = 0;
    public static Integer COTTON = 0;
    public static Integer GRAIN = 0;
    public static Integer STONE = 0;
    public static Integer WATER = 0;
    public static Integer HEMP = 0;
    public static Integer ROPE = 0;
    public static Integer GOLD = 0;
    public static Integer BARDS = 0;

    // Resources per second or per whatever we decide
    public static Integer MONEY_TICK = 0;
    public static Integer TIMBER_TICK = 0;
    public static Integer COTTON_TICK = 0;
    public static Integer GRAIN_TICK = 0;
    public static Integer STONE_TICK = 0;
    public static Integer WATER_TICK = 0;
    public static Integer HEMP_TICK = 0;
    public static Integer ROPE_TICK = 0;
    public static Integer GOLD_TICK = 0;
    public static Integer BARDS_TICK = 0;

    // All placed structures should be added to this list
    // Key = Building Name; Value = Number of said buildings placed;
    public static Map<String,Integer> Buildings = new HashMap<>();

    // Just a basic method that will return a map of all resources
    // [String]  Key = Resource Name
    // [Integer] Value = Amount of said resource available;
    public static Map<String,Integer> GetAllResources() {
        Map<String,Integer> resources = new HashMap<>();
        resources.put("MONEY", MONEY);
        resources.put("TIMBER", TIMBER);
        resources.put("COTTON", COTTON);
        resources.put("GRAIN", GRAIN);
        resources.put("STONE", STONE);
        resources.put("WATER", WATER);
        resources.put("HEMP", HEMP);
        resources.put("ROPE", ROPE);
        resources.put("GOLD", GOLD);
        resources.put("BARDS", BARDS);
        return resources;
    }

    // Just a basic method that will return a map of all resources per tick
    // [String]  Key = Resource Name
    // [Integer] Value = Amount of said resource available
    public static Map<String,Integer> GetAllResourcesTick() {
        Map<String,Integer> resources = new HashMap<>();
        resources.put("MONEY", MONEY_TICK);
        resources.put("TIMBER", TIMBER_TICK);
        resources.put("COTTON", COTTON_TICK);
        resources.put("GRAIN", GRAIN_TICK);
        resources.put("STONE", STONE_TICK);
        resources.put("WATER", WATER_TICK);
        resources.put("HEMP", HEMP_TICK);
        resources.put("ROPE", ROPE_TICK);
        resources.put("GOLD", GOLD_TICK);
        resources.put("BARDS", BARDS_TICK);
        return resources;
    }

}
