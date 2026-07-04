public class loop3 {
    public static void main(String[] args) {
        int number = 6767, i;
        int sum = 0;
        while (number > 0) {
            int digit = number % 10;
            int f=1;
            for(i=1;i<=digit;i++){
                f=f*i;
            }
            System.out.println(digit + "!" + " = " + f);
            number /= 10;
            sum += f;

        }
        System.out.println("Sum of factorials of digits is: " + sum);
    }
}
