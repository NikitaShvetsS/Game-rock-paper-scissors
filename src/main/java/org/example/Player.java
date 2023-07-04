package org.example;

public class Player {
    private String name;
    private Integer numsOfGames;
    private Integer numsOfWinGAmes;
    private Integer numsOfLoseGames;

    public Player(String name) {
        this.name = name;
        this.numsOfGames = 0;
        this.numsOfWinGAmes = 0;
        this.numsOfLoseGames = 0;
    }

    public String getName() {
        return name;
    }

    public Integer getNumsOfGames() {
        return numsOfGames;
    }

    public Integer getNumsOfWinGames() {
        return numsOfWinGAmes;
    }

    public Integer getNumsOfLoseGames() {
        return numsOfLoseGames;
    }

    public void incrementNumsOfGames(){
        numsOfGames++;
    }

    public void incrementNumsOfWinGames(){
        numsOfWinGAmes++;
    }

    public void incrementNumsOfLostGames(){
        numsOfLoseGames++;
    }

}
