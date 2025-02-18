import java.util.Arrays;
import java.util.Scanner;

public class fixedrowcol {
    public static void main(String[] args) {
        fun();




    }
    static void fun(){
        int [] [] arr={
                {1,2,3,4},
                {4,5},
                {4,5,6}
        };
        for (int row=0;row<arr.length;row++) {
            for (int col = 0; col < arr[row].length; col++) {
                System.out.print(arr[row][col] + " ");
            }
            System.out.println();
        }
    }
}
