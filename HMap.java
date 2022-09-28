import java.util.*;

public class HMap {
    public static void main(String[] args) {
        Map<Integer, String> map = new TreeMap<>();
        map.put(null, "yura");
        map.put(null, "dasha");
        map.put(4, "ignat");
        map.put(1, "John");
        map.put(5, "Tom");

        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + "=" + entry.getValue());
        }

    }
}
