/**
 * Created by Serhiy on 07.12.2015.

public class Test3pr {
    public static void main(String[] args) {
        boolean a = true;
        boolean b = false;
        boolean c = true;

        if(a == true){
            if(b == true){
                if(c==true){
                    System.out.println("1");
                }else System.out.println("2");
            }else if (a && (b=c)){
                System.out.println("3");
            }
        }else {
            System.out.println(("4"));
        }
    }
}
 */