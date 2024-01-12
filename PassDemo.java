import javax.swing.*;
import java.awt.event.*;

public class PassDemo extends JPanel {

    JLabel lblName;
    JLabel lblPasswd;

    JTextField txtName;
    JPasswordField txtPasswd;

    public PassDemo() {
        lblName = new JLabel("Enter the User Name: ");
        txtName = new JTextField(10);
        lblPasswd = new JLabel("Enter the Password: ");
        txtPasswd = new JPasswordField(10);
        txtPasswd.setEchoChar('*');

        txtName.setToolTipText("Enter User Name");
        txtPasswd.setToolTipText("Enter Password");

        add(lblName);
        add(txtName);
        add(lblPasswd);
        add(txtPasswd);
    }

    public static void main(String[] args) {

        PassDemo demo = new PassDemo();

        JFrame frm = new JFrame("Password Demo");
        frm.setContentPane(demo);

        frm.setSize(275, 300);

        frm.setVisible(true);
        WindowListener listener = new WindowAdapter() {
            public void windowClosing(WindowEvent winEvt) {
                System.exit(0);
            }
        };

        frm.addWindowListener(listener);
    }
}
