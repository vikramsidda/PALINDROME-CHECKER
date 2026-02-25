import java.util.Scanner;

public class palindromecheckerapp {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        String original = input;
        String reversed = "";

        // Reverse string using for loop
        for (int i = input.length() - 1; i >= 0; i--) {
            reversed = reversed + input.charAt(i);
        }

        // Compare original and reversed
        if (original.equals(reversed)) {
            System.out.println("Result: " + original + " is a Palindrome.");
        } else {
            System.out.println("Result: " + original + " is NOT a Palindrome.");
        }

        scanner.close();
    }
}