import java.util.Scanner;

public class countingSort {

	public static void Sort(int[] arr, int size) {
		int largest = Integer.MIN_VALUE;
		for(int i = 0; i<size; i++) {
			largest = Math.max(largest, arr[i]);
		}
		int count[] = new int[largest + 1];
		
		for(int i = 0; i<size; i++) {
			count[arr[i]]++;
		}
		int j = 0;
		for(int i = 0; i<largest+1; i++) {
			while(count[i] > 0) {
				arr[j] = i;
				j++;
				count[i]--;
				
			}
			
			
		}
		for(int i = 0; i<size; i++) {
			System.out.print(arr[i]+" ");
		}
		
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
	}
}
