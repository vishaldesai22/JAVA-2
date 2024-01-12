import javax.swing.*;
import java.awt.Dimension;
 import java.awt.*;
 import java.awt.Font;
 import java.awt.event.*;
public class JTextop1 implements KeyListener
{
JTextField tf , tf1 ; 
JLabel res,res1,res2,res3,j1; 
JTextop1()
{
JFrame f = new JFrame(); 
f.setVisible(true); 
f.setSize(400,400); 
f.setLayout(new FlowLayout());

 JLabel jl = new JLabel("Enter 1st Number:"); 

tf = new JTextField(5);


JLabel jl1 = new JLabel("Enter 2nd Number:");
 tf1 = new JTextField(5);
res = new JLabel("CTRL + A  FOR ADDITION \n \n"); 
tf1.addKeyListener(this);
res1 = new JLabel("   " +"CTRL + S  FOR SUBTRACTION \n \n");
res2 = new JLabel("   "+"CTRL + M  FOR MULTIPLICATION \n \n"); 
res3 = new JLabel("   "+"CTRL + D  FOR DIVISION \n \n \n \n \n");
f.add(jl);
f.add(tf);
f.add(jl1);
f.add(tf1);
f.add(res);
f.add(res1);
f.add(res2);
f.add(res3);
res.setBounds(200,300,400,400);

}
public static void main(String[] args)
{
JTextop1 jt = new JTextop1();
}

private void clearText()
{
res.setText("");
res1.setText("");
res2.setText("");
res3.setText("");
}
/*private void clearText1()
{
tf.setText("");
tf1.setText("");
}*/
public void keyPressed(KeyEvent e)
{
String str1 = tf.getText();
double fn = Double.parseDouble(str1);
double sn = Double.parseDouble(tf1.getText()); 
if((e.getKeyCode()==KeyEvent.VK_A) && ((e.getModifiers() & KeyEvent.CTRL_MASK)!=0))
{
clearText();
res.setText("Sum is " + (fn+sn));
}
if((e.getKeyCode()==KeyEvent.VK_S) && ((e.getModifiers() & KeyEvent.CTRL_MASK)!=0))
{
clearText();
res1.setText("Substraction is " + (fn-sn));
}
if((e.getKeyCode()==KeyEvent.VK_M) && ((e.getModifiers() & KeyEvent.CTRL_MASK)!=0))
{
clearText();
res2.setText("Multiplication is " + (fn*sn));
}


if((e.getKeyCode()==KeyEvent.VK_D) && ((e.getModifiers() & KeyEvent.CTRL_MASK)!=0))
{
clearText();
res3.setText("Division is " + (fn/sn));
}


}
public void keyReleased(KeyEvent e)
{
System.out.println("Key is released");
}
public void keyTyped(KeyEvent e)
{
System.out.println("Key is pressed");
}
}

