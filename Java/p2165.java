
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws Exception {
        String str = new BufferedReader(new InputStreamReader(System.in)).readLine();
        System.out.println(str.replaceAll("[\\s]{2,}", " ").trim());
    }

}
