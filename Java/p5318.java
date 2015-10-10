
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt(), k = in.nextInt();
        System.out.println(n & (Integer.MAX_VALUE >>> 31 - k));
    }

}
