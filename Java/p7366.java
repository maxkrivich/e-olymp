import java.util.Date;
import java.util.Locale;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;
import static javafx.util.Duration.seconds;

public class Main {

    public static void main(String[] args) {
        int seconds=new Scanner(System.in).nextInt();
        int day = (int) TimeUnit.SECONDS.toDays(seconds);
    long hours = TimeUnit.SECONDS.toHours(seconds) -
                 TimeUnit.DAYS.toHours(day);
    long minute = TimeUnit.SECONDS.toMinutes(seconds) - 
                  TimeUnit.DAYS.toMinutes(day) -
                  TimeUnit.HOURS.toMinutes(hours);
    long second = TimeUnit.SECONDS.toSeconds(seconds) -
                  TimeUnit.DAYS.toSeconds(day) -
                  TimeUnit.HOURS.toSeconds(hours) - 
                  TimeUnit.MINUTES.toSeconds(minute);
    System.out.println( day + " " + hours + " " + minute + " " + second);
       
    }
}
