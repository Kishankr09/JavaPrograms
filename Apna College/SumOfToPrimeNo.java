/*
 * 3.  Check whether a number can be expressed as 
 * a sum of two prime numbers For example, 
 * the number 34 is given as input.  
 * 34 = 3 + 31 
 * 34 = 5 + 29 
 * 34 = 11 + 23 
 * 34 = 17 + 17
 */

import java.util.Scanner;
public class SumOfToPrimeNo {
	public static void PrintTwoPrimeSum(int num) {
		int start = 1, end = num-1;
		for(int i  = 1 ; i <= num/2; i++) {
			
			if(start + end == num) {
				boolean b1 = Prime(start) , b2 = Prime(end);
				if(b1 == true && b2 == true)
					System.out.println((start)+" ,"+(end));
			}
			
			start++;
			end--;
		}
	}
	public static boolean Prime(int a) {
		int c = 0;
		for(int i = 2; i<= Math.sqrt(a); i++) {
			if(a % i == 0)
				c++;
		}
		if(c > 0)
			return false;
		else
			return true;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Anu Positive Number ");
		int num = sc.nextInt();		
		PrintTwoPrimeSum(num);
	}
}
