import java.util.Scanner;

public class BubbleSort {
	public static int[] Sort(int arr[], int size) {
		
		for(int i = 0; i< size - 2; i++) {
			for(int j = 0; j < size - 1 -i; j++) {
				if(arr[j] > arr[j+1]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
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
