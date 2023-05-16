import java.util.Scanner;

public class ReverseArray {

	public static void main(String[] args) {
		Scanner sc =  new Scanner(System.in);
		System.out.println("Enter the Size Of The Array");
		int Size = sc.nextInt();
		int arr[]  = new int[Size];
		for(int i = 0; i< Size; i++) {
			System.out.println("Enter The " + (i+1) + " Element");
			arr[i] = sc.nextInt();
		}
		int NewArr[] = new int[Size];
		int j = Size - 1;
		for(int i = 0; i<Size; i++) {
			NewArr[i] = arr[j--];
		}
		for(int i = 0; i< Size; i++) {
			System.out.print(NewArr[i] + " ");
		}
		System.out.println();
		sc.close();

	}

}
