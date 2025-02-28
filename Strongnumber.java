public class Strongnumber {

    public static void main(String[] args) {
        int range=1000;
        for (int j=1;j<=range;j++){
              if (isstrong(j)){
                  System.out.println(j+" ");
              }

          }

    }

    static int factorial(int n){
        int fact=1;
        for (int i=1;i<=n;i++){
            fact=fact*i;

        }
        return fact;

    }


    static int Strong(int n){
    int sum=0;
       while(n>0){
           int lastdigit=n%10;
           sum+=factorial(lastdigit);

           n/=10;

       }
       return sum;

    }

    static boolean isstrong(int n){
        int res=Strong(n);
        if (n==res){
            return true;
        }
        return false;
    }
}
