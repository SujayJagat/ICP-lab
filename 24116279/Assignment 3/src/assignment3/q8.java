package assignment3;
import java.util.Scanner;
public class q8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the X Coordinate");
		double x = sc.nextDouble();
		System.out.print("Enter the Y Coordinate");
		double y = sc.nextDouble();
		if (x > 0 && y > 0)
			System.out.println("("+x+","+y+")"+"is in quadrant I");
		else if (x < 0 && y > 0)
			System.out.println("("+x+","+y+")"+"is in quadrant II");
		else if (x < 0 && y < 0)
			System.out.println("("+x+","+y+")"+"is in quadrant III");
		else if (x > 0 && y < 0)
			System.out.println("("+x+","+y+")"+"is in quadrant IV");
		else if (x == 0 && y != 0)
			System.out.println("("+x+","+y+")"+"is in Y-axis");
		else if (y == 0 && x != 0)
			System.out.println("("+x+","+y+")"+"is in X-axis");
		else
			System.out.println("("+x+","+y+")"+"is in Origin");
	}

}
