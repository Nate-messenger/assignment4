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
public class A4Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //scanner to get user input
        Scanner input = new Scanner(System.in);
        //asking user to type the niumbers
        System.out.println("Please enter in four numbers with spaces in between them or on different lines");
        //scanning in numbers 
        double n1 = input.nextDouble();
        double n2 = input.nextDouble();
        double n3 = input.nextDouble();
        double n4 = input.nextDouble();
        System.out.println("your numbers are " + n1 + ", " + n2 + ", " + n3 + ", " + n4);
    }

}
