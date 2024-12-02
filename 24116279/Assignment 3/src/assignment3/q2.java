package assignment3;

import java.util.Scanner;

public class q2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter amount of water drank today");
		int x = sc.nextInt();
		if(x>=5000)
			System.out.println("Yes, Alice is following doctor’s advice");
		else
			System.out.println("No, Alice is not following doctor’s advice");
		
	}

}
