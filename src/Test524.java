/**
 * Created by Serhiy on 14.12.2015.
 */
public class Test524 {
    public static void main(String[] args) {

        int i;
        int k;
        int j;

        for(i = 1, k = 8; i <= 9; i += 2, k -= 2){
            for(j = 1; j <= k/2; j++){
                System.out.print(" ");
            }
            for(j = 1; j <= i; j++){
                System.out.print("*");

            }
            System.out.println("");
        }
        for(i = 7, k = 3; i >= 1; i -= 2, k += 2){
            for(j = 1; j <= k/2; j++){
                System.out.print(" ");
            }
            for(j = 1; j <= i; j++){
                System.out.print("*");

            }
            System.out.println("");
        }
    }
}
