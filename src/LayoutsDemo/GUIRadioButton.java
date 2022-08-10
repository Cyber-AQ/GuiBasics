package LayoutsDemo;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
/*
In this project we are going to change the background and foreground color of the GUI, using three Radio button.
 */
public class GUIRadioButton extends JFrame{
    final int WINDOW_WIDTH = 400;
    final int WINDOW_HEIGHT = 300;
    private JRadioButton radioButton1;
    private JRadioButton radioButton2;
    private JPanel panel;

    public GUIRadioButton(){
        setTitle("Background And Foreground");
        setSize(WINDOW_WIDTH,WINDOW_HEIGHT);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        BuildPane();

        setLayout(new FlowLayout());

        add(panel);
        setVisible(true);
    }

    public void BuildPane(){
        radioButton1 = new JRadioButton("yellow Background");
        radioButton2 = new JRadioButton("border titled");

        ButtonGroup btnGroup = new ButtonGroup();
        btnGroup.add(radioButton1);
        btnGroup.add(radioButton2);

        radioButton1.addItemListener(new radioButtonListener());
        radioButton2.addItemListener(new radioButtonListener());

        panel = new JPanel();
        panel.add(radioButton1);
        panel.add(radioButton2);
    }

    private class radioButtonListener implements ItemListener{

        @Override
        public void itemStateChanged(ItemEvent e) {
            if (e.getSource() == radioButton1){
                if (radioButton1.isSelected()){
                    radioButton2.setBackground(Color.ORANGE);
                    getContentPane().setBackground(Color.ORANGE);
                }else{
                    radioButton2.setBackground(Color.gray);
                    getContentPane().setBackground(Color.gray);
                }
            }

            if (e.getSource() == radioButton2){
                if(radioButton2.isSelected()){
                    panel.setBorder(BorderFactory.createTitledBorder("button 2 choice"));
                }else{
                    panel.setBorder(BorderFactory.createLineBorder(Color.cyan, 5));
                }
            }
        }
    }

    public static void main(String[] args) {
        new GUIRadioButton();
    }
}