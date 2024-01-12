import java.awt.event.*;
import javax.swing.*;
import java.awt.*;

public class Calculator extends JFrame implements ActionListener {

    private JPanel panel;
    private JTextField textField;
    private JButton[] buttons;

    public Calculator() {
        super("Calculator");
        panel = new JPanel();
        panel.setLayout(new GridLayout(4, 4));
        textField = new JTextField();
        textField.setHorizontalAlignment(JTextField.RIGHT);
        buttons = new JButton[10];
        for (int i = 0; i < 10; i++) {
            buttons[i] = new JButton(String.valueOf(i));
            buttons[i].addActionListener(this);
        }
        JButton plusButton = new JButton("+");
        plusButton.addActionListener(this);
        JButton minusButton = new JButton("-");
        minusButton.addActionListener(this);
        JButton multiplyButton = new JButton("*");
        multiplyButton.addActionListener(this);
        JButton divideButton = new JButton("/");
        divideButton.addActionListener(this);
        JButton equalsButton = new JButton("=");
        equalsButton.addActionListener(this);
        panel.add(textField);
        for (int i = 0; i < 10; i++) {
            panel.add(buttons[i]);
        }
        panel.add(plusButton);
        panel.add(minusButton);
        panel.add(multiplyButton);
        panel.add(divideButton);
        panel.add(equalsButton);
        add(panel);
        pack();
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        String actionCommand = e.getActionCommand();
        if (actionCommand.equals("+")) {
            int firstNumber = Integer.parseInt(textField.getText());
            int secondNumber = Integer.parseInt(buttons[0].getText());
            int result = firstNumber + secondNumber;
            textField.setText(String.valueOf(result));
        } else if (actionCommand.equals("-")) {
            int firstNumber = Integer.parseInt(textField.getText());
            int secondNumber = Integer.parseInt(buttons[0].getText());
            int result = firstNumber - secondNumber;
            textField.setText(String.valueOf(result));
        } else if (actionCommand.equals("*")) {
            int firstNumber = Integer.parseInt(textField.getText());
            int secondNumber = Integer.parseInt(buttons[0].getText());
            int result = firstNumber * secondNumber;
            textField.setText(String.valueOf(result));
        } else if (actionCommand.equals("/")) {
            int firstNumber = Integer.parseInt(textField.getText());
            int secondNumber = Integer.parseInt(buttons[0].getText());
            int result = firstNumber / secondNumber;
            textField.setText(String.valueOf(result));
        } else if (actionCommand.equals("=")) {
            int firstNumber = Integer.parseInt(textField.getText());
            int secondNumber = Integer.parseInt(buttons[0].getText());
            int result = firstNumber + secondNumber - secondNumber * firstNumber / secondNumber;
            textField.setText(String.valueOf(result));
        } else {
            textField.setText(actionCommand);
        }
    }

    public static void main(String[] args) {
        new Calculator();
    }
}