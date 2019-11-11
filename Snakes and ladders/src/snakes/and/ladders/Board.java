/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package snakes.and.ladders;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

/**
 *
 * @author dhirst1
 */
public class Board {
    Map<Integer, String> gameBoard = new HashMap<>();
    public Board(){
        
    }
    public void setUpGame(){
        Random rand = new Random(); 
        int number;
        for (int i = 0; i < 100; i++) {
            number = rand.nextInt(3);
            switch(number){
                case 0:
                    gameBoard.put(i, "Snake");
                case 1:
                    gameBoard.put(i, "Blank");
                case 2:
                    gameBoard.put(i, "Ladder");
            }
            
        }
    }

    public Map<Integer, String> getGameBoard() {
        return gameBoard;
    }

    
}
