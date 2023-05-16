
public class DemoPattern2 {

	public static void main(String[] args) {
		int c = 1;
		for(int i = 1; i<= 3; i++) {
			for(int j = 3; j> 0; j--) {
				System.out.print(c + " ");
				c++;
			}
			
			System.out.println();
		}

	}

}
