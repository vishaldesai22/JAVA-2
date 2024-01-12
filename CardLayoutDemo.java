import java.awt.*;
import java.awt.event.*;
import javax.swing.JFrame;
import javax.swing.*;

public class CardLayoutDemo extends JFrame implements ActionListener {

    CardLayout card;
    JButton b1, b2, b3;
    Container c;

    CardLayoutDemo() {
        c = getContentPane();
        card = new CardLayout(40, 30);
        c.setLayout(card);

        b1 = new JButton("First Level");
        b2 = new JButton("Second Level");

        b1.addActionListener(this);
        b2.addActionListener(this);

        c.add("a", b1);
        c.add("b", b2);
    }

    public void actionPerformed(ActionEvent e) {
        card.next(c);
    }

    public static void main(String[] args) {
        CardLayoutDemo cl = new CardLayoutDemo();

        cl.setSize(400, 400);
        cl.setVisible(true);
        cl.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
}