package DBTEST.view;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

import DBTEST.model.Student;

public class StudentView {

    private Scanner scan = new Scanner(System.in);

    public int showMenu() {
        System.out.println("1. 입력\n2. 전체 조회\n3. 이름 검색\n4. 학번 검색\n5. 삭제\n0. 종료");
        System.out.print("메뉴 >> ");
        return scan.nextInt();
    }

    public Student inputStudent() {
        System.out.print("이름: ");
        String name = scan.next();
        System.out.print("전화번호: ");
        String tel = scan.next();
        System.out.print("학번: ");
        int id = scan.nextInt();
        System.out.print("학과코드: ");
        String dept = scan.next();
        System.out.print("수학: ");
        int math = scan.nextInt();
        System.out.print("체육: ");
        int phyc = scan.nextInt();

        return new Student(name, tel, id, dept, math, phyc);
    }

    public String inputName() {
        System.out.print("이름 입력: ");
        return scan.next();
    }

    public int inputId() {
        System.out.print("학번 입력: ");
        return scan.nextInt();
    }

    public void printResult(ResultSet rs) throws SQLException {

        System.out.println("==============================================================");
        System.out.println("------------------------- 학생 목록 ---------------------------");
        System.out.println("==============================================================");
        while (rs.next()) {
            System.out.println(
                    rs.getString(1) + " | " +
                            rs.getString(2) + " | " +
                            rs.getInt(3) + " | " +
                            rs.getString(4) + " | " +
                            rs.getInt(5) + " | " +
                            rs.getString(7) + " | " +
                            rs.getInt(6) + " | " +
                            rs.getString(8) + " | " +
                            rs.getDouble(9)
            );
        }
    }
}
