package Test;

import java.util.ArrayList;
import java.util.Scanner;

public class CollectionEx1 {
    public static void main(String[] args) {
        ArrayList<Student> p = new ArrayList<Student>();
        Scanner scan = new Scanner(System.in);

        while(true) {
            String name, stuld, age, phone;

            System.out.print("이름 >>");
            name = scan.next();
            if(name.equals("exit")) break;
            System.out.print("학번 >>");
            stuld = scan.next();
            if(stuld.equals("exit")) break;
            System.out.print("나이 >>");
            age = scan.next();
            if(age.equals("exit")) break;
            System.out.print("전화번호 >>");
            phone = scan.next();
            if(phone.equals("exit")) break;

            p.add(new Student(name, stuld, age, phone));
        }


        for(int i=0; i<p.size(); i++) System.out.println(p.get(i));
        for(Student member : p) System.out.println(member);


        ArrayList<Customer> c = new ArrayList<>();

        while(true) {
            String name, addr, phone;
            int cusNo, mile;

            System.out.print("이름 >>");
            name = scan.next();
            if(name.equals("exit")) break;
            System.out.print("주소 >>");
            addr = scan.next();
            if(addr.equals("exit")) break;
            System.out.print("전화번호 >>");
            phone = scan.next();
            if(phone.equals("exit")) break;
            System.out.print("학생번호를 입력하세요 >>");
            cusNo = scan.nextInt();
            System.out.print("마일 수를 입력하세요 >>");
            mile = scan.nextInt();

            c.add(new Customer(name, addr, phone, cusNo, mile));
        }

        for (int i=0; i<c.size(); i++) if(c.get(i).getMile() >= 1000) System.out.println(c.get(i));
        for (Customer member : c) if(member.getMile() >= 1000) System.out.println(member);


        ArrayList<Magazine> magazines = new ArrayList<>();

        while(true) {
            String title, author;
            int pages, date;

            System.out.print("책 제목 >>");
            title = scan.next();
            if(title.equals("exit")) break;
            System.out.print("책 작가 >>");
            author = scan.next();
            if(author.equals("exit")) break;
            System.out.print("책 페이지 수 >>");
            pages = scan.nextInt();
            System.out.println("책 출간 날짜 >>");
            date = scan.nextInt();

            magazines.add(new Magazine(title, author, pages, date));
        }

        for (int i=0; i<magazines.size(); i++) System.out.println(magazines.get(i));
        for (Magazine books : magazines) System.out.println(books);


        ArrayList<TextBook> textBooks = new ArrayList<>();

        while(true) {
            String title, author, school, hakgi;
            int pages;

            System.out.print("책 제목 >>");
            title = scan.next();
            if(title.equals("exit")) break;
            System.out.print("책 작가 >>");
            author = scan.next();
            if(author.equals("exit")) break;
            System.out.print("책 페이지 수 >>");
            pages = scan.nextInt();
            System.out.print("학교 이름 >>");
            school = scan.next();
            if(school.equals("exit")) break;
            System.out.print("학년-학기 >>");
            hakgi = scan.next();
            if(hakgi.equals("exit")) break;

            textBooks.add(new TextBook(title, author, pages, school, hakgi));
        }

        for (int i=0; i<textBooks.size(); i++) if(textBooks.get(i).getSchool().equals("미림마이스터고")) System.out.println(textBooks.get(i));
        for (TextBook tb : textBooks) if(tb.getSchool().equals("미림마이스터고")) System.out.println(tb);
    }
}
