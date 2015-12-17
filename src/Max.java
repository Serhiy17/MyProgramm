/**
 * Created by Serhiy on 09.12.2015.
 */

import java.util.Scanner;

public class Max {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int n = 1;
        int k = 1;
        int a = 0;
        int max = a;
        System.out.print("Please enter a: ");
        a = input.nextInt();

        do{
            if (a > max) {
                max = a;
                System.out.printf("%d.  aMax = %d\n", n, a);
                System.out.print("Please enter a: ");
                a = input.nextInt();
            } else {
                System.out.printf("%d.  aMax = %d\n", n, max);
                System.out.print("Please enter a: ");
                a = input.nextInt();
            }
            ++k;
            ++n;
        }while (k <= 10);
    }
}
