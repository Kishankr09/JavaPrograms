
public class Pattern4 {

	public static void zeroOnePattern(int num) {
		
		for(int i = 1; i<= num; i++) {
			for(int j = 1; j<=i; j++) {
				int sum = i + j;
				if(sum % 2 == 0)
					System.out.print(1 + " ");
				else
					System.out.print(0 + " ");
			}
			System.out.println();
		}
		
	}
	
	public static void main(String[] args) {
		int n = 5;
		zeroOnePattern(n);
	}

}
