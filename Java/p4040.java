import java.util.HashSet;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        HashSet<Integer> arrSet = new HashSet<Integer>();
        in.nextLine();
        for (String n : in.nextLine().split("\\s")) {
            arrSet.add(new Integer(n));
        }
        System.out.println(arrSet.size());
    }

}
