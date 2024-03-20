import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class DivisionWindow extends JFrame {
    public DivisionWindow()
    {
        setTitle("Division");
        setSize(400,600);
        setLayout(new FlowLayout());
        JLabel lbl=new JLabel("Division");
        add(lbl);
    }
}
