import java.util.Arrays;

public class hairetu {
    private static int i;

    public static void main(String[] args) {

        int[] arr = { 1, 2, 3, 4, 5 };

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        arr[0] = 3;
        arr[1] = 2;
        arr[2] = 5;
        arr[3] = 1;
        arr[4] = 4;

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        arr[0] = 3;
        arr[1] = 1;
        arr[2] = 5;
        arr[3] = 4;
        arr[4] = 2;

        Arrays.sort(arr);

        for (int i : arr) {
            System.out.println(i);

        }
        int[] newarr = new int[10];

        newarr[5] = 6;
        newarr[6] = 7;
        newarr[7] = 8;
        newarr[8] = 9;
        newarr[9] = 10;

        for (int i = 0; i < newarr.length; i++) {

            int count1 = 0;
            int count2 = 0;
            
            if (i % 2 == 0) {
                count1++;
                System.out.println();
            }
        }
    }
}
