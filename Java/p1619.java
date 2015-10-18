
import java.io.File;
import java.util.Scanner;
import java.io.PrintWriter;
import java.io.IOException;
import static java.util.Arrays.fill;
import static java.util.Arrays.stream;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(new File("input.txt"));
        PrintWriter pw = new PrintWriter(new File("output.txt"));
        int n = Integer.parseInt(in.nextLine());
        int[] arr = new int[n], cnt = new int[n];
        for (int i = 0; i < n; i++) 
            arr[i] = in.nextInt();
        fill(cnt, 1);
        for (int i = 1; i < n; i++) 
            for(int j = 0; j < i; j++)
                if(arr[i] > arr[j] && cnt[i] < cnt[j] + 1)
                    cnt[i] = cnt[j] + 1;
        pw.println(stream(cnt).max().getAsInt());
        pw.flush();
        pw.close();
    }
}
