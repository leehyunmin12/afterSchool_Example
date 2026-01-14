package DBTEST.dao;

import DBTEST.model.Student;

import java.sql.*;

public class StudentDAO {

    private Connection conn;

    public StudentDAO(Connection conn) {
        this.conn = conn;
    }

    public void insert(Student student) throws SQLException {
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
    }

    public ResultSet selectAll() throws SQLException {
        String sql = "select * from persontbl";
        PreparedStatement pstmt = conn.prepareStatement(sql);
        return pstmt.executeQuery();
    }

    public ResultSet selectByName(String name) throws SQLException {
        String sql = "select * from persontbl where username = ?";
        PreparedStatement pstmt = conn.prepareStatement(sql);
        pstmt.setString(1, name);
        return pstmt.executeQuery();
    }

    public ResultSet selectById(int id) throws SQLException {
        String sql = "select * from persontbl where userid = ?";
        PreparedStatement pstmt = conn.prepareStatement(sql);
        pstmt.setInt(1, id);
        return pstmt.executeQuery();
    }

    public void delete(String name) throws SQLException {
        String sql = "delete from persontbl where username = ?";
        PreparedStatement pstmt = conn.prepareStatement(sql);
        pstmt.setString(1, name);
        pstmt.executeUpdate();
    }
}
