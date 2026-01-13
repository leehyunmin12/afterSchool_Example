package Test;

import java.sql.*;
import java.util.Scanner;
import java.util.concurrent.CopyOnWriteArrayList;

class Person {
    private String name, phone;

    public Person() {}
    public Person(String name, String phone) {
        this.name = name;
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }
}

interface StudentInterface {
    String getAbCGrade();
    String getPFGrade();
    String getDeft();
    Double getAve();
}
class Student extends Person implements StudentInterface {

    static int count = 0;
    private int stuid, math, phyc;
    private String jeongong;

    public Student() {}
    public Student(String name, String phone, int stuid, String jeongong, int math, int phyc) {
        super(name, phone);
        this.stuid = stuid;
        this.jeongong = jeongong;
        this.math = math;
        this.phyc = phyc;

        count ++;
    }

    public int getStuid() {
        return stuid;
    }

    public void setStuid(int stuid) {
        this.stuid = stuid;
    }

    public String getJeongong() {
        return jeongong;
    }

    public void setJeongong(String jeongong) {
        this.jeongong = jeongong;
    }

    public int getMath() {
        return math;
    }

    public void setMath(int math) {
        this.math = math;
    }

    public int getPhyc() {
        return phyc;
    }

    public void setPhyc(int phyc) {
        this.phyc = phyc;
    }

    @Override
    public String toString() {
        return "Student{" +
                "stuid=" + stuid +
                ", jeongong=" + jeongong +
                ", math=" + math +
                ", phyc=" + phyc +
                '}';
    }

    @Override
    public String getAbCGrade() {
        String grade;

        if (math >= 90) grade = "A";
        else if (math>=80) grade = "B";
        else if (math>=70) grade = "C";
        else grade = "F";

        return grade;
    }

    @Override
    public String getPFGrade() {
        String grade;

        if (phyc >= 60) grade = "P";
        else grade = "F";

        return grade;
    }

    @Override
    public String getDeft() {
        String major = "";

        if(jeongong.equals("1000")) major = "컴퓨터공학부 컴퓨터소프트웨어공학과";
        else if(jeongong.equals("2000")) major = "경영학부 경영학과";
        else if(jeongong.equals("3000")) major = "컴퓨터공학부 인공지능소프트웨어학과";


        return major;
    }

    @Override
    public Double getAve() {
        return (double)(math+phyc)/2;
    }
}

