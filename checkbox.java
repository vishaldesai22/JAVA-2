import java.awt.*;
public class checkbox extends Frame
{
    
    public static void main (String args[])
    {
        Frame f1 = new Frame();
        Checkbox c1 = new Checkbox ("vishal",true);
        c1.setBounds(100,100,100,100);

        Checkbox c2 = new Checkbox ("vikas",false);
        c2.setBounds(150,150,150,150);
        f1.add(c1);
        f1.add(c2);
        f1.setSize(400,400);
        f1.setVisible(true);

    }
}