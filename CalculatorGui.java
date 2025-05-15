//GUI Calculator
 import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class VowelCounterApp extends JFrame {
    private JTextField inputField;
    private JTextField outputField;
    private JButton countButton;
    private JButton resetButton;
    private JButton exitButton;

    public VowelCounterApp() {
        createView();

        setTitle("Vowel Counter");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(400,400);
        setLocationRelativeTo(null);
        setResizable(false);
    }

    private void createView() {
        JPanel panel = new JPanel();
        getContentPane().add(panel);
        panel.setLayout(new GridLayout(4,2,5,5));

        JLabel inputLabel = new JLabel("Enter a string:");
        panel.add(inputLabel);

        inputField = new JTextField();
        panel.add(inputField);

        JLabel outputLabel = new JLabel("Number of Vowels:");
        panel.add(outputLabel);

        outputField = new JTextField();
        outputField.setEditable(false);
        panel.add(outputField);

        countButton = new JButton("Count Vowels");
        countButton.addActionListener(new CountButtonActionListener());
        panel.add(countButton);

        resetButton = new JButton("Reset");
        resetButton.addActionListener(new ResetButtonActionListener());
        panel.add(resetButton);

        exitButton = new JButton("Exit");
        exitButton.addActionListener(new ExitButtonActionListener());
        panel.add(exitButton);
    }

    private class CountButtonActionListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            String text = inputField.getText().toLowerCase();
            int count = 0;

            for (int i = 0; i < text.length(); i++) {
                char c = text.charAt(i);
                if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                    count++;
                }
            }

            outputField.setText(String.valueOf(count));
        }
    }

    private class ResetButtonActionListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            inputField.setText("");
            outputField.setText("");
        }
    }

    private class ExitButtonActionListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            System.exit(0);
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new VowelCounterApp().setVisible(true));
    }
}
