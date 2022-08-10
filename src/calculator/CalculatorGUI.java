package calculator;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class CalculatorGUI extends JFrame{
private labelNorth north = new labelNorth();
private textAreaCenter center = new textAreaCenter();
private buttonsSouth south = new buttonsSouth();
    public CalculatorGUI(){
        setTitle("GUI Calculator");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocation(600,300);
        setLayout(new BorderLayout());
        setResizable(false);

        add(north, BorderLayout.NORTH);
        add(center, BorderLayout.CENTER);
        add(south, BorderLayout.SOUTH);

        pack();
        setVisible(true);
    }

    public static void main(String[] args) {
        new CalculatorGUI();
    }
}