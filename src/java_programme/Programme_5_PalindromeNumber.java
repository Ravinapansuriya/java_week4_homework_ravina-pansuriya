package java_programme;

import java.util.Scanner;
/**
 * 5.	Palindrome Number
 * Write a method called isPalindrome with one int parameter called number. The method needs to return a boolean.
 * It should return true if the number is a palindrome number otherwise it should return false. Check the tips below for more info about palindromes.
 * Example Input/Output
 * isPalindrome(-1221); → should return true
 * isPalindrome(707); → should return true
 * isPalindrome(11212); → should return false because the reverse is 21211 and that is not equal to 11212.
 */
public class Programme_5_PalindromeNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        if (scanner.hasNextInt()) {
            int number = scanner.nextInt();
            boolean isPalindrome = isPalindrome(number);
            if (isPalindrome) {
                System.out.println("True");
            } else {
                System.out.println("False");
            }
        } else {
            System.out.println("Invalid input. Please enter a valid number.");
        }
        //Scanner closing
        scanner.close();
    }

    public static boolean isPalindrome(int number) {
        int originalNumber = number;
        int reverse = 0;

        while (number != 0) {
            int lastDigit = number % 10;
            reverse = reverse * 10 + lastDigit;
            number /= 10;
        }

        return originalNumber == reverse;
    }
}
