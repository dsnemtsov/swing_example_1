package ru.yandex.dimas224;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        JFrame jFrame = MyFrame.getFrame();

        jFrame.add(new MyFrame.MyComponent());
    }
}
