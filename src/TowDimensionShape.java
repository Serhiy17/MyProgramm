package src;

public abstract class TowDimensionShape extends Shape{

    public TowDimensionShape(double dim){

        super(dim);
    }

    @Override
    public String toString(){
        return String.format("%s",super.getDim());
    }

    public abstract double getArea();

}