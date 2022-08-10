package listGui;
/*
List of son's and daughters of Mr and Mr's Massawe.
with choice of their best Son/Daughter.
for a Single selection mode
 */
import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import java.awt.*;
import java.awt.event.*;
import java.text.BreakIterator;

public class ListGUI extends JFrame{
    private JLabel lbl;
    private JList lst;
    private JTextField txt;
    private JPanel pnlN, pnlC, pnlS;

    String[] names = {
            "Louis", "Brice", "Alice", "Pierce", "Carlos"//, "Alicepreda", "Christina"
    };

    public ListGUI(){
        setTitle("List Demo of GUI");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocation(600,300);
        setResizable(false);

        buildNorth();
        buildCenter();
        buildSouth();

        setLayout(new BorderLayout());

        add(pnlN, BorderLayout.NORTH);
        add(pnlC, BorderLayout.CENTER);
        add(pnlS, BorderLayout.SOUTH);

        pack();
        setVisible(true);
    }

    public void buildNorth(){
        lbl = new JLabel("MR & MR'S MASSAWE'S CHILDREN");
        lbl.setForeground(Color.GREEN);
        pnlN = new JPanel();
        pnlN.add(lbl);
    }

    public void buildCenter(){
//        JScrollPane lstScroll = new JScrollPane();   //for the scroll pane that was created.
        lst = new JList(names);
           //for the scroll pane creation.
/*
        if(names.length >= 6){
            lst.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION); //for Multiple selection of data.
            lst.setVisibleRowCount(6);
            lstScroll = new JScrollPane(lst);
        }
*/



        /*
       // void setListData(Object[] data);  //The argument passed into data is an array of objects that will become the items displayed
                                            //in the JList component. Any items that are currently displayed in the component will be
                                             //replaced by the new items
        // JList nameList = new JList();   //This statement creates an empty JList component referenced by the nameList variable
        // String[] names = { "Bill", "Geri", "Greg", "Jean",
         "Kirk", "Phillip", "Susan" };  //You can then add items to the list, as shown here:

        nameList.setListData(names);
        */

/*
     // Get the selected values.
     Object[] selections =
     monthList.getSelectedValues();

     // Store the selected items in selectedMonthList.
     selectedMonthList.setListData(selections);
*/
        pnlC = new JPanel();
        lst.setBorder(BorderFactory.createLineBorder(Color.cyan, 2));
        lst.addListSelectionListener(new ListListener());
        pnlC.add(lst);
//        pnlC.add(lstScroll);     //for the scroll pane that was created.
    }

    public void buildSouth(){
        pnlS = new JPanel();

        JLabel lblS = new JLabel("Loved one is:");
        txt = new JTextField(10);
        txt.setEditable(false);
        txt.setForeground(Color.RED);

        pnlS.add(lblS);
        pnlS.add(txt);
    }

    private class ListListener implements ListSelectionListener{

        @Override
        public void valueChanged(ListSelectionEvent e) {
            String selected = "";
            int index = lst.getSelectedIndex();
            if (index != -1){
                selected = names[index];
            }
            txt.setText(selected);
        }
    }

    public static void main(String[] args) {
        new ListGUI();
    }
}
