package org.launchcode.java.exercises;

import java.util.Scanner;

public class Mpg {
    public static void main(String[] args) {
        double distance;
        double gallons;
        double mpg;
        Scanner in;

        in = new Scanner(System.in);
        System.out.println("How many miles have you traveled? : ");
        distance = in.nextDouble();

        in = new Scanner(System.in);
        System.out.println("How many gallons did you put in last fill-up? :");
        gallons = in.nextDouble();

        mpg = distance / gallons;
        System.out.println("Your MPG is: " + mpg);



    }
}
