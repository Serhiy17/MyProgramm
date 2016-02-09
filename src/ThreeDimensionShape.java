package src;

public abstract class ThreeDimensionShape extends Shape{

    public ThreeDimensionShape(double dim){
        super(dim);
    }

    @Override
    public String toString(){
        return String.format("%s",super.getDim());
    }

    public abstract double getVolume();
}