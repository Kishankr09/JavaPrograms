package testString;

import java.util.Scanner;

public class CharCountByOwn {
	static int count = 0;
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter any String ");
		String str = s.nextLine();
		for(int i = 0; i<str.length(); i++,count++);
		System.out.println("Length of String : "+ count);
		s.close();
	}

}
