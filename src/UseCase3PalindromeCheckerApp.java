import java.util.Scanner;

/**
 * Use Case 3: Reverse String Based Palindrome Check
 * Description:
 * This class checks whether a string is a palindrome
 * by reversing the string and comparing it with
 * the original value. [cite: 19, 20, 21]
 *
 * @author Developer [cite: 28]
 * @version 3.0 [cite: 30]
 */

public class UseCase3PalindromeCheckerApp {
    
    /**
     * Application entry point for UC3. [cite: 34]
     * @param args Command-line arguments [cite: 35]
     */
    public static void main(String[] args) { 
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        
        String reversed = "";
        
        // Iterate from the last character to the first. [cite: 39]
        for (int i = input.length() - 1; i >= 0; i--) { 
            // String Concatenation (+) - Used to build the reversed string character by character [cite: 13]
            reversed += input.charAt(i);
        }
        
        // equals() Method - Used to compare the actual content of two String objects [cite: 14]
        if (input.equals(reversed)) {
            System.out.println("The string is a palindrome."); 
        } else {
            System.out.println("The string is not a palindrome."); 
        }
        
        scanner.close();
    }
}
