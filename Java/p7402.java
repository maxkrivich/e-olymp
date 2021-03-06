
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        TreeMap<Integer, Integer> map = new TreeMap<Integer, Integer>();
        int n = in.nextInt();
        for (int i = 0; i < n; i++) {
            int game = in.nextInt();
            int time = in.nextInt();
            if (map.containsKey(game)) {
                int gt = map.get(game);
                map.put(game, time + gt);
            } else {
                map.put(game, time);
            }
        }
        Collection c = map.values();

        int max = (int) Collections.max(c);
        Set set = map.entrySet();
        Iterator i = set.iterator();
        while (i.hasNext()) {
            Map.Entry me = (Map.Entry) i.next();
            if ((int) me.getValue() == max) {
                System.out.println(me.getKey());
                break;
            }
        }
    }

}
