/*
    NonFuncGUILab.java
    CIS 160
    Name: David Wartenbe
    Assignment: Non-functional GUI lab
    Date: 11/30/2016
    
    Demonstration of a non-functional GUI.
*/

import java.awt.*;
import javax.swing.*;

public class NonFuncGUILab extends JFrame{
    
    public static void main(String[] args) {
        new NonFuncGUILab();
    }
    
    public NonFuncGUILab() {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }
        });
    }
    
    public void createAndShowGUI() {
        //create container
        Container c = getContentPane();
        c.setLayout(new BorderLayout());
        
        //create components
        //north text field
        JTextField textField = new JTextField("This is a text field");
        c.add(textField, BorderLayout.NORTH);
        
        //west check boxes
        JPanel jPanelCheckBox = new JPanel();
        jPanelCheckBox.setLayout(new GridLayout(3, 1));//3 rows 1 column
        
        JCheckBox cBoxA = new JCheckBox("A");
        JCheckBox cBoxB = new JCheckBox("B");
        JCheckBox cBoxC = new JCheckBox("C", true);
        
        jPanelCheckBox.add(cBoxA);
        jPanelCheckBox.add(cBoxB);
        jPanelCheckBox.add(cBoxC);
        c.add(jPanelCheckBox, BorderLayout.WEST);
        
        //center buttons
        JPanel jPanelButton = new JPanel();
        jPanelButton.setLayout(new FlowLayout());
        
        JButton btnD = new JButton("D");
        JButton btnE = new JButton("E");
        JButton btnF = new JButton("F");
        
        jPanelButton.add(btnD);
        jPanelButton.add(btnE);
        jPanelButton.add(btnF);
        c.add(jPanelButton, BorderLayout.CENTER);
        
        //south radio buttons 
        JPanel jPanelRadioButton = new JPanel();
        jPanelRadioButton.setLayout(new BoxLayout(jPanelRadioButton, BoxLayout.X_AXIS));
        
        ButtonGroup bg = new ButtonGroup();
        
        JRadioButton rbG = new JRadioButton("Radio Button G");
        JRadioButton rbH = new JRadioButton("Radio Button H", true);
        JRadioButton rbI = new JRadioButton("Radio Button I");
        
        //add radio buttons to button group
        bg.add(rbG);
        bg.add(rbH);
        bg.add(rbI);
        
        jPanelRadioButton.add(rbG);
        jPanelRadioButton.add(rbH);
        jPanelRadioButton.add(rbI);
        c.add(jPanelRadioButton, BorderLayout.SOUTH);

        setSize(360, 380);
        setMinimumSize(new Dimension(340, 180));
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }
}