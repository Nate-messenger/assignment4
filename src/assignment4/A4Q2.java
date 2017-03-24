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
public class A4Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //scanner to get user input
        Scanner input = new Scanner(System.in);
        //asking user to type measurement
        System.out.println("please enter in a mesurement in inches to be converten into cm");
        //use to calculate cm
        double in = input.nextDouble();
        double cm = in * 2.54;
        //if the number doesent exist it wont calculate it
        if (in < 0) {
            System.out.println("Negitive measurements don`t exist");
        } else {
            //displayes the measurement in cm       
            System.out.println(in + " in cm is " + cm);
        }

    }

}
