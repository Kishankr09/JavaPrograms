import java.util.Scanner;
public class SecondLargest {
	public static int secondMax(int arr[], int size) {
		int res = -1, largest = 0;
		for(int i = 1; i<size; i++) {
			if(arr[i] > arr[largest]) {
				res = largest;
				largest = i;
			}else if(arr[i] != arr[largest]) {
				if(res == -1 || arr[i]> arr[res])
					res = i;
			}
		}
		return res;
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
		int res = secondMax(arr,size);
		System.out.println("Second Largest "+arr[res]);
		sc.close();
	}
}
