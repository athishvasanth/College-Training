import java.util.Arrays;

public class rotation {
    public static void main(String[] args) {
        int [][]matrix={{1,2,3},
                {4,5,6},
                {7,8,9}};
        rotate(matrix);
    }

    public static void rotate(int[][]matrix){
        for (int i=0;i<matrix.length;i++){
            for (int j=0;j<matrix[i].length;j++){
                int top=0;int bottom= matrix.length-1;
                while(top<bottom){
                    int temp=matrix[top][j];
                    matrix[top][j]=matrix[bottom][j];
                    matrix[bottom][j]=temp;
                    top++;
                    bottom--;

                }

            }
        }
        for (int i=0;i<matrix.length;i++) {
            for (int j = 0; j < matrix[i].length; j++) {

                System.out.print(matrix[i][j]);

            }
            System.out.println();
        }

    }
}
