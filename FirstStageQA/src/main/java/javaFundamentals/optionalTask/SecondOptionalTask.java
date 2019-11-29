package main.java.javaFundamentals.optionalTask;

import java.util.Scanner;

public class SecondOptionalTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the numbers:");
        String writtenNumbers = scanner.nextLine();
        String[] arrayOfEachWrittenNumber = writtenNumbers.split(" ");
        int sumOfEveryElement;
        int sumOfEveryElementCounter = 0;
        int amountOfElements;
        int amountOfElementsCounter = 0;
        String eachNumber;
        for (int i = 0; i < arrayOfEachWrittenNumber.length; i++) {
            eachNumber = arrayOfEachWrittenNumber[i];
            sumOfEveryElement = eachNumber.length();
            sumOfEveryElementCounter += sumOfEveryElement;
            amountOfElementsCounter = arrayOfEachWrittenNumber.length;
        }
        double averageValue = sumOfEveryElementCounter / amountOfElementsCounter;
        System.out.println("Average number is: " + averageValue);
        for (int i = 0; i < arrayOfEachWrittenNumber.length; i++) {
            eachNumber = arrayOfEachWrittenNumber[i];
            sumOfEveryElement = eachNumber.length();
            if (sumOfEveryElement > averageValue) {
                System.out.println("Numbers which length is bigger than the average value: " + arrayOfEachWrittenNumber[i]);
                System.out.println("Longest number value: " + sumOfEveryElement);
            }
        }
    }
}