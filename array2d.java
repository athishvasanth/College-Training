import java.util.Arrays;
import java.util.Scanner;

public class array2d {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
       int row,col;
        int [][] arr=new int[5] [4];

       for (row=0;row< arr.length;row++){
           for (col=0;col<arr[row].length ;col++){
              arr[row][col] =in.nextInt();
//                System.out.print(arr[row][col]+" ");
            }
//           System.out.println();
       }

        for(row=0;row<arr.length;row++){

//            System.out.println(Arrays.toString(arr[row]));
        }

        for (int[] num:arr){
            System.out.println(Arrays.toString(num));
        }
        in.close();
    }
}
