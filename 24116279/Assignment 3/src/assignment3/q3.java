package assignment3;
import java.util.Scanner;
public class q3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter first number");
		int a = sc.nextInt();
		System.out.print("Enter Second number");
		int b = sc.nextInt();
		System.out.print("Enter Third number");
		int c = sc.nextInt();
		if(a<b && b<c)
			System.out.println("Increasing");
		else if(a>b && b>c)
			System.out.println("Decreasing");                                                      
		else
			System.out.println("Neither Increasing nor decreasing");
	}

}
