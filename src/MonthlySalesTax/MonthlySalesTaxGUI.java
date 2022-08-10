package MonthlySalesTax;

/*
2. Monthly Sales Tax
A retail company must file a monthly sales tax report listing the total sales for the month,
and the amount of state and county sales tax collected. The state sales tax rate is 4 percent
and the county sales tax rate is 2 percent. Create a GUI application that allows the user to
enter the total sales for the month into a text field. From this figure, the application should
calculate and display the following:
•	 The amount of county sales tax
•	 The amount of state sales tax
•	 The total sales tax (county plus state)
In the application’s code, represent the county tax rate (0.02) and the state tax rate (0.04)
as named constants.
 */
import javax.swing.*;
import java.awt.event.*;

public class MonthlySalesTaxGUI extends JFrame{
    JTextField txt, txt1;
    JPanel panel1;
    JButton submit;
    public MonthlySalesTaxGUI(){
        setTitle("Monthly Sales Tax App");
        int width = 400;
        int height = 300;
        setSize(width, height);

        build();
        add(panel1);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        setVisible(true);
    }

    public void build(){
//        int[] monthlySales = {10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21};
        JLabel lbl = new JLabel("Monthly Sales Amount: ");
        txt = new JTextField(10);
//        for (int i = 0; i <monthlySales.length; i++) {
//            txt.setText(String.valueOf(monthlySales[i]));
//        }

        panel1 = new JPanel();

        txt1 = new JTextField(10);
        txt1.setEditable(false);
        submit = new JButton("DISPLAY");
        submit.addActionListener(new submitButtonListener());
        panel1.add(lbl);
        panel1.add(txt);
        panel1.add(txt1);
        panel1.add(submit);


    }

    private class submitButtonListener implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
//            for (int i = 0; i < 12; i++) {
            txt1.setText(txt.getText());
//            }

        }
    }


    public static void main(String[] args) {
        new MonthlySalesTaxGUI();
    }
}
