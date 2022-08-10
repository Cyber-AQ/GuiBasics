package calculator;

import javax.swing.*;
import java.awt.*;

public class labelNorth extends JPanel{
private JLabel lbl;

    public labelNorth(){
        lbl = new JLabel("SIMPLE CALCULATOR.", SwingConstants.LEFT);  //SwingConstants.LEFT alligns left horizontally.
        lbl.setForeground(Color.RED);
        add(lbl);
    }
}