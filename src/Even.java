package src;

import java.util.Scanner;

public class Even {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Please enter the number: ");
        int number = input.nextInt();
        System.out.print(" ");

        System.out.println("Result is: " + isEven(number));
    }

    public static boolean isEven(int number){
        if(number%2 == 0){
            return true;
        }
        else
            return false;
    }
}
