package src;

public class Salespeople {
    public static void main(String[] args) {

        int[]sales = {1333,1230,1326,523,1875,1365,758,914,525,320};
        int[]selery = new int[sales.length];
        for(int count = 0, count1 = 0; count < sales.length; count++, count1++) {
            selery[count1] = 200 + ((sales[count] / 100) * 9);
        }

        System.out.printf("%12s%13s\n", "Sales", "Salary");
        for (int counter = 1; counter < sales.length; counter++){
            if(counter == 9){
                System.out.printf("\n%s", "1000 and more");
            }
            else{
                System.out.printf("\n%9d-%2d",
                        counter * 100 + 100, counter * 100 + 199);
            }
            for(int sale = 0; sale < sales.length; sale++){
                if (sales[sale]/100 == counter+1){
                    System.out.printf("%8d", selery[sale]);
                }
            }
        }
    }
}
