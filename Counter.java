public class Counter {
    static int count=0;
Counter(){
    Counter.count++;
}
    public static void main(String[] args) {
        Counter c=new Counter();
        System.out.println("object Created!Current Count ="+c.count);
        Counter k=new Counter();
        System.out.println("object Created!Current Count ="+k.count);
        Counter b=new Counter();
        System.out.println("object Created!Current Count ="+b.count);
    }





}
