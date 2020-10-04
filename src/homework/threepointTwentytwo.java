package homework;
import java.util.Scanner;
import java.lang.*;
public class threepointTwentytwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a point with two coordinates: ");
		Double x = input.nextDouble();
		Double y = input.nextDouble();
		Double r = Math.sqrt(x * x + y * y);
		if(r <= 10)
			System.out.print("point (" + x + "," + y + ") is in the circle");
		else
			System.out.print("point (" + x + "," + y + ") is not in the circle");
	}

}
