
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNextLine()) {
            String singleLine = in.nextLine();
            if (singleLine.contains("->")) {
                if (singleLine.contains("//")) {
                    System.out.printf("%s\n", getNewString(singleLine));
                } else {
                    System.out.printf("%s\n", singleLine.replaceAll("->", "."));
                }
            } else {
                System.out.printf("%s\n", singleLine);
            }
        }
        in.close();
    }

    private static String getNewString(final String line) {
        return (line.indexOf("->") > line.indexOf("//")) ? line : line.substring(0, line.indexOf("//")).replaceAll("->", ".").concat(line.substring(line.indexOf("//")));
    }

}
