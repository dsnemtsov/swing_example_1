package ru.yandex.dimas224;

import java.awt.*;
import javax.swing.*;

public class MyComponent extends JComponent {
    private static int xCord;
    private static int yCord;

    @Override
    protected void paintComponent(Graphics g) {
        Graphics2D g2 = (Graphics2D) g;
        g2.drawString("Coordinates x: " + xCord + " y: " + yCord, 50, 50);
    }

    public static void setXCord(int xCord) {
        MyComponent.xCord = xCord;
    }

    public static void setYCord(int yCord) {
        MyComponent.yCord = yCord;
    }
}
