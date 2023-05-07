package testString;
import java.util.Scanner;
public class CountVowelConsonant {
	static int vowel = 0;
	static int consonant = 0;
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter any String ");
		String str = s.nextLine();
		str.toLowerCase();
		for(int i = 0; i<str.length(); i++) {
			if(str.charAt(i) >='a' && str.charAt(i)<='z') {
				if(str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' ||  str.charAt(i) == 'u' ){    
					vowel++;    
				}else {
					consonant++;
				}
			}
		}
		System.out.println("Total vowel  : "+ vowel);
		System.out.println("Total consonant  : "+ consonant);
		s.close();
	}
}
