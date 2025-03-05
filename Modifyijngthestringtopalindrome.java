import java.util.Scanner;

public class Modifyijngthestringtopalindrome {
    static int display(String s){
        StringBuilder sb=new StringBuilder(s);
        int count=0;
        int j=s.length()-1,i = 0;
        int start=i;
        int end=j;
        while(start<end){
            if (sb.charAt(start) != sb.charAt(end)) {
                    sb.setCharAt(end, sb.charAt(start));
                    count++;
                }
                s = sb.toString();
            start++;
            end--;

        }
        if (ispal(s,start,end)){
            return count;
        }
        return 0;
        }


    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the String :");
        System.out.println(display(in.nextLine()));



    }
    static boolean ispal(String s, int left, int right) {
        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) return false;
            left++;
            right--;
        }
        return true;
    }
}
