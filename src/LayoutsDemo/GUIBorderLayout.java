package LayoutsDemo;

import javax.swing.*;
import java.awt.*;
public class GUIBorderLayout extends JFrame {
    final int width = 300;
    final int height = 300;
    private JPanel panel;
    private JButton btn1;
    private JButton btn2;
    private JButton btn3;
    private JButton btn4;
    private JButton btn5;

    public GUIBorderLayout(){
        setTitle("Border Layout");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(width,height);

        btn1 = new JButton("Button 1");
        btn2 = new JButton("Button 2");
        btn3 = new JButton("Button 3");
        btn4 = new JButton("Button 4");
        btn5 = new JButton("Button 5");
        panel = new JPanel();

        panel.setLayout(new BorderLayout());
        panel.add(btn1,BorderLayout.NORTH);
        panel.add(btn2,BorderLayout.SOUTH);
        panel.add(btn3,BorderLayout.WEST);
        panel.add(btn4,BorderLayout.EAST);
        panel.add(btn5,BorderLayout.CENTER);

        add(panel);

        setVisible(true);
    }

    public static void main(String[] args) {
        new GUIBorderLayout();
    }
}
