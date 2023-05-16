import java.util.*;
public class PrintArray {
	public static int[] printArr(int arr[], int Size) {
		Scanner sc = new Scanner(System.in);
		for(int i = 0; i<Size; i++) {
			System.out.println("Enter The Element in Array");
			arr[i] = sc.nextInt();
		}
		return arr;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Size  ");
		int n = sc.nextInt();
		int Arr[] = new int[n];
		printArr(Arr,n);
		for(int i = 0; i<n; i++) {
			System.out.print(Arr[i] + " ");
		}
		System.out.println();
	}
}
