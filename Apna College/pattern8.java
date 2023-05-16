
public class pattern8 {
	public static void diamond(int n) {
		for(int i = 1; i<= n; i++) {
			for(int j = 1; j <= n -i; j++)
				System.out.print("  ");
			for(int k = 1; k <= i + i - 1; k++)
				System.out.print("* ");
			
			System.out.println();
		}
		for(int i = 1; i<= n; i++) {
			for(int j = 1; j <=i; j++)
				System.out.print("  ");
			for(int k =  n + n - i- i- 1; k > 0; k--)
				System.out.print("* ");
			
			System.out.println();
		}
	}
	public static void main(String[] args) {
		int num = 5;
		diamond(num);
	}

}
