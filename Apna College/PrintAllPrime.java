import java.util.Scanner;
public class PrintAllPrime {

	public static void PrimeWithRange(int a) {
		
		for(int j = 2; j<= a; j++ ) {
		int c = 0;
		
			for(int i = 2; i<= Math.sqrt(j); i++) {
				if(j % i == 0)
					c++;
			}
				if(c == 0)
					System.out.println(j + " ");
		
		}
	}
	public static void main(String[] args) {
		System.out.println("Enter the Range ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		PrimeWithRange(n);
	}
}
