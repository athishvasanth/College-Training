import java.util.Arrays;

public class everydiagnolmatrix {
    public static void main(String[] args) {
        int [][]a={{1,2,3,4},
                {4,5,6,7},
                {7,8,9,1},
                {6,9,5,6}
        };
        System.out.println("original matrix:");
        for (int[]num:a){
            System.out.println(Arrays.toString(num));
        }
        System.out.println("diagnol added :");
        print(a);
    }

    static void print(int[][] a){
        int row=a.length;
        int col=a[0].length;
        int sum=0;
        int add=0;

        for (int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(i<j){
                   sum+=a[i][j];
                } else if (i>j) {

                   add+=a[i][j];
                }
            }
        }

        a[0][0]=add;
        a[row-1][row-1]=sum;

        for (int[] num:a){
            System.out.println(Arrays.toString(num));
        }
    }
}
