import java.util.Scanner;

public class Test516{
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int a;
        int b;
        int c;
        int d;
        int e;
        int i;

        System.out.print("Please enter a: ");
        a = input.nextInt();

        System.out.print("Please enter b: ");
        b = input.nextInt();

        System.out.print("Please enter c: ");
        c = input.nextInt();

        System.out.print("Please enter d: ");
        d = input.nextInt();

        System.out.print("Please enter e: ");
        e = input.nextInt();

        if (a <= 30){
            for(i = 1; i <= a; i++){
            System.out.print("*");
        }
        System.out.println("");
        }

        if (b <= 30){
            for(i = 1; i <= b; i++){
                System.out.print("*");
            }
        System.out.println("");
        }

        if (c <= 30){
            for(i = 1; i <= c; i++){
                System.out.print("*");
            }
        System.out.println("");
        }

        if (d <= 30){
            for(i = 1; i <= d; i++){
                System.out.print("*");
            }
        System.out.println("");
        }

        if (e <= 30){
            for(i = 1; i <= e; i++){
                System.out.print("*");
            }
        System.out.println("");
        }
    }
}
