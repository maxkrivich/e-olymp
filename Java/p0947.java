import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int n = new Scanner(System.in).nextInt();
        System.out.println(n%10+""+n/10%10+""+n/100%10);
    }
}
