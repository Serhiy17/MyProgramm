package src;

import java.util.Scanner;

public class Power {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int base;
        int exp;

        System.out.print("Please enter the base: ");
        base = input.nextInt();
        System.out.println();

        System.out.print("Please enter the exponent: ");
        exp = input.nextInt();
        System.out.println();

        System.out.println("Power is " + integerPower(base, exp));
    }

    public static int integerPower(int base, int exp){
        int res = base;
        for(int count = 2; count <= exp; count ++){
            res *= base;
        }
        return res;
    }
}
