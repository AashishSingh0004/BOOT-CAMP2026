
public class test2 {
    public static void main(String[] args) {
        int a = 5, b = 10, c = 15;

        System.out.println("Before swapping:");
        System.out.println("a = " + a + ", b = " + b + ", c = " + c);

        // Swapping logic
        int temp = a;
        a = b;
        b = c;
        c = temp;

        System.out.println("After swapping:");
        System.out.println("a = " + a + ", b = " + b + ", c = " + c);
    }
}