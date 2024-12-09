package assignment3;
import java.util.Scanner;
public class q7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Units Consumed: ");
		int unit = sc.nextInt();
		double bill = 0;
		if (unit <= 50)
			bill = unit*3;
		else if (unit > 50 && unit <= 200)
			bill = 50*3 + (unit-50)*4.80;
		else if (unit > 200 && unit <= 400)
			bill = 50*3 + 150*4.80 + (unit-200)*5.80;
		else
			bill = 50*3 + 150*4.80+ 200*5.80 + (unit-400)*6.20;
		System.out.println("Do You Want to Pay ONLINE (y/n)");
		char c = sc.next().charAt(0);
		if(c == 'y') {
			double dis = 0.03*bill;
			double na = bill - dis;
			System.out.println("Total Amount = " + bill);
			System.out.println("Discount = " + dis);
			System.out.println("Total Payable = " + na);
		}
		else if(c == 'n')
			System.out.println("Total Amount = " + bill);
		else
			System.out.println("Invalid Input");
	}

}
