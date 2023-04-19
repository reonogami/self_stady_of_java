public class kasai4_2 {
    public static void main(String[] args) {

        int num = 0;

        int sum = 0;

        for (int i = 0; i <= 10; i++) {

            if (i%2 == 1) {
                
                continue;
            }
            sum = num + i;
        }
        System.out.println(sum);
    }
}
