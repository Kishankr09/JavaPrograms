import java.util.Scanner;
public class checkPrime {

	public static void Prime(int a) {
		int c = 0;
		for(int i = 2; i<= Math.sqrt(a); i++) {
			if(a % i == 0)
				c++;
		}
		if(c > 0)
			System.out.println("Not Prime");
		else
			System.out.println("Prime");
	}
	
	public static void main(String[] args) {
		System.out.println("Enter any value  ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		Prime(n);
		sc.close();
	}

}
