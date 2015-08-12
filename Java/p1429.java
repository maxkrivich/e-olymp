
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int base = Integer.parseInt(in.readLine());
        System.out.println((new BigInteger(in.readLine(), base).max(new BigInteger(in.readLine(), base))).toString(base).toUpperCase());
    }
}
