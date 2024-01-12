import javax.swing.*;
import java.awt.*;

public class State extends JFrame {
    JComboBox jc;

    State() {
        Container c = getContentPane();
        c.setLayout(new FlowLayout());
        jc = new JComboBox();
        jc.addItem("Maharashtra");
        jc.addItem("Goa");
        jc.addItem("Andhra Pradesh");
        jc.addItem("Gujarat");
        jc.addItem("Jammu and Kashmir");
        jc.addItem("Kerala");
        jc.addItem("Orrisa");
        jc.addItem("Punjab");
        jc.addItem("Rajasthan");
        add(jc);
    }

    public static void main(String args[]) {
        State s = new State();
        s.setVisible(true);
        s.setSize(500, 500);
    }
}