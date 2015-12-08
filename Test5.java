/**
 * Created by Serhiy on 06.12.2015.
 */
public class Test5 {

    public static void main(String[] args) {

        int a = 1;
        int b;

        while (a <= 8) {

            if(a%2 == 1){
                b = 1;
                while (b <= 8){

                    System.out.print("*");
                    System.out.print(" ");
                    ++b;
                }
                System.out.println();
            }
            else{
                b = 1;
                while (b <= 8){

                    System.out.print(" ");
                    System.out.print("*");
                    ++b;
                }
                System.out.println();
            }
            ++a;
        }
    }
}
