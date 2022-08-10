package TaxCalculator;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;

/*
1. Scrollable Tax Calculator
Create an application that allows you to enter the amount of a purchase and then displays
the amount of sales tax on that purchase. Use a slider to adjust the tax rate between 0 percent and 10 percent.
 */
public class ScrollableTaxCalculator extends JFrame{
    private JSlider slider;
    private JTextField txt, txt1;
    private JPanel pnl1, pnl2, pnl3;
    public  ScrollableTaxCalculator(){
        setTitle("Scrollable Tax Calculator");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocation(600,300);
        setLayout(new GridLayout());
        setResizable(false);
        setLayout(new GridLayout(2,1));

        BuildDataDisplay();
        BuildTaxControl();
        add(pnl2);
        add(pnl3);

        pack();
        setVisible(true);
    }

    public void BuildDataDisplay(){
        JLabel lbl = new JLabel("Total Sales:");
        txt = new JTextField(10);
        txt.setEditable(false);

        JLabel lbl1 = new JLabel("Sales Value:");
        txt1 = new JTextField(10);

        pnl2 = new JPanel();
        pnl1 = new JPanel();

        setLayout(new GridLayout(2,1));
        pnl2.add(lbl);
        pnl2.add(txt);
        pnl1.add(lbl1);
        pnl1.add(txt1);

        add(pnl2);
        add(pnl1);
        pack();
    }

    public void BuildTaxControl(){
        slider = new JSlider(JSlider.HORIZONTAL,0,18,0);
        slider.setMajorTickSpacing(3);  //add the numbers of major lines
        slider.setMinorTickSpacing(1);  //add the numbers of minor lines
        slider.setPaintLabels(true);  //add the numbers
        slider.setPaintTicks(true);   //add the lines
        slider.setPaintTrack(true);
        slider.addChangeListener(new sliderListener());

        pnl3 = new JPanel();
        pnl3.add(slider);
    }

    private class sliderListener implements ChangeListener{

        @Override
        public void stateChanged(ChangeEvent e) {
            double Tax = Double.valueOf((slider.getValue())) / 100;
            double userSalesValue = Double.parseDouble(txt1.getText());
            double results = userSalesValue + (Tax * userSalesValue);

            txt.setText(String.format("%.2f",results));
        }
    }

    public static void main(String[] args) {
        new ScrollableTaxCalculator();
    }
}
