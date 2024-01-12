import java.awt.*;

public class btn extends Frame {
    public static void main(String[] args) {
        Frame f = new Frame();
        Button b0 = new Button("click here");
        Button b1 = new Button("Cancel");
        Button b2 = new Button("Reset");
        b0.setBounds(55, 100, 85, 35);
        b1.setBounds(55, 150, 85, 35);
        b2.setBounds(55, 200, 85, 35);
        f.setSize(400, 400);

        f.setVisible(true);
    }
}