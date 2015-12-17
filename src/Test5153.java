/**
 * Created by Serhiy on 12.12.2015.
 */
public class Test5153{
    public static void main (String[] args){
        int i;
        int j;
        int k;
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
