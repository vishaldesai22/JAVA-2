import java.awt.*;
import javax.swing.*;

public class dem extends JApplet {
    public void init() {
        String[] languages = { "English", "Marathi", "Hindi", "Sanskrit" };

        JComboBox<String> comboBox = new JComboBox(languages);
        JScrollPane scrollPane = new JScrollPane(comboBox);

        setLayout(new BorderLayout());
        add(scrollPane, BorderLayout.CENTER);
    }
}
