public class Harshadnumbers {
    public static void main(String[] args) {
        int range = 2500;
        System.out.println("harshad Numbers for 500 t0 2500:");
        for (int i=500;i<=2500;i++){
           if (isHarshad(i)){
        System.out.println(i+" ");
    }
}

    }
    static int printharshad(int n) {
        int sum=0;
        while(n>0){
            int lastdigit=n%10;
            sum+=lastdigit;

            n/=10;

        }
        return sum;


    }

    static boolean isHarshad(int n){
        int res=printharshad(n);
        if (n%res==0){
            return true;
        }
        return false;

    }
}

