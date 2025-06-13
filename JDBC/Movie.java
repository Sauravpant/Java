//  Assume a table MOVIE(id, title, genre). Now, using JDBC perform queries:
// a. Add any three records to the MOVIE table.
// b. Using a prepared statement, update the genre to “Comedy” having the title “Jatra”.

import java.sql.*;

public class Movie {
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
    tableOperation();
  }

  public static void tableOperation() {
    try {
      Connection conn = getConnection();
      // a
      String query = "INSERT INTO movie1 VALUES (?,?,?),(?,?,?),(?,?,?)";
      PreparedStatement ps = conn.prepareStatement(query);
      ps.setInt(1, 1);
      ps.setString(2, "Hera pheri");
      ps.setString(3, "Comedy");
      ps.setInt(4, 2);
      ps.setString(5, "Jatra");
      ps.setString(6, "Action");
      ps.setInt(7, 3);
      ps.setString(8, "War");
      ps.setString(9, "Action");
      ps.executeUpdate();

      System.out.println("Data inserted");

      // b

      query = "UPDATE movie1 SET genre=? WHERE title='Jatra'";
      ps = conn.prepareStatement(query);
      ps.setString(1, "Comedy");
      ps.executeUpdate();

      System.out.println("Genre updated to Comedy");
      conn.close();

    } catch (Exception e) {
      System.out.println("Error: " + e);
    }
  }
}