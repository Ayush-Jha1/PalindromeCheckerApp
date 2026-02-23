/*
 * Application Name : Palindrome Checker App
 * Version          : 1.0
 * Description      : Console-based application to validate palindrome strings.
 */

public class PalindromeCheckerApp {

    // Main Method - Entry point of the Java Application
    public static void main(String[] args) {

        String word = "madam";   // Hardcoded string
        String reversed = "";

        // Reverse the string
        for (int i = word.length() - 1; i >= 0; i--) {
            reversed = reversed + word.charAt(i);
        }

        // Check palindrome condition
        if (word.equals(reversed)) {
            System.out.println("The word '" + word + "' is a Palindrome.");
        } else {
            System.out.println("The word '" + word + "' is NOT a Palindrome.");
        }
    }
}