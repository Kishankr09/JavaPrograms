import java.util.Scanner;

public class DeletionElement {
	public static int[] Deletion(int arr[], int pos, int size) {
		for(int i = pos-1; i< size-1; i++) {
			arr[i] = arr[i+1];
		}		
		
		return arr;
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
		System.out.print("Enter the position to delete the element ");
		int pos = sc.nextInt();
		Deletion(arr,pos,size);
		size = size - 1;
		for(int i = 0; i<size; i++) {
			System.out.print(arr[i]+"  ");
		}
		sc.close();

	}

}
