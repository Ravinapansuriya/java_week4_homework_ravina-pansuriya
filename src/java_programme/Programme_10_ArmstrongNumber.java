package java_programme;

import java.util.Scanner;

/**
 * 10.	Write a program to input any number and check if it Armstrong number or not
 */
public class Programme_10_ArmstrongNumber {
    public static void main(String[] args) {
        //Scanner to read the data from console
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        //Scanner closing
        scanner.close();

        if (isArmstrongNumber(number)) {
            System.out.println(number + " is an Armstrong number.");
        } else {
            System.out.println(number + " is not an Armstrong number.");
        }
    }

    // Function to check if a number is an Armstrong number
    public static boolean isArmstrongNumber(int number) {
        int originalNumber = number;
        int numDigits = String.valueOf(number).length();
        int sum = 0;

        while (number > 0) {
            int digit = number % 10;
            sum += Math.pow(digit, numDigits);
            number = number / 10;
        }

        return sum == originalNumber;
    }
}
