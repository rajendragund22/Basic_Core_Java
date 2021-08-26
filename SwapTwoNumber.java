package basicPrograms;

import java.util.Scanner;

public class SwapTwoNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first Value : ");
		int a = sc.nextInt();
		System.out.println("Enter second value : ");
		int b = sc.nextInt();
		sc.close();
		System.out.println("Aefore swapping the of A -: " + a + " and B -: " + b);
		int c = 0;
		c = a;
		a = b;
		b = c;
		System.out.println("After swapping the of A -: " + a + " and B -: " + b);
	}
}
