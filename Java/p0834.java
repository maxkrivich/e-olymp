import java.math.BigInteger;
import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        BigInteger a=new BigInteger(in.next().trim());
        System.out.println(a.pow(in.nextInt()));
    }

}
