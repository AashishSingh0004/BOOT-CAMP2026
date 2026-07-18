import java.util.Scanner;
public class handling1 {
    public static void main(String[] args) {
        int[] arr = {11, 12, 33, 44, 55};

        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter an array index (0 to 4): ");
            int index = scanner.nextInt();
            System.out.println("Value at index " + index + " is: " + arr[index]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Please enter an index from 0 to 4.");
        } catch (java.util.InputMismatchException e) {
            System.out.println("Error: Please enter a whole number.");
        } finally {
            System.out.println("Program finished.");
        }
    }
}
