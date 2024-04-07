package Exercises;

public class Student {

    String firstName;
    String lastName;
    double averageScore;
    int expectedYearToGraduate;
    String major;
    int behaviourNumber;

    public Student(
            String firstName,
            String lastName,
            double averageScore,
            int expectedYearToGraduate,
            String major,
            int behaviourNumber
    ) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.averageScore = averageScore;
        this.expectedYearToGraduate = expectedYearToGraduate;
        this.major = major;
        this.behaviourNumber = behaviourNumber;
    }
    
    public int incrementExpectedGraduationYear() {
        int ret = expectedYearToGraduate + behaviourNumber;
        System.out.println(ret);
        return ret;
    }
}