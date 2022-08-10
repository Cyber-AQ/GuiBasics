package Colors;

import javax.swing.*;
import java.awt.*;

public class ColorChooser extends JFrame{

    public ColorChooser(){
        setTitle("Chose Color.");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocation(600,300);
        setSize(400,400);

        /*
        If you pass null, the
        dialog box is normally centered in the screen. If you pass a reference to a component, such
        as JFrame, the dialog box is displayed over the component.
         */

        JPanel pnl = new JPanel();
        Color colorSelector = JColorChooser.showDialog(null, "Chose color of your choice",Color.BLUE);
        pnl.setBackground(colorSelector);

        add(pnl);
        setVisible(true);
    }

    public static void main(String[] args) {
        new ColorChooser();
    }
}