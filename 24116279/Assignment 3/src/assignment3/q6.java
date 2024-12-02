package assignment3;
import java.util.Scanner;
public class q6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Units Consumed: ");
		int unit = sc.nextInt();
		if (unit < 50)
			System.out.println("BILL = " + (unit*3));
		else if (unit >= 50 && unit < 200)
			System.out.println("BILL = " + (unit*4.80));
		else if (unit >= 200 && unit < 400)
			System.out.println("BILL = " + (unit*5.80));
		else
			System.out.println("BILL = " + (unit*6.20));
	}

}
