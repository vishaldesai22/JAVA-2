import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JProgressBar;

public class progressbar {
    public static void main(String args[]) {

        JFrame f = new JFrame();
        f.setSize(400, 400);
        f.setVisible(true);
        JProgressBar pb = new JProgressBar(0, 100);
        pb.setBounds(20, 30, 50, 70);

        f.add(pb);
        pb.setStringPainted(true);
        int i = 0;
        while (i <= 100) {
            pb.setValue(i);
            try {
                Thread.sleep(1000);
            } catch (Exception e) {

            }
            i = i + 10;
        }

    }
}
