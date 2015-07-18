
public class Main {

    public static void main(String[] args) {
        java.util.Scanner in = new java.util.Scanner(System.in).useLocale(java.util.Locale.US);
        double a = in.nextDouble(), b = in.nextDouble(), c = in.nextDouble(), d = in.nextDouble(), f = in.nextDouble();
        System.out.printf(java.util.Locale.US, "%.4f\n", getArea(a, b, f) + getArea(d, c, f));
    }

    public static double getArea(double a, double b, double c) {
        double p = (a + b + c) / 2;
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }

}
