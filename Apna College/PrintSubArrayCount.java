import java.util.Scanner;

public class PrintSubArrayCount {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Size Of The Array");
		int Size = sc.nextInt();
		int arr[]  = new int[Size];
		for(int i = 0; i< Size; i++) {
			System.out.println("Enter The " + (i+1) + " Element");
			arr[i] = sc.nextInt();
		}
		int Subarray = (Size * (Size+1))/2;
		System.out.println("Total Sub-Array Count is "+Subarray);
		sc.close();

	}

}
