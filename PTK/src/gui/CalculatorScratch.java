package gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalculatorScratch extends JFrame implements ActionListener {
    private JTextField txtNum1, txtNum2, txtResult;
    private JButton btnAdd, btnSub, btnMul, btnDiv;

    public CalculatorScratch() {
        setTitle("Calculator");
        setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(5,5,5,5);
        gbc.fill = GridBagConstraints.HORIZONTAL;

        JLabel lbNum1 = new JLabel("Num 1: ");
        JLabel lbNum2 = new JLabel("Num 2: ");
        JLabel lbResult = new JLabel("Result: ");

        txtNum1 = new JTextField();
        txtNum2 = new JTextField();
        txtResult = new JTextField();
        txtResult.setEditable(false);

        btnAdd = new JButton("Add");
        btnSub = new JButton("Sub");
        btnMul = new JButton("Mul");
        btnDiv = new JButton("Div");

        btnAdd.setActionCommand("ADD");
        btnSub.setActionCommand("SUB");
        btnMul.setActionCommand("MUL");
        btnDiv.setActionCommand("DIV");

        btnAdd.addActionListener(this);
        btnSub.addActionListener(this);
        btnMul.addActionListener(this);
        btnDiv.addActionListener(this);

        gbc.gridx = 0;
        gbc.gridy = 0;
        add(lbNum1, gbc);

        gbc.gridx = 1;
        add(txtNum1, gbc);

        gbc.gridx = 0;
        gbc.gridy = 1;
        add(lbNum2, gbc);

        gbc.gridx = 1;
        add(txtNum2, gbc);

        gbc.gridx = 0;
        gbc.gridy = 2;
        add(lbResult, gbc);

        gbc.gridx = 1;
        add(txtResult, gbc);

        JPanel buttonPanel = new JPanel(new FlowLayout(FlowLayout.CENTER, 10, 10));
        buttonPanel.add(btnAdd);
        buttonPanel.add(btnSub);
        buttonPanel.add(btnMul);
        buttonPanel.add(btnDiv);

        gbc.gridx = 0;
        gbc.gridy = 3;
        gbc.gridwidth = 2;
        gbc.anchor = GridBagConstraints.CENTER;
        add(buttonPanel, gbc);

        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setResizable(false);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try {
            double num1 = Double.parseDouble(txtNum1.getText());
            double num2 = Double.parseDouble(txtNum2.getText());
            double result = 0;

            switch (e.getActionCommand()) {
                case "ADD":
                    result = num1 + num2;
                    break;
                case "SUB":
                    result = num1 - num2;
                    break;
                case "MUL":
                    result = num1 * num2;
                    break;
                case "DIV":
                    if (num2 != 0) {
                        result = num1 / num2;
                    } else {
                        JOptionPane.showMessageDialog(this, "Khong the chia cho 0");
                        return;
                    }
                    break;
                default:
                    throw new IllegalStateException("Gia tri khong xac dinh: " + e.getActionCommand());
            }

            txtResult.setText(String.valueOf(result));
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Hay nhap cac chu so vao.");
        }
    }

    public static void main(String[] args) {
        new CalculatorScratch();
    }
}
