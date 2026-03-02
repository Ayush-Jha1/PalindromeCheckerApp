import java.util.Queue;
import java.util.LinkedList;
import java.util.Stack;

public class PalindromeCheckerApp {

    /**
     * Application entry point for UC6.
     * @param args Command-line arguments
     */
    public static void main(String[] args) {

        // Declare and initialize the input string
        String input = "madam";

        // Create Queue (FIFO)
        Queue<Character> queue = new LinkedList<>();

        // Create Stack (LIFO)
        Stack<Character> stack = new Stack<>();

        // Add characters to both Queue and Stack
        for (char c : input.toCharArray()) {
            queue.add(c);     // Enqueue
            stack.push(c);    // Push
        }

        // Assume palindrome initially
        boolean isPalindrome = true;

        // Compare dequeue (FIFO) with pop (LIFO)
        while (!queue.isEmpty()) {

            char fromQueue = queue.remove();  // Dequeue (front)
            char fromStack = stack.pop();     // Pop (top)

            if (fromQueue != fromStack) {
                isPalindrome = false;
                break;
            }
        }

        // Display result
        if (isPalindrome) {
            System.out.println(input + " is a Palindrome.");
        } else {
            System.out.println(input + " is NOT a Palindrome.");
        }
    }
}