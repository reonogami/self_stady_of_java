public class hairetu2 {
    public static void main(String[] args) {
        
        int[] arr = { 1, 2 , 3 , 4 , 5 , 6 , 7 , 8 , 9 , 10 };

        int GusuNumber = 0;
        int KisuNumber = 0;
    
        for (int i : arr) {
          if (i % 2 == 0) {
            GusuNumber = i;
          } else {
            KisuNumber = i;
          }
        }
    
        System.out.println("奇数の個数" + KisuNumber);
        System.out.println("偶数の個数" + GusuNumber);
    }
}
