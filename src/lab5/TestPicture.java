package lab5;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.io.IOException;

public class TestPicture {
    public static void main(String[] args) {
        JFrame f = new JFrame();
        f.setTitle("Hello");
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ImagePanel pp = new ImagePanel();
        pp.setLayout(new BorderLayout());
        try {
            pp.setImage(ImageIO.read(new File("dog.jpg")));
        } catch (IOException e) {
            e.printStackTrace();
        }
        f.add(pp);
        f.setSize(800, 600);
        f.setVisible(true);
    }
}
