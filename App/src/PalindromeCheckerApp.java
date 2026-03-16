import java.util.Scanner;
import java.util.Stack;
import java.util.*;

//usecase6
public class PalindromeCheckerApp {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

                System.out.print("Enter a string: ");
                String input = sc.nextLine();

                Queue<Character> queue = new LinkedList<>();
                Stack<Character> stack = new Stack<>();

                // Insert characters into queue and stack
                for (int i = 0; i < input.length(); i++) {
                    char ch = input.charAt(i);
                    queue.add(ch);     // Enqueue
                    stack.push(ch);    // Push
                }

                boolean isPalindrome = true;

                // Compare dequeue and pop
                while (!queue.isEmpty()) {
                    if (queue.remove() != stack.pop()) {
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