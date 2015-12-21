package src;
import java.util.Scanner;

public class Parking {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String name;
        double time1;
        double time2;

        System.out.print("Please enter te customer names: ");
        name = input.nextLine();
        System.out.println();

        System.out.print("Please enter the time when  car is come to parking ");
        time1 = input.nextDouble();
        System.out.println();

        System.out.print("Please enter the now time ");
        time2 = input.nextDouble();
        System.out.println();

        System.out.printf("%s must pay %.2f dollars for parking",
                name, calculateCharges(time1, time2));

    }

    public  static double calculateCharges(double time1, double time2){

        double res1;
        double res;

        res1 = 2 + (((24 - time1)+time2)-3)*0.5;

        if(res1 < 2){
            res = 2;
        }
        else{
            if (res1 >= 10){
                res = 10;
            }
            else{
                res = res1;
            }
        }

        return res;
    }
}
