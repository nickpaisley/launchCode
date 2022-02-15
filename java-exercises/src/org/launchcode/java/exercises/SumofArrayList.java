package org.launchcode.java.exercises;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SumofArrayList {

    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));


        int sum = 0;

        for (int i = 0;  i < numbers.size(); i++) {
            if (numbers.get(i) % 2 == 0)
                sum += numbers.get(i);

            }


        System.out.println("Even numbers sum:" + sum);


    }

}
