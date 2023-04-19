public class mon_kadai5_2 {
    public static void main(String[] args) {

        int num = 9973;

        if (num < 2) {
            System.out.println("素数ではありません");

        } else if (num == 2) {
            System.out.println("素数です");

        } else if (num % 2 == 0) {
            System.out.println("素数ではありません");

        }
        for (int i = 3; i <= num; i += 2) {
            
        }
    }
}
