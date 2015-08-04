
public class Main {

    public static void main(String[] args) {
        int n = new java.util.Scanner(System.in).nextInt(), cnt = 0;
        int[] arr = {500, 200, 100, 50, 20, 10};
        for (int c : arr) 
            while (Math.signum(n - c) != -1) 
                n -= c + 0 * (++cnt);
        System.out.printf("%d\n", n == 0 ? cnt : -1);
    }
}
