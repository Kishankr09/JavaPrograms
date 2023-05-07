package testString;
import java.lang.*;
import java.util.Scanner;

public class PallindromeWithPredefined {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		System.out.println("Enter Any String : ");
		String str1 = s.nextLine();
		sb.append(str1);
		String str2 = str1;
		sb.append(str2);
		sb.reverse();
		if(str1 == str2)
			System.out.println("Pallindrome");
		else
			System.out.println("Not Pallindrome");
	}

}
