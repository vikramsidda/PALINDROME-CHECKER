import java.util.Scanner;

public class palindromecheckerapp {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = scanner.nextLine();


        char[] characters = input.toCharArray();

        boolean isPalindrome = true;

        int start = 0;
        int end = characters.length - 1;


        while (start < end) {
            if (characters[start] != characters[end]) {
                isPalindrome = false;
                break;
            }
            start++;
            end--;
        }


        if (isPalindrome) {
            System.out.println("Result: " + input + " is a Palindrome.");
        } else {
            System.out.println("Result: " + input + " is NOT a Palindrome.");
        }

        scanner.close();
    }
}