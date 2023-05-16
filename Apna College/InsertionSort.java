import java.util.Scanner;

public class InsertionSort {
	public static int[] Sort(int arr[], int size) {
		
		for(int i = 1; i< size; i++) {
			int temp = arr[i];
			int j = i-1;
			while(j >=0 && temp < arr[j]) {
				arr[j+1] = arr[j];
				j--;
			}
			arr[j+1] = temp;
		}
		return arr;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Size of The Array ");
		int size = sc.nextInt();
		int arr[] = new int[size];
		for(int i = 0; i<size; i++) {
			System.out.print("Enter the "+ (i+1)+ " element ");
			arr[i] = sc.nextInt();
		}
		Sort(arr,size);
		for(int i = 0; i<size; i++) {
			System.out.print(arr[i]+" ");
		}

	}

}
