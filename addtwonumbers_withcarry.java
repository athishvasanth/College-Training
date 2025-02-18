public class addtwonumbers_withcarry {
    public static void main(String[] args) {
        int[] a={9,9,9,9,9,9,9};
        int[] b={9,9,9,9};
        print(a,b);
    }

    static void print(int[] a,int[] b){
        int carry=0;
        int sum=0;
        int n=a.length>b.length?a.length: b.length;
        int[] res=new int[n+1];

        for (int i=0;i<n;i++){
            int digi1=(i<a.length)?a[i]:0;
            int digi2=(i<b.length)?b[i]:0;
            sum=digi1+digi2+carry;

            res[i]=sum%10;
            carry=sum/10;
        }
        if(carry>0){
            res[n]=carry;
            n++;
        }
        for (int j=0;j<n;j++){
            System.out.print(res[j]+" ");
        }
    }
}
