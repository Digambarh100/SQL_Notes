package scannercode;
import java.util.Scanner;
public class Conversion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		double kilometers;
		System.out.println("Please enter the kilometers");
		Scanner in = new Scanner(System.in);
		kilometers = in.nextDouble();
		double miles = kilometers / 1.609;
		System.out.println(miles + " miles");
		}
		}
	


