package testString;

public class ReplaceSpaceWithoutUsingMethod {

	public static void main(String[] args) {
		String str1 = "Once in a blue moon";    
        char ch = '-'; 
        int len = str1.length();
		char[] ch1 = str1.toCharArray();
		for(int i = 0; i < len; i++) {
			if(ch1[i] == ' ') {
				ch1[i] = ch;
			}
		}
		str1=String.valueOf(ch1);
		System.out.println("String after replacing spaces with given character: ");    
        System.out.println(str1);
	}
}
