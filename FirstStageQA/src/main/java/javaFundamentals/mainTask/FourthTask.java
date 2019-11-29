package main.java.javaFundamentals.mainTask;

import java.util.Scanner;

public class FourthTask {
    public static void main(String[] args) {
        Scanner listOfIntegers = new Scanner (System.in);
        System.out.println("Write the quantity of Integers: ");
        int writtenIterations = listOfIntegers.nextInt();
        int sum = 0;
        int intersection = 1;
        for (int i = 0; i < writtenIterations; i++) {
            System.out.println("Write you numbers: ");
            int eachInteger = listOfIntegers.nextInt();
            sum += eachInteger;
            intersection *= eachInteger;
        }
        System.out.println("The sum of Integers are: " + sum);
        System.out.println("The intersection of Integers are: " + intersection);
    }
}