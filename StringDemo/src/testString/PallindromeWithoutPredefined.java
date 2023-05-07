package testString;
import java.util.Scanner;
public class PallindromeWithoutPredefined {
	
	public static void main(String[] args) {
			Scanner s = new Scanner(System.in);
			System.out.println("Enter Any String : ");
			String str = s.nextLine();
			boolean b = true;
			char ch1,ch2;
			if(str.length()%2!=0) {
				for(int i = 0, j = str.length()-1; i<str.length()/2; i++,j--) {
						ch1 = str.charAt(i);
						ch2 = str.charAt(j);
						if(ch1 == ch2)
							continue;
						else {
							b = false;
							break;
						}							
				}
				if(b) {
					System.out.println("Pallindrome");
				}
				else {
					System.out.println("Not Pallindrome");
				}
			}
			else
				System.out.println("Not Pallindrome");
	}

}
