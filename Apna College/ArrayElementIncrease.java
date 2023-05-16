import java.util.Scanner;

public class ArrayElementIncrease {

	public static int[] printArrIncrement(int arr[], int Size) {
		Scanner sc = new Scanner(System.in);
		for(int i = 0; i<Size; i++) {
			System.out.println("Enter The " + (i+1) + " Element in Array");
			arr[i] = sc.nextInt();
			arr[i] = arr[i] + 1;
		}
		return arr;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Size ");
		int n = sc.nextInt();
		int arr[] = new int[n];
		printArrIncrement(arr,n);
		for(int i = 0; i<n; i++) {
			System.out.print(arr[i] + " ");
		}
	}

}
