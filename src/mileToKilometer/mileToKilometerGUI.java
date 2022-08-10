package mileToKilometer;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class mileToKilometerGUI extends JFrame{
    private JTextField txtField;
    private JPanel pnl;

    public mileToKilometerGUI(){
        setTitle("Mile To Kilometer");
        int height = 400;
        int width = 450;
        setSize(width, height);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        /*
         The horizontalGap parameter is the number of pixels to separate components
         horizontally, and the verticalGap parameter is the number of pixels to separate components vertically
         */
        // FlowLayout flow = new FlowLayout();
        setLayout(new FlowLayout(FlowLayout.CENTER,10,7)); // Add a FlowLayout manager to the content pane.

        /*
        In this statement, the getContentPane method is called to get a reference to the JFrame
        object’s content pane. This reference is then used to call the content pane’s setBackground
        method. As a result, the content pane’s background color will change to blue.
         */
        getContentPane().setBackground(Color.GREEN);

        buildPanel(); //add components into the panel.

        add(pnl); // add the panel into the frame/content pane.
        setVisible(true);
    }
    private void buildPanel(){
        JLabel lbl = new JLabel("Enter the distance got in miles.");
        txtField = new JTextField(10);
        JButton btn = new JButton("CONVETOR"); //after user clicks

        btn.setBackground(Color.orange); //for components color
        btn.setForeground(Color.blue); //for text color.

        //button(btn) generates an event object and passes it to the action Listener
        // object's actionPerformed method.
        // the following statement creates a btnListener object and registers that object with the
        //btn object:
        btn.addActionListener(new btnListener());    //Add an action listener to the button.

       /*
        OR, write as follows.
//        btnListener listener = new btnListener();
//        btn.addActionListener(listener);

        */

        //adding GUI components on a panel
        pnl = new JPanel();
        pnl.add(lbl);
        pnl.add(txtField);
        pnl.add(btn);
    }

    /*
    btnListener is an action listener class for
    the Calculate button.
     */
    private class btnListener implements ActionListener{
        //The actionPerformed method executes the statements necessary to handle the event.
        @Override
        public void actionPerformed(ActionEvent e) {
            final double conversion = 0.6214;
            String input;
            double miles;

            input = txtField.getText();
            miles = Double.parseDouble(input) * conversion;

            JOptionPane.showMessageDialog(null,
                    String.format("%s Kilometer is equal to: "+"%,.2f Miles",input,miles));
        }
    }

    public static void main(String[] args) {
        /*
         Once the instance is created, however, the variable is not used
         again. Because we do not need the variable, we can instantiate the class anonymously as
         shown here:
         */
        new mileToKilometerGUI();
    }
}