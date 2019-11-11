/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package snakes.and.ladders;

import java.util.List;
import java.util.Map;

/**
 *
 * @author dhirst1
 */
public class SnakesAndLadders {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Board board = new Board();
        board.setUpGame();
        Game sAndL = new Game(board.getGameBoard());
        Player player1 = new Player();
        sAndL.addPlayer(player1);
        Player player2 = new Player();
        sAndL.addPlayer(player2);
        String Winner;
        List<Player> players = sAndL.getPlayers();
        Map<Integer, String> theGameBoard = board.getGameBoard();
        while(true){ // hard coded for test cases would implement a cleaner method
            int dice1 = Dice.roll();
            System.out.println("palyer 1 pos" + players.get(0).getPosition());
            players.get(0).setPosition(dice1 + players.get(0).getPosition());
            int player1Pos = players.get(0).getPosition();
            if(player1Pos < 100){
                if(theGameBoard.get(player1Pos) == "Snake"){
                    players.get(0).setPosition(players.get(0).getPosition()- 10);
                }
                else if(theGameBoard.get(player1Pos) == "Ladder"){
                    players.get(0).setPosition(players.get(0).getPosition()+ 10);
                
                }
            }
            else{
                Winner = "player 1";
                break;
            }
            int dice2 = Dice.roll();
            System.out.println("palyer 2 pos" + players.get(1).getPosition());
            players.get(1).setPosition(dice2 + players.get(1).getPosition());
            int player2Pos = players.get(1).getPosition();
            if(player2Pos < 100){
                if(theGameBoard.get(player2Pos) == "Snake"){
                    players.get(1).setPosition(players.get(1).getPosition()- 10);
                }
                else if(theGameBoard.get(player1Pos) == "Ladder"){
                    players.get(1).setPosition(players.get(1).getPosition()+ 10);
                
                }
            }
            else{
                Winner = "player 2";
                break;
            }
        }
        System.out.println(Winner);
     
    }
    
}
