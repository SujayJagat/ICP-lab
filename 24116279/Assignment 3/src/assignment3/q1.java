package assignment3;
import java.util.Scanner;
public class q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your age");
		int age = sc.nextInt();
		if(age>=18)
			System.out.println("You are eligible to vote");
	}

}
