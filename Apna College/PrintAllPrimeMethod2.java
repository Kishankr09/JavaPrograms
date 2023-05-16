import java.util.Scanner;

public class PrintAllPrimeMethod2 {
	
	public static boolean PrimeCheck(int a) {
		boolean c = true;
		for(int i = 2; i<= Math.sqrt(a); i++) {
			if(a % i == 0) {
				c = false;
				break;
			}	
		}
		if(c == true)
			return true;
		else
			return false;
	}
	public static void printPrime(int a) {
		if(a <= 0  || a == 1) 
			System.out.println("Enter Valid Range !!");
		else {
			
			for(int i = 2; i<= a; i++) {
				boolean ch = PrimeCheck(i);
				if(ch == true)
					System.out.print(i + " ");
			}
			
		}
		
	}
	public static void main(String[] args) {
		System.out.println("Enter any Range  ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		printPrime(n);
		sc.close();

	}

}
