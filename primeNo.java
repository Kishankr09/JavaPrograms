import java.util.Scanner;
public class primeNo {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	boolean b;
	do {
		System.out.println("1. Prime Number Check \n2. Range for Prime Number");
		int num = sc.nextInt();
	switch(num)
	{
		case 1: 
			System.out.print("Enter any Number to Check ");
			int n = sc.nextInt();
			primeCheck(n);
			break;
		case 2: 
			System.out.println("Enter The Range To Find all Prime Number ");
			int n1 = sc.nextInt();
			primeRange(n1);
			break;	
		default:
			System.out.println("You Have entered Wrong Key ");
			break;
		}
		System.out.println("\nDo You Want To Close (Y/N) ");
			char ch = sc.next().charAt(0);
			if(ch =='Y' || ch == 'y')
				 b = false;
			else
				 b = true;
		}while(b);
	}
	
	public static void primeCheck(int n)
	{
		int c = 0;
		for(int i = 2; i<n; i++) {
			if(n % i == 0)
				c++;
		}
		if(c == 0)
			System.out.print("Prime Number " + n);
		else
			System.out.print("Not Prime Number " + n);
	
	}
	public static void primeRange(int r)
	{
		for(int k = 2; k<=r; k++)
		{
			int c = 0;
			for(int i = 2; i<k; i++) {
				if(k % i == 0)
					c++;
			}
			if(c == 0)
				System.out.print(k + " ");
		}
	}
}
