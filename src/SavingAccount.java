package src;

public class SavingAccount {

    private int deposit;
    private static int annualInterestRate;
    private int savingBalanse = 0;

    int [] Month = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};

    public void setDeposit(int d){
        this.deposit = d;
    }

    public void calculateInterestRate(){

        for (int i = 1; i <= Month.length; i++){

            int k = (deposit/100)*annualInterestRate/12;

            savingBalanse = deposit + (k*i);

            System.out.printf("%d%8d", Month[i], savingBalanse);
            System.out.println();
        }
    }
}
