import java.util.*;
public class SwapAlternate {

	public static int[] ArrInitilization(int arr[], int Size) {
		Scanner sc = new Scanner(System.in);
		for(int i = 0; i<Size; i++) {
			System.out.println("Enter The " + (i+1) + " Element in Array");
			arr[i] = sc.nextInt();
		}
		return arr;
	}
	
	public static int[] ArrSwap(int arr[], int Size) {
		
		if(Size % 2 == 0) {
			for(int i = 0; i< Size-1; i++) {
				if(i == 1 || i % 2 != 0 || i == Size-1 ) {
					continue;
				}
				else {
					int swap = arr[i];
					arr[i] = arr[i+1];
					arr[i+1] = swap;	
				}
			}
		}
		if(Size % 2 != 0) {
			for(int i = 0; i< Size-1; i++) {
				if(i == 1 || i % 2 != 0 || i == Size-1) {
					continue;
				}
				else {
					int swap = arr[i];
					arr[i] = arr[i+1];
					arr[i+1] = swap;	
				}
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
			ArrSwap(Arr,size);
			for(int j = 0; j<size; j++) {
				System.out.print(Arr[j]+" ");
			}
			System.out.println();
		
		}
	}

}
