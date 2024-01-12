import java.awt.*;

import java.awt.event.*;

import javax.swing.*;
import javax.swing.JFrame;

public class demo extends JFrame implements ActionListener {

    CardLayout card;
    Container c;
    JButton b1, b2, b3;

    demo() {
        c = getContentPane();
        card = new CardLayout();
        c.setLayout(card);

        b1 = new JButton("first ");
        b2 = new JButton("second ");

        b1.addActionListener(this);
        b2.addActionListener(this);

        c.add("a", b1);
        c.add("b", b2);

    }

    public void actionPerformed(ActionEvent e) {
        card.next(c);
    }

    public static void main(String args[]) {
        demo c1 = new demo();
        c1.setSize(400, 400);
        c1.setVisible(true);
        c1.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

}
