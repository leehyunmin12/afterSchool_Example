//package DB;
//
//import java.sql.*;
//
//public class DBConnection {
//    public static void main(String[] args) {
//        try {
//            Class.forName("com.mysql.cj.jdbc.Driver");
//            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/mirimdb", "root", "leehm2292!"); // url 주소 잘 보기
//            System.out.println("db 연결 OK");
//
//            Statement stmt = conn.createStatement();
//
//            //String sql1 = "insert into studenttbl values(20260101, '김후배', 'sw', '01055555555')";
//            //                                                           stmt.executeUpdate(sql1); // 입력, 수정, 삭제
//            // 김후배의 연락처를 01066667777 로 수정해 보세요.
//
//            String updateSql = "update studenttbl set tel = '01066667777' where name = '김후배'";
//            stmt.executeUpdate(updateSql);
//
//            String deleteSql = "delete from studenttbl where id = 20260101";
//            stmt.executeUpdate(deleteSql);
//
//            System.out.println("insert ok!");
//
//            // 찍어보자!
//            String sql = "select * from studenttbl where dept = 'sw';"; // studenttbl에서 학과가 sw인 부분 검색
//            ResultSet rs = stmt.executeQuery(sql); // sql문을 ResultSet 객체에 저장
//            while (rs.next() == true) { // Resultset 객체 안에 있는 내용을 출력!
//                int id = rs.getInt(1);
//                String name = rs.getString(2);
//                String dept = rs.getString("dept");
//                String tel = rs.getString("tel");
//                System.out.println(id + ", " + name + ", " + dept + ", " + tel);
//            }
//            rs.close();
//            stmt.close();
//            conn.close();
//
//        }  catch (ClassNotFoundException e) {
//            e.printStackTrace();
//            System.out.println("연결 실패");
//        } catch (SQLException e) {
//            e.printStackTrace();
//            System.out.println("연결 실패");
//        }
//
//    }
//}
