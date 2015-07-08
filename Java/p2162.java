import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        StringBuilder ss = new StringBuilder(new Scanner(System.in).nextLine().trim().replaceAll(" ", ""));
        if(ss.toString().equals(ss.reverse().toString()))
            System.out.println("YES");
        else
            System.out.println("NO");
    }

}
