import javax.swing.JFrame;
import javax.swing.JProgressBar;

public class progress {
    public static void main(String args[]) {
        JFrame f = new JFrame();

        f.setVisible(true);
        f.setSize(400, 400);
        JProgressBar pb = new JProgressBar(0, 100);
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
