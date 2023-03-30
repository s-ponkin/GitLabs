import java.util.Random;

public class Main {

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            System.out.println("Hello my");
        }
        
        Random random = new Random();
        random.ints(3).forEach(System.out::println);
    }
}
