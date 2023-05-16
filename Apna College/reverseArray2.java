
public class reverseArray2 {
	public static int[] reverse(int[] arr) {
		int start = 0,end = arr.length-1;
		
		while(start< end) {
			int swap = arr[start];
			arr[start] = arr[end];
			arr[end] = swap;
			start++;
			end--;
			
		}
		
		return arr;
	}
	public static void main(String[] args) {
		int [] arr = {5,2,4,3,6,8};
		reverse(arr);
		for(int i = 0; i< arr.length; i++)
			System.out.print(arr[i] + " ");
	}

}
