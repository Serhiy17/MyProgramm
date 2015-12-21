package src;

import java.util.Scanner;

public class Display {
    public static void main (String[] args){

        Scanner input = new Scanner(System.in);

        System.out.print("Please enter a: ");
        int a = input.nextInt();
        System.out.println();

        System.out.print("Please enter b: ");
        int b = input.nextInt();
        System.out.println();

        System.out.print("|a/b| is " + deviding(a, b));
        System.out.println();
        System.out.print("|a%b| is " + reminding(a, b));
        System.out.println();
        System.out.print(displayDigits(a));
    }

    public static int deviding(int a, int b){

        int res = a/b;

        return res;
    }

    public static int reminding(int a, int b){

        int res1 = a%b;

        return res1;
    }

    public static String displayDigits(int a){

        String c = "";
        for(int count = 10000; count >= 1; count /= 10 ){
            int res2 = a/count;
            if (res2 < 1){
                System.out.print("");
            }
            else {
                System.out.print(res2);
                System.out.print("  ");
            }
            a = a % count;
        }
        return c;
    }
}
