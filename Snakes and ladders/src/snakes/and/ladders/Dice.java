/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package snakes.and.ladders;

import java.util.Random;

/**
 *
 * @author dhirst1
 */
public class Dice {
    public static int roll(){
        Random rand = new Random(); 
        return rand.nextInt(6 - 1 + 1) + 1;
        
    }
}
