public class loop4 {
    public static void main(String[] args) {
        int number = 6767;
        int t=number;
        int r;
        int sum = 0;
        while (number > 0) {
            r = number % 10;
            number /= 10;
            sum += r;
            t /= 10;
            

        }
    }
}

