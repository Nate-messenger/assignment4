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
public class A4Q4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //scanner to get user input
        Scanner input = new Scanner(System.in);
        //asking user to type cost
        System.out.println("please enter the cost of food");
        double c1 = input.nextDouble();
        //asking user to type cost
        System.out.println("please enter the cost of the DJ");
        double c2 = input.nextDouble();
        //asking user to type cost
        System.out.println("please enter the cost to rent the place");
        double c3 = input.nextDouble();
        //asking user to type cost
        System.out.println("please enter the cost of the decorations");
        double c4 = input.nextDouble();
        //asking user to type cost
        System.out.println("please enter the cost of the staff");
        double c5 = input.nextDouble();
        //asking user to type cost
        System.out.println("please enter the cost of misc things");
        double c6 = input.nextDouble();
        //calculate the total
        double total = c1 + c2 + c3 + c4 + c5 + c6;
        System.out.println("the cost of those items are " + total);
        System.out.println("please enter the cost a ticket");
        double ticket = input.nextDouble();
        double nt = total / ticket;
        System.out.println("you would need to sell " + nt + "tickets");
    }

}
