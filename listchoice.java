import java.awt.*;

public class listchoice {
    public static void main(String args[]) {
        Frame f = new Frame("frame");
        f.setTitle("example ");
        f.setLayout(new FlowLayout());
        f.setVisible(true);

        Choice c = new Choice();
        c.add("vishal");
        c.add("vikas ");
        c.add("mohit");
        c.add("abhishek");
        c.add("akash");
        Label z = new Label("select your choice");
        List l = new List();
        l.setMultipleSelections(true);
        l.add("times new roman");
        l.add("pudhari");
        l.add("tarunbharat");

        f.add(c);
        f.add(z);
        f.add(l);
    }

}
