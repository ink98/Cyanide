package com.nwatkins1.cyanide.data;

import com.nwatkins1.cyanide.utils.enums.PlayerState;
import com.nwatkins1.cyanide.utils.enums.Rank;

public class UserData {

    private PlayerState state;
    private Rank rank;
    private int experience;
    private int coins;

    public UserData(PlayerState state, Rank rank, int experience, int coins) {
        this.state = state;
        this.rank = rank;
        this.experience = experience;
        this.coins = coins;
    }

    public PlayerState getState() {
        return state;
    }

    public void setState(PlayerState state) {
        this.state = state;
    }

    public Rank getRank() {
        return rank;
    }

    public void setRank(Rank rank) {
        this.rank = rank;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public int getCoins() {
        return coins;
    }

    public void setCoins(int coins) {
        this.coins = coins;
    }
}
