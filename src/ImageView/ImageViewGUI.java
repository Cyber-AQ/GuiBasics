package ImageView;

import javax.swing.*;
import java.awt.event.*;
import java.awt.event.KeyEvent;

/*
2. Image Viewer
Write an application that allows the user to view image files. The application should use
either a button or a menu item that displays a file chooser. When the user selects an image
file, it should be loaded and displayed.
 */

public class ImageViewGUI extends JFrame {
    private JMenu fileMenu, closeMenu, parentMenu;
    private JMenuItem menuItemL;
    private JMenuItem menuItemB;
    private JMenuItem menuItemA;
    private JMenuItem menuItemF;
    private JMenuItem menuItemM;
    private final JLabel lbl;
    public ImageViewGUI(){
        setTitle("Image Display GUI");
        setLocation(500,200);
        setSize(400,300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        lbl = new JLabel();

        add(lbl);
        buildMenuBar();
//        pack();

        setVisible(true);
    }

    private void buildMenuBar(){
        JMenuBar menuBar = new JMenuBar();
        buildFileMenu();
        buildCloseMenu();
        buildParentMenu();

        menuBar.add(fileMenu);
        menuBar.add(closeMenu);
        menuBar.add(parentMenu);

        setJMenuBar(menuBar);
    }

    private void buildFileMenu(){
        fileMenu = new JMenu("File");

        menuItemL = new JMenuItem("Louis");
        menuItemB = new JMenuItem("Brice");
        menuItemA = new JMenuItem("Alice");

        menuItemL.setMnemonic(KeyEvent.VK_L);
        menuItemL.addActionListener(new Listeners());

        menuItemB.setMnemonic(KeyEvent.VK_B);
        menuItemB.addActionListener(new Listeners());

        menuItemA.setMnemonic(KeyEvent.VK_A);
        menuItemA.addActionListener(new Listeners());

        fileMenu.add(menuItemL);
        fileMenu.add(menuItemB);
        fileMenu.add(menuItemA);
    }

    private void buildCloseMenu(){
        closeMenu = new JMenu("Close");
        JMenuItem menuItemExit = new JMenuItem("Exit");
        menuItemExit.setMnemonic(KeyEvent.VK_E);
        menuItemExit.addActionListener(new exitListener());

        closeMenu.add(menuItemExit);
    }

    private void buildParentMenu(){
        parentMenu = new JMenu("Parents");
        menuItemF = new JMenuItem("Father");
        menuItemM = new JMenuItem("Mother");

        menuItemF.setMnemonic(KeyEvent.VK_F);
        menuItemF.addActionListener(new Listeners());

        menuItemM.setMnemonic(KeyEvent.VK_M);
        menuItemM.addActionListener(new Listeners());

        parentMenu.add(menuItemF);
        parentMenu.add(menuItemM);
    }

    private class Listeners implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            if (e.getSource() == menuItemL) {
                ImageIcon image = new ImageIcon("C:\\Users\\USER\\IdeaProjects\\GuiBasics\\src\\ImageView\\Desktop Splash Screen.png");
                lbl.setIcon(image);
            } else if (e.getSource() == menuItemB) {
                ImageIcon image = new ImageIcon("C:\\Users\\USER\\IdeaProjects\\GuiBasics\\src\\ImageView\\logo.png");
                lbl.setIcon(image);
            } else if (e.getSource() == menuItemA) {
                ImageIcon image = new ImageIcon("C:\\Users\\USER\\IdeaProjects\\GuiBasics\\src\\ImageView\\Monica  ticket.PNG");
                lbl.setIcon(image);
            } else if (e.getSource() == menuItemF) {
                ImageIcon image = new ImageIcon("C:\\Users\\USER\\IdeaProjects\\GuiBasics\\src\\ImageView\\NIT_logoBg.png");
                lbl.setIcon(image);
            } else if (e.getSource() == menuItemM) {
                ImageIcon image = new ImageIcon("C:\\Users\\USER\\IdeaProjects\\GuiBasics\\src\\ImageView\\splash-screen-progress-bar-clip-art-png-favpng-CfcXv5Wfc73Wm4E8bgYC1bHkK.jpg");
                lbl.setIcon(image);
            }
            pack();
        }
    }

    private static class exitListener implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            System.exit(0);
        }
    }

    public static void main(String[] args) {
        new ImageViewGUI();
    }
}