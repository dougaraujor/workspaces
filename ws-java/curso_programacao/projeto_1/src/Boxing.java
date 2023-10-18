import java.util.Locale;
import java.util.Scanner;

public class Boxing {
    public static void main(String[] args) {

        // Aula sobre Boxing, Unboxing, Wrapper.
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        // Boxing
        int x = 20;
        Object obj = x;
        System.out.println(obj);
        // ------------------------------

        // Unboxing
        int y = (int) obj;
        System.out.println(y);
        // ------------------------------

        // Wrapper
        Integer w = x;
        System.out.println(w * 2);
        sc.close();
    }
}
