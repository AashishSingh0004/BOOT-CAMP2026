import java.util.Scanner;

public class c {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number: ");
		long n = sc.nextLong();
		sc.close();

		long original = n;
		int digits = 0;
		long temp = n;
		while (temp != 0) {
			digits++;
			temp /= 10;
		}

		long sum = 0;
		temp = n;
		while (temp != 0) {
			int d = (int)(temp % 10);
			long p = 1;
			for (int i = 0; i < digits; i++) p *= d;
			sum += p;
			temp /= 10;
		}

		if (sum == original) System.out.println(original + " is an Armstrong number.");
		else System.out.println(original + " is not an Armstrong number.");
	}
}


