package java_programme;

import java.util.Scanner;

/**
 * 7.	First And Last Digit Sum
 *
 * Write a method named sumFirstAndLastDigit with one parameter of type int called number.
 * The method needs to find the first and the last digit of the parameter number passed to the method, using a loop and return the sum of the first and the last digit of that number.
 * If the number is negative then the method needs to return -1 to indicate an invalid value.
 */
public class Programme_7_FirstLastDigitSum {

    public static void main(String[] args) {
        //Scanner class to read the data from console
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        if (scanner.hasNextInt()) {
            int number = scanner.nextInt();
            int result = sumFirstAndLastDigit(number);
            System.out.println("Sum of the first and last digit: " + result);
        } else {
            System.out.println("Invalid input. Please enter a valid number.");
        }
        //Scanner closing
        scanner.close();
    }

    public static int sumFirstAndLastDigit(int number) {
        if (number < 0) {
            return -1; // Return -1 for negative numbers
        }

        int lastDigit = number % 10;

        while (number >= 10) {
            number /= 10;
        }

        int firstDigit = number;

        return firstDigit + lastDigit;
    }
}
