package src;
public class Test10pr {
    public static void main(String[] args) {

        int k = 0;
        int s = 0;
        switch (k){
        case 0: {
            k += 2;
            s += k;
        }
        case 1: {
            k += 2;
            s += k;
        }
    }
    System.out.println("s = " + s);
    }
}
