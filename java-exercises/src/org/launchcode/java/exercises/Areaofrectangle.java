package org.launchcode.java.exercises;

import java.util.Scanner;

public class Areaofrectangle {
    public static void main(String[] args) {
        double sidea;
        double sideb;
        double area;
        Scanner in;

        in = new Scanner(System.in);
        System.out.println("What is the length of Side A?");
        sidea = in.nextDouble();

        in = new Scanner(System.in);
        System.out.println("What is the length of Side B?");
        sideb = in.nextDouble();

        area = sidea * sideb;
        System.out.println("The area of your rectangle is: " + area);

    }
}
