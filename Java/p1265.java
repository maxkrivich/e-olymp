
import static java.lang.Math.hypot;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (true) {
            int a = in.nextInt(), b = in.nextInt(), c = in.nextInt();
            if (a == b && b == c && c == 0) {
                break;
            }
            if (hypot(a, b) == c || hypot(a, c) == b || hypot(b, c) == a) {
                System.out.println("right");
            } else {
                System.out.println("wrong");
            }
        }
        in.close();
    }

}
