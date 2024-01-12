import java.awt.*;

public class two {
    public static void main(String args[]) {
        Frame f = new Frame();
        f.setVisible(true);
        f.setSize(400, 400);
        f.setLayout(new FlowLayout());
        /*
         * List l = new List();
         * l.setMultipleMode(true);
         * l.add("vishal");
         * l.add("Desai");
         * f.add(l);
         */

        Choice c = new Choice();
        c.add("vishal");
        c.add("vikas");
        c.add("Amit");
        f.add(c);

    }
}
