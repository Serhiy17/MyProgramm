/**
 * Created by Serhiy on 07.12.2015.
 */
import java.util.Scanner;

public class Factorial1{

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        int x;
        int factorial = 1;
        int res = 1;

        System.out.print("Please enter the x: ");
        x = input.nextInt();

        while (x > 0){

            int p = x;

            while (p > 0){

                factorial = factorial*p;

                --p;
            }
            res = (res + (1/factorial));
                    --x;

        }

        System.out.print("Res is " + res);
    }
}