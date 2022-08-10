package retailPriceCalculator;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
/*
1. Retail Price Calculator
Create a GUI application where the user enters the wholesale cost of an item and its markup(bei ya ziada)
percentage into text fields. (For example, if an item’s wholesale cost is $5 and its markup
percentage is 100 percent, then its retail price is $10(total price). ) The application should have a button
that displays the item’s retail price when clicked.
 */
public class retailPriceCalculatorGUI extends JFrame{
    private int WINDOW_WIDTH = 300;
    private int WINDOW_HEIGHT = 200;
    private JLabel label1, label2;
    private JTextField txt1, txt2, txt3;
    private JButton submit;
    private JPanel panel;

    public retailPriceCalculatorGUI(){
        setTitle("Retail Price Calculator");
        setSize(WINDOW_WIDTH,WINDOW_HEIGHT);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        buildPanel();

        add(panel);

        setVisible(true);
    }

    public void buildPanel(){
        panel = new JPanel();

        label1 = new JLabel("Wholesales Cost");
        txt1 = new JTextField(10);

        label2 = new JLabel("Markup Percentage");
        txt2 = new JTextField(10);

        txt3 = new JTextField(10);

        submit = new JButton("SUBMIT");

        submit.addActionListener(new submitButtonListener());

        setLayout(new GridLayout(4,2));

        add(label1);
        add(txt1);
        add(label2);
        add(txt2);
        add(submit);
        add(txt3);

    }

    private class submitButtonListener implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            String wholeSalesCost = txt1.getText();
            double retailCost = 0;
            String markUpCost = txt2.getText();

            retailCost = Double.parseDouble(wholeSalesCost) + ((Double.parseDouble(markUpCost)/100)*Double.parseDouble(wholeSalesCost));

//            JOptionPane.showMessageDialog(null,
//                    String.format("The retailPrice is: $%.02f",retailCost));
            txt3.setText("The retailPrice is: $"+retailCost);
        }
    }

    public static void main(String[] args) {
        new retailPriceCalculatorGUI();
    }
}