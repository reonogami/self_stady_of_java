public class patinco {
    public static void main(String[] args) {
        int age;

        int limitLow = 18;

        int limiLow2 = 20;

        age = 19;

        if (age < limiLow2) {
            System.out.print(age + "歳なら飲酒、喫煙は不可です");
        }

        age = 20;
        if (age > limitLow) {
            System.out.print(age + "歳ならパチンコ屋に行けます");
        }
    }
}
