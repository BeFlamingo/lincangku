package homework;
import java.util.Scanner;
public class threepointTwentyone {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int h;
		System.out.print("Enter year: (e.g., 2012): ");
		int year  = input.nextInt();
		System.out.print("Enter month: 1-12: ");
		int month = input.nextInt();
		System.out.print("Enter the day of the month: ");
		int day   = input.nextInt();
		int q = day;
		
		int m = month;
		if(m == 1) {
			m = 13;
			year -= 1;
		}
		else if(m == 2) {
			m = 14;
			year -= 1;
		}
		int j = year / 100;
		int k = year % 100;
		h = (q + 26 * (m + 1) / 10 + k + k / 4 + j / 4 + 5 * j) % 7;
		if     (h == 0)
			System.out.println("Day of the week is Saturday");
		else if(h == 1)
			System.out.println("Day of the week is Sunday");
		else if(h == 2)
			System.out.println("Day of the week is Monday");
		else if(h == 3)
			System.out.println("Day of the week is Tuesday");
		else if(h == 4)
			System.out.println("Day of the week is Wednesday");
		else if(h == 5)
			System.out.println("Day of the week is Thursday");
		else
			System.out.println("Day of the week is Friday");
	}

}
