import java.util.Scanner;
public class DecimalToBinary {
	public static int toBinary(int num) {
		int bin = 0 ;
		int count = 0;
		while(num > 0) {
			int rem = num % 2;
			bin = bin + rem * (int)Math.pow(10, count);
			count++;
			num =num / 2;
		}
		return bin;
	}
	public static void main(String[] args) {
		System.out.println("Enter Decimal Number  ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		System.out.println(toBinary(num));
		sc.close();
	}

}
