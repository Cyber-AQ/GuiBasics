package LayoutsDemo;

import javax.swing.*;
import java.awt.*;
/*
Nesting Panels Inside a Container’s Regions.
so the buttons retain their original size. We can accomplish this by placing each button in
a separate JPanel object and then adding the JPanel objects to the content pane’s five
regions.
 */
public class GUIBorderLayout1 extends JFrame {
    private JPanel panel1;
    private JPanel panel2;
    private JPanel panel3;
    private JPanel panel4;
    private JPanel panel5;
    private JButton btn1;
    private JButton btn2;
    private JButton btn3;
    private JButton btn4;
    private JButton btn5;

    public GUIBorderLayout1(){
        setTitle("Border Layout");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        panel1 = new JPanel();
        panel2 = new JPanel();
        panel3 = new JPanel();
        panel4 = new JPanel();
        panel5 = new JPanel();

        btn1 = new JButton("Button 1");
        btn2 = new JButton("Button 2");
        btn3 = new JButton("Button 3");
        btn4 = new JButton("Button 4");
        btn5 = new JButton("Button 5");

        panel1.add(btn1);
        panel2.add(btn2);
        panel3.add(btn3);
        panel4.add(btn4);
        panel5.add(btn5);

        setLayout(new BorderLayout());
        add(panel1,BorderLayout.NORTH);
        add(panel2,BorderLayout.SOUTH);
        add(panel3,BorderLayout.WEST);
        add(panel4,BorderLayout.EAST);
        add(panel5,BorderLayout.CENTER);

        pack(); //resize it's self, not a must to use setSize()method.
        // . The pack method, which is inherited from JFrame,
        //automatically sizes the window to accommodate the components contained within it.

        setVisible(true);
    }

    public static void main(String[] args) {
        new GUIBorderLayout1();
    }
}