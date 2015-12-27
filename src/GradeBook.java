package src;
import java.util.Scanner;

public class GradeBook {

    private String courseName;

    private int total;
    private int grateCounter;
    private int aCounte;
    private int bCounte;
    private int cCounte;
    private int dCounte;
    private int fCounte;

    public GradeBook(String name){
        courseName = name;
    }

    public void setCourseName (String name){
        this.courseName = name;
    }

    public String getCourseName(){
        return courseName;
    }

    public void displayMessage(){
        System.out.printf("Welcome to the GradeBook for \n%s!\n\n", getCourseName());
    }


    public void inputGrades(){

        Scanner input = new Scanner(System.in);

        int grade;

        System.out.printf("%s\n%s\n  %s\n  %s\n",
                "Enter the integer grades in the range 0-100/",
                "Type the end-of-file indicator to terminate input:",
                "On UNIX/Linux/Mac OS X type <Ctrl>d then press Enter",
                "on Windows type <Ctrl>z then press Enter");

        while (input.hasNext()){

            grade = input.nextInt();
            total += grade;
            ++grateCounter;

            incrementLetterGradeCounter(grade);
        }

    }
    private void incrementLetterGradeCounter (int grade){

        switch (grade/10)
        {
            case 9:
            case 10:
                ++aCounte;
                break;
            case 8:
                ++bCounte;
                break;
            case 7:
                ++cCounte;
                break;
            case 6:
                ++dCounte;
                break;
            default:
                ++fCounte;
        }
    }

    public void displayGradeReport(){

        System.out.println("\nGradeReport: ");

        if (grateCounter != 0){

            double average = (double)total/grateCounter;

            System.out.printf("Total of the %d grades entered is %d\n", grateCounter, total);
            System.out.printf("Class average is %.2f\n", average);
            System.out.printf("%s\n%s%d\n%s%d\n%s%d\n%s%d\n%s%d\n",
                    "Number of students who received each grade: ",
                    "A: ", aCounte,
                    "B: ", bCounte,
                    "C: ", cCounte,
                    "D: ", dCounte,
                    "F: ", fCounte);

        }
        else
            System.out.println("No grades were entered");
    }
}
