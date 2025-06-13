// Write a program to extract the user information such as Reg_no, Name, Address, Phone_no from the database and display in the console.

import java.sql.*;

public class User {
  public static Connection getConnection() {
    try {
      String driver = "com.mysql.cj.jdbc.Driver";
      String databaseURL = "jdbc:mysql://localhost:3306/Lab";
      String username = "root";
      String password = "";
      Class.forName(driver);
      Connection conn = DriverManager.getConnection(databaseURL, username, password);
      return conn;
    } catch (Exception e) {
      System.out.println("Error: " + e);
    }
    return null;
  }

  public static void main(String[] args) {
    try {
      Connection conn = getConnection();
      String query = "SELECT Reg_no, Name, Address, Phone_no FROM user";
      Statement stmt = conn.createStatement();
      ResultSet rs = stmt.executeQuery(query);

      System.out.println("User Information:");
      while (rs.next()) {
        int regNo = rs.getInt("Reg_no");
        String name = rs.getString("Name");
        String address = rs.getString("Address");
        String phone = rs.getString("Phone_no");

        System.out.println("Reg_no: " + regNo);
        System.out.println("Name: " + name);
        System.out.println("Address: " + address);
        System.out.println("Phone_no: " + phone);
      }

      conn.close();
    } catch (Exception e) {
      System.out.println("Error: " + e);
    }
  }
}
