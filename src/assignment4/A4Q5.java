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
public class A4Q5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //scanner to get user input
        Scanner input = new Scanner(System.in);
        //asking user to type out the things
        System.out.println("please enter the marks you got on the test");
        double m1 = input.nextDouble();
        System.out.println("please enter in what the test was out of");
        double t1 = input.nextDouble();
        //calculate the percent
        double p1 = m1 / t1 * 100;
        //asking user to type out the things
        System.out.println("please enter the marks you got on the test");
        double m2 = input.nextDouble();
        System.out.println("please enter in what the test was out of");
        double t2 = input.nextDouble();
        //calculate the percent
        double p2 = m2 / t2 * 100;
        //asking user to type out the things
        System.out.println("please enter the marks you got on the test");
        double m3 = input.nextDouble();
        System.out.println("please enter in what the test was out of");
        double t3 = input.nextDouble();
        //calculate the percent
        double p3 = m3 / t3 * 100;
        //asking user to type out the things
        System.out.println("please enter the marks you got on the test");
        double m4 = input.nextDouble();
        System.out.println("please enter in what the test was out of");
        double t4 = input.nextDouble();
        //calculate the percent
        double p4 = m4 / t4 * 100;
        //asking user to type out the things
        System.out.println("please enter the marks you got on the test");
        double m5 = input.nextDouble();
        System.out.println("please enter in what the test was out of");
        double t5 = input.nextDouble();
        //calculate the percent
        double p5 = m5 / t5 * 100;
        System.out.println("your percents are " + p1 + " " + p2 + " " + p3 + " " + " " + p4 + " " + p5);
        //calculate the average percent
        double total = p1 + p2 + p3 + p4 + p5;
        double a = total / 5;
        System.out.println("your average percent is " + a);
    }

}
