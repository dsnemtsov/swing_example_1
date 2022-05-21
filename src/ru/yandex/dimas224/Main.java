package ru.yandex.dimas224;

import java.awt.*;
import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        JFrame jFrame = MyFrame.getFrame();

        JPanel jPanel = new JPanel();
        jFrame.add(jPanel);

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

        //jFrame.add(new MyFrame.MyComponent());
    }
}
