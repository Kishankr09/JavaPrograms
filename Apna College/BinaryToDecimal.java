import java.util.*;
import java.lang.Math;
public class BinaryToDecimal {

	public static double ToDecimal(int n) {
		int num = n;
		double net = 0.0;
		int count = 0;
		while(n > 0) {
			n = n/10;
			count++;	
		}
		
		for(int i = 0; i < count; i++) {
			int d = num % 10;
			num = num / 10;
			net = net + d * Math.pow(2, i);
			
		}
		return net;
	}
	public static void main(String[] args) {
		System.out.println("Enter Binary Number  ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		System.out.println(ToDecimal(num));
		sc.close();

	}

}
