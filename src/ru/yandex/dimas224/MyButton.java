package ru.yandex.dimas224;

import java.awt.*;
import java.awt.event.ActionListener;
import java.beans.EventHandler;
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

    public static JPanel getButtonWithEventHandler(JFrame jFrame) {
        JPanel jPanel = new JPanel();
        JButton jButton = new JButton("Submit");
        jPanel.add(jButton);
        //jButton.addActionListener(e -> jFrame.setTitle(((JButton)e.getSource()).getText()));
        jButton.addActionListener(EventHandler.create(ActionListener.class, jFrame, "title", "source.text"));

        return jPanel;
    }
}
