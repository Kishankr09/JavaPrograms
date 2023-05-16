
public class Pattern2 {

	public static void main(String[] args) {
		int n = 5;
		
		for(int i = 1; i<= n ; i++) {
			for(int j = n - i; j>0; j--) {
				System.out.print("  ");
			}
			for(int k = i ; k >= 1; k--) {
				System.out.print(k + " ");
			}
			
			for(int l = 2; l <= i; l++) {
				System.out.print(l + " ");
			}
			System.out.println();
		}
	}

}
