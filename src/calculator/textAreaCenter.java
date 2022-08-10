package calculator;

import javax.swing.*;
import java.awt.*;

public class textAreaCenter extends JPanel{
private JTextArea txt;

    public textAreaCenter(){
        txt = new JTextArea(4,20);         //SwingConstants.SOUTH_EAST
        txt.setBorder(BorderFactory.createLineBorder(Color.black, 2));
        add(txt);
    }

    public void settingText(){
        double result = 0.0;
        txt.setText(String.valueOf(result));
    }
}