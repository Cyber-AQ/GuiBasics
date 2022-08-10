package LayoutsDemo;

import javax.swing.*;
import java.awt.*;
/*
As
a result, the container that is managed by a GridLayout object is divided into equally sized
cells. illustrates a container with three rows and five columns. This means that
the container is divided into 15 cells.
You pass the number of rows and columns that a container should have as arguments to the
GridLayout constructor. Here is the general format of the constructor:
This statement gives the container two rows and three columns, for a total of six cells. You
can pass 0 as an argument for the rows or the columns, but not both. Passing 0 for both
arguments will cause an error.
 */
public class GUIGridLayout extends JFrame{
    final int width = 400;
    final int height = 200;

    public GUIGridLayout(){
        setTitle("Grid Layout");
        setSize(width,height);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        setLayout(new GridLayout(2,3));

        JButton btn1 = new JButton("Button 1");
        JButton btn2 = new JButton("Button 2");
        JButton btn3 = new JButton("Button 3");
        JButton btn4 = new JButton("Button 4");
        JButton btn5 = new JButton("Button 5");
        JButton btn6 = new JButton("Button 6");

        /*
           Goes into row 1, column 1
           Goes into row 1, column 2
           Goes into row 1, column 3
           Goes into row 2, column 1
           Goes into row 2, column 2
           Goes into row 2, column 3
         */
        add(btn1);
        add(btn2);
        add(btn3);
        add(btn4);
        add(btn5);
        add(btn6);

        setVisible(true);
    }

    public static void main(String[] args) {
        new GUIGridLayout();
    }
}
