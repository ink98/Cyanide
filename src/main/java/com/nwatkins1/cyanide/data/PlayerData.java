package com.nwatkins1.cyanide.data;

import com.nwatkins1.cyanide.Cyanide;
import com.nwatkins1.cyanide.utils.enums.PlayerState;
import com.nwatkins1.cyanide.utils.enums.Rank;

import java.util.*;

public class PlayerData {

    private final Cyanide plugin;
    private Map<UUID, UserData> userDataMap = new HashMap<>();
    private List<UUID> vanished = new ArrayList<>();

    public PlayerData(Cyanide plugin) {
        this.plugin = plugin;
    }

    public Map<UUID, UserData> getUserDataMap() {
        return userDataMap;
    }

    public void loadPlayer(UUID uuid, Rank rank, int experience, int coins) {
        UserData data = new UserData(PlayerState.ALIVE, rank, experience, coins);
        userDataMap.put(uuid, data);
    }

}
