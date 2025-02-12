public class prepostfx {
    public static void main(String[] args) {
        int x,y,z;
        x=10;
        y=--x + x++ + ++x + --x + x++;
        z= x++ + ++x + ++x + x++ + ++x;
        System.out.println(y);
        System.out.println(z);


    }
}
