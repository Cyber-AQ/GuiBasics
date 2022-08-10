package GUIBasics;
/*
  we are creating a simple GUI Window for desktop, that has no components; just a frame/container.
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class GUIWindow {
    private static JButton btn;
        public static void main(String[] args) {
            final int width = 230;
            final int height = 250;
            JWindow window = new JWindow();
            window.setSize(width,height);
            window.setLocation(600,200);

            JPanel pnl = new JPanel();
            btn = new JButton("PRESS ME TO EXIT");
            btn.addActionListener(new btnListener()); //for quitting the window panel/GUI.
            btn.setBackground(Color.RED);
            btn.setForeground(Color.white);
            pnl.add(btn);
            window.add(pnl);  //add button to the GUI Window.

            window.setVisible(true);
        }

        private  static class btnListener implements ActionListener{

            @Override
            public void actionPerformed(ActionEvent e) {
                if (e.getSource() == btn){
                    System.exit(0);
                }
            }
        }

}
