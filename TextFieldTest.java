import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class TextFieldTest extends JFrame {
    private JTextField text1, text2, text3;
    private JPasswordField password;

    public TextFieldTest() {
        super("Testing JTextField and JPasswordField");
        Container c = getContentPane();
        c.setLayout(new FlowLayout());
        // construct textfield with default sizing
        text1 = new JTextField(10);
        c.add(text1);
        // construct textfield with default text
        text2 = new JTextField("Enter text here");
        c.add(text2);
        // construct textfield with default text and
        // 20 visible elements and no event handler
        text3 = new JTextField("Uneditable text field", 20);
        text3.setEditable(false);
        c.add(text3);
        // construct textfield with default text
        password = new JPasswordField("Hidden text");
        c.add(password);
        TextFieldHandler handler = new TextFieldHandler();
        text1.addActionListener(handler);
        text2.addActionListener(handler);
        text3.addActionListener(handler);
        password.addActionListener(handler);
        setSize(325, 100);
        show();
    }

    public static void main(String args[]) {
        TextFieldTest app = new TextFieldTest();
        app.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }

    private class TextFieldHandler implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String s = "";
            if (e.getSource() == text1)
                s = "text1: " + e.getActionCommand();
            else if (e.getSource() == text2)
                s = "text2: " + e.getActionCommand();
            else if (e.getSource() == text3)
                s = "text3: " + e.getActionCommand();
            else if (e.getSource() == password) {
                JPasswordField pwd = (JPasswordField) e.getSource();
                s = "password: " + new String(pwd.getPassword());
            }
            JOptionPane.showMessageDialog(null, s);
        }
    }
}