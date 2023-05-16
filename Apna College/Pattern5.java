
public class Pattern5 {
    public static void butterfly(int n) {
    	for(int i = 1; i<= n; i++) {
    		for(int j = 1; j<= i; j++) {
    			System.out.print("* ");
    		}
    		for(int l = 1; l<=n - i; l++) {
    			System.out.print("    ");
    		}
    		
    		for(int k = 1 ; k <= i; k++) {
    			System.out.print("* ");
    		}
    		System.out.println();
    	}
    	for(int i = 1; i<= n; i++) {
    		for(int j = n + 1 - i; j > 0; j--) {
    			System.out.print("* ");
    		}
    		for(int l = 2; l<= i; l++) {
    			System.out.print("    ");
    		}
    		
    		for(int j = n + 1 - i; j > 0; j--) {
    			System.out.print("* ");
    		}
    		System.out.println();
    	}
    	
    }
	public static void main(String[] args) {
		int num = 5;
		butterfly(num);
	}

}
