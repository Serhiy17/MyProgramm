package src;

public abstract class Shape{

    private double dimension;

    public Shape(double dim){
        setDim(dim);
    }

    public void setDim(double dim){
        if (dim > 0.0)
            dimension = dim;
        else
            throw new IllegalArgumentException(
                    "Dimension must be > 0.0");
    }

    public double getDim(){
        return dimension;
    }

    @Override
    public String toString(){
        return String.format("%s",getDim());
    }
}
