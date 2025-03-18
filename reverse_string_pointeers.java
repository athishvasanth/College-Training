import java.util.Arrays;

public class reverse_string_pointeers {
    public static void main(String[] args) {
        String str = "vasanth is good boy in our class";
        String[] arr=str.split(" ");
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            String temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
        String result=String.join(" ",arr);


        System.out.println("OriginalString:"+str);
        System.out.println("Reverserd String:"+ result);
    }
}
