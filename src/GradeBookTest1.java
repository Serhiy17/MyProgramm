package src;

public class GradeBookTest1 {

    public static void main(String[] args) {

        int[] gradesArray = {87, 68, 94, 100, 83, 78, 85, 91, 76, 87};

        GradeBook1 myGradeBook = new GradeBook1(
                "CS101 Introduction to Java Programming", gradesArray);

        myGradeBook.displayMessage();
        myGradeBook.processGrades();
    }
}
