import java.util.ArrayList;
import java.util.List;

public class risuto2 {
    public static void main(String[] args) {

        List<String> fruit = new ArrayList<String>();

        fruit.add("apple");
        fruit.add("banana");
        fruit.add("cherry");
        fruit.add("date");
        fruit.add("elderberry");

        System.out.println(fruit.get(3));

        String str = fruit.remove(2);

        System.out.println("要素数" + fruit.size());

        for (String number : fruit) {
            System.out.println(number);
        }
    }
}
