package java_programme;

import java.util.Scanner;

/**
 * Write a Java program that takes the user to provide a single character from the
 * alphabet. Print Vowel of Consonant, depending on the user input. If the user input Is not a letter (between a and z or A and Z), or is a string of length > 1, print an error message.
 */
public class Programme_3_AlphabetVowelOrConsonant {
    //Scanner declaration to read the data from console
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter any alphabet: ");
        String input = scanner.nextLine();

        if (input.length() == 1 && Character.isLetter(input.charAt(0))) {
            char letter = Character.toLowerCase(input.charAt(0));

            if (letter == 'a' || letter == 'e' || letter == 'i' || letter == 'o' || letter == 'u') {
                System.out.println("Input is vowel");
            } else {
                System.out.println("Input is consonant");
            }
        } else {
            System.out.println("Enter valid alphabet");
        }
        //Scanner closing
        scanner.close();
    }
}
