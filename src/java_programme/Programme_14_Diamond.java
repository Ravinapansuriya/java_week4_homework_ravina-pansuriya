package java_programme;

import java.util.Scanner;

/**
 * 14.	Write a program in Java to display the pattern like a diamond. While loop
 * <p>
 *            *
 *           ***
 *          *****
 *         *******
 *        *********
 *       ***********
 *      *************
 *       ***********
 *        *********
 *         *******
 *          *****
 *           ***
 *            *
 */
public class Programme_14_Diamond {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of rows for the diamond pattern: ");
        int n = scanner.nextInt();
        scanner.close();

        if (n % 2 == 0) {
            System.out.println("Please enter an odd number for a symmetric diamond pattern.");
            return;
        }

        int spaces = n / 2;
        int stars = 1;
        int row = 1;

        while (row <= n) {
            int spaceCount = spaces;

            while (spaceCount > 0) {
                System.out.print(" ");
                spaceCount--;
            }

            int starCount = stars;

            while (starCount > 0) {
                System.out.print("*");
                starCount--;
            }

            System.out.println();

            if (row <= n / 2) {
                spaces--;
                stars += 2;
            } else {
                spaces++;
                stars -= 2;
            }

            row++;
        }
    }
}
