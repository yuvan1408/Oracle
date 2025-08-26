package book;
public class Book {
    String name;
    String publisher;
    int year;
    
    public  void display(){ 
        System.out.println("Book name: "+name);
        System.out.println("Book publisher: "+publisher);
        System.out.println("Book year: "+year);
    }
}