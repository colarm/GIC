package Exercises;

public class Exercise4 {
    public static void main(String[] args) {
        Student obj1 = new Student("Lucas", "Goodwin", 85.2, 2024, "Software Development", 1);
        Student obj2 = new Student("Frank", "Underwood", 82.4, 2024, "Information Technology", 2);
        obj1.incrementExpectedGraduationYear();
    }
}
