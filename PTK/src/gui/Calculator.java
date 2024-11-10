package gui;

import javax.swing.*;

public class Calculator extends JFrame {
    private JPanel calculatorPanel;
    private JTextField txtNum1;
    private JTextField txtNum2;
    private JTextField txtResult;
    private JLabel lbNum1;
    private JLabel lbNum2;
    private JLabel lbResult;
    private JButton btnAdd;
    private JButton btnSub;
    private JButton btnMul;
    private JButton btnDiv;

    public Calculator() {
        btnAdd.addActionListener(e -> {
            int num1 = Integer.parseInt(txtNum1.getText());
            int num2 = Integer.parseInt(txtNum2.getText());
            int result = num1 + num2;

            txtResult.setText(String.valueOf(result));
        });

        btnSub.addActionListener(e -> {
            int num1 = Integer.parseInt(txtNum1.getText());
            int num2 = Integer.parseInt(txtNum2.getText());
            int result = num1 - num2;

            txtResult.setText(String.valueOf(result));
        });

        btnMul.addActionListener(e -> {
            int num1 = Integer.parseInt(txtNum1.getText());
            int num2 = Integer.parseInt(txtNum2.getText());
            int result = num1 * num2;

            txtResult.setText(String.valueOf(result));
        });

        btnDiv.addActionListener(e -> {
            int num1 = Integer.parseInt(txtNum1.getText());
            int num2 = Integer.parseInt(txtNum2.getText());
            int result = num1 / num2;

            txtResult.setText(String.valueOf(result));
        });
    }

    public static void main(String[] args) {
        JFrame jFrame = new JFrame("Calculator");
        jFrame.setContentPane(new Calculator().calculatorPanel);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.pack();
        jFrame.setVisible(true);
    }
}
