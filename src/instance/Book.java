package instance;

public class Book {
    String title;
    String author;
    public Book(String t) {
        title = t; author="작자미상";
    }
    public Book(String t, String a){
        title = t; author = a;
    }

    public static void main(String[] args) {
        Book book1 = new Book("어린왕자","생텍쥐페리");
        System.out.println(book1.title+" "+book1.author);
        Book book2 = new Book("춘향전");
        System.out.print(book2.title+" "+book2.author);
    }
}
