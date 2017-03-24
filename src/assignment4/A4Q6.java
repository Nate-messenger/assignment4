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
public class A4Q6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        //scanner to get user input
        Scanner input = new Scanner(System.in);
        //asking user to type speedlimit and driver speed
        System.out.println("Please enter the the speed limit");
        int s1 = input.nextInt();
        System.out.println("Please enter the speed of the car");
        int l1 = input.nextInt();
        //calculate the amount the speed limit is over by
        int d = l1 - s1;
        //tells you by how much you are over the speed limit
        if (d >= 1) {
            System.out.println("You are over the limit by " + d);
        } else {
            System.out.println("Congratulations, you are within the speed limit!");
        }
        //fines 
        if (d > 1 && d < 20) {
            System.out.println("Your fine is $100");
        }
        if (d > 21 && d <= 30) {
            System.out.println("Your fine is $270");
        }
        if (d < 31) {
            System.out.println("Your fine is $500");
        }

    }

}


/*
1 - 20 $100
21 - 30 $270
above 31 $500
 */
