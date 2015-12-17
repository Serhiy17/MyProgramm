/**
 * Created by Serhiy on 14.12.2015.
 */
public class Test527 {
    public static void main(String[] args) {
        int i;
        int j;
        int k;

        for ( i = 1; i <= 5; i++ )
        {
            for ( j = 1; j <= 3; j++ ) {
                for ( k = 1; k <= 4; k++ )
                    System.out.print( '*' );
                System.out.println();
            } // end inner for
            System.out.println();
        } // end outer for
    }
}
