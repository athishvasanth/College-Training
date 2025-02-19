import java.util.Arrays;

public class clockwisearray {
    public static void main(String[] args) {
        int [][] a={
                {1,4,5},
                {3,6,7},
                {8,9,2}};
        System.out.println("original matrix:");
        print(a);

        rotatearray(a);
        System.out.println("rotated:");
        print(a);

    }

    static void rotatearray(int[][]a){
        int temp=a[0][0];
        int rows=a.length;
        int cols=a[0].length;

        if (rows<2||cols<2){
            return;
        }


        for (int i=0;i<rows-1;i++){
            a[i][0]=a[i+1][0];
        }

        for(int j=0;j<cols-1;j++){
            a[rows-1][j]=a[rows-1][j+1];

        }
        for (int k=rows-1;k>0;k--){
            a[k][cols-1]=a[k-1][cols-1];
        }
        for (int i=rows-1;i>1;i--){
            a[0][i]=a[0][i-1];
        }
        a[0][1]=temp;
    }

    static void print(int[][]a) {
        for (int[] num:a){

                System.out.println(Arrays.toString(num));

        }



    }
}
