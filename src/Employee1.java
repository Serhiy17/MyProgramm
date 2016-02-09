package src;

public abstract class Employee1 {

    private String firstName;
    private String lastName;
    private String socialSecurityNumber;
    private Date Date;

    public Employee1 (String first, String last, String ssn, int month, int day, int year){
        firstName = first;
        lastName = last;
        socialSecurityNumber = ssn;
        Date = new Date (month, day, year);
    }

    public void setFirstName (String first){
        firstName = first;
    }

    public String getFirstName(){
        return firstName;
    }

    public void setLastName (String last){
        lastName = last;
    }

    public String getLastName(){
        return lastName;
    }

    public void setSocialSecurityNumber (String ssn){
        socialSecurityNumber = ssn;
    }

    public String getSocialSecurityNumber(){
        return socialSecurityNumber;
    }

    public void setDate(int month){
        month = Date.getMonth();
    }

    public int getDate(){
        return Date.getMonth();
    }

    @Override
    public String toString(){
        return String.format("%s %s\nsocial security number: %s\n date of birth: %s",
                getFirstName(),getLastName(),getSocialSecurityNumber(), Date.toString());
    }
    public abstract double earnings();

}
