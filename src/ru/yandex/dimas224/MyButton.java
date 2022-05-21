package ru.yandex.dimas224;

import java.awt.*;
import javax.swing.*;

public class MyButton {
    public static JPanel getButton() {
        JPanel jPanel = new JPanel();

        JButton submit = new JButton("Submit");
        jPanel.add(submit);
        submit.addActionListener(e -> {
            if (jPanel.getBackground().equals(Color.GREEN)) {
                jPanel.setBackground(Color.YELLOW);
            } else if (jPanel.getBackground().equals(Color.YELLOW)) {
                jPanel.setBackground(Color.RED);
            } else {
                jPanel.setBackground(Color.GREEN);
            }
        });

        return jPanel;
    }
}
