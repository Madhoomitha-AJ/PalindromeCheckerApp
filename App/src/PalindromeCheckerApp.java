import java.util.Scanner;
import java.util.Stack;
import java.util.*;

//usecase7
public class PalindromeCheckerApp {
    public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);

                System.out.print("Enter a string: ");
                String input = sc.nextLine();

                Deque<Character> deque = new ArrayDeque<>();

                // Insert characters into deque
                for (int i = 0; i < input.length(); i++) {
                    deque.addLast(input.charAt(i));
                }

                boolean isPalindrome = true;

                // Compare front and rear characters
                while (deque.size() > 1) {
                    char front = deque.removeFirst();
                    char rear = deque.removeLast();

                    if (front != rear) {
                        isPalindrome = false;
                        break;
                    }
                }

                if (isPalindrome) {
                    System.out.println("The string is a Palindrome.");
                } else {
                    System.out.println("The string is not a Palindrome.");
                }

                sc.close();
            }
        }