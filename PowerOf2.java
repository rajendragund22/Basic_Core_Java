package basicPrograms;
import java.util.Scanner;
public class PowerOf2 {

	public static void main(String[] args) {
		System.out.println("Enter the power of 2 : ");
		Scanner sc = new Scanner(System.in);
		int num = 2;
		int power;
		power = sc.nextInt();
		sc.close();

		System.out.println(Math.pow(num, power));

	}

}
