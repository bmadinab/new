package com.company.module_1.Lesson_8;

public class Club {
    String name;
    String country;
    int ratingPoints;
    Player []players;

    public Club() {
    }

    public Club(String name, String country, int ratingPoints, Player[] players) {
        this.name = name;
        this.country = country;
        this.ratingPoints = ratingPoints;
        this.players = players;
    }

    public String printClubData(){
        String player = " ";

        for (int i = 0; i < players.length; i++) {
            player = player + players [i];
        }
        return name + ", " + country + ", " +  ratingPoints + ", " + player;
    }


}
