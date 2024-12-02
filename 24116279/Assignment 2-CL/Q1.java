import java.util.Scanner;
public class Q1{
	public static void main(String[] args){
		int dividend,divisor;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the dividend");
		dividend = sc.nextInt();
		System.out.print("Enter the divisor");
		divisor = sc.nextInt();
		int quotient = (int)(dividend/divisor);
		int remainder = dividend%divisor;
		System.out.println("Quotient = "+quotient);
		System.out.println("Remainder = "+remainder);
	}
}