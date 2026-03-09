import java.util.Queue;
import java.util.LinkedList;
import java.util.Stack;

import java.util.Scanner;

public class PalindromeCheckerApp {

    public static void main(String[] args) {

        // Input string
        String input = "A man a plan a canal Panama";

        // Step 1: Convert to lowercase
        String normalized = input.toLowerCase();

        // Step 2: Remove spaces and special characters
        normalized = normalized.replaceAll("[^a-z0-9]", "");

        // Step 3: Reverse the normalized string
        String reversed = "";

        for (int i = normalized.length() - 1; i >= 0; i--) {
            reversed = reversed + normalized.charAt(i);
        }

        // Step 4: Compare normalized string with reversed
        if (normalized.equals(reversed)) {
            System.out.println("\"" + input + "\" is a Palindrome.");
        } else {
            System.out.println("\"" + input + "\" is NOT a Palindrome.");
        }
    }
}