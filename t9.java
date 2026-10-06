/*Employee Joining Date Analysis
Create a program that stores an employee's joining date using LocalDate and calculates the employee's total years, months, and days of service using Period.*/
import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Employee{
    String name;
    LocalDate joiningDate;

    Employee(String name, LocalDate joiningDate){
        this.name=name;
        this.joiningDate=joiningDate;
    }
}
public class t9{
 public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        List<Employee> lst = new ArrayList<>();
        System.out.print("Enter number of Employees: ");
        int n = sc.nextInt();
        sc.nextLine();

        for(int i=0;i<n;i++){
            System.out.println("\nEmployee " +(i+1));
            System.out.print("Enter Employee name: ");
            String name = sc.nextLine();
            System.out.print("Enter joining date (yyyy-mm-dd): ");
            LocalDate joiningDate = LocalDate.parse(sc.nextLine());

            lst.add(new Employee(name, joiningDate));
        }
        LocalDate today = LocalDate.now();

        System.out.println("\n--Employee Service Analysis--");

        for(Employee emp : lst){
            Period service = Period.between(emp.joiningDate, today);

            System.out.println("\nEmployee Name: " +emp.name);
            System.out.println("Joining Date: " +emp.joiningDate);
            System.out.println("Service: "
                +service.getYears() +" years "
                +service.getMonths() +" months, "
                +service.getDays() +" days"

            );
        }
        sc.close();
 }
}