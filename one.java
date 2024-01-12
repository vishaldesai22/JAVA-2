import java.awt.*;

public class one {
    public static void main(String args[]) {
        Frame f = new Frame();
        f.setVisible(true);
        f.setLayout(new FlowLayout());
        CheckboxGroup cg = new CheckboxGroup();
        Checkbox c3 = new Checkbox("male", cg, true);
        Checkbox c4 = new Checkbox("female", cg, true);
        f.setSize(400, 400);
        Label l = new Label("My name is vishal");
        TextArea a = new TextArea("", 3, 40);
        Button b1 = new Button("click here");
        TextField t = new TextField("vishal");
        Checkbox c1 = new Checkbox("marathi");
        Checkbox c2 = new Checkbox("hindi");

        f.add(l);

        f.add(a);
        f.add(t);
        f.add(c1);
        f.add(c3);
        f.add(c4);
        f.add(c2);
        f.add(b1);

    }
}
