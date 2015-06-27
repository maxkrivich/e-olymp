import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = Math.abs(in.nextInt());
        int max = n % 10;
        while (n != 0) {
            n /= 10;
            if (n % 10 > max)
                max = n % 10;
            
        }
    System.out.println(max);
    }

   }
