/**
 * Created by Serhiy on 07.12.2015.

import java.util.Scanner;

public class Factorial{

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        int x;
        int factorial = 1;

        System.out.print("Please enter the x: ");
        x = input.nextInt();

        while (x > 0){

            factorial = factorial*x;

            --x;
        }

        System.out.print("Factorial is " + factorial);
    }
}
 */