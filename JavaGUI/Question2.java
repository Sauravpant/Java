//Using swing components, design a form with three buttons with captions “RED”, “BLUE” and “Green” respectively. Then write a program to handle the event such that 
// when the user clicks the button, the color of that caption will be the same as its button.

package JavaGUI;

import java.awt.*;
import javax.swing.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class Question2 implements MouseListener {
  JFrame f;
  JPanel panel;
  JButton b1, b2, b3;

  Question2() {
    f = new JFrame("Color change");
    panel = new JPanel();
    b1 = new JButton("Red");
    b2 = new JButton("Blue");
    b3 = new JButton("Green"); 

    panel.setLayout(new FlowLayout(FlowLayout.CENTER));
    panel.add(b1);
    panel.add(b2);
    panel.add(b3);

    b1.addMouseListener(this);
    b2.addMouseListener(this);
    b3.addMouseListener(this);

    f.add(panel);

    f.setSize(500, 500);
    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    f.setVisible(true);
  }

  public void mouseClicked(MouseEvent e) {
    if (e.getSource() == b1) {
      panel.setBackground(Color.RED);
    } else if (e.getSource() == b2) {
      panel.setBackground(Color.BLUE);
    } else if (e.getSource() == b3) {
      panel.setBackground(Color.GREEN);
    }
  }

  public void mousePressed(MouseEvent e) {}
  public void mouseExited(MouseEvent e) {}
  public void mouseEntered(MouseEvent e) {}
  public void mouseReleased(MouseEvent e) {}

  public static void main(String[] args) {
    new Question2();
  }
}
