package org.launchcode.java.exercises;

import java.util.Scanner;

/**
 * Written by Nick Paisley
 * An app thats asks for your name and returns a greeting + yourname
 */

public class Hello {
    public static void main(String[] args) {
        String yourname;
        Scanner in;

        in = new Scanner(System.in);
        System.out.println("What is your name?");

        yourname = in.next();
        System.out.println("Hello, " + yourname);


    }

}
