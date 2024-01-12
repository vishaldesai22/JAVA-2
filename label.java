import java.awt.*;


public class label
{
public static void main(String args[])

{

Frame f = new Frame ("vishal desai");
Label b1 = new Label("by by");
b1.setBounds(55,100,85,35);
f.setSize(500,500);
f.setLayout(new FlowLayout());
f.setVisible(true);
f.add(b1);

}
}