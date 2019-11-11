/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package snakes.and.ladders;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 *
 * @author dhirst1
 */
public class Game {
    Map<Integer, String> gameBoard;
    List<Player> players;
    int turn;

    public Game(Map<Integer, String> gameBoard) {
        this.gameBoard = gameBoard;
        this.players = new ArrayList<>();
    }

    public void addPlayer(Player player){
        this.players.add(player);
    }
    public List<Player> getPlayers(){
        return this.players;
    }
    
    
    
    
            
    
}
