package src;
import java.util.Scanner;

public class Floor {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double x;
        double y;
        System.out.print("Please enter the number x: ");
        x = input.nextDouble();

        y = Math.floor(x + 0.5);

        System.out.println("y = " + y);
        System.out.println("y = " + (x+0.5));

    }
}
