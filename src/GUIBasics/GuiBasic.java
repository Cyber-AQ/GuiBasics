package GUIBasics;

import javax.swing.*;
// we are creating a simple GUI for desktop, that has no components; just a frame/container.

public class GuiBasic {
    public static void main(String[] args) {
        final int width = 230;
        final int height = 250;
        JFrame frame = new JFrame();
        frame.setTitle("Hello GUI");
        frame.setSize(width,height);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
