package ru.yandex.dimas224;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        JFrame jFrame = MyFrame.getFrame();

        JLabel jLabel = new JLabel("Label");

        JPanel jPanel = new JPanel();
        jFrame.add(jPanel);
        jPanel.add(jLabel);

        JTextArea jTextArea = new JTextArea(5, 5);
        jTextArea.setLineWrap(true);
        JScrollPane jScrollPane = new JScrollPane(jTextArea);
        jPanel.add(jScrollPane);

        JTextField jTextField = new JTextField("Default value", 20);
        jPanel.add(jTextField);
        jPanel.revalidate();

    }
}
