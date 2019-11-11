/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package snakes.and.ladders;

/**
 *
 * @author dhirst1
 */
public class Player {
    private int position;
    public Player(){
        this.position = 0;
    }
    public void setPosition(int number){
        this.position = number;
    }
    public int getPosition(){
        return this.position;
    }
}
