package src;

public class GradeBook1 {

    private String courseName;
    private int[] grades;

    public GradeBook1(String name, int [] gradesAray){
        courseName = name;
        grades = gradesAray;
    }

    public void setCourseName(String name){
        courseName = name;
    }

    public String getCourseName(){
        return courseName;
    }
    public void displayMessage(){
        System.out.printf("Welcome to the GradeBook for \n%s!\n\n",
                getCourseName());
    }
    public void processGrades(){
        outputGrades();

        System.out.printf("\nClass average is %.2f\n", getAverage());
        System.out.printf("Lowest grade is %d\nHighest grade is %d\n\n",
                getMinimum(), getMaximum());
        outputBarChart();
    }

    public  int getMinimum(){

        int LowGrade = grades [0];

        for (int grade : grades){
            if (grade < LowGrade)
                LowGrade = grade;
        }
        return LowGrade;
    }

    public  int getMaximum(){

        int highGrade = grades [0];

        for (int grade : grades){
            if (grade > highGrade)
                highGrade = grade;
        }
        return highGrade;
    }

    public double getAverage(){
        int total = 0;

        for (int grade : grades)
            total += grade;

        return (double) total/grades.length;
    }

    public void outputBarChart(){

        System.out.println("Grade distribution: ");

        int [] frequency = new int[11];

        for (int grade : grades){
            ++frequency[grade / 10];
        }

        for (int count = 0; count < frequency.length; count++){

            if (count == 10)
                System.out.printf("%5d: ", 100);
            else
                System.out.printf("%02d-%02d: ", count * 10, count * 10 + 9);
            for (int stars = 0; stars < frequency[count]; stars++)
                System.out.print("*");

            System.out.println();
        }
    }
    public void outputGrades(){
        System.out.println("The grades sre:\n");
        for (int student = 0; student < grades.length; student++)
            System.out.printf("Student %2d: %3d\n", student + 1, grades[student]);
    }
}
