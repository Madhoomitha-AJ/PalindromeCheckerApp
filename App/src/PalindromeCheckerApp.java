import java.util.Scanner;
import java.util.Stack;
import java.util.*;

//usecase10
public class PalindromeCheckerApp {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        // Normalize string: remove spaces and convert to lowercase
        String processed = input.replaceAll("\\s+", "").toLowerCase();

        boolean isPalindrome = true;
        int start = 0;
        int end = processed.length() - 1;

        // Compare characters
        while (start < end) {
            if (processed.charAt(start) != processed.charAt(end)) {
                isPalindrome = false;
                break;
            }
            start++;
            end--;
        }

        if (isPalindrome)
            System.out.println("The string is a Palindrome.");
        else
            System.out.println("The string is not a Palindrome.");

        sc.close();
    }
}