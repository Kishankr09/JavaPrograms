import java.util.*;
public class PrintSubArrays {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Size Of The Array");
		int Size = sc.nextInt();
		int arr[]  = new int[Size];
		for(int i = 0; i< Size; i++) {
			System.out.println("Enter The " + (i+1) + " Element");
			arr[i] = sc.nextInt();
		}
		for(int i = 0; i<Size; i++) {
			for(int j = i; j < Size; j++) {
				for(int k = i ; k <= j; k++)
					System.out.print(arr[k] + " ");
				System.out.println();
			}
			System.out.println();
		}
		sc.close();
	}

}
