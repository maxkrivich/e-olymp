
import java.io.File;
import java.util.Scanner;
import java.io.PrintWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(new File("input.txt"));
        PrintWriter pw = new PrintWriter(new File("output.txt"));
        int n = Integer.parseInt(in.nextLine()), ans = 0, mul = 1;
        do {
            mul *= 5;
            ans += n / mul;
        } while (mul <= n / 5);
        pw.println(ans);
        pw.flush();
        pw.close();
    }
}
