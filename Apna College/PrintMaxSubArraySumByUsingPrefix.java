import java.util.Scanner;

public class PrintMaxSubArraySumByUsingPrefix {
	public static int[] PrefixSumSubArray(int[] arr, int Size) {
		int prefixArr[]  = new int[Size];
		int sum = 0;
		for(int i = 0; i < Size; i++) {
			sum = sum + arr[i];
			prefixArr[i] = sum ; 
		}
		return prefixArr;
	}
	public static void maxSubArray(int[] arr, int Size) {
		
		int sum = Integer.MIN_VALUE;
		for(int i = 0; i < Size; i++) {
			if(arr[i] < sum)
				sum = sum + arr[i];
		}
		System.out.println("Maximum Sub Array = " + sum);
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Size Of The Array");
		int Size = sc.nextInt();
		int arr[]  = new int[Size];
		for(int i = 0; i< Size; i++) {
			System.out.println("Enter The " + (i+1) + " Element");
			arr[i] = sc.nextInt();
		}
		PrefixSumSubArray(arr,Size);
		maxSubArray(arr,Size);
		sc.close();
	}

}
