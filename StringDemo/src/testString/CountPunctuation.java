package testString;

import java.util.Scanner;
public class CountPunctuation {
	static int count = 0;
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter any String ");
		String str = s.nextLine();
		for(int i = 0; i<str.length(); i++) {
			if(str.charAt(i) == '!' || str.charAt(i) == ',' || str.charAt(i) == ';' || str.charAt(i) == '.' ||  str.charAt(i) == '?' || str.charAt(i) == '-' ||    
					str.charAt(i) == '\'' || str.charAt(i) == '\"' || str.charAt(i) == ':')   
					{    
					count++;    
					}    
		}
		System.out.println("Total Punctuation  : "+ count);
		s.close();
	}

}
