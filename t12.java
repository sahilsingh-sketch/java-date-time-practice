/*Employee Age Calculator
Accept an employee's date of birth and calculate their exact age in years, months, and days using LocalDate and Period. */

import java.time.LocalDate;
import java.time.Period;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
class Employee{
    int id;
    String name;
    String dob;
    Employee(int id, String name,String dob){
        this.id=id;
        this.name=name;
        this.dob = dob;
    }
}
public class t12 {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         Map<Integer,Employee> mp = new HashMap<>();
         System.out.print("Enter employee Id: ");
         int id = sc.nextInt();
         sc.nextLine();
         System.out.print("Enter employee name: ");
         String name =  sc.nextLine();
         System.out.println("Enter date of birth (yyyy-mm-dd): ");
         String dob = sc.next();
         Employee e = new Employee(id, name, dob);
         mp.put(id, e);
         Employee emp = mp.get(id);
         LocalDate birthDate = LocalDate.parse(emp.dob);
         LocalDate today =LocalDate.now();

         Period age = Period.between(birthDate, today);

         System.out.println("\nEmployee ID: "+emp.id);
         System.out.println("Employee Name :"+emp.name);
         System.out.println("Date of Birth: " + birthDate);
        System.out.println("Age: " +age.getYears() +"years,"
                + age.getMonths() + " months, "
                + age.getDays() + " days" );

         sc.close();
    }
}
