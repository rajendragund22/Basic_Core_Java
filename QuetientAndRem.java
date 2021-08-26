package basicPrograms;

import java.util.Scanner;

public class QuetientAndRem {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter divident ");
		int divident = sc.nextInt();

		System.out.println("Enter divisor ");
		int divisor = sc.nextInt();
		sc.close();

		int quotient = divident / divisor;

		int remainder = divident % divisor;

		System.out.println("The quotient is " + quotient);
		System.out.println("The remainder is " + remainder);

	}

}
