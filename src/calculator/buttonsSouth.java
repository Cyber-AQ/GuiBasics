package calculator;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class buttonsSouth extends JPanel{
    private textAreaCenter center = new textAreaCenter();
private JButton btn0, btn00, btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, btnFullStop, btnEquals
        , btnMinus, btnPlus, btnTimes, btnDivide, btnPercentage, btnACorOFF, btnClear;
    public buttonsSouth(){
        setLayout(new GridLayout(5,4));
/*
We create object of the button references and add them to the JPanel.
 */
        btn0 = new JButton("0"); btn00 = new JButton("0.0"); btn1 = new JButton("1"); btn2 = new JButton("2"); btn3 = new JButton("3");
        btn4 = new JButton("4"); btn5 = new JButton("5"); btn6 = new JButton("6"); btn7 = new JButton("7"); btn8 = new JButton("8");
        btn9 = new JButton("9"); btnACorOFF = new JButton("AC"); btnClear = new JButton("C"); btnPercentage = new JButton("%");
        btnTimes = new JButton("*"); btnDivide = new JButton("/"); btnPlus = new JButton("+"); btnMinus = new JButton("-");
        btnEquals = new JButton("="); btnFullStop = new JButton(".");

        /*
        Adding buttons Event Listeners.
         */
        btn0.addActionListener(new btnListener()); btn00.addActionListener(new btnListener()); btn1.addActionListener(new btnListener()); btn2.addActionListener(new btnListener());
        btn3.addActionListener(new btnListener()); btn8.addActionListener(new btnListener()); btnPercentage.addActionListener(new btnListener());
        btn4.addActionListener(new btnListener()); btn5.addActionListener(new btnListener()); btn6.addActionListener(new btnListener()); btn7.addActionListener(new btnListener());
        btn9.addActionListener(new btnListener()); btnACorOFF.addActionListener(new btnListener()); btnClear.addActionListener(new btnListener());
        btnTimes.addActionListener(new btnListener()); btnDivide.addActionListener(new btnListener()); btnPlus.addActionListener(new btnListener());
        btnEquals.addActionListener(new btnListener()); btnFullStop.addActionListener(new btnListener()); btnMinus.addActionListener(new btnListener());

        /*
        we add above buttons to the JPanel and GridLayout.
         */
        add(btnACorOFF); add(btnClear); add(btnPercentage); add(btnTimes); add(btn7); add(btn8); add(btn9);
        add(btnDivide); add(btn4); add(btn5); add(btn6); add(btnPlus); add(btn1); add(btn2); add(btn3); add(btnMinus);
        add(btn0); add(btnFullStop); add(btn00); add(btnEquals);

    }

    private class btnListener implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            if(e.getSource() == btn0){

            }

            if(e.getSource() == btn00){

            }

            if(e.getSource() == btn1){

            }
            if(e.getSource() == btn2){

            }

            if(e.getSource() == btn3){

            }

            if(e.getSource() == btn4){

            }

            if(e.getSource() == btn5){

            }

            if(e.getSource() == btn6){

            }

            if(e.getSource() == btn7){

            }

            if(e.getSource() == btn8){

            }

            if(e.getSource() == btn9){

            }

            if(e.getSource() == btnFullStop){

            }

            if(e.getSource() == btnEquals){

            }

            if(e.getSource() == btnMinus){

            }

            if(e.getSource() == btnPlus){

            }

            if(e.getSource() == btnDivide){

            }

            if(e.getSource() == btnTimes){

            }

            if(e.getSource() == btnPercentage){

            }

            if(e.getSource() == btnClear){

            }

            if(e.getSource() == btnACorOFF){

            }
        }
    }
}
