import java.util.Scanner;

public class PalindromeException {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter a word or sentence: ");
            String input = sc.nextLine().trim();

            if (input.isEmpty()) {
                throw new IllegalArgumentException("Input cannot be empty.");
            }

            String text = input.replaceAll("\\s+", "").toLowerCase();
            String reverse = new StringBuilder(text).reverse().toString();

            if (!text.equals(reverse)) {
                throw new NotPalindromeException("Input is not a palindrome.");
            }

            System.out.println(input + " is a palindrome.");
        } catch (IllegalArgumentException | NotPalindromeException e) {
            System.out.println("Exception: " + e.getMessage());
        } finally {
            System.out.println("Program finished.");
            sc.close();
        }
    }

    static class NotPalindromeException extends Exception {
        NotPalindromeException(String message) {
            super(message);
        }
    }
}
