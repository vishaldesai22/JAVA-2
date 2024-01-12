import java.awt.*;
public class listex extends Frame 
{
listex()
{ Frame f = new Frame("vishal");
f.setSize(400,400);
f.setVisible(true);
f.setLayout(new FlowLayout());
List l1 = new List();
l1.setMultipleSelections(true);
l1.add("vishal");
l1.add("vikas");
l1.add("mohit");
l1.add("manyata");
f.add(l1);

}
public static void main(String args[])
{
listex x = new listex();
}

}