import java.util.ArrayList;
import java.util.List;

public class list {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        list.add("Maria");
        list.add("Bob");
        list.add("Ana");
        list.add("Alex");
        list.add(2, "Douglas");

        System.out.println(list.size());

        for (String x : list) {
            System.out.println(x);
        }
        System.out.println("---------------------");

        list.removeIf(x -> x.charAt(0) == 'M');

        for (String x : list) {
            System.out.println(x);
        }
        System.out.println("------------------------------");
        System.out.println("Index of Bob: " + list.indexOf("Bob"));
    }
}
