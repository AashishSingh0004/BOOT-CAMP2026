import java.util.Scanner;

public class test1 {
    public static void main(String[] args) {

        char ch;

        System.out.print("Enter a character: ");
        Scanner scanner = new Scanner(System.in);

        ch = scanner.next().charAt(0);

        switch (ch) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
            case 'A':
            case 'E':
            case 'I':
            case 'O':
            case 'U':
                System.out.println(ch + " is a vowel.");
                break;

            default:
                System.out.println(ch + " is a consonant.");
        }

        scanner.close();
    }
}

