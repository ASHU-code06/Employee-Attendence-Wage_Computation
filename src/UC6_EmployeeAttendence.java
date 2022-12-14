import java.util.Random;

public class UC6_EmployeeAttendence {
    public static void main(String[] args) {
        int r;
        Random ran = new Random();
        r = ran.nextInt(2);
        System.out.println("random numbers are   " + r);
        if (r == 0) {
            System.out.println("Employee is absent");
        }

        if (r == 1)
        {
            System.out.println("Employee is present");

            int wageperhour = 20;
            int fulltimehours = 8;
            int parttimehours = 4;
            int wageperday= wageperhour * fulltimehours;
            //Calculation of wage per day of employee.
            System.out.println("daily wage of fulltime working Employee is " +wageperday);
            //Calculation of wages till a condition of total working hours(or days) is reached for a month.
            //here assume 100hours(or 20 days).
            int monthlyworkingdays = 20;
            int totalwage = wageperday * monthlyworkingdays;
            System.out.println("totalwage of Employee for 20days is      " + totalwage);
        }
    }
}

