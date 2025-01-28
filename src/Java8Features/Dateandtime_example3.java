package Java8Features;
import java.time.LocalDate;
import java.time.DayOfWeek;
import java.time.format.TextStyle;
import java.util.Locale;

public class Dateandtime_example3 {
    public static void main(String[] args) {
        // Get the current date
        LocalDate currentDate = LocalDate.now();

        // Add 7 days to the current date
        LocalDate dateAfter7Days = currentDate.plusDays(7);

        // Get the day of the week for the date after 7 days
        DayOfWeek dayOfWeek = dateAfter7Days.getDayOfWeek();

        // Display the day of the week in a readable format
        String dayName = dayOfWeek.getDisplayName(TextStyle.FULL, Locale.ENGLISH);
        System.out.println("Today's date: " + currentDate);
        System.out.println("Date after 7 days: " + dateAfter7Days);
        System.out.println("Day after 7 days: " + dayName);
    }
}
