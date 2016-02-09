package src;

public class RectangularTest {

    public static void main (String [] args){

        Rectangular r1 = new Rectangular();
        Rectangular r3 = new Rectangular( 15, 12 );

        System.out.printf("Perimeter of r1 is: %s\n", r1.toString());
        System.out.printf("Perimeter of r3 is: %s\n", r3.toString());

        try{
            Rectangular r2 = new Rectangular( 25 );
        }
        catch (IllegalArgumentException e){
            System.out.printf( "\nException while initializing r2: %s\n",
                    e.getMessage() );
        }

        try{
            Rectangular r4 = new Rectangular( 19, 25 );
        }
        catch (IllegalArgumentException e){
            System.out.printf( "\nException while initializing r4: %s\n",
                    e.getMessage() );
        }
    }
}
