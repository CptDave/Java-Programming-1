/*
    ProgrammingProject7.java
    David Wartenbe
    CIS 160
    12/10/2016
    Programming Project 7
    
    This program creates a non functional GUI
*/
import javax.swing.JFrame;
import javax.swing.SwingUtilities;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.FlowLayout;
import javax.swing.JCheckBox;
import javax.swing.JRadioButton;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.ButtonGroup;
import java.util.Arrays;
import java.awt.Dimension;

public class ProgrammingProject7 extends JFrame{
    public static void main(String[] args) {
        new ProgrammingProject7();
    }
    
    public ProgrammingProject7() {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                showGUI();
            }
        });
    }
    
    public void showGUI() {
        //Set the layout of this JFrame
        setLayout(new BorderLayout());
        
        //Declare objects
        //JPanel
        JPanel jpPrinterName;
        JPanel jpCenterLeft;
        JPanel jpCenter;
        JPanel jpBottom;
        JPanel jpButton;
        //JLabel
        JLabel jlPrinterName;
        JLabel jlPrintQuality;
        //JCheckBox
        JCheckBox jcbImage;
        JCheckBox jcbText;
        JCheckBox jcbCode;
        JCheckBox jcbPrintToFile;
        //JRadioButton
        JRadioButton jrbSelection;
        JRadioButton jrbAll;
        JRadioButton jrbApplet;
        //ButtonGroup
        ButtonGroup bg;
        //JButton
        JButton jbOk;
        JButton jbCancel;
        JButton jbSetup;
        JButton jbHelp;
        //JComboBox
        JComboBox<String> jComboBox;
        String[] jcbString = {"High", "Normal", "Low"};
        
        //JPanel to hold printer name, checkbox/radio button, and printer quality JPanels
        jpCenterLeft = new JPanel();
        jpCenterLeft.setLayout(new BorderLayout());
        
        //North - Printer name
        jpPrinterName = new JPanel();
        jpPrinterName.setLayout(new BorderLayout());
        jlPrinterName = new JLabel("Printer: HP Color LaserJet 3800dn");
        jpPrinterName.add(jlPrinterName);
        jpCenterLeft.add(jpPrinterName, BorderLayout.NORTH);
        
        //Center - Checkbox/Radio button
        jpCenter = new JPanel();
        jpCenter.setLayout(new GridLayout(3, 2));
        jcbImage = new JCheckBox("Image");
        jcbText = new JCheckBox("Text");
        jcbCode = new JCheckBox("Code");
        jrbSelection = new JRadioButton("Selection");
        jrbAll = new JRadioButton("All", true);
        jrbApplet = new JRadioButton("Applet");
        bg = new ButtonGroup();
        bg.add(jrbAll);
        bg.add(jrbSelection);
        bg.add(jrbApplet);
        jpCenter.add(jcbImage);
        jpCenter.add(jrbSelection);
        jpCenter.add(jcbText);
        jpCenter.add(jrbAll);
        jpCenter.add(jcbCode);
        jpCenter.add(jrbApplet);
        jpCenterLeft.add(jpCenter, BorderLayout.CENTER);
        
        //South - Printer Quality
        jpBottom = new JPanel();
        jpBottom.setLayout(new FlowLayout());
        jComboBox = new JComboBox<>(jcbString);
        jComboBox.setSelectedIndex(1);
        jlPrintQuality = new JLabel("Print Quality:");
        jcbPrintToFile = new JCheckBox("Print to File");
        jpBottom.add(jlPrintQuality);
        jpBottom.add(jComboBox);
        jpBottom.add(jcbPrintToFile);
        jpCenterLeft.add(jpBottom, BorderLayout.SOUTH);
        
        //JPanel to hold JButtons
        jpButton = new JPanel();
        jpButton.setLayout(new GridLayout(4, 1));
        
        //East - Buttons
        jbOk = new JButton("Okay");
        jbCancel = new JButton("Cancel");
        jbSetup = new JButton("Setup");
        jbHelp = new JButton("Help");
        jpButton.add(jbOk);
        jpButton.add(jbCancel);
        jpButton.add(jbSetup);
        jpButton.add(jbHelp);
        
        //add both panels to the top level
        add(jpCenterLeft, BorderLayout.WEST);
        add(jpButton, BorderLayout.EAST);

        //config jframe
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pack();
        setMinimumSize(new Dimension(getBounds().width, getBounds().height));
    }
    
}