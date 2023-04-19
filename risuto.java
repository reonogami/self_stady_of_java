import java.util.ArrayList;
import java.util.List;

public class risuto {
    public static void main(String[] args) {

        List<Integer> numbers = new ArrayList<>();

        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(50);

        System.out.println(numbers.get(2));

        numbers.remove(2);

        System.out.println("要素数" + numbers.size());

        for (int number : numbers) {
            System.out.println(number);
        }
    }
}
