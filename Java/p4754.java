
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int k = Integer.parseInt(in.nextLine());
        String N = in.nextLine();
        System.out.println(Integer.valueOf(N, k).toString());
        in.close();
    }
}
