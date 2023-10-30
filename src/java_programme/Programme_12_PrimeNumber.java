package java_programme;

import java.util.Scanner;

/**
 * 12.	Write a programme to input any number and check if it is prime or not.
 */
public class Programme_12_PrimeNumber {

    public static boolean isPrime(int number) {

        // All negative numbers, 0 and 1 are not a prime number
        if (number <= 1) return false;

        // check for remaining
        for (int i = 2; i < number; i++)
            if (number % i == 0)
                return false;

        return true;
    }

    public static void main(String[] args) {
        int number = 0;
        boolean flag = false;
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number:: ");
        number = scan.nextInt();

        // check number is prime number or not
        flag = isPrime(number);
        if (flag)
            System.out.println(number +
                    " is a prime number");
        else
            System.out.println(number +
                    " is not a prime number");

        // close Scanner class object
        scan.close();
    }
}
