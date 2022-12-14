import java.util.Scanner;

public class UC4_EmployeeAttendence {
    public static void main(String[] args) {
        int wageperhour = 20;
        int fulltimehours = 8;
        int parttimehours = 4;
        Scanner myinput = new Scanner(System.in);
        System.out.println("Enter 1 for fulltimewage else Enter 2 for partimewage calculation");
        int data = myinput.nextInt();
        switch(data){
            case 1:
                int dailywage;
                dailywage = wageperhour * fulltimehours;
                System.out.println("daily wage of fulltime working Employee is " + dailywage);
                break;
            case 2:
                int partimewage;
                partimewage= wageperhour * parttimehours;
                System.out.println("Daily wage of partime working Employee is " + partimewage);
                break;
            default:
                System.out.println("hi");
        }
    }

}
