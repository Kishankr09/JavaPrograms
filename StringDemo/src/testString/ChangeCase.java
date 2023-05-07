package testString;

import java.util.Scanner;

public class ChangeCase {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int i;
		System.out.println("Enter Any Number ");
		String str1 = s.nextLine();
		int len = str1.length();
		char[] ch1 = str1.toCharArray();
		for(i = 0; i < len; i++) {
			if(ch1[i] >= 'a' && ch1[i] <='z') {
				ch1[i] -= 32;
			}else if(ch1[i] >= 'A' && ch1[i] <='Z') {
				ch1[i] += 32;
			}
		}
		str1=String.valueOf(ch1);
		System.out.println("After Changing The Case\n\n"+str1);
		s.close();
}
}
