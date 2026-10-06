/*	Last Friday of the Month
Given a month and year, use TemporalAdjusters and DayOfWeek to find and display the last Friday of that month. */
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.TemporalAdjusters;
import java.util.Scanner;
public class t16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner( System.in);
        System.out.println("Enter the year: ");
        int year = sc.nextInt();
        System.out.println("Enter the months(1 to 12): ");
        int month = sc.nextInt();

        LocalDate date = LocalDate.of(year, month, 1);

        LocalDate lastFriday  = date.with(TemporalAdjusters.lastInMonth(DayOfWeek.FRIDAY));

        System.out.println("Last Friday: " + lastFriday);

        sc.close();
    }
}
