import java.awt.*;


public class bdemo1 
{
public static void main(String args[])

{

Frame f = new Frame ("vishal desai");
Button b = new Button("click here");
Button b1 = new Button("by by");
b.setBounds(55,100,85,35);
b1.setBounds(30,130,110,50);
f.setSize(500,500);
f.setLayout(new FlowLayout());
f.setVisible(true);
f.add(b);
f.add(b1);
}
}