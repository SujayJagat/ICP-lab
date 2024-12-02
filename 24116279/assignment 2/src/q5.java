/*Author name:Sujay Jagat
 * Author reg no:24116279
 * Author semester: 1st
 * Author branch-section: CSE-H2
 * Introduction to computer programming
 * Question details: (Assignment2,Q5)*/
import java.util.Scanner;
import java.lang.Math;
public class q5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the radius of the Hemisphere");
		double r = sc.nextDouble();
		double sa = 3*Math.PI*(r*r);
		double v = (2.0/3.0)*Math.PI*(r*r*r);
		System.out.println("\nSurface Area of the Hemisphere = "+sa);
		System.out.println("Volume of the Hemisphere = "+v);
	}

}
