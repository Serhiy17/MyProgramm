package src;

public class ShapeTest {

    public static void main (String [] args){

        Circle circle = new Circle(2);
        Square square = new Square(2);

        System.out.println(circle.toString());
        System.out.println(square.toString());
    }
}
