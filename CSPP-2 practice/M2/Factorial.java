import java.util.Scanner;
public class Factorial {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		int fact = factorial(number);
		System.out.println(fact);
	}
	public static int factorial(int n) {
		if (n != 0) {
			return (n * factorial(n - 1));
		} else {
			return 1;
		}
	}
}