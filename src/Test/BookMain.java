package Test;


class Book {
    private String title, author;
    private int pages;

    public Book() {}
    public Book(String title, String author, int pages) {
        this.title = title;
        this.author = author;
        this.pages = pages;
    }

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

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", pages=" + pages +
                '}';
    }
}
class Magazine extends Book {
    private int date;

    public Magazine() {}
    public Magazine(String title, String author, int pages, int date) {
        super(title, author, pages);
        this.date = date;
    }

    public int getDate() {
        return date;
    }

    public void setDate(int date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return super.toString() + ", 발매일 : " + date;
    }
}
class TextBook extends Book {
    private String school, hakgi;

    public TextBook() {}
    public TextBook(String title, String author, int pages, String school, String hakgi) {
        super(title, author, pages);
        this.school = school;
        this.hakgi = hakgi;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public String getHakgi() {
        return hakgi;
    }

    public void setHakgi(String hakgi) {
        this.hakgi = hakgi;
    }

    @Override
    public String toString() {
        return super.toString() + ", 학년 학기 : " + hakgi + ", 학교 : " + school;
    }
}

public class BookMain {
    public static void main(String[] args) {
        Magazine mgzs[] = {
                new Magazine("아주 작은 습관의 힘", "이현민", 600, 20260108),
                new Magazine("아주 작은 습관의 힘", "연정훈", 600, 20260108),
        };
        TextBook textBooks[] = {
                new TextBook("자바프로그래밍", "황기태", 100, "미림마이스터고", "1학년 1학기"),
                new TextBook("국어", "선생님", 40, "서울초등학교", "1학년 1학기"),
        };

        for(int i=0; i<mgzs.length; i++) {
            System.out.println(mgzs[i]);
            System.out.println(textBooks[i]);
        }
        for(Magazine m : mgzs) System.out.println(m);
        for(TextBook tb : textBooks) System.out.println(tb);

    }
}
