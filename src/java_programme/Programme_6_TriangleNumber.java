package java_programme;

import java.util.Scanner;

/**
 * 6. Write a program in Java to display the pattern like a triangle with a number. For eg.
 * Input number of rows: 10
 */
public class Programme_6_TriangleNumber {
    public static void main(String[] args) {
        //Scanner class to read the data from console
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input number of rows: ");
        int num = scanner.nextInt();

        if (num > 0) {
            for (int i = 1; i <= num; i++) {
                for (int j = 1; j <= i; j++) {
                    System.out.print(j);
                }
                System.out.println();
            }
        } else {
            System.out.println("Please enter valid input");
        }
        //Scanner closing
        scanner.close();
    }
}