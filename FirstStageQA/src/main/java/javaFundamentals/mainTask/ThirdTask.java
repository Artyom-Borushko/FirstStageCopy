package main.java.javaFundamentals.mainTask;

import java.util.Random;
import java.util.Scanner;

public class ThirdTask {
    public static void main(String[] args) {
        Scanner scanForQuantity = new Scanner(System.in);
        System.out.println("Enter the amount of random numbers:");
        Integer quantityOfRandomNumbers = scanForQuantity.nextInt();
        int min = 0;
        int max = 1000;
        for (int i = 0; i < quantityOfRandomNumbers; i++) {
            int randomNumber = min + (int) (Math.random() * max);
            System.out.print(randomNumber + " ");
        }
        for (int i = 0; i < quantityOfRandomNumbers; i++) {
            int randomNumber = min + (int) (Math.random() * max);
            System.out.println("\n Random number is: " + randomNumber);
        }
        scanForQuantity.close();
    }
}
