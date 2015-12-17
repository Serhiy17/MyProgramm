/**
 * Created by Serhiy on 15.12.2015.
 */
public class Test522 {
    public static void main (String[] args){
        int i;
        int j;
        for(i = 1; i<=10; i++){
            for(j = 1; j <= i; j++){
                System.out.print("*");
            }
            System.out.println("");
        }

        for(i = 10; i>=1; i--){
            for(j = 1; j <= i; j++){
                System.out.print("*");
            }
            System.out.println("");
        }

        int k;
        for(i = 10, k = 10; i >= 1; i--, k -= 1){
            for(j = 1; j <= 10 - k; j++){
                System.out.print(" ");
            }
            for(j = 1; j <= k; j++){
                System.out.print("*");
            }
            System.out.println("");
        }


        for(i = 1, k = 1; i<=10; i++, k += 1){
            for(j = 1; j <= 10 - k; j++){
                System.out.print(" ");
            }
            for(j = 1; j <= k; j++){
                System.out.print("*");
            }
            System.out.println("");
        }





    }
}
