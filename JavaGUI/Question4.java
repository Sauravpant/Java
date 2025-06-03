// Write a GUI program using components to find factorial and cube of number. Use TextField for giving input and label for output. The program should display factorial 
// if user press mouse on result button and cube if user release mouse from result button.

package JavaGUI;


import java.awt.*;
import javax.swing.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class Question4 implements MouseListener {
  JFrame f;
  JTextField num1, r;

  Question4() {
    f = new JFrame("Calculator");
    num1 = new JTextField();
    JLabel l1=new JLabel("Enter Number:");
    JButton b=new JButton("Result: ");
    r = new JTextField();

    f.setLayout(new GridLayout(2, 2));
    f.add(l1);
    f.add(num1);
    f.add(b);
    r.setEditable(false);
    f.add(r);

    b.addMouseListener(this);

    f.setSize(500, 500);
    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    f.setVisible(true);
  }

  public void mousePressed(MouseEvent e) {
    int num = Integer.parseInt(num1.getText());
    int fact=1;
    for(int i=1;i<=num;i++) {
      fact*=i;
    }
    r.setText("Factorial: " + fact);
  }

  public void mouseReleased(MouseEvent e) {
    int num = Integer.parseInt(num1.getText());
    r.setText("Cube: " + num*num*num);
  }

  public void mouseClicked(MouseEvent e) {
  }

  public void mouseEntered(MouseEvent e) {
  }

  public void mouseExited(MouseEvent e) {
  }

  public static void main(String[] args) {
    new Question4();
  }
}