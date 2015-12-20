package src;

import java.util.Scanner;

public class Rounging {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double x;

        System.out.print("Please enter x: ");
        x = input.nextDouble();

        System.out.printf("%f\n%f\n%f\n%f", roundToInteger(x), roundToTenths(x),
                roundToHundredths(x), roundToThousandths(x));
    }
    public static double roundToInteger(double x){

        double y = Math.floor(x + 0.5);
        return y;
    }
    public static double roundToTenths(double x){

        double y = Math.floor(x * 10 + 0.5)/10;
        return y;
    }
    public static double roundToHundredths(double x){

        double y = Math.floor(x * 100 + 0.5)/100;
        return y;
    }
    public static double roundToThousandths(double x){

        double y = Math.floor(x * 1000 + 0.5)/1000;
        return y;
    }
}
