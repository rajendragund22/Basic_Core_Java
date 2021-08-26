package basicPrograms;
import java.util.Scanner;
public class OddOrEven {

	public static void main(String[] args) {
		 int num;
		 System.out.println("Enter the value ");
		 Scanner sc = new Scanner(System.in);
		 num=sc.nextInt();
		 sc.close();
		 if (num%2==0) {
			 System.out.println("Entered number is Even");
		 }
		 else {
			 System.out.println("Entered number is Odd");
		 }
	}

}
