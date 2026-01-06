package Instance;

import java.util.Scanner;

public class BookArray {
    public static void main(String[] args) {
        Book[] book = new Book[3];

        Scanner scanner = new Scanner(System.in);
        for(int i=0; i<book.length; i++) {
            System.out.print("제목>>");
            String title = scanner.nextLine();
            System.out.print("저자>>");
            String author = scanner.nextLine();
            book[i] = new Book(title, author);
        }

        for(int i=0; i<book.length; i++)
            System.out.print("(" + book[i].getTitle() + ", " + book[i].getAuthor() + ")");

        System.out.println();

        for(Book bk : book)
            System.out.print("(" + bk.getTitle() + ", " + bk.getAuthor() + ")");

        scanner.close();

    }
}
