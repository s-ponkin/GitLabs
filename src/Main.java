import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            System.out.println("Всем добрый день!");
            System.out.println("У меня отличные новости!");

        }

        System.out.println();

        Set<Integer> number = new HashSet<>();
        number.add(1);
        number.add(2);
        number.add(1);
        number.add(3);

        System.out.println(number.size() == 3?3:2);

        ArrayList<Integer> abc = new ArrayList<>();
    }
}
