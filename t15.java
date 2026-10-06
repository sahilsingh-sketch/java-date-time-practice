/*
Project Deadline Calculator
Given a project start date and the number of weeks allocated to the project, 
calculate the project deadline using LocalDate and display the remaining days between the current date and the deadline.
 */

import java.util.Scanner;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
public class t15 {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        System.out.println("Enter project start date (yyyy-MM-dd): ");
        LocalDate start = LocalDate.parse(sc.next());
        System.out.println("Enter allocated weeks:  ");
        int weeks =sc.nextInt();

        LocalDate deadline = start.plusWeeks(weeks);

        System.out.println("Project Deadline: " +deadline);

        long remainingDays  = ChronoUnit.DAYS.between(LocalDate.now(), deadline);

        System.out.println("Total Days Remaining : "
            +remainingDays +" Days"
        );
        sc.close();
    }
}
