public class sat_kadai5 {
    public static void main(String[] args) {

        double age = 19;

        if (age < 0 || age >= 120) {
            System.out.println("不正な値です");

        } else if (age >= 20) {
            System.out.println("成人です");

        } else {
            System.out.println("未成年です");
        }
    }
}
