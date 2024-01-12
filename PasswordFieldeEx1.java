import javax.swing.*;
import java.awt.event.*;

public class PasswordFieldeEx1 {
  public static voidmain(String[] args)
    {JFrame F=newJFrame("Password Field Example");
    final JPasswordField value =newJPasswordField();
    value.setBounds(100,75,100,30);
    JLabel L1=newJLabel("Username:-");
    L1.setBounds(20,20,80,30);
    JLabel L2=newJLabel("Password:-");
    L2.setBounds(20,75,80,30);
    JButton B =newJButton("Login");
    B.setBounds(100,120,80,30);
    final JTextField text =newJTextField();
    text.setBounds(100,20,100,30);
    F.add(value);
    F.add(L1);
    F.add(L2);
    F.add(B);
    F.add(text);
    F.setSize(300,300);
    F.setLayout(null);
    F.setVisible(true);
    B.addActionListener(newActionListener())
    { public voidactionPerformed (ActionEvent event) 
        {event.getSource();
            char [] password =value.getPassword();
            if(password.length<6) {
                System.out.println("Password length must be >6 characters"); 
            }else
            {System.out.println("Login successfully");
        }}});
    }
}
