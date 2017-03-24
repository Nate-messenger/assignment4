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
public class A4Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //scanner to get user input
        Scanner input = new Scanner(System.in);
        //asking user to type name
        System.out.println("please enter your name");
        //scanning in name into variable
        String name = input.nextLine();
        //scaniing in name
        System.out.println("Hello " + name);
    }

}
