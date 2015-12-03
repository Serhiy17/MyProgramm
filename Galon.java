import java.util Scanner;

public class Galon{

	public static void main (String [] args){

		Scanner input = new Scanner (System.in);

		int galon;
		int miles;
		double result;

		System.out.print("Enter please the quantity of galons or -1");
		galon = input.nextInt();

		System.out.print("Enter please the quantity of miles");
		miles = input.nextInt();
		
		while(galon != -1){

			result = (double)miles/galon;

			System.out.printf("Result is: %d.2f", result);

			System.out.print("Enter please the quantity of galons or -1");
			galon = input.nextInt();

			System.out.print("Enter please the quantity of miles");
			miles = input.nextInt();

		}
	}
}