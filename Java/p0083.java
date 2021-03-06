
import java.math.BigInteger;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String[] arr = in.nextLine().split("/");
        System.out.println(str(arr, Integer.parseInt(arr[0]) + 1));
    }

    public static String str(String[] ns, int d) {
        String tmp = "";
        for (String s : ns) 
            tmp += new BigInteger(s).toString(d) + "/";
        return tmp.substring(0, tmp.length() - 1).toUpperCase();
    }

}
