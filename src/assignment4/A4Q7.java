/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment4;

import java.util.Scanner;

/**
 *
 * @author nate
 */
public class A4Q7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //eels and escalators is the same as snakes and ladders
        //scanner to get user input
        Scanner input = new Scanner(System.in);
        int p = 1; //the position of tht player

        System.out.println("welcome to eels and escalator");
        while (p <= 99) {
            System.out.println("please enter in the role of the dice");
            int r = input.nextInt();
            if (r == 0) {
                System.out.println("you quit");
                break;
            }
            //the rolling of the dice
            if (r >= 2 && r <= 12) {
                //increases the position of the player
                p = p + r;
                if (p > 100) {
                p = p - r; 
            }
                System.out.println("You are at " + p);
            }
            
            //Snakes
            if (p == 54) {
                System.out.println("You hit a eel you are now at 19");
                p = 19;
            }
            if (p == 90) {
                System.out.println("You hit a eel you are now at 48");
                p = 48;
            }
            if (p == 99) {
                System.out.println("You hit a eel you are now at 77");
                p = 77;
            }
            //Ladders
            if (p == 9) {
                System.out.println("You hit a escalators you are now at 34");
                p = 34;
            }
            if (p == 40) {
                System.out.println("You hit a escalators you ar now at 64");
                p = 64;
            }
            if (p == 67) {
                System.out.println("You hit a escalators you ar now at 86");
                p = 86;
            }
            if (p == 100) {
                System.out.println("You win");
            }
            
        }

    }
}
/* the board has 3 eels
: 54 sends the player to 19, 90 sends the player to 48 and 99 sends the player to 77. It also has 3 escalators
: 9 sends a player to 34, 40 sends a player to 64 and 67 sends a player to 86).

 */
