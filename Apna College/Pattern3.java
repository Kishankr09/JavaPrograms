
public class Pattern3 {
	
	public static void hollow_Rectangle(int TRow, int TCol) {
	
		
		for(int i = 1; i <= TRow; i++) {
			for(int j = 1; j<= TCol; j++) {
				if(i == 1 || i == TRow || j == 1 || j == TCol)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		hollow_Rectangle(10,12);
	}

}
