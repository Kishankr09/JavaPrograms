package testString;

public class ReplaceSpace {
	public static void main(String[] args) {    
        String str1 = "Once in a blue moon";    
        char ch = '-';      
        str1 = str1.replace(' ', ch);    
        System.out.println("String after replacing spaces with given character: ");    
        System.out.println(str1);    
    }    
}
