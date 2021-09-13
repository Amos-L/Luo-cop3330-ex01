/*
 *  UCF COP3330 Fall 2021 Assignment 1.1 Solution
 *  Copyright 2021 Amos Luo
 */

package org.example;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in); //Asking for user input
        System.out.println("What is your name?"); //Printing out question
        String name = input.nextLine(); //Storing user input to string "name"
        String x = "Hello, " + name + ", nice to meet you!"; //Printing
        System.out.println(x);
    }
}
