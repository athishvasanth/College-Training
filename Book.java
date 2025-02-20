public class Book {
    String title;
    float price;

    public static void main(String[] args) {

        Book obj=new Book();
        obj.print(obj.title, obj.price);
        System.out.println("Book Title:"+obj.title);
        System.out.println("Book Price:"+obj.price);

    }

    void print(String title,float price){
        this.title="Java Programming";
        this.price=100.0f;
    }


}
