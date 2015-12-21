package src;

import java.util.Scanner;

public class Multiple {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Please enter first integer: ");
        int firstInt = input.nextInt();
        System.out.print(" ");

        System.out.print("Please enter second integer: ");
        int secondInt = input.nextInt();
        System.out.print(" ");

        System.out.println("Result is: " + isMultiple(firstInt, secondInt));
    }

    public static boolean isMultiple(int firstInt, int secondInt){
        if(firstInt%secondInt == 0){
            return true;
        }
        else
            return false;
    }
}
