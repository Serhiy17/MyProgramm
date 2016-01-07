package src;

import java.util.Scanner;
import java.util.Arrays;

public class Test790{
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);

        int[][]arr = new int [2][3];
        arr[0][0] = 0;
        arr[0][1] = 0;
        arr[0][2] = 0;
        arr[1][0] = 0;
        arr[1][1] = 0;
        arr[1][2] = 0;

        for(int row = 0; row < arr.length; row++){
            for (int column = 0; column < arr[row].length; column++){
                System.out.printf("%d  ", arr[row][column]);
            }
            System.out.println();
        }
        System.out.println();

        for(int row = 0; row < arr.length; row++){
            for (int column = 0; column < arr[row].length; column++){
                arr[row][column] = 1;
                System.out.printf("%d  ", arr[row][column]);
            }
            System.out.println();
        }
        for(int row = 0; row < arr.length; row++){
            for (int column = 0; column < arr[row].length; column++){
                arr[row][column]=input.nextInt();
            }
        }
        for(int row = 0; row < arr.length; row++){
            for (int column = 0; column < arr[row].length; column++){
                System.out.printf("%d  ", arr[row][column]);
            }
            System.out.println();
        }
        int low = arr[0][0];
        for ( int[] a : arr ){
            for ( int x : a ){
                if ( x < low )
                    low = x;
            }
        }
        System.out.printf("Low is %d\n", low);
        System.out.printf("%d%3d%3d\n", arr[0][0],arr[0][1],arr[0][2]);
        int total = arr[0][2]+arr[1][2];
        System.out.printf("Total is %d\n", total);

        System.out.print("n/n");
        for(int row = 0; row < 1; row++){
            for(int column = 0; column < arr[row].length; column++){
        System.out.printf("   %d", column);
            }
        }
        System.out.println();

        for(int row1 = 0; row1 < arr.length; row1++){
            System.out.printf(" %d   ", row1);
            for (int column = 0; column < arr[row1].length; column++){
                System.out.printf(" %d  ", arr[row1][column]);
            }
            System.out.println();
        }
    }
}
