
import java.util.GregorianCalendar;
import java.util.Calendar;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int day = new Scanner(System.in).nextInt();
        GregorianCalendar g = new GregorianCalendar(2014, Calendar.ALL_STYLES, day);
        System.out.println(g.get(Calendar.DAY_OF_MONTH) + " " + (g.get(Calendar.MONTH) + 1));
        
    }

}
