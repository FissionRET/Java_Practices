package gui;

import javax.swing.*;

public class FrameDemo {
    private JTextField txtFirstName;
    private JTextField txtLastName;
    private JTextField txtTitle;
    private JTextField txtNickName;
    private JPanel namePanel;
    private JPanel mainPanel;
    private JLabel lbFirstName;
    private JLabel lbLastName;
    private JLabel lbTitle;
    private JLabel lbNickName;
    private JPanel emailPanel;
    private JTextField txtEmailAddress;
    private JLabel lbEmailAddress;
    private JButton btnAdd;
    private JButton btnEdit;
    private JButton btnDelete;
    private JPanel mailFormatPanel;
    private JRadioButton radioBtnHTML;
    private JRadioButton radioBtnPlainText;
    private JRadioButton radioBtnCustom;
    private JButton btnOK;
    private JButton btnExit;
    private JPanel buttonsPanel;
    private JEditorPane editorEmails;

    public FrameDemo() {

        btnAdd.addActionListener(e -> {

        });
    }

    public static void main(String[] args) {
        JFrame jFrame = new JFrame("Frame Demo");
        jFrame.setContentPane(new FrameDemo().mainPanel);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.pack();
        jFrame.setVisible(true);
    }
}
