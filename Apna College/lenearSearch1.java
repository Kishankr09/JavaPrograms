//Find any Number 

import java.util.*;
public class lenearSearch1 {
	public static int lenearSearchIndex(int arr[], int key) {
		for(int i = 0; i<arr.length; i++) {
			if(arr[i] == key)
				return 1;
		}
		return -1;
		
	}
	public static void main(String[] args) {
		
		int Array[] = {12, 16, 18, 20, 25, 63, 19, 30, 33};
		System.out.println("Enter any Number to search");
		Scanner sc = new Scanner(System.in);
		int key = sc.nextInt();
		int index = lenearSearchIndex(Array,key);
		if(index == 1)
			System.out.println("Number Found");
		else
			System.out.println("Number Not Found ");
		
		sc.close();
	}

}
