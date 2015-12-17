/**
 * Created by Serhiy on 14.12.2015.
 */
public class Test520 {

    public static void main(String[] args) {
        double x;
        double y;
        double Pi = 4;

        for (x = 3, y = 5; x < 80000001; x += 4, y += 4) {

            Pi = Pi - (4 / x) + (4 / y);

        }

        System.out.println(Pi);
    }
}
