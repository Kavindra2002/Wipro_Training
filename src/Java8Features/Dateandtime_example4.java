package Java8Features;
import java.time.LocalDate;

public class Dateandtime_example4 {
    public static void main(String[] args) {
        // Get the current date
        LocalDate currentDate = LocalDate.now();

        // Add 1 month to the current date
        LocalDate dateAfter1Month = currentDate.plusMonths(1);

        // Display the results
        System.out.println("Today's date: " + currentDate);
        System.out.println("Date after 1 month: " + dateAfter1Month);
    }
}
