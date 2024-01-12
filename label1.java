import java.awt.*;

public class label1 {
    public static void main(String args[]) {
        Frame f1 = new Frame();
        f1.setTitle("vishal");
        f1.setSize(400, 400);
        f1.setVisible(true);
        f1.setLayout(new FlowLayout());
        Label l = new Label("hello im vishal");
        TextField f = new TextField("vishal");
        TextArea a = new TextArea("", 3, 40);

        Button b = new Button("click here");
        Label l2 = new Label("select subjects");
        Checkbox c = new Checkbox("marathi");
        Checkbox c1 = new Checkbox("hindi");
        Checkbox c3 = new Checkbox("english");
        Label x = new Label("select your gender");
        CheckboxGroup z = new CheckboxGroup();
        Checkbox z1 = new Checkbox("vishal", z, true);
        Checkbox z2 = new Checkbox("vishal", z, true);

        f1.add(l);
        f1.add(f);
        f1.add(a);
        f1.add(b);
        f1.add(l2);
        f1.add(c);
        f1.add(c1);
        f1.add(c3);
        f1.add(x);
        f1.add(z1);
        f1.add(z2);

    }
}