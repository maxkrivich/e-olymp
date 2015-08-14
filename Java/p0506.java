
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNextLine()) {
            String code = in.nextLine();
            if (code.contains("->")) {
                if (code.contains("//")) {
                    System.out.printf("%s\n", getNewString(code));
                } else {
                    System.out.printf("%s\n", code.replaceAll("->", "."));
                }
            } else {
                System.out.printf("%s\n", code);
            }
        }
        in.close();
    }

    private static String getNewString(final String code) {
        return (code.indexOf("->") > code.indexOf("//")) ? code : code.substring(0, code.indexOf("//")).replaceAll("->", ".") + code.substring(code.indexOf("//"));
    }

}
