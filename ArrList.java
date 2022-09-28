import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;


public class ArrList {
    public static void main(String[] args) {
        List<String> list = new LinkedList<>();
        list.add("Yura");
        System.out.println(list.set(0, "Sergey"));
        System.out.println(list.get(0));
    }
}
