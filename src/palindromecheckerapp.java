import java.util.Scanner;
import java.util.Stack;

public class palindromecheckerapp {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Stack<Character> stack = new Stack<>();

        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        boolean isPalindrome = true;

        // Push characters into stack
        for (int i = 0; i < input.length(); i++) {
            stack.push(input.charAt(i));
        }

        // Pop and compare
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) != stack.pop()) {
                isPalindrome = false;
                break;
            }
        }

        // Print result
        if (isPalindrome) {
            System.out.println("Result: " + input + " is a Palindrome.");
        } else {
            System.out.println("Result: " + input + " is NOT a Palindrome.");
        }

        scanner.close();
    }
}