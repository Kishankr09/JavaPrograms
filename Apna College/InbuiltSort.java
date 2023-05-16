import java.util.Scanner;
import java.util.Arrays;
public class InbuiltSort {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Size of The Array ");
		int size = sc.nextInt();
		int arr[] = new int[size];
		for(int i = 0; i<size; i++) {
			System.out.print("Enter the "+ (i+1)+ " element ");
			arr[i] = sc.nextInt();
		}
		
		
		Arrays.sort(arr);
		for(int i = 0; i<size; i++) {
			System.out.print(arr[i]+" ");
		}

	}

}
