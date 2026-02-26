import java.util.ArrayDeque;
import java.util.Deque;

public class UseCase7PalindromeCheckerApp {
    public static void main(String[] args){
        // define input string
        String input = "refer";

        // create a Deque to store the characters
        Deque<Character> deque = new ArrayDeque<>();

        // add each character to deque
        for(Character c : input.toCharArray()){
            deque.addLast(c);
        }

        // flag declaration
        boolean isPalindrome = true;

        while(deque.size() > 1){
            if(deque.removeFirst() != deque.removeLast()){
                isPalindrome = false;
            }
        }

        System.out.println("input : " + input);
        System.out.println("Is Palindrome :" + isPalindrome);
    }
}
