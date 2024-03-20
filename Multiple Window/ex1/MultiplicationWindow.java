import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class MultiplicationWindow extends JFrame {
    public MultiplicationWindow()
    {
        setTitle("Multiplication");
        setSize(400,600);
        setLayout(new FlowLayout());
        JLabel lbl=new JLabel("Multiplication");
        add(lbl); 
    }
}
