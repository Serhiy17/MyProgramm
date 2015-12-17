/**
 * Created by Serhiy on 12.12.2015.
 */
public class Interest {
    public static void main(String[] args) {

        double amount;
        double principal = 1000.0;

        System.out.printf("%s%15s%15s%15s%15s%15s%15s\n", "Year", "5%", "6%", "7%", "8%", "9%", "10%");

        for(int year = 1; year <= 10; year++){

            System.out.printf("%4d", year);

            double rate = 0.05;

            while (rate <= 0.1){

                amount = principal * Math.pow(1.0 + rate, year);

                System.out.printf("%15.2f", amount);

                rate += 0.01;

            }

            System.out.println("");

        }
    }
}
