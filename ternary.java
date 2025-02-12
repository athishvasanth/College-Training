public class ternary {
    public static void main(String[] args) {
        int a,b,c;
        a=10;
        b=20;
        c=30;

        int max=((a>b) && (a>c))?a:((b>c))? b:c;
        System.out.println(max);


    }
}
