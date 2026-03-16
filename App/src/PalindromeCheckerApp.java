import java.util.Scanner;
import java.util.Stack;
import java.util.*;

//usecase8
class Node {
    char data;
    Node next;

    Node(char data) {
        this.data = data;
        this.next = null;
    }
}

        Node head = null;

        // Insert node at end
        void insert(char data) {
            Node newNode = new Node(data);

            if (head == null) {
                head = newNode;
                return;
            }

            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }

        // Reverse linked list
        Node reverse(Node node) {
            Node prev = null;
            Node current = node;
            Node next = null;

            while (current != null) {
                next = current.next;
                current.next = prev;
                prev = current;
                current = next;
            }
            return prev;
        }

        // Check palindrome
        boolean isPalindrome() {
            if (head == null || head.next == null)
                return true;

            Node slow = head;
            Node fast = head;

            // Find middle
            while (fast != null && fast.next != null) {
                slow = slow.next;
                fast = fast.next.next;
            }

            // Reverse second half
            Node secondHalf = reverse(slow);
            Node firstHalf = head;

            // Compare halves
            while (secondHalf != null) {
                if (firstHalf.data != secondHalf.data)
                    return false;

                firstHalf = firstHalf.next;
                secondHalf = secondHalf.next;
            }

            return true;
        }

public class PalindromeCheckerApp {
    public static void main(String[] args) {


                Scanner sc = new Scanner(System.in);

                System.out.print("Enter a string: ");
                String input = sc.nextLine();

                // Convert string to linked list
                for (int i = 0; i < input.length(); i++) {
                    insert(input.charAt(i));
                }

                if (isPalindrome())
                    System.out.println("The string is a Palindrome.");
                else
                    System.out.println("The string is not a Palindrome.");

                sc.close();
            }
        }

        void main() {
        }