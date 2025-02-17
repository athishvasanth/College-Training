import java.util.Arrays;
import java.util.Scanner;

public class Array2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }
        System.out.println(maximum(arr));
        System.out.println(secondmax(arr));
        System.out.println(thirdsortmax(arr));
    }

    static int maximum(int[] arr) {


        int max = arr[0];

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] > max) {
                max = arr[i];
            }

        }
        return max;


    }

    static int secondmax(int[] arr) {

        int max2 = arr[0];

        for (int j = 0; j < arr.length-1; j++) {
            if (arr[j] > max2) {
                max2 = arr[j];

            }
        }
        return max2;


    }
    static int thirdsortmax(int[] arr){
        Arrays.sort(arr);
        int maximum=arr [arr.length-3];
        return maximum;
    }

}

