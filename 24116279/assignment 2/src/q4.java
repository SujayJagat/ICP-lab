/*Author name:Sujay Jagat
 * Author registration no:24116279
 * Author semester: 1st
 * Author branch-section: CSE-H2
 * Introduction to computer programming
 * Question details: (Assignment2,Q4)*/
import java.util.Scanner;
public class q4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number between 0 to 1000");
		int n = sc.nextInt();
		int m = n;
		int d1 = m%10;
		m = m/10;
		int d2 = m%10;
		m = m/10;
		int d3 = m%10;
		m = m/10;
		int sum = d1+d2+d3;
		System.out.println("Sum of all the digits of "+n+" = "+sum);
	}

}
