package src;
import  java.util.Scanner;
import  java.util.Random;
public class HowMuch {
    public static void main(String[] args) {
        int write = 0;
        int wrong = 0;
        for(int count = 1; count <= 10; count++){
            Scanner input = new Scanner(System.in);
            Random randomNumbers = new Random();
            int number1 = 1 + randomNumbers.nextInt(10);
            int number2 = 1 + randomNumbers.nextInt(10);
            System.out.printf("How much is %d times %d = ", number1, number2);
            int res = input.nextInt();
            int trueSum = number1 * number2;
            if (res == trueSum){
                int n1 = 1 + randomNumbers.nextInt(4);
                switch(n1){
                    case 1:
                        System.out.println("Very good!");
                        break;
                    case 2:
                        System.out.println("Excellent!");
                        break;
                    case 3:
                        System.out.println("Nice work!");
                        break;
                    case 4:
                        System.out.println("Keep up the good work!");
                        break;
                }
                write++;
            }
            else{
                int n2 = 1 + randomNumbers.nextInt(4);
                switch(n2){
                    case 1:
                        System.out.println("No. Please try again");
                        break;
                    case 2:
                        System.out.println("Wrong. Try once more");
                        break;
                    case 3:
                        System.out.println("Don't give up!");
                        break;
                    case 4:
                        System.out.println("No. Keep trying.");
                        break;
                }
                wrong++;
            }
        }
        if ((write/wrong) > 3){
            System.out.println("Congratulations, you are ready to go to the next value.");
        }
        else {
            System.out.println("Please ask you teacher for extra help.");
        }
    }
}
