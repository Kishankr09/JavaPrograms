package testString;

import java.util.Arrays;
import java.util.Scanner;

public class AnagramCheck {
	static boolean b = true;
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter 1st String ");
		String str1 = s.nextLine();
		System.out.println("Enter 2nd String ");
		String str2 = s.nextLine();
		str1.trim();
		str2.trim();
		str1.toLowerCase();
		str2.toLowerCase();
		if(str1.length() == str2.length()) {
			char[] ch1 = str1.toCharArray();  
            char[] ch2 = str2.toCharArray();  
  
            Arrays.sort(ch1);  
            Arrays.sort(ch2);  
    
            if(Arrays.equals(ch1, ch2) == true) {  
                System.out.println("Both the strings are anagram");  
            }  
            else {  
                System.out.println("Both the strings are not anagram");  
            }
		}
		else {
			System.out.println("Both the strings are not anagram");
		}
		s.close();
	}
}
