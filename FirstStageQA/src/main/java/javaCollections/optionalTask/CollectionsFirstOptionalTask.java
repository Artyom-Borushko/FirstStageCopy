package main.java.javaCollections.optionalTask;


import java.util.Scanner;
import java.util.Stack;

public class CollectionsFirstOptionalTask {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int definedNumber = scanner.nextInt();
        System.out.println(reversedNumber(definedNumber));
    }

    static Stack<Integer> stack = new Stack<>();

    static void addNumbers(int definedNumber) {
        while (definedNumber != 0) {
            stack.push(definedNumber % 10);
            definedNumber = definedNumber / 10;
        }
    }

    static int reversedNumber(int definedNumber) {
        addNumbers(definedNumber);
        int reverse = 0;
        int i = 1;

        while (!stack.isEmpty()) {
            reverse = reverse + (stack.peek() * i);
            stack.pop();
            i = i * 10;
        }
        return reverse;
    }
}
