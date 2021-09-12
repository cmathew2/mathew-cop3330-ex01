package base;

/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Chris Mathew
 */

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        //input
        System.out.print("What is your name? ");
        String name = in.nextLine();

        //string concatenation
        String outputString = "Hello, " + name + ", nice to meet you!";

        //output
        System.out.println(outputString);
    }
}
