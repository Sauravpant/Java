
package JavaGUI;

import java.awt.*;
import javax.swing.*;

public class Question3 {
  Question3() {
    String[] cityList = { "Biratnagar", "Kathmandu", "Bhaktapur", "Pokhara" };
    JFrame f = new JFrame("Question");
    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    f.setSize(500, 500);

    JLabel l1 = new JLabel("Enter name");
    JTextField t1 = new JTextField();

    JLabel l2 = new JLabel("Enter age");
    JTextField t2 = new JTextField();

    JLabel l3 = new JLabel("Select gender");
    JRadioButton r1 = new JRadioButton("Male");
    JRadioButton r2 = new JRadioButton("Female");

    ButtonGroup b = new ButtonGroup();
    b.add(r1);
    b.add(r2);

    JLabel l4 = new JLabel("Select city");
    JComboBox<String> drop = new JComboBox<String>(cityList);

    JButton b1 = new JButton("Sumbit");
    JButton b2 = new JButton("Clear");

    GridBagConstraints gbc = new GridBagConstraints();
    GridBagLayout g = new GridBagLayout();
    f.setLayout(g);

    gbc.gridx = 0;
    gbc.gridy = 0;
    gbc.ipady = 10;
    g.setConstraints(l1, gbc);
    f.add(l1);

    gbc.gridx = 4;
    gbc.gridy = 0;
    gbc.ipadx = 150;
    g.setConstraints(t1, gbc);
    f.add(t1);

    gbc.gridx = 0;
    gbc.gridy = 1;
    gbc.ipadx = 0;
    g.setConstraints(l2, gbc);
    f.add(l2);

    gbc.gridx = 4;
    gbc.gridy = 1;
    gbc.ipadx = 150;
    g.setConstraints(t2, gbc);
    f.add(t2);

    gbc.gridx = 0;
    gbc.gridy = 2;
    gbc.ipadx = 0;
    g.setConstraints(l3, gbc);
    f.add(l3);

    gbc.gridx = 1;
    gbc.gridy = 2;
    g.setConstraints(r1, gbc);
    f.add(r1);

    gbc.gridx = 4;
    gbc.gridy = 2;
    g.setConstraints(r2, gbc);
    f.add(r2);

    gbc.gridx = 0;
    gbc.gridy = 3;
    g.setConstraints(l4, gbc);
    f.add(l4);

    gbc.gridx = 4;
    gbc.gridy = 3;
    g.setConstraints(drop, gbc);
    f.add(drop);

    gbc.gridx = 0;
    gbc.gridy = 8;
    g.setConstraints(b1, gbc);
    f.add(b1);

    gbc.gridx = 4;
    gbc.gridy = 8;
    g.setConstraints(b2, gbc);
    f.add(b2);

    f.setVisible(true);
  }

  public static void main(String[] args) {
    new Question3();
  }
}
