package assignment3;
import java.util.Scanner;
public class q10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the marks: ");
		double m = sc.nextDouble();
		int n = (int)m/10;
		if (m > 100 && m < 0) {
			System.out.println("Invalid Input");
			return;
		}
		switch(n){
		case 10:
		case 9:
			System.out.println("Grade is: O");
			break;
		case 8:
			System.out.println("Grade is: A");
			break;
		case 7:
			System.out.println("Grade is: B");
			break;
		case 6:
			System.out.println("Grade is: C");
			break;
		case 5:
			System.out.println("Grade is: D");
			break;
		case 4:
			System.out.println("Grade is: E");
			break;
		default:
			System.out.println("Grade is: F");
			break;
		}
	}

}
