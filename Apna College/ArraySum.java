import java.util.Scanner;

public class ArraySum {

	public static int SumArr(int arr[], int Size) {
		int sum = 0;
		Scanner sc = new Scanner(System.in);
		for(int i = 0; i<Size; i++) {
			System.out.println("Enter The " + (i+1) + " Element in Array");
			arr[i] = sc.nextInt();
			sum = sum + arr[i];
		}
		return sum;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Size Of an Array");
		int n = sc.nextInt();
		int Arr[] = new int[n];
		int Sum = SumArr(Arr,n);
		System.out.println("Sum = " + Sum);
	
	}
}
