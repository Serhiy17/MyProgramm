package src;

public class SalariedEmployee extends Employee1{

    private double weeklySalary;

    public SalariedEmployee(String first, String last, String ssn, int month, int day, int year, double salary) {
        super(first, last, ssn, month, day,year);
        setWeeklySalary(salary);
    }

    public void setWeeklySalary(double salary){
        if (salary >= 0.0)
            weeklySalary = salary;
        else
            throw new IllegalArgumentException(
                    "Weekly salary must be >= 0.0");
    }

    public double getWeeklySalary(){
        return weeklySalary;
    }

    @Override
    public double earnings() {
        return getWeeklySalary();
    }

    @Override
    public String toString(){
        return String.format("salaryed employee: %s\n%s: $%,.2f",
                super.toString(), "weekly salary", getWeeklySalary());
    }
}