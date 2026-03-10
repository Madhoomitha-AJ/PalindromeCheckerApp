//usecase1:welcomepage
public class PalindromeCheckerApp {
    public static void main(String[] args){
        String original = "madam";
        String reversed = "";

        // Reverse the string using for loop
        for (int i = original.length() - 1; i >= 0; i--) {
            reversed = reversed + original.charAt(i);
        }

        // Compare original and reversed string
        if (original.equals(reversed)) {
            System.out.println(original + " is a Palindrome.");
        } else {
            System.out.println(original + " is NOT a Palindrome.");
        }

//usecase2:HardcodePalindrome

public class HardcodedStringCheck {

    public static void main(String[] args) {
        // Program starts
        System.out.println("Program started");

        // Hardcoded string
        String input = "HelloWorld";
        String expected = "HelloWorld";

        // Check the string
        if (input.equals(expected)) {
            System.out.println("String matches!");
        } else {
            System.out.println("String does not match!");
        }

        // Program exits
        System.out.println("Program ended");
    }
}