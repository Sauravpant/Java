// Write a java program to design an GUI application that reads teacher information like as tchID, tchName, tchAddress, tchPhone and store into a database called “citizen” when user clicks on a button(login).

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.sql.*;

public class Teacher implements MouseListener {
  public static JTextField t1, t2, t3, t4;

  Teacher() {
    JFrame f = new JFrame("Database");
    f.setSize(500, 500);
    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    JLabel l1 = new JLabel("Enter teacher id: ");
    JLabel l2 = new JLabel("Enter teacher name: ");
    JLabel l3 = new JLabel("Enter teacher address: ");
    JLabel l4 = new JLabel("Enter teacher phone: ");
    t1 = new JTextField();
    t2 = new JTextField();
    t3 = new JTextField();
    t4 = new JTextField();
    JButton b = new JButton("Login");
    f.setLayout(new GridLayout(5, 5));
    f.add(l1);
    f.add(t1);
    f.add(l2);
    f.add(t2);
    f.add(l3);
    f.add(t3);
    f.add(l4);
    f.add(t4);
    f.add(b);
    b.addMouseListener(this);
    f.setVisible(true);
  }

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
    new Teacher();
  }

  public void mouseClicked(MouseEvent e) {
    try {
      int tId = Integer.parseInt(t1.getText());
      String teacherName = t2.getText();
      String address = t3.getText();
      String phone = t4.getText();
      Connection conn = getConnection();
      String query = "INSERT INTO Teacher Values (?,?,?,?)";
      PreparedStatement psc = conn.prepareStatement(query);
      psc.setInt(1, tId);
      psc.setString(2, teacherName);
      psc.setString(3, address);
      psc.setString(4, phone);
      psc.executeUpdate();
      System.out.println("Data entered into the database");
      conn.close();
    } catch (Exception ex) {
      System.out.println("Error:" + ex);
    }
  }

  public void mouseReleased(MouseEvent e) {

  }

  public void mousePressed(MouseEvent e) {

  }

  public void mouseEntered(MouseEvent e) {

  }

  public void mouseExited(MouseEvent e) {

  }

}
