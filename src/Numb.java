package src;
import java.util.Scanner;
import java.lang.String;
public class Numb{
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Please enter the number: ");
        int number = input.nextInt();
        System.out.println("");

        System.out.print(squareOfAsterisks(number));
    }


    public static String squareOfAsterisks(int number){
        String a = "*";
        String b = " ";
        for(int count = 1; count <= number; count++){
            for(int i = 1;i <= number; i++){
                System.out.print(a);
            }
            System.out.println();
        }
        return b;
    }
}
