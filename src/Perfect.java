package src;

import java.util.Scanner;

public class Perfect{
    public static void main (String [] args){

        Scanner input = new Scanner (System.in);

        System.out.print("Please enter the number: ");
        int numb = input.nextInt();
        System.out.println();

        System.out.print(isPrefect(numb));
    }

    public static String isPrefect(int numb){
        String a = " ";
        if (numb < 1000){
            int x;
            System.out.printf("%d = ", numb);
            for(x = 1; x < numb; x++){
                numb = numb - x;
                System.out.printf("%d + ", x);
            }
            if(numb == x){
                System.out.printf("%d. The number is perfect", x);
            }
            else{
                System.out.printf("%d. The number is not perfect", numb);
            }
        }

        else{
            System.out.print("Error");
        }
        return a;
    }
}
