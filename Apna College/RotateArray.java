
// Not Complete
import java.util.Scanner;

public class RotateArray {

	public static int[] ArrInitilization(int arr[], int Size) {
		Scanner sc = new Scanner(System.in);
		for(int i = 0; i<Size; i++) {
			System.out.println("Enter The " + (i+1) + " Element in Array");
			arr[i] = sc.nextInt();
		}
		sc.close();
		return arr;
	}
	public static int[] ArrRotate(int arr[], int Size, int d) {
		if(d==0)
			return arr;
		else if(d > 0) {
			int rotate = d;
			int newArr[] = new int[d];
			for(int i = 0; i<d; i++) {
				newArr[i] = arr[i];
			}
			int ch = 0;
			for(int i = 0; i<Size-rotate; i++) {
				arr[i] = arr[d++];
			}
			for(int i = Size-rotate-1;   i<Size-1; i++) {
				arr[i] = newArr[ch++];
			}
		return arr;
		}
		else
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
			
			System.out.println("Enter The index Value need to be Rotated");
			int d =sc.nextInt();
			ArrRotate(Arr,size,d);
			
			for(int j = 0; j<size; j++) {
				System.out.print(Arr[j]+" ");
			}
			System.out.println();
		}
	}
}