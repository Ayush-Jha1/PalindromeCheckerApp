import java.util.Queue;
import java.util.LinkedList;
import java.util.Stack;

import java.util.Scanner;

public class PalindromeCheckerApp {

    /**
     * Application entry point for UC9.
     * @param args Command-line arguments
     */
    public static void main(String[] args) {

        // Create Scanner object
        Scanner scanner = new Scanner(System.in);

        // Ask user for input
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        // Reverse the string
        String reversed = "";

        for (int i = input.length() - 1; i >= 0; i--) {
            reversed = reversed + input.charAt(i);
        }

        // Compare original and reversed
        if (input.equals(reversed)) {
            System.out.println(input + " is a Palindrome.");
        } else {
            System.out.println(input + " is NOT a Palindrome.");
        }

        scanner.close();
    }
}