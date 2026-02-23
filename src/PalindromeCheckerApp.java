/*
 * Application Name : Palindrome Checker App
 * Version          : 1.0
 * Description      : Console-based application to validate palindrome strings.
 */

public class PalindromeCheckerApp {

    // Main Method - Entry point of the Java Application
    public static void main(String[] args) {

        // UC3: Palindrome Check Using String Reverse

        String original = "madam";   // You can change this word
        String reversed = "";

        // Reverse the string using for loop
        for (int i = original.length() - 1; i >= 0; i--) {
            reversed = reversed + original.charAt(i);
        }

        // Compare original and reversed string
        if (original.equals(reversed)) {
            System.out.println("The string '" + original + "' is a Palindrome.");
        } else {
            System.out.println("The string '" + original + "' is NOT a Palindrome.");
        }
    }
}