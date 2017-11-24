package com.nwatkins1.cyanide.utils.enums;

import org.bukkit.ChatColor;

public enum Rank {

    PLAYER("DEFAULT", ChatColor.GRAY + ""),
    DONATOR("DONATOR", ChatColor.GREEN + "DONATOR "+ ChatColor.GRAY + ""),
    STAFF("STAFF", ChatColor.BLUE + "M "+ ChatColor.GRAY + ""),
    ADMIN("ADMIN", ChatColor.RED + "A "+ ChatColor.GRAY + "");

    private String name;
    private String prefix;

    public String getName() {
        return name;
    }

    public String getPrefix() {
        return prefix;
    }

    Rank(String name, String prefix) {
        this.name = name;
        this.prefix = prefix;
    }
}
