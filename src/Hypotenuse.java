package src;

import java.util.Scanner;

public class Hypotenuse {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Please enter value of side 1: ");
        double side1 = input.nextDouble();
        System.out.print(" ");

        System.out.print("Please enter value of side 2: ");
        double side2 = input.nextDouble();
        System.out.print(" ");

        System.out.print("Hypotenuse is " + hypotenuse(side1, side2));
    }

    public static double hypotenuse(double side1, double side2){

        double hyp = Math.sqrt((Math.pow(side1, 2)) + (Math.pow(side2, 2)));
        return hyp;
    }
}
