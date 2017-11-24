package com.nwatkins1.cyanide.utils;

import com.nwatkins1.cyanide.Cyanide;
import org.bukkit.ChatColor;

public class StringUtil {

    private final Cyanide plugin;

    public StringUtil(Cyanide plugin) {
        this.plugin = plugin;
    }

    public String message(String message) {
        return ChatColor.translateAlternateColorCodes('&', message);
    }

    public void broadcast(String message) {
        plugin.getServer().broadcastMessage(plugin.getConfig().getString("prefix") + message(message));
    }
}
