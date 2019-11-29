package main.java.javaFundamentals.mainTask;

import java.util.Scanner;

public class SecondTask {
    public static void main(String[] args) {
        Scanner writtenText = new Scanner(System.in);
        System.out.println("Enter some text here:");
        String someText = writtenText.nextLine();
        String reverse = new StringBuffer(someText).reverse().toString();
        System.out.println("Primary line: " + someText);
        System.out.println("Line after reverse: " + reverse);
        writtenText.close();
    }
}
