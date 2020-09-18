import java.sql.Time;
import java.text.ParseException;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Dagetiljul {
    public static void Dagtiljul() {
         DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d-MMM-yyyy");
         Scanner input = new Scanner(System.in);
         System.out.println("First date, 18-Sep-2020 <-- this format");
         String dage1 = input.next();
         System.out.println("Second date, 18-Sep-2020 <-- this format");
         String dage2 = input.next();

         LocalDate date1 = LocalDate.parse(dage1, formatter);
         LocalDate date2 = LocalDate.parse(dage2, formatter);
         long daysinbetween = ChronoUnit.DAYS.between(date1, date2);
         System.out.println("Days: " + daysinbetween);
    }
   //static String dage1 = "18-Sep-2020";
   //static String dage2 = "24-Dec-2020";

}
