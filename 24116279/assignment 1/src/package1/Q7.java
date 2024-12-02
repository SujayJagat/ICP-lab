/* Author Name: SUJAY JAGAT
 * Author registration no. : 24116279
 * Author Semester: 1st
 * Author Branch Section: CSE-H2
 * Subject: Introduction to Computer Programming
 * Question details: (ASSIGNMENT1,Q1) 
 * */

package package1;

public class Q7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 12;
		int b = 45;
		int c;
		System.out.println("Before swapping");
		System.out.println("a = " + a);
		System.out.println("b = " + b);
		
		c = a;
		a = b;
		b = c;
		System.out.println("After swapping");
		System.out.println("a = " + a);
		System.out.println("b = " + b);
	}

}

/*OUTPUT*/
/*Before swapping
a = 12
b = 45
After swapping
a = 45
b = 12
*/