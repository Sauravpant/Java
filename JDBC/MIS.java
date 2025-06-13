// You are hired by a reputed software company which is going to design an application for “Movie Rental System”. Your responsibility is to design a schema named MRS and create a table named Movie(id, Tille, Genre, Language, Length). Write a program to design a GUI form to take input for this table and insert the data into table after clicking the OK button.


import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.sql.*;

public class MIS implements MouseListener {
  public static JTextField t1, t2, t3, t4, t5;

  MIS() {
    JFrame f = new JFrame("Movie Rental System");
    f.setSize(500, 500);
    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    JLabel l1 = new JLabel("Enter Movie ID: ");
    JLabel l2 = new JLabel("Enter Title: ");
    JLabel l3 = new JLabel("Enter Genre: ");
    JLabel l4 = new JLabel("Enter Language: ");
    JLabel l5 = new JLabel("Enter Length (in mins): ");

    t1 = new JTextField();
    t2 = new JTextField();
    t3 = new JTextField();
    t4 = new JTextField();
    t5 = new JTextField();

    JButton b = new JButton("OK");

    f.setLayout(new GridLayout(6, 2));
    f.add(l1);
    f.add(t1);
    f.add(l2);
    f.add(t2);
    f.add(l3);
    f.add(t3);
    f.add(l4);
    f.add(t4);
    f.add(l5);
    f.add(t5);
    f.add(b);

    b.addMouseListener(this);
    f.setVisible(true);
  }

  public static Connection getConnection() {
    try {
      String driver = "com.mysql.cj.jdbc.Driver";
      String url = "jdbc:mysql://localhost:3306/Lab"; 
      String username = "root";
      String password = "";
      Class.forName(driver);
      return DriverManager.getConnection(url, username, password);
    } catch (Exception e) {
      System.out.println("Connection Error: " + e);
    }
    return null;
  }

  public void mouseClicked(MouseEvent e) {
    try {
      int id = Integer.parseInt(t1.getText());
      String title = t2.getText();
      String genre = t3.getText();
      String language = t4.getText();
      int length = Integer.parseInt(t5.getText());

      String query = "INSERT INTO Movie VALUES (?, ?, ?, ?, ?)";
      PreparedStatement pst = getConnection().prepareStatement(query);
      pst.setInt(1, id);
      pst.setString(2, title);
      pst.setString(3, genre);
      pst.setString(4, language);
      pst.setInt(5, length);

      pst.executeUpdate();
      System.out.println("Data inserted successfully.");
    } catch (Exception ex) {
      System.out.println("Error: " + ex);
    }
  }

  public void mousePressed(MouseEvent e) {
  }

  public void mouseReleased(MouseEvent e) {
  }

  public void mouseEntered(MouseEvent e) {
  }

  public void mouseExited(MouseEvent e) {
  }

  public static void main(String[] args) {
    new MIS();
  }
}
