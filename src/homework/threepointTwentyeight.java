package homework;
import java.util.Scanner;
public class threepointTwentyeight {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("Enter r1's center x-, y-coordinates, width, and height: ");
		Double x1 = input.nextDouble();
		Double y1 = input.nextDouble();
		Double w1 = input.nextDouble();
		Double h1 = input.nextDouble();
		System.out.print("Enter r2's center x-, y-coordinates, width, and height: ");
		Double x2 = input.nextDouble();
		Double y2 = input.nextDouble();
		Double w2 = input.nextDouble();
		Double h2 = input.nextDouble();
		if(    x2 - w2 / 2 >= x1 - w1 / 2
			&& x2 + w2 / 2 <= x1 + w1 / 2
			&& y2 + h2 / 2 <= y1 + h1 / 2
			&& y2 - h2 / 2 >= y1 - h1 / 2) {
			System.out.println("r2 is inside r1");
		}
		else if(x2 - w2 / 2 >= x1 + w1 / 2
			||  x2 + w2 / 2 <= x1 - w1 / 2
			||  y2 + h2 / 2 <= y1 - h1 / 2
			||  y2 - h2 / 2 >= y1 + h1 / 2) {
			System.out.println("r2 dose not overlaps r1");
		}
		else {
			System.out.println("r2 overlaps r1");
		}
	}

}
