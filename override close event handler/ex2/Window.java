import java.awt.Frame;
import java.awt.Label;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class Window extends Frame{
public Window() {
        Frame Window=new Frame();
        setSize(610,450);
        setTitle("Family Details");
        setLayout(new FlowLayout());
        setBackground(Color.DARK_GRAY);
        setResizable(false);

        Label l1=new Label("My Family Details");
        l1.setForeground(Color.green);
        l1.setFont(new Font("Brush Script m7",Font.CENTER_BASELINE,50));
        add(l1);

        Label l2=new Label("----------------------------------------------------");
        l2.setForeground(Color.cyan);
        l2.setFont(new Font("Brush Script m7",Font.BOLD,30));
        add(l2);

        Label l3=new Label("I am Neha.");
        l3.setFont(new Font("Brush Script m7",Font.ROMAN_BASELINE,30));
        l3.setForeground(Color.white);
        add(l3);

        Label l4=new Label("I come from a small family.");
        l4.setFont(new Font("Brush Script m7",Font.ROMAN_BASELINE,30));
        l4.setForeground(Color.white);
        add(l4);
        Label l5=new Label("There are 4 members in my family.");
        l5.setFont(new Font("Brush Script m7",Font.ROMAN_BASELINE,30));
        l5.setForeground(Color.white);
        add(l5);


        Label l6=new Label("My Father's name is Mr. Anil Kumar.");
        l6.setFont(new Font("Brush Script m7",Font.ROMAN_BASELINE,30));
        l6.setForeground(Color.white);
        add(l6);

        Label l7=new Label("My Mother's name is Mrs. Manju Devi.");
        l7.setFont(new Font("Brush Script m7",Font.ROMAN_BASELINE,30));
        l7.setForeground(Color.white);
        add(l7);

        Label l8=new Label("My Brother's name is Abhishek Kumar.");
        l8.setFont(new Font("Brush Script m7",Font.ROMAN_BASELINE,30));
        l8.setForeground(Color.white);
        add(l8);
        
        addWindowListener(new WindowHandler());

    }

    class WindowHandler implements WindowListener
    {
        @Override
        public void windowOpened(WindowEvent e) {
           }

        @Override
        public void windowClosing(WindowEvent e) {
        System.exit(0);   
        }

        @Override
        public void windowClosed(WindowEvent e) {
           
        }

        @Override
        public void windowIconified(WindowEvent e) {
           }

        @Override
        public void windowDeiconified(WindowEvent e) {
           }

        @Override
        public void windowActivated(WindowEvent e) {
           }

        @Override
        public void windowDeactivated(WindowEvent e) {
           }

    }
}

