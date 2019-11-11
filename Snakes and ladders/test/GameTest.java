/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import static org.junit.Assert.assertTrue;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import snakes.and.ladders.Board;
import snakes.and.ladders.Game;
import snakes.and.ladders.Player;

/**
 *
 * @author dhirst1
 */
public class GameTest {
    
    public GameTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {

    }
    
    @After
    public void tearDown() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
    @Test
    public void addPlayerTest(){
        Board board = new Board();
        board.setUpGame();
        Game sAndL = new Game(board.getGameBoard());
        Player player1 = new Player();
        sAndL.addPlayer(player1);
        List<Player> players = sAndL.getPlayers();
        assertTrue("test if objects are the same",players.contains(player1));
        
    }
}
