package BookExample;

import instance.Ex;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

class Book {
    private String isbn;
    private String title;
    private String author;

    public Book(String isbn, String title, String author){
        this.isbn = isbn;
        this.title = title;
        this.author = author;
    }

    public String getIsbn() {
        return isbn;
    }
    public String getTitle() {
        return title;
    }
    public String getAuthor() {
        return author;
    }

    @Override
    public String toString() {
        return String.format("%s\t %s\t %s",isbn,title,author);
    }
}

class BookDAO {
    private List<Book> bookList;

    public BookDAO() {
        bookList = new ArrayList<>();
        // 테스트용 데이터 추가
        bookList.add(new Book("979-11-92932-76-7", "명품 자바", "황기태"));
        bookList.add(new Book("978-89-5674-688-9", "이것이 자바다", "신용권"));
        bookList.add(new Book("979-11-92932-76-9", "점프 투 자바", "박응선"));
    }

    public Book search(String isbn){
        for (Book book : bookList){
            if(book.getIsbn().equals(isbn)){
                return book;
            }
        }
        return null;
    }
    public List<Book> search(String field, String keyword) {
        List<Book> results  = new ArrayList<>();
        for(Book book : bookList) {
            if("author".equals(field) && book.getAuthor().contains(keyword)) {
                results.add(book);
            } else if("title".equals(field) && book.getTitle().contains(keyword)){
                results.add(book);
            }
        }
        return results;
    }

    public List<Book> showAll() {
        return bookList;
    }
}

public class BookManager {
    BufferedReader br;
    BookDAO dao;

    public BookManager() {
        br = new BufferedReader(new InputStreamReader(System.in));
        dao = new BookDAO();
    }

    public void run() {
        String isbn;
        String author;
        String title;
        List<Book> list;

        while (true) {
            System.out.println("[1] 검색 [2] 목록 출력 [3] 종료");
            System.out.print("메뉴 입력>>");
            try{
                int select = Integer.parseInt(br.readLine());
                if(select == 3) {
                    System.out.println("프로그램을 종료합니다.");
                    break;
                }
                switch (select){
                    case 1:
                        System.out.println("검색어 선택 [1] isbn [2] 작가 [3] 제목>>");
                        select = Integer.parseInt(br.readLine());
                        switch (select) {
                            case 1:
                                System.out.println("isbn 입력>>");
                                isbn = br.readLine();
                                Book book = dao.search(isbn);
                                if (book != null) {
                                    System.out.println("찾는 정보: " + book);
                                } else {
                                    System.out.println("해당 isbn의 책을 찾을 수 없습니다.");
                                }
                            case 2:
                                System.out.println("작가명 입력>>");
                                author = br.readLine();
                                list = dao.search("author", author);
                                if (list.isEmpty()) {
                                    System.out.println("해당 작가의 책을 찾을 수 없습니다.");
                                } else {
                                    System.out.println("--- 검색 결과 ---");
                                    for (int i = 0;i < list.size(); i++) {
                                        System.out.println((i+1) + ". " + list.get(i));
                                    }
                                } break;
                            case 3:
                                System.out.println("제목 입력>>");
                                title = br.readLine();
                                list = dao.search("title", title);
                                if (list.isEmpty()) {
                                    System.out.println("해당 제목의 책을 찾을 수 없습니다.");
                                } else {
                                    System.out.println(" --- 검색 결과 ---");
                                    for (int i = 0; i < list.size(); i++) {
                                        System.out.println((i+1) +". " + list.get(i));
                                    }
                                } break;
                            default:
                                System.out.println("잘못 입력했습니다."); }
                            break;
                            case 2:
                                list = dao.showAll();
                                if (list.isEmpty()) {
                                    System.out.println("등록된 자료가 없습니다.");
                                } else {
                                    Iterator<Book> it = list.iterator();
                                    System.out.println("No.\t isbn\t\t 제 목 \t\t 작가");
                                    int i = 1;
                                    while (it.hasNext()) {
                                        System.out.println(i + "./t" + it.next());
                                        i++;
                                    }
                                }
                                break;
                                default :
                                    System.out.println("잘못 입력했습니다."); }
                } catch (NumberFormatException | IOException e) {
                System.out.println("입력 형식 오류 >> 숫자를 입력하세요 .");
            } } }
        static void main() {
        BookManager bm = new BookManager();
        try {
            bm.run();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}