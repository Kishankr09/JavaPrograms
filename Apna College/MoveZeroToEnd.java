import java.util.Scanner;

public class MoveZeroToEnd {
	public static void ZeroEnd(int arr[], int size) {
		int n = size -1;
		for(int i = 0; i<size; i++) {
			if(arr[i] == 0) {
				int temp = arr[i];
				arr[i] = arr[n];
				arr[n] = temp;
				n--;
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
		
		ZeroEnd(arr,size);
		sc.close();

	}

}
