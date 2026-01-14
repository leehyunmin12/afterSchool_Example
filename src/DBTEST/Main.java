package DBTEST;

import DBTEST.controller.StudentController;
import DBTEST.dao.StudentDAO;
import DBTEST.view.StudentView;

import java.sql.Connection;
import java.sql.DriverManager;

public class Main {
    public static void main(String[] args) throws Exception {

        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection conn = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/shopdb",
                "root",
                "leehm2292!"
        );

        StudentDAO dao = new StudentDAO(conn);
        StudentView view = new StudentView();
        StudentController controller = new StudentController(dao, view);

        controller.run();
    }
}
