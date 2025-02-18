public class addind2arrwithremainder {

    public static void main(String[] args) {
        int[] arr1={5,1,3};
        int[] arr2={9,7,7,7};
        int carry=0;
        int d=0;
        int sum=0;
        int i,j;
        int n=arr1.length>arr2.length? arr1.length : arr2.length;
        int[] arr=new int[n];

        for (i=0;i<arr1.length;i++){
            sum=arr1[i]+arr2[i]+d;

            carry=sum%10;
            d=sum/10;
            arr[i]=carry;

        }
        for (j=arr1.length;j<n;j++){
            sum=arr2[j]+d;
            carry=sum%10;
            d=sum/10;
            arr[j]=carry;
        }

        for (int num:arr){
            System.out.println(num);
        }

        }
}
