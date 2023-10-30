package java_programme;

import java.util.Scanner;

public class Programme_2_MinAndMaxInputChallenge {
    /**
     * Read the numbers from the console entered by the user and print the minimum and maximum number the user has entered.
     */
    public static void main(String[] args) {
        //Scanner declaration to read the data from console
        Scanner scanner = new Scanner(System.in);
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        while (true) {
            System.out.print("Enter number: ");

            if (scanner.hasNextInt()) {
                int number = scanner.nextInt();
                min = Math.min(min, number);
                max = Math.max(max, number);
            } else {
                System.out.println("Invalid input. Exiting the program.");
                break;
            }

            // Consume the newline character left in the input buffer
            scanner.nextLine();
        }

        System.out.println("Minimum number entered: " + min);
        System.out.println("Maximum number entered: " + max);
        //Scanner closing
        scanner.close();
    }
}





