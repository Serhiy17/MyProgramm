/**
 * Created by Serhiy on 04.12.2015.
 */
public class Bank{

    private int acNumber;
    private int balance;
    private int items;
    private int credit;
    private int limit;

    public void setAcNumber(int acNumber){
        this.acNumber = acNumber;
    }

    public int getAcNumber(){
        return acNumber;
    }

    public void setBalance(int balance){
        this.balance = balance;
    }

    public int getBalance(){
        return balance;
    }

    public void setItems(int items){
        this.items = items;
    }

    public int getItems(){
        return items;
    }

    public void setCredit(int credit){
        this.credit = credit;
    }

    public int getCredit(){
        return credit;
    }

    public void setLimit(int limit){
        this.limit = limit;
    }

    public int getLimit(){
        return limit;
    }

    public void displayBalance(){

        if (balance <= 0){
            System.out.println("Balance is dont exist");
        }
        if (credit > limit){
            System.out.printf("%d) Credit limit exceeded. Balance = %d + %d\n",acNumber, balance, items);
            balance = balance + items;
            System.out.println("Balance is " + balance);
        }
        else{
            System.out.printf("%d) Balance = %d + %d - %d\n",acNumber, balance, items, credit);
            balance = balance + items - credit;
            System.out.println("Balance is " + balance);
        }

    }

}