import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class Key1 extends Applet implements KeyListener {
    String msg = "";

    public void init() {
        addKeyListener(this);
    }

    public void keyUp(KeyEvent k) {
        showStatus("Key Up");
        repaint();
    }

    public void keyDown(KeyEvent k) {
        showStatus("Key Down");
        repaint();
    }

    public void keyReleased(KeyEvent k) {
        showStatus("Key Released");
        repaint();
    }

    public void keyTyped(KeyEvent k) {
        showStatus("Key Typed");
        repaint();
    }

    public void keyPressed(KeyEvent k) {
        showStatus("Key Pressed");
        repaint();
    }

    public void paint(Graphics g) {
        g.drawString(msg, 20, 20);
    }
}
