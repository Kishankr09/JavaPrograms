package testString;
/* This Program Found How Many Character in The String by using predefined method*/

import java.util.Scanner;

public class CharCount {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		System.out.println("Enter any String ");
		String str = s.nextLine();
		sb.append(str);
		System.out.println("Length of String : "+sb.length());
		s.close();
	}
}
