package Instance;

class Book {
    // 1. 속성
    private String title;
    private String author;

    // 2. 생성자
    Book() {} // 기본 생성자
    Book(String title, String author) {
        this.title = title;
        this.author = author;
    }
    // 3. 메소드, getter, setter

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                '}';
    }

    void showInfo() {
        System.out.println(title + ", " + author);
    }

}

public class proj0106 {
    public static void main(String[] args) {
        Book bk1 = new Book("어린왕자", "생텍쥐베리");
        System.out.println(bk1);
        bk1.showInfo();

    }
}
