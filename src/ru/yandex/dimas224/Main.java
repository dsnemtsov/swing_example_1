package ru.yandex.dimas224;


import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        JFrame jFrame = MyFrame.getFrame();
        JComponent jComponent = new MyComponent();

        jFrame.add(jComponent);
        jFrame.addMouseMotionListener(new MouseAdapter() {
            @Override
            public void mouseMoved(MouseEvent e) {
                MyComponent.setXCord(e.getX());
                MyComponent.setYCord(e.getY());
                jComponent.repaint();
            }
        });

//        JPanel jPanel = new JPanel();
//        jFrame.add(jPanel);

//        JButton jButton = new JButton("Submit");
//        jPanel.add(jButton);
//        jButton.addActionListener(new MyAction(jPanel));



        //jFrame.add(MyButton.getButtonWithEventHandler(jFrame));
        //jFrame.add(MyButton.getButton());
        //jFrame.add(new MyFrame.MyComponent());
    }
}
