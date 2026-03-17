import java.util.Scanner;
import java.util.Stack;
import java.util.*;

//usecase11
// Strategy Interface
interface PalindromeStrategy {
    boolean isPalindrome(String input);
}

        // Stack-based Strategy
        class StackStrategy implements PalindromeStrategy {

            public boolean isPalindrome(String input) {
                Stack<Character> stack = new Stack<>();
                String processed = input.replaceAll("\\s+", "").toLowerCase();

                // Push characters
                for (char ch : processed.toCharArray()) {
                    stack.push(ch);
                }

                // Compare with original
                for (char ch : processed.toCharArray()) {
                    if (ch != stack.pop()) {
                        return false;
                    }
                }
                return true;
            }
        }

        // Deque-based Strategy
        class DequeStrategy implements PalindromeStrategy {

            public boolean isPalindrome(String input) {
                Deque<Character> deque = new ArrayDeque<>();
                String processed = input.replaceAll("\\s+", "").toLowerCase();

                for (char ch : processed.toCharArray()) {
                    deque.addLast(ch);
                }

                while (deque.size() > 1) {
                    if (deque.removeFirst() != deque.removeLast()) {
                        return false;
                    }
                }
                return true;
            }
        }

        // Context Class
        class PalindromeContext {

            private PalindromeStrategy strategy;

            public void setStrategy(PalindromeStrategy strategy) {
                this.strategy = strategy;
            }

            public boolean check(String input) {
                if (strategy == null) {
                    throw new IllegalStateException("Strategy not set");
                }
                return strategy.isPalindrome(input);
            }
        }


public class PalindromeCheckerApp {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        PalindromeContext context = new PalindromeContext();

        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        System.out.println("Choose Strategy:");
        System.out.println("1. Stack");
        System.out.println("2. Deque");

        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                context.setStrategy(new StackStrategy());
                break;
            case 2:
                context.setStrategy(new DequeStrategy());
                break;
            default:
                System.out.println("Invalid choice");
                sc.close();
                return;
        }

        boolean result = context.check(input);

        if (result) {
            System.out.println("The string is a Palindrome.");
        } else {
            System.out.println("The string is not a Palindrome.");
        }

        sc.close();
    }
}