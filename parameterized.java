public class parameterized {
String title;
String Author;
float Prize;
parameterized(String title,String Author,float Prize) {
    this.title = title;
    this.Author = Author;
    this.Prize = Prize;
    display();

}

void display(){
    System.out.println("the book name is:"+this.title);
    System.out.println("the Author is:"+this.Author);
    System.out.println("Prize is:"+this.Prize);
}

public static void main(String[] args) {

        parameterized obj=new parameterized("Half Girlfriend","Chetan Bhagat",236.0f);
        
    }
}
