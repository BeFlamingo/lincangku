package homework;
import java.util.Scanner;
public class threepointNineteen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int x = input.nextInt();
		int y = input.nextInt();
		int z = input.nextInt();
		if(x+y>z&&x+z>y&&y+z>x) {
			System.out.println(x+y+z);
		}
		else {
			System.out.println("这些值不合法");
		}
	}

}
