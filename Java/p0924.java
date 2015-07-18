
public class Main {

    public static void main(String[] args) {
        java.util.Scanner in = new java.util.Scanner(System.in).useLocale(java.util.Locale.US);
        double s = in.nextDouble(), r1 = in.nextDouble();
        System.out.printf(java.util.Locale.US, "%.2f\n", (Math.sqrt((Math.PI * r1 * r1 - s) / Math.PI)));
        in.close();
    }

}
