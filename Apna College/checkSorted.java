import java.util.Scanner;
public class checkSorted {
	public static void isSort(int arr[], int size) {
		int c = 0; 
		for(int i = 0; i< size; i++) {
			for(int j = i+1; j<size; j++) {
				if(arr[i] > arr[j]) {
					c++;
					break;
				}
			}
		}
		if(c == 0) {
			System.out.println("Sorted");
		}else {
			System.out.println("Not Sorted");
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Size of the Array  ");
		int size = sc.nextInt();
		int arr[] = new int[size];
		for(int i = 0; i<size; i++) {
			System.out.print("Enter the "+ (i+1)+ " element ");
			arr[i] = sc.nextInt();
		}
		isSort(arr,size);
		sc.close();
	}

}
