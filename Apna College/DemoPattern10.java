import java.util.Scanner;

public class DemoPattern10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Any Number To Print");
		int limit = sc.nextInt();	
		int num = 1;
		for(int i = 1; i<=limit; i++) {
			
			for(int j = 1; j <= limit-i; j++) {
				System.out.print("  ");			
			}
			for(int k = 1; k <= i; k++) {
				System.out.print(num +" ");	
				num++;
			}
			System.out.println();
		}
	}

}
