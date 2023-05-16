//find The Maximum Number Through Linear Search

public class LenearSearch2 {
	public static int getLargest(int arr[]) {
		int maxValue = Integer.MIN_VALUE;
		for(int i = 0; i< arr.length; i++) {
			if(maxValue < arr[i])
				maxValue = arr[i];
		}
		return maxValue;
		
	}
	public static int getSmallest(int arr[]) {
		int minValue = Integer.MAX_VALUE;
		for(int i = 0; i< arr.length; i++) {
			if(minValue > arr[i])
				minValue = arr[i];
		}
		return minValue;
	}
	public static void main(String[] args) {
		
		int arr[] = {12,78,69,72,13,55, 68, 89 ,41 };
		System.out.println("Maximum Value = " + getLargest(arr));
		System.out.println("Mininum Value = " + getSmallest(arr));
	}

}
