public class Main {
    public static void main(String[] args) {
        int a = 5;
        int b = 3;
        int c;

        c = a + b; 
        System.out.println("加算 c : " + c);

        c = a - b; 
        System.out.println("減算 c : " + c);
        
        a = 3;
        b = 4;
        c = a * b; 
        System.out.println("乗算 c : " + c);
        
        a = 6;
        b = 2;
        c = a / b; 
        System.out.println("除算 c : " + c);

        a = 6;
        b = 5;
        c = a % b; 
        System.out.println("剰余 c : " + c);
    }
}
