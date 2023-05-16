import java.util.Scanner;

public class DemoPattern7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Any Number To Print");
		int limit = sc.nextInt();	
		
		for(int i = 1; i<=limit; i++) {
			int newCh = (int)'A' +i -1;
			for(int j = 1; j <= i; j++) {
				System.out.print( (char)newCh + " ");
				newCh++;		
			}	
			
			System.out.println();
		}
	}

}
