package homework;

public class threepointTwentyfour {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number = (int)(Math.random()*13);
		int color  = (int)(Math.random()*4);
		String s = String.valueOf(number+1);
		if(s == "1")
			s = "Ace";
		else if(s == "11")
			s = "Jack";
		else if(s == "12")
			s = "Queen";
		else if(s == "13")
			s = "King";
		
		if (color == 0)
			System.out.print("The card you picked is " + s + " of Clubs");
		else if(color == 1)
			System.out.print("The card you picked is " + s + " of Diamonds");
		else if(color == 2)
			System.out.print("The card you picked is " + s + " of Hearts");
		else if(color == 3)
			System.out.print("The card you picked is " + s + " of Spades");
	}

}
