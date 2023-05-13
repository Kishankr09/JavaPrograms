package testInLab;

import java.util.Scanner;
public class Test1_13May {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter The Three Digit Number : ");
		int num1 = s.nextInt();
		int rev=0,d;
		d = num1%10;
		num1/=10;
		rev = rev * 10 + d;
		d = num1%10;
		num1/=10;
		rev = rev * 10 + d;
		d = num1%10;
		num1/=10;
		rev = rev * 10 + d;
		System.out.println(rev);
		s.close();
	}

}
