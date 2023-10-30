package java_programme;

import java.util.Scanner;

/**
 * 13.	Shared Digit
 * Write a method named hasSharedDigit with two parameters of type int.
 * Each number should be within the range of 10 (inclusive) - 99 (inclusive). If one of the numbers is not within the range, the method should return false.
 * The method should return true if there is a digit that appears in both numbers, such as 2 in 12 and 23; otherwise, the method should return false.
 */
public class Programme_13_SharedDigit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first number (between 10 and 99): ");
        int number1 = scanner.nextInt();
        System.out.print("Enter the second number (between 10 and 99): ");
        int number2 = scanner.nextInt();
        scanner.close();

        if (hasSharedDigit(number1, number2)) {
            System.out.println("The numbers have a shared digit.");
        } else {
            System.out.println("The numbers do not have a shared digit.");
        }
    }

    // Method to check if two numbers have a shared digit
    public static boolean hasSharedDigit(int number1, int number2) {
        if (!isValidNumber(number1) || !isValidNumber(number2)) {
            return false; // Check if both numbers are within the range 10-99
        }

        int digit1_1 = number1 % 10;
        int digit1_10 = number1 / 10;
        int digit2_1 = number2 % 10;
        int digit2_10 = number2 / 10;

        return (digit1_1 == digit2_1 || digit1_1 == digit2_10 || digit1_10 == digit2_1 || digit1_10 == digit2_10);
    }

    // Method to check if a number is within the range 10-99
    public static boolean isValidNumber(int number) {

        return (number >= 10 && number <= 99);
    }
}
