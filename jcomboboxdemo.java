import java.awt.*;
import javax.swing.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
public class jcomboboxdemo extends JApplet implements ItemListener
{ JLabel obj = new JLabel();

public void init()
{
setLayout(FlowLayout());
setSize(400,400);
setVisible(true);
JComboBox object1 = new JComboBox();
object1.add("kolhapur");
object1.add("Solapur");
object1.addItemListener(this);
 add(obj);
 add(object1);
 
}
public void itemStateChanged(ItemEvent ie)
{ String stateName = (String)ie.getItem();
obj.setText("you are in "+stateName);
}
}