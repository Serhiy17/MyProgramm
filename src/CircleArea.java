package src;
import java.util.Scanner;
public class CircleArea{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Please enter the radius of circle: ");
        double r = input.nextDouble();
        System.out.println("");

        System.out.printf("Area is %.2f", circleArea(r));
    }


    public static double circleArea(double r){

        double res = Math.PI*Math.pow(r,2);

        return res;
    }
}