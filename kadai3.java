public class kadai3 {
    public static void main(String[] args) {
        
        for (int Month = 1; Month < 13; Month++) {
            System.out.println(Month + "月は");

            switch (Month) {
                case 1:
                case 2:
                case 3:
                    System.out.println("冬です");
                    break;

                case 4:
                case 5:
                case 6:
                    System.out.println("春です");
                    break;

                case 7:
                case 8:
                case 9:
                    System.out.println("夏です");
                    break;

                case 10:
                case 11:
                case 12:
                    System.out.println("秋です");
                    break;
            }
        }
    }
}
