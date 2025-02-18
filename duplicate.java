import java.util.Arrays;

public class duplicate {
    public static void main(String[] args) {
        int[] a = {3, 2, 3, 2, 1, 9};
        print(a);


    }

    static void print(int[] a) {

        int j = 0;
        for (int i = 0; i < a.length; i++) {
            int k;
            for ( k = 0; k<j; k++) {
                if (a[i] == a[k]) {
                    break;

                }


            }
            if (k == j) {

                a[j++] = a[i];
            }
        }
        for (int i = 0; i<j; i++) {
            System.out.print(a[i]+",");

        }
    }
}
