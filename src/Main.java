import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import java.util.Random;

public class Main {

    // It is base program

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

        ArrayList<Integer> abc = new ArrayList<>();
        
        Random random = new Random();
        random.ints(3).forEach(System.out::println);
    }
}
