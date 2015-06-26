import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int n = new Scanner(System.in).nextInt();
        int sum = 0;
        while (n != 0) {
            sum += n % 10;
            n /= 10;
        }
        System.out.printf(Locale.US,"%.3f\n", Math.sqrt(sum));
    }
}