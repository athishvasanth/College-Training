import java.util.Arrays;

public class diagnol {
    public static void main(String[] args) {
        int[][] a={
                {1,2,3,},
                {4,5,6,},
                {7,8,9,}
        };

        System.out.println("the orginal matrix:");
        for (int []num:a){
            System.out.println(Arrays.toString(num));
        }
        System.out.println("the diagnol matrix is:");
        print(a);
    }

    static void print(int [][]a){
        int row=a.length;
        int col=a[0].length;
        int sum=0;
        int add=0;

        for (int i=a.length-1;i<row;i++){
           sum= a[0][i-1]+a[i-1][i]+a[0][i];
            add=a[i-1][0]+a[i][0]+a[i][i-1];
        }
        a[0][0]=add;
        a[2][2]=sum;

        for (int[] u:a){
            System.out.println(Arrays.toString(u));
        }
    }
}
