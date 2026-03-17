import java.util.Scanner;
import java.util.Stack;
import java.util.*;

//usecase13
class PalindromePerformance {

    // Stack Method
    public static boolean stackMethod(String input) {
        Stack<Character> stack = new Stack<>();
        String str = input.replaceAll("\\s+", "").toLowerCase();

        for (char ch : str.toCharArray()) {
            stack.push(ch);
        }

        for (char ch : str.toCharArray()) {
            if (ch != stack.pop()) {
                return false;
            }
        }
        return true;
    }

    // Deque Method
    public static boolean dequeMethod(String input) {
        Deque<Character> deque = new ArrayDeque<>();
        String str = input.replaceAll("\\s+", "").toLowerCase();

        for (char ch : str.toCharArray()) {
            deque.addLast(ch);
        }

        while (deque.size() > 1) {
            if (deque.removeFirst() != deque.removeLast()) {
                return false;
            }
        }
        return true;
    }

    // Recursion Method
    public static boolean recursionMethod(String str, int left, int right) {
        if (left >= right)
            return true;

        if (str.charAt(left) != str.charAt(right))
            return false;

        return recursionMethod(str, left + 1, right - 1);
    }

    public class PalindromeCheckerApp {
        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);
            System.out.print("Enter a string: ");
            String input = sc.nextLine();
            String processed = input.replaceAll("\\s+", "").toLowerCase();

            // Stack Timing
            long start1 = System.nanoTime();
            boolean res1 = stackMethod(input);
            long end1 = System.nanoTime();

            // Deque Timing
            long start2 = System.nanoTime();
            boolean res2 = dequeMethod(input);
            long end2 = System.nanoTime();

            // Recursion Timing
            long start3 = System.nanoTime();
            boolean res3 = recursionMethod(processed, 0, processed.length() - 1);
            long end3 = System.nanoTime();

            System.out.println("\nResults:");
            System.out.println("Stack Method: " + res1 + " | Time: " + (end1 - start1) + " ns");
            System.out.println("Deque Method: " + res2 + " | Time: " + (end2 - start2) + " ns");
            System.out.println("Recursion Method: " + res3 + " | Time: " + (end3 - start3) + " ns");

            sc.close();
        }
    }
}