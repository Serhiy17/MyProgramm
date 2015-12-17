/**
 * Created by Serhiy on 12.12.2015.
 */
public class Test5154{
    public static void main (String[] args){
        int i;
        int j;
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
    }
}