public class DBTest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/shopdb", "root", "leehm2292!"); // url 주소 잘 보기
            System.out.println("db 연결 OK");
            int cnt = 0;

            while(true) {
                System.out.println("1. 입력\n2. 전체 조회\n3. 이름으로 검색\n4. 학번으로 검색\n5. 수정\n6. 삭제\n0. 종료");
                System.out.print("메뉴를 입력하시오. >>");
                int choice = scan.nextInt();

                switch (choice) {
                    case 1 : insert(scan, conn); break;
                    case 2 : selectAll(conn); break;
                    case 3 : selectName(scan, conn); break;
                    case 4 : selectUser(scan, conn); break;
                    case 5 : updateUser(scan, conn); break;
                    case 6 : deleteUser(scan, conn); break;
                    default:
                        System.out.println("종료합니다.");
                        cnt=1;
                }
                if(cnt == 1) break;
            }




        }  catch (ClassNotFoundException e) {
            e.printStackTrace();
            System.out.println("연결 실패");
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("연결 실패");
        }
    }

    private static void deleteUser(Scanner scan, Connection conn) throws SQLException {
        scan.nextLine();
        System.out.print("삭제하고자 하는 목록 이름을 입력하세요 : ");
        String name = scan.nextLine();

        String sql = "delete from persontbl where username = ?";
        PreparedStatement pstmt = conn.prepareStatement(sql);
        pstmt.setString(1, name);

        pstmt.executeUpdate();

        System.out.println("삭제가 완료되었습니다.");

    }

    private static void updateUser(Scanner scan, Connection conn) {
        scan.nextLine();
        System.out.print("수정할 학생의 이름을 입력하세요 : ");
        String updateName = scan.nextLine();

        System.out.println("--------------- 수정 부분 ----------------");
        System.out.print("이름을 입력하시오 : ");
        String name = scan.next();
        System.out.print("전화번호를 입력하시오 : ");
        String tel = scan.next();
        System.out.print("학번을 입력하시오 : ");
        int userid = scan.nextInt();
        scan.nextLine();
        System.out.print("학과코드를 입력하시오 : ");
        String jeongong = scan.next();
        System.out.print("수학점수를 입력하시오 : ");
        int math = scan.nextInt();
        System.out.print("체육점수를 입력하시오 : ");
        int phyc = scan.nextInt();


    }

    private static void selectUser(Scanner scan, Connection conn) throws SQLException {
        System.out.print("검색하고자 하는 학번을 입력하세요 : ");
        int userid = scan.nextInt();

        String sql = "select * from persontbl where userid = ?";
        PreparedStatement pstmt = conn.prepareStatement(sql);
        pstmt.setInt(1, userid);
        ResultSet rs = pstmt.executeQuery();

        while(rs.next()) {
            System.out.println("\n=== " + rs.getString(1) + "학생 명단 ===" );
            System.out.println("---------------------------------------------------------------------------------------");
            System.out.println("| 이름 |     연락처     |   학번   |        학과        |  수학성적 | 등급 | 체육성적 | 등급 | 평균 |");
            System.out.println("---------------------------------------------------------------------------------------");

            System.out.print(rs.getString(1) + " | " + rs.getString(2) + " | " + rs.getInt(3) + " | ");
            System.out.print(rs.getString(4) + " | " + rs.getInt(5) + " | " + rs.getString(7) + " | ");
            System.out.println(rs.getInt(6) + " | " + rs.getString(8) + " | " + rs.getDouble(9));
        }

    }

    private static void selectName(Scanner scan, Connection conn) throws SQLException {
        scan.nextLine();
        System.out.print("검색하고자 하는 이름을 입력하세요 : ");
        String name = scan.nextLine();

        String sql = "select * from persontbl where username = ?";
        PreparedStatement pstmt = conn.prepareStatement(sql);
        pstmt.setString(1, name);
        ResultSet rs = pstmt.executeQuery();

        System.out.println("\n=== " + name + "학생 명단 ===" );
        System.out.println("---------------------------------------------------------------------------------------");
        System.out.println("| 이름 |     연락처     |   학번   |        학과        |  수학성적 | 등급 | 체육성적 | 등급 | 평균 |");
        System.out.println("---------------------------------------------------------------------------------------");
        while(rs.next()) {
            System.out.print(rs.getString(1) + " | " + rs.getString(2) + " | " + rs.getInt(3) + " | ");
            System.out.print(rs.getString(4) + " | " + rs.getInt(5) + " | " + rs.getString(7) + " | ");
            System.out.println(rs.getInt(6) + " | " + rs.getString(8) + " | " + rs.getDouble(9));
        }
        System.out.println();

    }

    private static void selectAll(Connection conn) throws SQLException {
        String sql = "select * from persontbl";

        PreparedStatement pstmt = conn.prepareStatement(sql);
        ResultSet rs = pstmt.executeQuery();


        System.out.println("\n=== 전체 학생 명단 ===");
        System.out.println("---------------------------------------------------------------------------------------");
        System.out.println("| 이름 |     연락처     |   학번   |        학과        |  수학성적 | 등급 | 체육성적 | 등급 | 평균 |");
        System.out.println("---------------------------------------------------------------------------------------");
        while(rs.next()) {
            System.out.print(rs.getString(1) + " | " + rs.getString(2) + " | " + rs.getInt(3) + " | ");
            System.out.print(rs.getString(4) + " | " + rs.getInt(5) + " | " + rs.getString(7) + " | ");
            System.out.println(rs.getInt(6) + " | " + rs.getString(8) + " | " + rs.getDouble(9));
        }
        System.out.println();

    }

    private static void insert(Scanner scan, Connection conn) throws SQLException {
        System.out.print("이름을 입력하시오 : ");
        String name = scan.next();
        System.out.print("전화번호를 입력하시오 : ");
        String tel = scan.next();
        System.out.print("학번을 입력하시오 : ");
        int userid = scan.nextInt();
        scan.nextLine();
        System.out.print("학과코드를 입력하시오 : ");
        String jeongong = scan.next();
        System.out.print("수학점수를 입력하시오 : ");
        int math = scan.nextInt();
        System.out.print("체육점수를 입력하시오 : ");
        int phyc = scan.nextInt();

        Student student = new Student(name, tel, userid, jeongong, math, phyc);

        String sql = "insert into persontbl values(?,?,?,?,?,?,?,?,?)";
        PreparedStatement pstmt = conn.prepareStatement(sql);

        pstmt.setString(1, student.getName());
        pstmt.setString(2, student.getPhone());
        pstmt.setInt(3, student.getStuid());
        pstmt.setString(4, student.getDeft());
        pstmt.setInt(5, student.getMath());
        pstmt.setInt(6, student.getPhyc());
        pstmt.setString(7, student.getAbCGrade());
        pstmt.setString(8, student.getPFGrade());
        pstmt.setDouble(9, student.getAve());

        pstmt.executeUpdate();
        System.out.println("입력이 완료되었습니다.");
    }
}
