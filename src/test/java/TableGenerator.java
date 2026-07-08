import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class TableGenerator extends JFrame {

    JTextField numberField;
    JTextArea outputArea;
    JButton generateButton;

    public TableGenerator() {

        setTitle("Table Generator");
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        add(new JLabel("Enter Number:"));

        numberField = new JTextField(10);
        add(numberField);

        generateButton = new JButton("Generate Table");
        add(generateButton);

        outputArea = new JTextArea(15, 25);
        outputArea.setEditable(false);

        add(new JScrollPane(outputArea));

        generateButton.addActionListener((ActionEvent e) -> {

            int number = Integer.parseInt(numberField.getText());

            StringBuilder table = new StringBuilder();

            for (int i = 1; i <= 10; i++) {
                table.append(number)
                        .append(" x ")
                        .append(i)
                        .append(" = ")
                        .append(number * i)
                        .append("\n");
            }

            outputArea.setText(table.toString());

        });

        setVisible(true);
    }

    public static void main(String[] args) {
        new TableGenerator();
    }
}