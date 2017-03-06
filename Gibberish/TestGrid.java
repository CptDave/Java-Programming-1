/*
    TestGrid.java
    CIS 160
    David Klick
    2011-09-24

    Demonstration of GridLayout layout manager
*/

import java.awt.Container;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;

public class TestGrid extends JFrame {
    public TestGrid() {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }
        });
    }
    
    private void createAndShowGUI() {
        setSize(200,200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        Container c = getContentPane();
        c.setLayout(new GridLayout(2,3));
        c.add(new JButton("Button 1"));
        c.add(new JButton("Button 2"));
        c.add(new JButton("Button 3"));
        c.add(new JButton("Button 4"));
        c.add(new JButton("Button 5"));
        setVisible(true);
    }

    public static void main(String[] args) {
        TestGrid app = new TestGrid();
    }
}