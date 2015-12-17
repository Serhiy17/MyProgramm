/**
 * Created by Serhiy on 06.12.2015.
 */
public class Palind {

    private int value;
    private int result;


    public void setValue(int value){
        this.value = value;
    }

    public int getValue(){
        return value;
    }

    public int getResult(){
        int result = 0;
        while (value > 0) {
            result = result * 10 + value % 10;
            value /= 10;
        }
        return result;
    }

}
