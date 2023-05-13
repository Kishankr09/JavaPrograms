package testInLab;

import java.util.Scanner;

public class Test2_13May {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter The 1 Number : ");
		int num1 = s.nextInt();
		System.out.println("Enter The 2 Number : ");
		int num2 = s.nextInt();
		System.out.println("Enter The 3 Number : ");
		int num3 = s.nextInt();
		int d = 0;
		d = num1 % 10;
			num1 = num1 + (10-d);
		d = num2 % 10;
			num2 = num2 + (10-d);
		d = num3 % 10;
			num3 = num3 + (10-d);
		int tot = num1+num2+num3;
		System.out.println(tot);
		s.close();
	}

}
