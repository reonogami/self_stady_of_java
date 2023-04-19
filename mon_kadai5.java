public class mon_kadai5 {
    public static void main(String[] args) {

        int num = 9973;

        for (int i = 2; i <= Math.sqrt(num); i++) {

            if (num % i == 0) {
                System.out.println("素数ではありません");
                
                return;
            }
        }
        System.out.println("素数です");
    }
}
