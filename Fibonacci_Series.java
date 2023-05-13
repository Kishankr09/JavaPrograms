import java.util.Scanner;
public class Fibonacci_Series {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter The Range :");
		int range = sc.nextInt();
		System.out.println("\nFibonacci Series");
		fibo(range);
	}
	public static void fibo(int r)
	{
		System.out.print("0 0");
		int n1 = 0;
		int n2 = 1;
		int net = 0;
		for(int i = 0; i< r-2; i++) 
		{
			net = n1 + n2;
			n1 = n2;
			n2 = net;
			System.out.print(" " + net  );		
		}
		
		
		
	}
}
