package DB;

import java.sql.*;

public class shopDBConnection {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/shopdb", "root", "leehm2292!"); // url 주소 잘 보기
            System.out.println("db 연결 OK");

            Statement stmt = conn.createStatement();

            // 주소가 서울인 객체의 id, 이름, 주소를 검색, 조회 해보자

            String selectQuery = "select userid, username, addr from usertbl where addr = '서울'";
            ResultSet rs = stmt.executeQuery(selectQuery);
            while(rs.next()) {
                String userid = rs.getString(1);
                String username = rs.getString(2);
                String addr = rs.getString("addr");

                System.out.println("id : " + userid + ", name : " + username + ", addr : " + addr);
            }

            String selectQuery2 = "select username, mobile1, mobile2, height from usertbl where height >= 170 and height <=175";
            ResultSet rs2 = stmt.executeQuery(selectQuery2);
            while(rs2.next()) {
                String username = rs2.getString("username");
                String mobile1 = rs2.getString("mobile1");
                String mobile2 = rs2.getString("mobile2");
                String height = rs2.getString("height");

                System.out.println("username : " + username + ", mobile1 : " + mobile1 + ", mobile2 : " + mobile2 + ", height : " + height);
            }

            String selectQuery3 = "select * from usertbl where username = '강호동'";
            ResultSet rs3 = stmt.executeQuery(selectQuery3);
            while(rs3.next()) {
                String userid = rs3.getString(1);
                String username = rs3.getString("username");
                String birthyear = rs3.getString("birthyear");
                String addr = rs3.getString("addr");
                String mobile1 = rs3.getString("mobile1");
                String mobile2 = rs3.getString("mobile2");
                String height = rs3.getString("height");
                String mDate = rs3.getString("mDate");

                System.out.print("userid : " + userid);
                System.out.println(", username : " + username + ", mobile1 : " + mobile1 + ", mobile2 : " + mobile2 + ", height : " + height);
                System.out.println(", birthyear : " + birthyear + ", addr : " + addr + ", mDate : " + mDate);
            }


            rs.close();
            stmt.close();
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
