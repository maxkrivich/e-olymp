
import java.math.BigInteger;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        BigInteger a = new BigInteger(new Scanner(System.in).next(), 2);
        if (isDivisible(a, "0011") & isDivisible(a, "0101")) 
            System.out.println("YES");
         else 
            System.out.println("NO");
        
    }

    private static boolean isDivisible(BigInteger a, String s) {
        return a.mod(new BigInteger(s, 2)).intValue() == 0;
    }
}
