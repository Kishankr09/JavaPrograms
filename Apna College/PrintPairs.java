import java.util.*;
class PrintPairs {

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
			for(int j = i+1; j < Size; j++) {
				System.out.print("("+arr[i]+","+arr[j]+")");
			}
			System.out.println();
		}
		
		sc.close();
	}

}
