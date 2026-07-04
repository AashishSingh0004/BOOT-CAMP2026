
public class loop2 {
    public static void main(String[] args) {
        long number = 8868926069L;
        int limit = 10; 

        System.out.println("Multiplication Table of " + number);
        for (int i = 1; i <= limit; i++) {
            System.out.println(number + " x " + i + " = " + (number * i));
        }
    }
}
