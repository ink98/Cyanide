package com.nwatkins1.cyanide;

import org.bukkit.plugin.java.JavaPlugin;

public final class Cyanide extends JavaPlugin {

    private static Cyanide plugin;

    @Override
    public void onEnable() {
        plugin = this;
        saveDefaultConfig();
    }

    public static Cyanide getPlugin() {
        return plugin;
    }
}
