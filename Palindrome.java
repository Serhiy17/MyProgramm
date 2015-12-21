/**
 * Created by Serhiy on 06.12.2015.

import java.util.Scanner;

public class Palindrome {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        Palind myPalind = new Palind();

        System.out.print("Pleas enter the value: ");
        myPalind.setValue(input.nextInt());
        System.out.println();

        System.out.println(myPalind.getValue());
        System.out.println(myPalind.getResult());

        if(myPalind.getValue() == myPalind.getResult()){
            System.out.println("This two values is palindromes");
        }
        else{
            System.out.println("This two values is not palindromes");
        }

    }

}*/


