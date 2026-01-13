package DB;

import java.sql.*;

public class DBSelect {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/shopdb", "root", "leehm2292!"); // url 주소 잘 보기
            System.out.println("db 연결 OK");

            PreparedStatement pstmt = null;

            String sql = "select distinct U.userid, U.username, U.addr from usertbl U, buytbl B where U.userid = B.userid and U.username like '이%' order by U.username";

            pstmt = conn.prepareStatement(sql);
            ResultSet rs = pstmt.executeQuery();

            while(rs.next()) {
                String userid = rs.getString(1);
                String username = rs.getString(2);
                String addr = rs.getString(3);

                System.out.println("아이디 : " + userid + ", 이름 : " + username + ", 주소 : " + addr);
            }


        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
