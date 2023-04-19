import java.util.Random;

public class sat_kadai4 {
    public static void main(String[] args) {

        Random rand = new Random();

        int hand = rand.nextInt(5) + 1;

        switch (hand) {
            case 1:
                System.out.println("グー");
                break;

            case 2:
                System.out.println("チョキ");
                break;

            case 3:
                System.out.println("パー");
                break;

            default:
                System.out.println("丸山南");
                break;
        }
    }
}
