/**package src;
import java.util.Random;

public class CoinnTossing {

    public static final Random randomNumbers = new Random();

    private enum Status {CONTINUE, WON, LOST};

    private static final int HEADS= 1;
    private static final int TAILS = 2;

    public static void main(String[] args) {

        Status gameStatus;

        int sumOfCoin = rollCoin();

        switch (sumOfCoin){
            case HEADS:
                gameStatus = Status.WON;
                break;
            case TAILS:
                gameStatus = Status.LOST;
                break;
            default:
                gameStatus = Status.CONTINUE;
        }
    }
    public static int rollCoin(){
        int a = 1 + randomNumbers.nextInt(2);
        return a;
    }
}*/
