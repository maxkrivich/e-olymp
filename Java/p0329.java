
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws Exception {
        String[] arr = new BufferedReader(new InputStreamReader(System.in)).readLine().split("\\s");
        byte cnt = 0;
        for (String tmp : arr) 
            if (!tmp.replaceAll("[^\\w\\d]", "").isEmpty()) 
                ++cnt;
        System.out.println(cnt);
    }

}
