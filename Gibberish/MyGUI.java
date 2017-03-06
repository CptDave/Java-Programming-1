import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.lang.NumberFormatException;
import java.io.IOException;
import java.net.URISyntaxException;
import java.net.*;

public class MyGUI extends JFrame implements ActionListener {
    JTextField txtField = null;
    JTextField txtField2 = null;
    JButton jButton = null;
    JButton jButton2 = null;
    
    public static void main(String[] args) {
        new MyGUI();
    }
    
    public MyGUI() {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                showMainGUI();
            }
        });
    }
    
    public MyGUI(boolean b) {
        
    }
    
    public void showMainGUI() {
        setLayout(new BorderLayout());
        
        JPanel jpaneltxt = new JPanel();
        jpaneltxt.setLayout(new BorderLayout());
        txtField = new JTextField();
        jpaneltxt.add(txtField);
        add(jpaneltxt, BorderLayout.NORTH);
        
        JPanel jpanelbutton = new JPanel();
        jpanelbutton.setLayout(new FlowLayout());
        jButton = new JButton("Convert to Integer");
        jButton2 = new JButton("Open Helper");
        jButton.addActionListener(this);
        jButton2.addActionListener(this);
        jpanelbutton.add(jButton);
        jpanelbutton.add(jButton2);
        add(jpanelbutton, BorderLayout.CENTER);
        
        txtField2 = new JTextField();
        txtField2.setEditable(false);
        add(txtField2, BorderLayout.SOUTH);
        
        pack();
        setTitle("My GUI App");
        setVisible(true);
        setMinimumSize(new Dimension(this.getBounds().width, this.getBounds().height));
        setDefaultCloseOperation(this.EXIT_ON_CLOSE);
        
    }
    
    public void actionPerformed(ActionEvent event) {
        if (event.getSource() == jButton) {
            try {
                txtField2.setText((Integer.parseInt(txtField.getText())) + "");
            } catch (NumberFormatException e) {
                txtField2.setText("Error: Cant convert to integer.");
            };
            
        } else if (event.getSource() == jButton2) {
            //new MyGUI();
            new MyGUIHelper();
        }       
    }
}

class MyGUIHelper extends JFrame implements ActionListener {
    JTextField txtf = null;
    JButton jb = null;
    JButton jb2 = null;
    JTextField txtf2 = null;
    
    public MyGUIHelper() {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                showHelperGUI();
            }
        });
    }
    
    public void showHelperGUI() {
        setLayout(new BorderLayout());
        
        JPanel jptxt = new JPanel();
        jptxt.setLayout(new BorderLayout());
        txtf = new JTextField();
        jptxt.add(txtf);
        add(jptxt, BorderLayout.NORTH);
        
        JPanel jpb = new JPanel();
        jpb.setLayout(new FlowLayout());
        jb = new JButton("Convert to Integer");
        jb2 = new JButton("Open Web Browser");
        jb.addActionListener(this);
        jb2.addActionListener(this);
        jpb.add(jb);
        jpb.add(jb2);
        add(jpb, BorderLayout.CENTER);
        
        JPanel jptxt2 = new JPanel();
        jptxt2.setLayout(new BorderLayout());
        txtf2 = new JTextField();
        txtf2.setEditable(false);
        jptxt2.add(txtf2);
        add(jptxt2, BorderLayout.SOUTH);
        
        pack();
        setTitle("My GUI Helper");
        setVisible(true);
        setMinimumSize(new Dimension(this.getBounds().width, this.getBounds().height));
        setDefaultCloseOperation(this.HIDE_ON_CLOSE);
    }
    
    public void actionPerformed(ActionEvent event) {
        if (event.getSource() == jb) {
            try {
                txtf2.setText((Integer.parseInt(txtf.getText())) + "");
            } catch (NumberFormatException e) {
                txtf2.setText("Error: Cant convert to integer.");
            };
            
        } else if (event.getSource() == jb2) {
            //new MyGUIHelper();
            try {
                if (Desktop.isDesktopSupported()) {
                    Desktop.getDesktop().browse(new URI("https://www.google.com"));
                }
            } catch (URISyntaxException uri) {
                System.exit(1);
            } catch (IOException e) {
                System.exit(1);
            };
        }
    }
}