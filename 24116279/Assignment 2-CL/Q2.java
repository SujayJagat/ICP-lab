import java.util.Scanner;
import java.lang.Math;
public class Q2{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the first number");
		int a = sc.nextInt();
		System.out.print("Enter the second number");
		int b = sc.nextInt();
		System.out.println("RESULT = "+(int)Math.pow(a, b));
	}
}