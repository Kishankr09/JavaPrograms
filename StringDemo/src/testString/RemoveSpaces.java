package testString;

public class RemoveSpaces {

	public static void main(String[] args) {
		String str1="Remove white spaces";
		int i,j;
		int len = str1.length();
		char[] ch1 = str1.toCharArray();
		for(i = 0; i < len; i++) {
			if(ch1[i] == ' ') {
				for( j = i; j<len-1; j++) {
					ch1[j] = ch1[j+1];
				}
				ch1[j] = '\r';
				len--;
			}
		}
		
		for(i = 0; i< len; i++)
			System.out.print(ch1[i]);
		//We can also convert in String
		 String str2=String.valueOf(ch1);
		 System.out.println("\n"+str2);
	}
}
