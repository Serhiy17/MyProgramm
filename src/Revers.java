package src;

import java.util.Scanner;

public class Revers {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Number is ");
        int numb = input.nextInt();
        System.out.println(revers(numb));
    }
    public static String revers(int numb){
        String a = " ";
        int res;
        while(numb > 1){
            res = numb%10;
            System.out.print(res);
            numb = numb/10;
        }
        return a;
    }
}
