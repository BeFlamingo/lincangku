package homework;
import java.util.Scanner;
public class threepointTwentyseven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a point's x- and y-coordinates: ");
		Double x = input.nextDouble();
		Double y = input.nextDouble();
		if(x >= 0 && y >= 0 && y <= (-0.5) * x + 100) {
			System.out.println("The point is in the triangle");
		}
		else {
			System.out.println("The point is not in the triangle");
		}
	}

}
