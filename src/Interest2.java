/**
 * Created by Serhiy on 12.12.2015.
 */
public class Interest2 {
    public static void main(String[] args) {

        double amount;
        int amount1;
        int amount2;
        double principal = 1000.0;
        double rate = 0.05;

        System.out.printf("%s%15s\n", "Year", "5%");

        for(int year = 1; year <= 10; year++){

            amount = 100 * principal * Math.pow(1.0 + rate, year);
            amount1 = (int)amount/100;
            amount2 = (int)amount%100;
            System.out.printf("%4d%15d,%d\n", year, amount1, amount2 );
        }
    }
}
