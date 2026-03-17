import java.util.Scanner;
import java.util.Stack;
import java.util.*;

//usecase11

// Class responsible only for palindrome checking
class PalindromeChecker {

    // Method to check palindrome
    public boolean isPalindrome(String input) {

        if (input == null) {
            return false;
        }

        // Normalize string: remove spaces and convert to lowercase
        String processed = input.replaceAll("\\s+", "").toLowerCase();

        int left = 0;
        int right = processed.length() - 1;

        while (left < right) {
            if (processed.charAt(left) != processed.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }

        return true;
    }
}

public class PalindromeCheckerApp {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        PalindromeChecker checker = new PalindromeChecker();

        boolean result = checker.isPalindrome(input);

        if (result) {
            System.out.println("The string is a Palindrome.");
        } else {
            System.out.println("The string is not a Palindrome.");
        }

        scanner.close();
    }
}