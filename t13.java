/*Training Session Duration
Given the start and end time of a training session, 
use LocalTime and Duration to calculate the total duration in hours, 
minutes, and seconds. */
import java.time.LocalTime;
import java.util.Scanner;
import java.time.Duration;
public class t13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the start timing of the session: ");
        LocalTime start = LocalTime.parse(sc.next());
        System.out.print("Enter the end time of session: ");
        LocalTime end = LocalTime.parse(sc.next());
        Duration totalDuration = Duration.between(start, end);
        System.out.println("Total Duration of the session: "
         + totalDuration.toHours() + "hours,"
         + totalDuration.toMinutesPart()+ "minutes,"
         + totalDuration.toSecondsPart()+"second ");
        sc.close();
    }
}
