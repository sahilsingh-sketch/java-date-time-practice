
/*Date Formatting and Parsing
Accept a date in the format dd/MM/yyyy, 
convert it into a LocalDate using DateTimeFormatter, 
and display it in the formats dd-MM-yyyy, MMMM dd, yyyy, 
and EEEE, dd MMMM yyyy.*/
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
public class t14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner( System.in);

        System.out.println("Enter date (dd/MM/yyyy): ");
        String input = sc.next();

        DateTimeFormatter inputFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate date= LocalDate.parse(input, inputFormatter);

        DateTimeFormatter f1 = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        DateTimeFormatter f2 = DateTimeFormatter.ofPattern("MMMM dd, yyyy");
        DateTimeFormatter f3 = DateTimeFormatter.ofPattern("EEEE, dd MMMM yyyy");

        System.out.println(date.format(f1));
         System.out.println(date.format(f2));
          System.out.println(date.format(f3));

        sc.close();
    }
}
