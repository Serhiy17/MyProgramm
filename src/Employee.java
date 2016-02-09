package src;

public class Employee {

    private String firstName;
    private String lastName;
    private Date birthDay;
    private Date hireDay;

    public Employee(String first, String last, Date dateOfBirth, Date dateOfHire){
        firstName = first;
        lastName = last;
        birthDay = dateOfBirth;
        hireDay = dateOfHire;
    }

    public String toString(){
        return String.format("%s, %s, Hire: %s Birthday: %s", lastName, firstName, hireDay, birthDay);
    }
}
