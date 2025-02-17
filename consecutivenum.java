import java.util.Scanner;

public class consecutivenum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
       int [] arr={1,0,1,1,1,0,1,1,0,0,0,0,1};
        System.out.println(consecutivenumber(arr));

    }

    static int consecutivenumber(int[] arr) {
        int max = 0;
        int num = 0;
        int c = 0;
        for (int i = 0; i < arr.length-1; i++) {
            if (arr[i] == arr[i + 1]) {
                c++;
            } else {
                c = 1;
            }
            if (max < c) {
                max=c;
                num = arr[i + 1];
            }

        }

        System.out.println("the frequency of" +num+"is"+max);


        return max;
    }
}
