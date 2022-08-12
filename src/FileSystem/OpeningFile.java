package FileSystem;

import javax.swing.*;
import java.awt.*;
import java.io.File;

public class OpeningFile extends JFrame {

    public OpeningFile(){
        setTitle("Chose Color.");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocation(600,300);

        /*
        The first constructor shown takes no arguments. This constructor uses the default directory
        as the starting point for all of its dialog boxes. If you are using Windows, this will probably
        be the “My Documents” folder under your account. If you are using UNIX, this will be your
        login directory. The second constructor takes a String argument containing a valid path.
        This path will be the starting point for the object’s dialog boxes.
         */

        JPanel pnl = new JPanel();
        JLabel lbl = new JLabel("File selected is: ");
        JTextField txt = new JTextField();
        txt.setEditable(false);

        JFileChooser fileChooser = new JFileChooser();
        int openingFile = fileChooser.showOpenDialog(null);

        if (openingFile == JFileChooser.APPROVE_OPTION){
            File gettingFile = fileChooser.getSelectedFile();
           // String fileName = fileChooser.getName(gettingFile);    //an alternative.
            String fileName = gettingFile.getName();

            txt.setText(fileName);
        }

        pnl.add(lbl);
        pnl.add(txt);
        add(pnl);
        pack();
        setVisible(true);
    }

    public static void main(String[] args) {
        new OpeningFile();
    }
}
