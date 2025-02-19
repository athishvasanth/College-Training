import java.util.Arrays;
import java.util.Scanner;

public class shifting {
    public static void main(String[] args) {
        int[] a = {20, 56, 78, 3, 21, 6};
        Scanner in = new Scanner(System.in);

        System.out.println("The original array is :");
        for (int i = 0; i < 1; i++) {
            System.out.println(Arrays.toString(a));
        }
        System.out.println("enter the n to shift elements:");

        print(a,in.nextInt());



    }

    static void print(int[] a,int n){
        for (int i=0;i<n;i++){
            int last=a[a.length-1];
            for (int j=a.length-1;j>0;j--){
                a[j]=a[j-1];
            }
            a[0]=last;

            for (int k=0;k<1;k++){
                System.out.println(Arrays.toString(a));


            }

        }

        }
    }

