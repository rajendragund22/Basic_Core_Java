package basicPrograms;
import java.util.Scanner;
public class Harmonic {

	public static void main(String[] args) {
		double harmonic = 0;
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter number to find harmonic value:");
		int num = scanner.nextInt();
		scanner.close();

		for (int i = 1; i <= num; i++) {
			harmonic += (double) 1 / i;
			System.out.println(" Harmonic " + i + ": " + harmonic);
		}

	}

}
