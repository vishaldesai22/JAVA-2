import java.awt.*;

public class fifth {
    public static void main(String args[]) {
        Frame f = new Frame();
        f.setLayout(new FlowLayout());
        f.setVisible(true);
        f.setSize(400, 400);
        MenuBar m = new MenuBar();
        Menu m1 = new Menu("EDit");
        Menu m2 = new Menu("file");
        Menu m3 = new Menu("vishal");
        MenuItem mi1 = new MenuItem("open");
        MenuItem mi2 = new MenuItem("open1");

        m.add(m1);
        m.add(m2);
        m.add(m3);
        m3.add(mi1);
        m3.add(mi2);
        f.setMenuBar(m);
    }
}
