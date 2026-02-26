/**
 * Use Case 4: Character Array Based Validation
 * Description:
 * This class validates a palindrome by converting
 * the string into a character array and comparing
 * characters using the two-pointer technique. [cite: 60, 61, 62, 63]
 * * @author Developer [cite: 66]
 * @version 4.0 [cite: 67]
 */
public class UseCase4PalindromeCheckerApp { // [cite: 68]

    /**
     * Application entry point for UC4. [cite: 70]
     * @param args Command-Line arguments [cite: 71]
     */
    public static void main(String[] args) { // [cite: 73]
        
        // Declare and initialize the input string.
        String input = "radar"; // [cite: 76, 77]
        
        // Convert the string into a character array.
        char[] chars = input.toCharArray(); // [cite: 78, 79]
        
        // Initialize pointer at the beginning.
        int start = 0; // [cite: 80]
        
        // Initialize pointer at the end.
        int end = chars.length - 1; // [cite: 81, 82]
        
        // Assume palindrome initially.
        boolean isPalindrome = true; // [cite: 83, 84]
        
        // Continue comparison until pointers cross.
        while (start < end) { // [cite: 85]
            if (chars[start] != chars[end]) {
                isPalindrome = false;
                break; // Exit early if a mismatch is found
            }
            start++;
            end--;
        }
        
        System.out.println("Input: " + input); // [cite: 87]
        System.out.println("Is Palindrome?: " + isPalindrome); // [cite: 88]
    }
}