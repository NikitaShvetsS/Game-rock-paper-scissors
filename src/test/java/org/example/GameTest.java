package org.example;

import static org.junit.jupiter.api.Assertions.*;

class GameTest {

    @org.junit.jupiter.api.Test
    void Test_determine_winner() {
        Game game = new Game();

        //Draw
        int result1 = game.determineWinner(1, 1);
        assertEquals(0, result1);

        //Win
        int result2 = game.determineWinner(1, 2);
        assertEquals(1, result2);

        //Lose
        int result3 = game.determineWinner(2, 1);
        assertEquals(-1, result3);

    }
}