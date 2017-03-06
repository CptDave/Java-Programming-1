/*
    ProgrammingProject8.java
    David Wartenbe
    CIS 160
    12/17/2016
    Programming Project 8
    
    This program creates a fuctional GUI that adds up four numbers and displays the results.
*/

import javax.swing.SwingUtilities;
import javax.swing.JPanel;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.GridLayout;
import java.awt.BorderLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Dimension;
import java.lang.NumberFormatException;

public class ProgrammingProject8 extends JFrame implements ActionListener{
    //Declare global variables for action listener method
    JButton jbAdd;
    JButton jbExit;
    JLabel jlRegionOutput;
    JTextField jtfRegion1;
    JTextField jtfRegion2;
    JTextField jtfRegion3;
    JTextField jtfRegion4;
    
    public static void main(String[] args) {
        new ProgrammingProject8();
    }
    
    ProgrammingProject8() {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                showGUI();
            }
        });
    }
    
    public void showGUI() {
        //set top level layout
        setLayout(new BorderLayout());
        
        //Declare variable
        //JPanels
        JPanel jpLabel;
        JPanel jpTextField;
        JPanel jpButton;
        //JLabels
        JLabel jlRegion1;
        JLabel jlRegion2;
        JLabel jlRegion3;
        JLabel jlRegion4;
        
        //JPanel for JLabels
        jpLabel = new JPanel(new GridLayout(4, 1));
        
        //JLabels
        jlRegion1 = new JLabel("Region 1");
        jlRegion2 = new JLabel("Region 2");
        jlRegion3 = new JLabel("Region 3");
        jlRegion4 = new JLabel("Region 4");
        jlRegionOutput = new JLabel("Total:");
        jpLabel.add(jlRegion1);
        jpLabel.add(jlRegion2);
        jpLabel.add(jlRegion3);
        jpLabel.add(jlRegion4);
        
        //JPanel for JTextFields
        jpTextField = new JPanel(new GridLayout(4, 150));
        
        //JTextFields
        jtfRegion1 = new JTextField();
        jtfRegion2 = new JTextField();
        jtfRegion3 = new JTextField();
        jtfRegion4 = new JTextField();
        jpTextField.add(jtfRegion1);
        jpTextField.add(jtfRegion2);
        jpTextField.add(jtfRegion3);
        jpTextField.add(jtfRegion4);
        
        //JPanel for JButtons
        jpButton = new JPanel(new GridLayout(4, 1));
        
        //JButtons
        jbAdd = new JButton("Add");
        jbExit = new JButton("Exit");
        jpButton.add(jbAdd);
        jpButton.add(jbExit);
        jpButton.add(jlRegionOutput);
        
        //Add buttons to action  listener
        jbAdd.addActionListener(this);
        jbExit.addActionListener(this);
        
        //Add JPanels to the frame
        add(jpLabel, BorderLayout.WEST);
        add(jpTextField, BorderLayout.CENTER);
        add(jpButton, BorderLayout.EAST);
        
        //Configure JFrame
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(215, 215);
        setMinimumSize(new Dimension(getBounds().width, getBounds().height));
    }
    
    public void actionPerformed(ActionEvent e) {
        Object obj = e.getSource();
        if (obj instanceof JButton) {
            JButton button = (JButton) obj;
            if (button == jbAdd) {
                //add numbers
                try {
                    Double num1 = Double.parseDouble(jtfRegion1.getText());
                    Double num2 = Double.parseDouble(jtfRegion2.getText());
                    Double num3 = Double.parseDouble(jtfRegion3.getText());
                    Double num4 = Double.parseDouble(jtfRegion4.getText());
                    jlRegionOutput.setText("Total: " + (num1 + num2 + num3 + num4));
                } catch (NumberFormatException e2) {
                    jlRegionOutput.setText("Error");
                };
            } else {
                System.exit(0);
            }
        }
    }
}