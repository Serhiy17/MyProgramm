package src;
import java.util.Scanner;

public class BankTest{

    public static void main(String [] args){

        Scanner input = new Scanner(System.in);

        Bank myBank = new Bank();

        System.out.print("Pleas enter the acount number: ");
        myBank.setAcNumber(input.nextInt());
        System.out.println();

        System.out.print("Pleas enter the begining balance: ");
        myBank.setBalance(input.nextInt());
        System.out.println();

        System.out.print("Pleas enter the items charged: ");
        myBank.setItems(input.nextInt());
        System.out.println();

        System.out.print("Pleas enter the credit: ");
        myBank.setCredit(input.nextInt());
        System.out.println();

        System.out.print("Pleas enter the limit: ");
        myBank.setLimit(input.nextInt());
        System.out.println();

        myBank.displayBalance();
    }
}