import java.util.Scanner;

public class NareshiTP1 {
	public static void calculate(int arr[], int size ) {
		int total = 0;
		for(int i = 0; i<size; i++) {
			total = total + arr[i];
		}	
		float per = (total / size) ;
		if(per>=70)
			System.out.println("Destinction");
		else if(per >=60 && per < 70)
			System.out.println("First Class");
		else if(per >= 50 && per < 60)
			System.out.println("Second Class");
		else if(per >= 35 && per < 50)
			System.out.println("Third Class");
		else
			System.out.println("Fail");
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number of Subject ");
		int size = sc.nextInt();
		int arr[] = new int[size];
		for(int i = 0; i<size; i++) {
			System.out.print("Enter the "+ (i+1)+ " Subject Marks ");
			arr[i] = sc.nextInt();
		}
		
		calculate(arr,size);
		sc.close();
	}

}
