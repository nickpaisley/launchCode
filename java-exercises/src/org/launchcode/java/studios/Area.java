package org.launchcode.java.studios;

import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
        double radius;
        double area;
        Scanner in;

        do {

            in = new Scanner(System.in);
            System.out.println("What is the radius of your circle?");
            radius = in.nextDouble();

            if (radius < 0) {
                System.out.println("Please enter positive value.");
            } else {
                area = 3.14 * (radius * radius);
                System.out.println("The area of your circle with a radius of " + radius + " is " + area);
            }
        } while (radius < 0);

    }
}