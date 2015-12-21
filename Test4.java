/**
 * Created by Serhiy on 05.12.2015.

import java.util.Scanner;

public class Test4 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int number;
        int k = 1;
        int b = 1;

        System.out.print("Pleas enter the number: ");
        number = input.nextInt();

        if (number > 20){
            System.out.println("Not executable");
        }
        else {
            while (k <= number){
                if (k == 1){
                    while (b <= number) {
                        System.out.print("*");
                        System.out.print("  ");
                        ++b;
                    }
                    System.out.println("");
                }
                else {
                    if (k < number){
                        b = 1;
                        while (b <= number){
                            if (b == 1){
                                System.out.print("*");
                            }
                            else {
                                if (b <= number){
                                    while (b <= (number)){
                                        System.out.print(" ");
                                        System.out.print("  ");
                                        if (b == number){
                                            System.out.print("*");
                                        }
                                        ++b;
                                    }
                                }
                            }
                            ++b;
                        }
                        System.out.println("");
                    }
                    else{
                        b = 1;
                        while (b <= number) {
                            System.out.print("*");
                            System.out.print("  ");
                            ++b;
                        }
                    }
                }
                ++k;
            }
        }
    }
}*/
