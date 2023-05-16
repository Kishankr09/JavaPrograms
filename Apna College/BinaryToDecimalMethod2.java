import java.util.Scanner;

public class BinaryToDecimalMethod2 {

	public static void ToDecimal(int binNum) {
		int myNum = binNum;
		int decNum= 0;
		int Pow = 0;
		
		while(binNum > 0) {
			int d  = binNum % 10;
			decNum = decNum + d * (int)Math.pow(2, Pow);
			
			Pow++;
			binNum /= 10;
		}
		
		System.out.println("Binary Number " + myNum +" and Decimal Number is "+ decNum);
	}
	
	public static void main(String[] args) {
		System.out.println("Enter Binary Number  ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		ToDecimal(num);
		sc.close();


	}

}
