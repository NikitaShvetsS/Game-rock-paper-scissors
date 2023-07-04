package org.example;
public class Computer {

    public Integer getMove(){
        return (int) (Math.random() * 3) + 1;
    }

    public static String getChoice(int choice){
        switch (choice){
            case Constants.ROCK:
                return "Rock";
            case Constants.PAPER:
                return "Paper";
            case Constants.SCISSORS:
                return "Scissors";
            default:
                return "Wrong";
        }
    }

}
