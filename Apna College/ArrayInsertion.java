import java.util.*;
public class ArrayInsertion {
	public static int[] insert(int arr[], int pos, int n, int size) {
		for(int i = size - 2; i>= pos-1; i--) {
			arr[i+1] = arr[i];
		}
		arr[pos-1] = n;
		
		return arr;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter The Size of an array  ");
		int size = sc.nextInt();
		int arr[] = new int[size];
		System.out.print("Enter the element of an array");
		for(int i = 0; i< size-1; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.print("Enter the position to insert element ");
		int pos = sc.nextInt();
		System.out.print("Enter The element to insert ");
		int n = sc.nextInt();
		insert(arr,pos,n,size);
		for(int i = 0; i<size; i++) {
			System.out.print(arr[i]+"  ");
		}
		sc.close();
	}

}
