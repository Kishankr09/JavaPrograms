import java.util.Scanner;

public class pg_1_NIT {
	public static void check(int arr[], int Size) {
		int last = Size - 1;
		Scanner sc = new Scanner(System.in);
		for(int i = 0; i<Size; i++) {
			System.out.println("Enter The " + (i+1) + " Element in Array");
			arr[i] = sc.nextInt();
		}
		if(arr[0] == 6 || arr[last]==6)
			System.out.println("No is Same" + arr[0]);
		else
			System.out.println("Number Not Foun");
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Limit of an array ");
		int limit = sc.nextInt();	
		int Arr[] = new int[limit];
		check(Arr,limit);	
	}

}
