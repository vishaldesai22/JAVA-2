import java.awt.*;

public class borderlayout {
    public static void main(String args[]) {
        Frame f = new Frame("vishal desai");
        f.setLayout(new BorderLayout());
        f.setSize(400, 400);
        f.setVisible(true);
        Button b1 = new Button("east");
        Button b2 = new Button("west");
        Button b3 = new Button("north");
        Button b4 = new Button("south");
        Button b5 = new Button("center");
        f.add(b1, BorderLayout.EAST);
        f.add(b2, BorderLayout.WEST);
        f.add(b3, BorderLayout.NORTH);
        f.add(b4, BorderLayout.SOUTH);
        f.add(b5, BorderLayout.CENTER);

    }
}