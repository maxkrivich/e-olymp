 
public class Main {

    public static void main(String[] args) {
        java.util.Scanner in = new java.util.Scanner(System.in).useLocale(java.util.Locale.US);
        int n = in.nextInt(), cnt = 0;
        for (int i = 0; i < n; i++) {
            int g = in.nextInt();
            if (in.nextDouble() < 50) {
                cnt += g;
            }
        }
        System.out.println(cnt);
    }

}
