package src;

public class Rectangular {
    private int lenght;
    private int width;

    public Rectangular(){
        this(1, 1);
    }

    public Rectangular(int l){
        this(l, 1);
    }

    public Rectangular(int l, int w){
        setRectangle(l, w);
    }

    public void setRectangle(int l, int w){
        setLength(l);
        setWidth(w);
    }

    public void setLength(int l){
        if ( l >= 0 && l < 20 )
            lenght = l;
        else
            throw new IllegalArgumentException( "lenght must be 0-20" );
    }
    public void setWidth(int w){
        if ( w >= 0 && w < 20 )
            width = w;
        else
            throw new IllegalArgumentException( "width must be 0-20" );
    }

    public int getLenght(){
        return lenght;
    }

    public int getWidth(){
        return width;
    }

    public String toString(){
        return String.format("Perimeter is %s", 2*getLenght() + 2*getWidth());
    }
}
