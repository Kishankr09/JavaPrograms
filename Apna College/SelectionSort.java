import java.util.Scanner;

public class SelectionSort {
	public static int[] Sort(int arr[], int size) {
		
		for(int i = 0; i< size - 1; i++) {
			int minPos = i;
			for(int j = i+1 ; j < size; j++) {
				if(arr[minPos] > arr[j]) {
					minPos = j;
					
				}
			}
			int temp = arr[minPos];
			arr[minPos] = arr[i];
			arr[i] = temp;
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
