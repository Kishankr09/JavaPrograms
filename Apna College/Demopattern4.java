import java.util.Scanner;

public class Demopattern4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Any Number To Print");
		int limit = sc.nextInt();
		int num = 1;
		for(int i = 1; i<= limit; i++) {
			for(int j = 1; j <= i; j++) {
				System.out.print(num + " ");
				num++;
			}
			
			System.out.println();
		}

	}

}
