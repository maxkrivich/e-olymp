
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        String number = new BufferedReader(new InputStreamReader(System.in)).readLine();
        StringBuilder str = new StringBuilder();
        byte cnt = 0;
        for (char i = '0'; i < ':'; i++) {
            if (!number.contains("" + i)) {
                ++cnt;
                str.append(i + " ");
            }
        }
        if (cnt == 0) 
            System.out.println("0");
         else {
            System.out.println(cnt);
            System.out.println(str.toString().trim());
        }

    }

}
