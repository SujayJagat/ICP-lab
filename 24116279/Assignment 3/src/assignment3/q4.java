package assignment3;
import java.util.Scanner;
public class q4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Your number ");
		int n = sc.nextInt();
		int m = (int)(Math.random()*9+1);
		if(n > 9 || n < 1) {
			System.out.println("Invalid Input");
			return;
		}
		System.out.println("Computer guesses "+ m);
		if(n == m)
			System.out.println("You got it right");
		else if(n == (m+1) || n == (m-1))
			System.out.println("Almost got it");
		else
			System.out.println("You got it wrong”");
	}

}
