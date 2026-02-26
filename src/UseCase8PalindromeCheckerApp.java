class Node {
    char data;
    Node next;

    Node(char data) {
        this.data = data;
        this.next = null;
    }
}

public class UseCase8PalindromeCheckerApp {

    public static boolean isPalindrome(Node head) {
        if (head == null || head.next == null) return true;

        // Phase 1: Find the middle using Fast and Slow pointers
        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;        // Moves 1 step
            fast = fast.next.next;   // Moves 2 steps
        }

        // Phase 2: Reverse the second half in-place
        Node prev = null;
        Node current = slow;

        while (current != null) {
            Node nextNode = current.next; // Temporarily store the next node
            current.next = prev;          // Flip the pointer backwards
            prev = current;               // Move prev forward
            current = nextNode;           // Move current forward
        }

        // Phase 3: Compare the two halves
        Node left = head;
        Node right = prev; // 'prev' is now the head of the reversed half

        while (right != null) {
            if (left.data != right.data) {
                return false; // Mismatch found
            }
            left = left.next;
            right = right.next;
        }

        return true; // All characters matched
    }

    public static void main(String[] args) {
        // Manually building the linked list for "radar"
        Node head = new Node('r');
        head.next = new Node('a');
        head.next.next = new Node('d');
        head.next.next.next = new Node('a');
        head.next.next.next.next = new Node('r');

        System.out.println("Input: radar");
        System.out.println("Is Palindrome?: " + isPalindrome(head));
    }
}