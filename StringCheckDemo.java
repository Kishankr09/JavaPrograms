import java.util.Scanner;

public class StringCheckDemo {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int v,c,spch,sp;
		v = c = spch = sp = 0;
		System.out.println("Enter The String : ");
		String str = s.nextLine();
		
		for(int i = 0; i<str.length(); i++) {
			char ch = str.charAt(i);
			if((ch >= 'A' && ch <='Z') || (ch >= 'a' && ch <= 'z')) {
				if(ch == 'a'|| ch == 'A' || ch == 'E' || ch == 'e' || ch == 'i' || ch == 'I' || ch == 'o' || ch =='O' || ch =='U'|| ch =='u' )
					v++;
				else
					c++;
			}
			else if(ch == ' ')
				sp++;
			else
				spch++;
							
		}
		System.out.println(str);
		System.out.println("Vowel Count : " + v);
		System.out.println("Consonant Count : " + c);
		System.out.println("Space Count : " + sp);
		System.out.println("Special Character Count : " + spch);
	}
}
