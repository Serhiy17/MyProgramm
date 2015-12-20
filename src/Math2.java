package src;

/**
 * Created by Serhiy on 20.12.2015.
 */
public class Math2 {
    public static void main(String[] args) {

        System.out.println("Math abs is " + Math.abs(7.5));
        System.out.println("Math floor is " + Math.floor(7.5));
        System.out.println("Math abs is " + Math.abs(0.0));
        System.out.println("Math ceil is " + Math.ceil(0.0));
        System.out.println("Math abs is " + Math.abs(-6.4));
        System.out.println("Math abs is " + Math.ceil(-6.4));
        System.out.println("Math abs is " + Math.ceil(-Math.abs(-8 + Math.floor(-5.5))));
    }
}
