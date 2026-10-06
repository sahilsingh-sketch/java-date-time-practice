
/*Student Exam Schedule
Given an examination date, use LocalDate to display the day of the week, 
calculate the number of days remaining until the examination, 
and determine whether the exam falls in a leap year.
*/
import java.time.*;
import java.util.Scanner;
import java.time.temporal.ChronoUnit;
public class t10{
 public static void main(String[] args){
  Scanner sc = new Scanner(System.in);
  System.out.print("Enter exam date yyyy-mm-dd: ");
  LocalDate exam = LocalDate.parse(sc.nextLine());
  System.out.println("Day: "+exam.getDayOfWeek());
  System.out.println("Days remaining for exam: "+Period.between(LocalDate.now(), exam).getDays()
   + " (Total: "+ChronoUnit.DAYS.between(LocalDate.now(), exam)+" days)");
  System.out.println("Leap year? "+exam.isLeapYear());
  sc.close();
 }
}
