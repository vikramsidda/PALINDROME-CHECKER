
        import java.util.Scanner;

        public class palindromecheckerapp {
            public static void main(String[] args){

                Scanner a = new Scanner(System.in);

                System.out.print("Enter a word: ");
                String input = a.nextLine();

                String original = input;
                boolean isPalindrome = true;

                for(int i = 0; i < input.length() / 2; i++){
                    if(input.charAt(i) != input.charAt(input.length() - 1 - i)){
                        isPalindrome = false;
                        break;
                    }
                }

                if(isPalindrome){
                    System.out.println(original + " is a palindrome");
                } else {
                    System.out.println(original + " is not a palindrome");
                }

                a.close();
            }
        }

