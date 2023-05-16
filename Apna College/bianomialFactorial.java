import java.util.Scanner;

public class bianomialFactorial {

	public static int fact(int a) {
		int sum = 1;
			while( a > 0) {
				sum = sum * a;
				a--;
			}
			return sum;
		}
	public static void main(String[] args) {
		System.out.println("Enter The value of N ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println("Enter The value of R ");
		int r = sc.nextInt();
		
		float res = fact(n) / (fact(r)*fact(n-r));
		
		System.out.println("Result = " + res);
		
		
	}

}
