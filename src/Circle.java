package src;

public class Circle extends TowDimensionShape{

    public Circle (double dim){
        super(dim);
    }

    @Override
    public double getArea(){
        return Math.PI*getDim()*getDim();
    }

    @Override
    public String toString(){
        return String.format("Radius is %s\n Area of circle is %,.2f", super.toString(), getArea());
    }
}
