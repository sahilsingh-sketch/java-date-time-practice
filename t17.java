/*Online Transaction Timestamp
Create a program that records the current transaction time using Instant, 
converts it to ZonedDateTime for Asia/Kolkata, and displays both the UTC timestamp and Indian local time. */
import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;
public class t17 {
    public static void main(String[] args) {
        Instant transactionTime = Instant.now();

        ZonedDateTime indianTime = transactionTime.atZone(ZoneId.of("Asia/Kolkata"));

        System.out.println("UTC time : " +transactionTime );
        System.out.println("Indian Local Time : " +indianTime);
    }
}
