package src;

import java.util.Scanner;

public class Temperature {
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);

        int M;
        System.out.print("Enter the method 1 or 2: ");
        M = input.nextInt();
        System.out.println("");
        System.out.print("Enter the temperature: ");
        double temp = input.nextInt();
        System.out.println("");
        if (M == 1){
            System.out.printf("Temperature is %.2f degree of celsius", celsius(temp));
        }
        else{
            System.out.printf("Temperature is %.2f degree of fahrenheit", fahrenheit(temp));
        }
    }

    public static double celsius (double temp){
        double celsius = 5.0 / 9.0*(temp - 32);
        return celsius;
    }
    public static double fahrenheit (double temp){
        double fahrenheit = 9.0 / 5.0 * temp + 32;
        return fahrenheit;
    }
}
