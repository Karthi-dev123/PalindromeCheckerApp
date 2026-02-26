import java.util.Stack;

/**
 * Use Case 5: Stack Based Palindrome Checker
 * Description:
 * This class validates a palindrome using a Stack
 * data structure which follows the LIFO principle.
 *
 * @author Developer
 * @version 5.0
 */
public class UseCase5PalindromeCheckerApp { 

    /**
     * Application entry point for UC5.
     * @param args Command-Line arguments
     */
    public static void main(String[] args) { 
        
        // Declare and initialize the input string.
        String input = "noon"; // [cite: 121]
        
        // Create a Stack to store characters.
        Stack<Character> stack = new Stack<>(); // [cite: 122, 123]
        
        // Push each character of the string into the stack.
        for (char c : input.toCharArray()) { // [cite: 124, 125]
            stack.push(c); // [cite: 99]
        }
        
        // Assume palindrome initially.
        boolean isPalindrome = true; // [cite: 126, 127]
        
        // Iterate again through original string.
        for (char c : input.toCharArray()) { // [cite: 128, 129]
            // Pop Operation - Used to remove characters from the stack in reverse order.
            if (c != stack.pop()) { // [cite: 100]
                isPalindrome = false;
                break; // Exit early if a mismatch is found
            }
        }
        
        System.out.println("Input: " + input); // [cite: 132]
        System.out.println("Is Palindrome?: " + isPalindrome); // [cite: 133]
    }
}