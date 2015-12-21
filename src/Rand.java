package src;

import java.util.Random;
public class Rand {
    public static void main(String[] args) {
        Random randomNumbers = new Random();

        int fase;
        for(int counts=0; counts <= 5; counts++){
        fase = 6 + randomNumbers.nextInt(5)*4;
        System.out.print(fase);
            System.out.print("  ");
        }
    }
}
