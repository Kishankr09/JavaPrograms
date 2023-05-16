
public class pattern7 {

	public static void hollowRhombus(int n) {
		for(int l = 1; l<= n; l++) {
			for(int j = 1; j<=n-l; j++) {
				System.out.print("  ");
			}
				for(int j = 1; j<=n; j++) {
					if(l == 1 || j == 1 || l == n || j == n)
						System.out.print("* ");
					else
						System.out.print("  ");
				}
				System.out.println();
			}
		}
	public static void main(String[] args) {
		int num =5;
		hollowRhombus(num);
	}

}
