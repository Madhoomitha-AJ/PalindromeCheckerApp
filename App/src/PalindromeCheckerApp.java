import java.util.Scanner;
import java.util.Stack;
import java.util.*;

<<<<<<< UC10
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
=======
//usecase9

public class RecursivePalindrome {

    // Recursive function
    static boolean isPalindrome(String str, int start, int end) {

        // Base condition
        if (start >= end)
            return true;
        }
public class PalindromeCheckerApp {
    public static void main(String[] args) {

        // If characters do not match
        if (str.charAt(start) != str.charAt(end))
            return false;

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
        // Recursive call
        return isPalindrome(str, start + 1, end - 1);
    }
    public class PalindromeCheckerApp {
        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);

            System.out.print("Enter a string: ");
            String input = sc.nextLine();

            if (isPalindrome(input, 0, input.length() - 1))
                System.out.println("The string is a Palindrome.");
            else
                System.out.println("The string is not a Palindrome.");

            sc.close();
        }
    }
>>>>>>> main
