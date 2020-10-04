package homework;
import java.util.Scanner;
public class threepointnine {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int[] d=new int[9];
		int n=input.nextInt();
		d[8]=n%10;
		d[7]=n/10%10;
		d[6]=n/100%10;
		d[5]=n/1000%10;
		d[4]=n/10000%10;
		d[3]=n/100000%10;
		d[2]=n/1000000%10;
		d[1]=n/10000000%10;
		d[0]=n/100000000;
		int x;
		x=(d[0]+d[1]*2+d[2]*3+d[3]*4+d[4]*5+d[5]*6+d[6]*7+d[7]*8+d[8]*9) % 11;
		if(x>=10&&d[0]!=0)
			System.out.print(n+"X");
		else if(x>=10&&d[0]==0)
			System.out.print("0"+n+"X");
		else if(x<10&&d[0]!=0)
			System.out.print(n*10+x);
		else
			System.out.print("0"+n+x);
	}

}
