package java_programme;

import java.util.Scanner;

/**
 * 15.	Display left angle triangle of * using nested for loops
 * *
 * * *
 * * * *
 * * * * *
 * * * * * *
 */
public class Programme_15_LeftAngleTraiangle {
    public static void main(String[] args) {

        //Scanner declaration to take input from console
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of rows for the left angled triangle: ");
        int n = scanner.nextInt();
        scanner.close();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
