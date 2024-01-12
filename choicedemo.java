import java.awt.*;
public class choicedemo extends Frame 
{public static void main(String args[])
{

Frame f = new Frame("vishal");
f.setLayout(new FlowLayout());
f.setSize(400,400);
f.setVisible(true);
Choice c = new Choice();
c.add("vishal");
c.add("vikas");
c.add("mohit");
c.add("Manyata");
f.add(c);

}
}