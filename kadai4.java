public class kadai4 {
    public static void main(String[] args) {

        int total;

        total = 0;

        for (int num = 0; num <= 10; num++) {

            if (num % 2 == 0) {
                total = total + num;

                System.out.println(total);
            }
        }
    }
}
