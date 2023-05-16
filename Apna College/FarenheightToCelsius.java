import java.util.Scanner;
public class FarenheightToCelsius {

	public static float conversion(float temp) {
		float newTemp = ((temp-32)*5)/9;
		return newTemp;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter The Temperature in Farenheight");
		float temp = sc.nextFloat();
		float celcius = conversion(temp);
		System.out.println(celcius);
	}

}
