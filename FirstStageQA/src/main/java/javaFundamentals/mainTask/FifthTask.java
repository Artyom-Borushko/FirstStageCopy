package main.java.javaFundamentals.mainTask;

import java.util.Scanner;

public class FifthTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the month number:");
        int monthNumber = scanner.nextInt();
        String[] arrayOfMonths = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
        if (monthNumber <= 0 || monthNumber > 12) {
            System.out.println("Please write down the numbers between 1 and 12: ");
        } else {
            System.out.println("Corresponding month is: " + arrayOfMonths[monthNumber - 1]);
        }
        scanner.close();
    }
}
