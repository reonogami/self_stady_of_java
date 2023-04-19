public class sat_kadai3 {
    public static void main(String[] args) {

        int Month = 4;

        switch (Month) {
            case 4:
            case 5:
            case 9:
            case 10:
                System.out.println("シーズンは春です");
                break;

            case 6:
            case 7:
            case 8:
                System.out.println("シーズンは夏です");
                break;

            default:
                System.out.println("その他の季節です");
                break;
        }
    }
}
