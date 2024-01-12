import java.awt.*;

public class simple extends Frame {
    public static void main(String args[]) {
        Frame f1 = new Frame("vishal");
f1.setSize(500,500);
f1.setVisible(true);
Button b1 = new Button("vishal");
b1.setBounds(100,100,100,100);
b1.setLocation(300,300);
Label l = new Label("vishal desai");
f1.add(l);
l.setBounds(100,100,100,200);
Button b2 = new Button("click");
b2.getLabel();
f1.add(b1);
f1.add(b2);
    }
}
