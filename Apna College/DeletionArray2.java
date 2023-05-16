import java.util.Scanner;

public class DeletionArray2 {
	public static void Deletion(int arr[], int n, int size) {
		int pos =Integer.MIN_VALUE;
		for(int i = 0; i< size; i++) {
			if(arr[i] == n) {
				pos = i;
			}
		}	
		
		if(pos >= 0) {
		for(int i = pos; i< size-1; i++) {
			arr[i] = arr[i+1];
		}
		size = size - 1;
		for(int i = 0; i<size; i++) {
			System.out.print(arr[i]+"  ");
		}
		}
		else {
			System.out.println("value Didn't Find "+ n);
			for(int i = 0; i<size; i++) {
				System.out.print(arr[i]+"  ");
			}
		}
			
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter The Size of an array  ");
		int size = sc.nextInt();
		int arr[] = new int[size];
		
		for(int i = 0; i< size; i++) {
			System.out.print("Enter the "+(i+1)+" element of an array  ");
			arr[i] = sc.nextInt();
		}
		System.out.print("Enter the element to delete the element ");
		int n = sc.nextInt();
		Deletion(arr,n,size);
		
		sc.close();

	}

}
