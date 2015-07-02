import java.math.BigInteger;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int n = new Scanner(System.in).nextByte();
        System.out.println(new BigInteger("2").pow(n*n).subtract(BigInteger.ONE).toString());
    }

}
