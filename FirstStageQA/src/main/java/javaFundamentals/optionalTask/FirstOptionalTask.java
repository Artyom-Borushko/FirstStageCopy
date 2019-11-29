package main.java.javaFundamentals.optionalTask;

import java.util.Scanner;

public class FirstOptionalTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the numbers:");
        String writtenNumbers = scanner.nextLine();
        String[] arrayOfEachWrittenNumber = writtenNumbers.split(" ");
        String longestNumber, shortestNumber;
        longestNumber = shortestNumber = arrayOfEachWrittenNumber[0];
        for (int i = 1; i < arrayOfEachWrittenNumber.length; i++) {
            String eachNumber = arrayOfEachWrittenNumber[i];
            if (eachNumber.length() > longestNumber.length()) {
                longestNumber = arrayOfEachWrittenNumber[i];
            } else {
                shortestNumber = arrayOfEachWrittenNumber[i];
            }
        }
        int longestNumberLength = longestNumber.length();
        int shortestNumberLength = shortestNumber.length();
        System.out.println("The shortest number is: " + shortestNumber);
        System.out.println("The shortest number length is: " + shortestNumberLength);
        System.out.println("The longest number is: " + longestNumber);
        System.out.println("The longest number length is: " + longestNumberLength);
    }
}
