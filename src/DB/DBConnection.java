package DB;

import java.sql.*;
import java.util.Scanner;

public class DBConnection {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/mirimdb", "root", "leehm2292!"); // url 주소 잘 보기
            System.out.println("db 연결 OK");
//            int id = 2026003; String name = "박마이";
//            String dept = "Sw"; String tel = "01044444444";
//            int id = scan.nextInt();
//            String name = scan.nextLine();
//            String dept = scan.nextLine();
//            String tel = scan.nextLine();

            PreparedStatement pstmt = null;
            // update 박마이 전공을 디자인과로 변경해보세요.

            String dept = "디자인과";
            String name = "박마이";

            String updateSql = "update studenttbl set dept = ? where name = ?";
            String sql = "insert into studenttbl values(?,?,?,?)";
            String deleteSql = "delete from studenttbl where name = ?";

            pstmt = conn.prepareStatement(deleteSql);
            pstmt.setString(1, name);

            pstmt.executeUpdate();
            System.out.println("delete 성공!");


            pstmt.close();
            conn.close();



        }  catch (ClassNotFoundException e) {
            e.printStackTrace();
            System.out.println("연결 실패");
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("연결 실패");
        }

    }
}
