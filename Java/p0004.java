
import java.util.Locale;
import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in).useLocale(Locale.US);
        double x1 = in.nextDouble(), y1 = in.nextDouble(), r1 = in.nextDouble(), x2 = in
                .nextDouble(), y2 = in.nextDouble(), r2 = in.nextDouble(), r, tmp;
        r = Math.sqrt(Math.pow((x1 - x2), 2) + Math.pow((y1 - y2), 2));
        if (r2 > r1) {
            tmp = r1;
            r1 = r2;
            r2 = tmp;
            tmp = x2;
            x1 = x2;
            x2 = tmp;
            tmp = y1;
            y1 = y2;
            y2 = tmp;
        }
        if (r == 0) {
            if (r1 != r2) {
                System.out.println("0");
            } else {
                System.out.println("-1");
            }
        } else if (r > r1 + r2) {
            System.out.println("0");
        } else if (r == r1 + r2) {
            System.out.println("1");
        } else if (r1 - r2 < r) {
            System.out.println("2");
        } else if (r1 - r2 == r) {
            System.out.println("1");
        } else {
            System.out.println("0");
        }
    }
}
