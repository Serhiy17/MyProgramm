package src;

public class GradeBookTest2 {
    public static void main(String[] args) {

        int[][] gradesArray ={ {87, 96, 70},
        {68, 87, 90},
        {53, 86, 80},
        {100, 92, 61},
        {87, 85, 89},
        {73, 65, 69},
        {68, 88, 99},
        {51, 51, 51},
        {63, 75, 84},
        {92, 89, 90}};

        GradeBook2 myGradeBook = new GradeBook2(
                "CS101 Introduction to Java Programming", gradesArray);

        myGradeBook.displayMessage();
        myGradeBook.processGrades();
    }
}
