package assignment3;
import java.util.Scanner;
public class q9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the value of a, b, c: ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		if(a>b && a>c) {
			System.out.println("Largest number is "+a);
			if(b>c)
				System.out.println("Second Largest number is "+b);
			else
				System.out.println("Second Largest number is "+c);
		}
		else if(b>a && b>c) {
			System.out.println("Largest number is "+b);
			if(a>c)
				System.out.println("Second Largest number is "+a);
			else
				System.out.println("Second Largest number is "+c);
		}
		else if(c>a && c>b){
			System.out.println("Largest number is "+c);
			if(a>b)
				System.out.println("Second Largest number is "+a);
			else
				System.out.println("Second Largest number is "+b);
		}
		else
			System.out.println("All numbers are Equal");
	}

}
