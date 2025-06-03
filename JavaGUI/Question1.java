// Compare AWT with Swing. Write a GUI program using components to find sum and difference of two numbers. Use two text fields for giving input and a label for output.
//  The program should display sum if user presses mouse and difference if user release mouse.

package JavaGUI;

import java.awt.*;
import javax.swing.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class Question1 implements MouseListener {
  JFrame f;
  JTextField num1, num2, r;

  Question1() {
    f = new JFrame("Sum and Difference Calculator");
    num1 = new JTextField();
    num2 = new JTextField();
    JLabel l1=new JLabel("Enter Number 1:");
    JLabel l2=new JLabel("Enter Number 2:");
    JLabel l3=new JLabel("Result: ");
    r = new JTextField();

    f.setLayout(new GridLayout(3, 3));
    f.add(l1);
    f.add(num1);
    f.add(l2);
    f.add(num2);
    f.add(l3);
    r.setEditable(false);
    f.add(r);

    l3.addMouseListener(this);

    f.setSize(500, 500);
    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    f.setVisible(true);
  }

  public void mousePressed(MouseEvent e) {
    int number1 = Integer.parseInt(num1.getText());
    int number2 = Integer.parseInt(num2.getText());
    int sum = number1 + number2;
    r.setText("Sum: " + sum);
  }

  public void mouseReleased(MouseEvent e) {
    int number1 = Integer.parseInt(num1.getText());
    int number2 = Integer.parseInt(num2.getText());
    int difference = number1 - number2;
    r.setText("Difference: " + difference);
  }

  public void mouseClicked(MouseEvent e) {
  }

  public void mouseEntered(MouseEvent e) {
  }

  public void mouseExited(MouseEvent e) {
  }

  public static void main(String[] args) {
    new Question1();
  }
}