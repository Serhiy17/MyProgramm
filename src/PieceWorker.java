package src;

public class PieceWorker extends Employee1{

    private int wage;
    private int piece;

    public PieceWorker(String first, String last, String ssn, int month, int day, int year, int wage, int piece){
        super(first, last, ssn, month, day, year);
        this.wage = wage;
        this.piece = piece;
    }

    public void setWage(int wage){
        this.wage = wage;
    }

    public int getWage(){
        return wage;
    }

    public void setPiece(int piece){
        this.piece = piece;
    }

    public int getPiece(){
        return piece;
    }

    @Override
    public double earnings(){
        return wage * piece;
    }

    @Override

    public String toString(){
        return String.format("piece worker: %s\n%s: $%,.2f",
                super.toString(), "piece worker", earnings());
    }
}
