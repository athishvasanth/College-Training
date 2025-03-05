import java.util.Arrays;
import java.util.Scanner;

public class lexicogrhapic {
    static void display(String s,int k){
        String []arr=new String[s.length()-k+1];
        for (int i=0;i<=s.length()-k;i++){

            arr[i]=s.substring(i,k+i);
        }

        sort(arr);
        System.out.println(arr[0]+" "+arr[arr.length-1]);


    }
    static String[] sort(String[] arr) {
        for (int i=0;i< arr.length;i++){
            for (int j=i+1;j< arr.length;j++){
                if (arr[i].compareTo(arr[j]) > 0) {

                    String temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;

    }
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        String s=in.nextLine();
        int k=in.nextInt();
        display(s,k);


    }
}
