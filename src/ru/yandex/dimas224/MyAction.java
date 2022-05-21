package ru.yandex.dimas224;

import java.awt.*;
import java.awt.event.ActionEvent;
import javax.swing.*;

public class MyAction extends AbstractAction {
    private final JPanel jPanel;

    public MyAction(JPanel jPanel) {
        this.jPanel = jPanel;
        putValue(Action.SHORT_DESCRIPTION, "My small action");
    }



    @Override
    public void actionPerformed(ActionEvent e) {
        jPanel.setBackground(Color.CYAN);
    }
}
