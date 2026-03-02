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