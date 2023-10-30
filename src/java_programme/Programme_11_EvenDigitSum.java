package java_programme;

import java.util.Scanner;

/**
 * 11.	Even Digit Sum
 * Write a method named getEvenDigitSum with one parameter of type int called number. The method should return the sum of the even digits within the number.
 * If the number is negative, the method should return -1 to indicate an invalid value.
 */
public class Programme_11_EvenDigitSum {
    public static void main(String[] args) {
        //Scanner Declaration to read the data from console
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer numbers: ");
        int number = scanner.nextInt();
        scanner.close();

        int evenDigitSum = getEvenDigitSum(number);

        if (evenDigitSum == -1) {
            System.out.println("Invalid input. Please enter integer number.");
        } else {
            System.out.println("Sum of even digits: " + evenDigitSum);
        }
    }

    // Method to calculate the sum of even digits
    public static int getEvenDigitSum(int number) {
        if (number < 0) {
            return -1; // Return -1 for negative numbers
        }

        int sum = 0;
        while (number > 0) {
            int digit = number % 10;
            if (digit % 2 == 0) {
                sum = digit + sum;
            }
            number = number / 10;
        }

        return sum;
    }
}
