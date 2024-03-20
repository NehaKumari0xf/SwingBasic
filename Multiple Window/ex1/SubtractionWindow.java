import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class SubtractionWindow extends JFrame {
    public SubtractionWindow()
    {
        setTitle("Subtraction");
        setSize(400,600);
        setLayout(new FlowLayout());
        JLabel lbl=new JLabel("Subtraction");
        add(lbl); 
    }
}
