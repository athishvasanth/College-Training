import java.util.Arrays;

public class BubbleSort {
    static void bubble(int[] arr){
        for (int i=0;i< arr.length-1;i++){
            for (int j=i+1;j< arr.length;j++){
                if(arr[i]>arr[j]){
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void main(String[] args) {
        int[]arr={10,56,78,2,3,10};
        bubble(arr);

    }
}
