import java.awt.*;

public class menu {
    public static void main(String args[]) {
        Frame f = new Frame();
        f.setVisible(true);
        f.setLayout(new FlowLayout());
        f.setSize(400, 400);
        MenuBar m = new MenuBar();
        Menu m1 = new Menu("file");
        Menu m2 = new Menu("edit");
        Menu m3 = new Menu("view");
        MenuItem m11 = new MenuItem("new ");
        MenuItem m12 = new MenuItem("open");
        m.add(m1);
        m.add(m2);
        m.add(m3);
        m3.add(m11);
        m3.add(m12);
        f.setMenuBar(m);
    }
}