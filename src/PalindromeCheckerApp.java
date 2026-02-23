/*
 * Application Name : Palindrome Checker App
 * Version          : 1.0
 * Description      : Console-based application to validate palindrome strings.
 */

public class PalindromeCheckerApp {

    // Main Method - Entry point of the Java Application
    public static void main(String[] args) {

        // UC4: Character Array Based Palindrome Check

        String word = "madam"; // You can change this string
        char[] chars = word.toCharArray();

        boolean isPalindrome = true; // Assume palindrome initially
        int start = 0;
        int end = chars.length - 1;

        while (start < end) {
            if (chars[start] != chars[end]) {
                isPalindrome = false;
                break;
            }
            start++;
            end--;
        }

        if (isPalindrome) {
            System.out.println("The word '" + word + "' is a Palindrome.");
        } else {
            System.out.println("The word '" + word + "' is NOT a Palindrome.");
        }
    }
}