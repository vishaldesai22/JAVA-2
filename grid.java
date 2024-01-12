import java.awt.*;
public class grid 
{public static void main(String args[])
{Frame f = new Frame("vishal desai");
f.setLayout(new GridLayout());
f.setSize(400,400);
f.setVisible(true);

Button b1 = new Button("A");
Button b2 = new Button("B");
Button b3 = new Button("C");
Button b4 = new Button("D");

f.add(b1);
f.add(b2);
f.add(b3);
f.add(b4);

}
}