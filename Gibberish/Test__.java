import javax.swing.JMenuBar;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.AbstractAction;
import java.awt.event.ActionEvent;

public class Test {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Test Application");
        
        JMenuBar bar = new JMenuBar();
        
        JMenu menu1 = new JMenu("File");
        JMenuItem item1 = new JMenuItem(new AbstractAction("item1"){
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        
        menu1.add(item1);
        bar.add(menu1);
        
        frame.setJMenuBar(bar);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 500);
        frame.setVisible(true);
        
        
        
    }
}