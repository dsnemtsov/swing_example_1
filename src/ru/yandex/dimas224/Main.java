package ru.yandex.dimas224;


import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        JFrame jFrame = MyFrame.getFrame();

        JPanel jPanel = new JPanel();
        jFrame.add(jPanel);

        JButton jButton = new JButton("Submit");
        jPanel.add(jButton);
        jButton.addActionListener(new MyAction(jPanel));



        //jFrame.add(MyButton.getButtonWithEventHandler(jFrame));
        //jFrame.add(MyButton.getButton());
        //jFrame.add(new MyFrame.MyComponent());
    }
}
