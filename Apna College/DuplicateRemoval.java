import java.util.Scanner;

public class DuplicateRemoval {
	public static void RemoveDuplicate(int arr[], int size) {
		int c = 1;
		for(int i = 1; i<size; i++) {
				if(arr[i] != arr[c-1]) {
					arr[c] = arr[i];
					c++;
			}
		}
		for(int i = 0; i<c; i++) {
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
		
		RemoveDuplicate(arr,size);
		sc.close();

	}

}
