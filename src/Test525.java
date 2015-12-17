/**
 * Created by Serhiy on 14.12.2015.
 */
import java.util.Scanner;

public class Test525 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Please enter a: ");
        int a = input.nextInt();

        int i;
        int k;
        int j;

        if (a <= 19) {
            for (i = 1, k = a - 1; i <= a; i += 2, k -= 2) {
                for (j = 1; j <= k / 2; j++) {
                    System.out.print(" ");
                }
                for (j = 1; j <= i; j++) {
                    System.out.print("*");

                }
                System.out.println("");
            }
            for (i = a - 2, k = 3; i >= 1; i -= 2, k += 2) {
                for (j = 1; j <= k / 2; j++) {
                System.out.print(" ");
                }
                for (j = 1; j <= i; j++) {
                System.out.print("*");

                }
                System.out.println("");
            }
        }
        else System.out.println("Error");
    }
}
