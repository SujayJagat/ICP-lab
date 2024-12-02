package assignment3;
import java.util.Scanner;
public class q5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the year: ");
		int n = sc.nextInt();
		if((n % 4) == 0 && (n % 100) != 0 || (n % 400) == 0)
			System.out.println("true");
		else
			System.out.println("false");
	}

}
