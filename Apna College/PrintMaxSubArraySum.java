import java.util.Scanner;

public class PrintMaxSubArraySum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Size Of The Array");
		int Size = sc.nextInt();
		int arr[]  = new int[Size];
		for(int i = 0; i< Size; i++) {
			System.out.println("Enter The " + (i+1) + " Element");
			arr[i] = sc.nextInt();
		}
		int max = Integer.MIN_VALUE;
		for(int i = 0; i<Size; i++) {
			for(int j = i; j < Size; j++) {
				int Sum = 0;
				for(int k = i ; k <= j; k++) {
					Sum = Sum + arr[k];
				}	
				if (Sum > max)
					max = Sum;
			}
		}
		System.out.println("Max Sub-Array Sum ="+max);
		sc.close();

	}

}
