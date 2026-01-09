package DB;

import java.sql.DriverManager;
import java.sql.SQLException;

public class DBTest {
    public static void main(String[] args) {

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url = "jdbc://localhost:3306/mirimdb";
            DriverManager.getConnection(url, "root", "leehm2292!");
            System.out.println("미림 db 연결 ok");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
            System.out.println("DB연결 Driver 에러~~ ");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
