/**
 * Created by Serhiy on 15.12.2015.
 */
public class Test532 {
    public static void main(String[] args) {

        double i ;
        double rate = 0.05;
        int month = 1;

        for(i = 5; i <= 10;){

            i = i * Math.pow(1 + rate , month );

            month++;
        }
        System.out.print("Month to 1000000000 is " + (month-1));
        System.out.println("");

        for(i = 5; i <= 20;){

            i = i * Math.pow(1 + rate , month );

            month++;
        }
        System.out.print("Month to 2000000000 is " + (month-1));
    }
}
