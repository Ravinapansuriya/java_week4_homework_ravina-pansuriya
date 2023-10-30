package java_programme;

import java.util.Scanner;

/**
 * 1.	Read 10 numbers from the console entered by the user and print the sum of those numbers.
 */
public class Programme_1_ReadingUserInputChallenge {
    public static void main(String[] args) {
        //Scanner declaration to read the data from console
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int count = 0;

        while (count < 10) {
            int order = count + 1;
            System.out.print("Enter number: " + order + ": ");

            if (scanner.hasNextInt()) {
                int number = scanner.nextInt();
                sum = sum + number;
                count++;
            } else {
                System.out.println("Invalid Number");
            }
        }

        System.out.println("Sum of the entered numbers is: " + sum);
        //Scanner closing
        scanner.close();
    }
}





