package src;

public class Square extends TowDimensionShape{

    public Square (double dim){
        super(dim);
    }

    @Override
    public double getArea(){
        return getDim()*getDim();
    }

    @Override
    public String toString(){
        return String.format("Side of square is %s\n Area of Square is %s", super.toString(), getArea());
    }
}