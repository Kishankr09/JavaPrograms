import java.util.Scanner;
public class FactorialThroughFunction {

	public static int fact(int a) {
	int sum = 1;
		while( a > 0) {
			sum = sum * a;
			a--;
		}
		return sum;
	}
	
	
	public static void main(String[] args) {
		System.out.println("Enter Any Number ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int fa = fact(n);
		System.out.println("Factorial of " + n + "=" + fa);
		
	}

}
