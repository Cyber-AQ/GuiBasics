package celsiusToFahrenheits;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/*
10. Celsius to Fahrenheit
Write a GUI application that converts Celsius temperatures to Fahrenheit temperatures. The
user should be able to enter a Celsius temperature, click a button, and then see the equivalent Fahrenheit temperature. Use the following formula to make the conversion:
F = 9/5 C + 32
C = (5/9) * (F-32)
F is the Fahrenheit temperature and C is the Celsius temperature.
 */
public class celsiusToFahrenheitsGUI extends JFrame {
    private JTextField txt;
    private JTextField txt1;
    private JPanel pnlC, pnlS, pnlN;
    public celsiusToFahrenheitsGUI(){
        setTitle("Censius To FahrenHeit");
//        setSize(300,250);
        setLocation(600,300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        setLayout(new BorderLayout());
        setSize(300,200);
        buildCenter();
        buildSouth();
        buildNorth();

        add(pnlN, BorderLayout.NORTH);
        add(pnlC, BorderLayout.CENTER);
        add(pnlS, BorderLayout.SOUTH);

        setResizable(false);
        pack();

        setVisible(true);
    }

    public void buildNorth(){
        pnlN = new JPanel();
        JLabel lbl = new JLabel("CELSIUS TO FAHRENHEIT CALCULATOR ");
        lbl.setForeground(Color.WHITE);
        pnlN.setBackground(Color.blue);
        pnlN.add(lbl);

    }
    public void buildCenter(){
        pnlC = new JPanel();
        JLabel lbl, lbl1;
        lbl = new JLabel("Celsius Degrees: ");
        txt = new JTextField(10);

        pnlC.setLayout(new GridLayout(2,2));

        lbl1 = new JLabel("Fahrenheit Degree: ");
        txt1 = new JTextField(10);
        txt1.setEditable(false);

        pnlC.add(lbl);
        pnlC.add(txt);
        pnlC.add(lbl1);
        pnlC.add(txt1);

    }

    public void buildSouth(){
        pnlS = new JPanel();
        pnlS.setLayout(new FlowLayout(FlowLayout.CENTER));

        JButton btn = new JButton("Calculate");
        btn.setBackground(Color.GREEN);
        btn.setForeground(Color.BLACK);
        btn.addActionListener(new btnListener());
        pnlS.add(btn);
    }
    private class btnListener implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            int F;
            String C = txt.getText();

            F = (9/5)*(Integer.parseInt(C)) + 32;

            txt1.setText(String.valueOf(F));
        }
    }

    public static void main(String[] args) {
        new celsiusToFahrenheitsGUI();
    }
}
