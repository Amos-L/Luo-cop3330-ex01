/*
 *  UCF COP3330 Fall 2021 Assignment 1.1 Solution
 *  Copyright 2021 Amos Luo
 */

package org.example;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("What is your name?");
        String name = input.nextLine();
        String x = "Hello, " + name + ", nice to meet you!";
        System.out.println(x);
    }
}
