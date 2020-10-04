package homework;
import java.util.Scanner;
public class threepointTwentythree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a point with two coordinates: ");
		Double x = input.nextDouble();
		Double y = input.nextDouble();
		if(x >= -5 && x <= 5 && y >= -2.5 && y <= 2.5) {
			System.out.print("point (" + x + "," + y + ") is in the rectangle");
		}
		else {
			System.out.print("point (" + x + "," + y + ") is not in the circle");
		}
	}

}
