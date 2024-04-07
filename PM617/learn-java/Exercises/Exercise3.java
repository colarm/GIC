package Exercises;
// This is the template code.

public class Exercise3 {

    public static double salaryCalculator(double workTime, double salaryPerHour, int vacationDays) {
        // calculate an employee's salary,
        // given how many hours that are worked per week
        // and how much the person makes per hour
        // Your inputs should be how many hours the employee works per week
        // and how much the person makes per hour.
        // Your output will be the employee's yearly salary.
        double salary = 54 * workTime * salaryPerHour;
        salary = salary - vacationDays * 8;
        return salary;
    }

    public static void main(String[] args) {
        double salary = salaryCalculator(20, 10, 2);
        System.out.println(salary);
    }
}
