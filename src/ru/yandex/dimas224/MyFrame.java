package ru.yandex.dimas224;

import java.awt.*;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;
import java.awt.geom.Rectangle2D;
import java.net.MalformedURLException;
import java.net.URL;
import javax.swing.*;

public class MyFrame {

    static class MyComponent extends JComponent {
        @Override
        protected void paintComponent(Graphics g) {
            Font font = new Font("Arial", Font.BOLD, 20);

            Graphics2D g2 = (Graphics2D) g;
            g2.setFont(font);

            g2.drawString("Hello, world!", 20, 40);

            Point2D p1 = new Point2D.Double(50, 50);
            Point2D p2 = new Point2D.Double(200, 200);
            Line2D l2 = new Line2D.Double(p1, p2);
            g2.draw(l2);

            Ellipse2D el = new Ellipse2D.Double(70, 70, 170, 170);
            g2.draw(el);
            g2.setPaint(Color.CYAN);
            g2.fill(el);

            Rectangle2D r2 = new Rectangle2D.Double(250, 150, 200, 100);
            g2.draw(r2);

            try {
                URL url = new URL("https://pngquant.org/Ducati_side_shadow.png");
                Image image = new ImageIcon(url).getImage();
                g2.drawImage(image, 20,20, null);
            } catch (MalformedURLException e) {
                throw new RuntimeException(e);
            }


        }
    }

    static JFrame getFrame() {
        JFrame jFrame = new JFrame();
        jFrame.setVisible(true);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        Dimension dimension = toolkit.getScreenSize();
        jFrame.setBounds(dimension.width/2 - 250, dimension.height/2 - 150, 500, 300);
        jFrame.setTitle("My App");

        return jFrame;
    }
}
