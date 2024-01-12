import java.awt.*;
import java.applet.*;

public class textAF
{
public static void main(String args[])
{
Frame f = new Frame("vishal desai");

TextArea b = new TextArea("click here");
TextField b1 = new TextField("click dude");

b.setBounds(55,100,85,35);
b1.setBounds(30,130,110,50);
f.setSize(500,500);
f.setLayout(new FlowLayout());
f.setVisible(true);
f.add(b);
f.add(b1);

}
}