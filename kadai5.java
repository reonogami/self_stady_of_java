public class kadai5 {
    public static void main(String[] args) {

        double height = 180.0;

        double weight = 60.0;

        double bmi = weight / (height * height) * 10000;

        if (bmi >= 25) {
            System.out.println("貴方のBMI値は" + bmi + "で太り気味です");

        } else if (bmi < 25 && bmi >= 18.5) {
            System.out.println("貴方のBMI値は" + bmi + "で適正値です");

        } else if (bmi < 18.5 && bmi >= 0) {
            System.out.println("貴方のBMI値は" + bmi + "で痩せ気味です");

        } else {
            System.out.println("存在しない値です");
        }
    }
}
