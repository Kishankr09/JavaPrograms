import java.util.Scanner;

public class PushZeroToEnd {
	
	public static int[] ArrInitilization(int arr[], int Size) {
		Scanner sc = new Scanner(System.in);
		for(int i = 0; i<Size; i++) {
			System.out.println("Enter The " + (i+1) + " Element in Array");
			arr[i] = sc.nextInt();
		}
		return arr;
	}
	
	public static int[] PushZero(int arr[], int Size) {
		for(int i = 0; i<Size-1; i++) {
			for(int j = i; j< Size-1 ; j++ ) {
				if(arr[i] == 0) {
					int swap = arr[i];
					arr[i] = arr[j+1];
					arr[j+1] = swap;	
				}
				else
					continue;
			}
		}
		return arr;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The TestCase");
		int t = sc.nextInt();
			if(t == 0 ||  t < 0)
			{
				System.out.println("You Have Enterd Unvalid Array Size");	
			}
			for(int i = 0; i < t; i++) {
				System.out.println("Enter The Size ");
				int size = sc.nextInt();
				if(size == 0 || size == 1 || size < 0)
				{
					System.out.println("You Have Enterd Unvalid Array Size");
					break;
				}
				int Arr[] = new int[size];
				ArrInitilization(Arr,size);
				PushZero(Arr,size);
				
				for(int j = 0; j<size; j++) {
				System.out.print(Arr[j]+" ");
				}
				System.out.println();
		}
	}
}
