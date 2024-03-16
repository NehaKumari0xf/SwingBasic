import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Label;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
public class Window extends Frame
{
       public Window()
    {
        setTitle("Jai Sri Ganesh");
        setSize(400,400);
        setLayout(new FlowLayout());
        setResizable(false);

        Label l1=new Label("Jai Sri Ram");
        l1.setFont(new Font("Times new roman",Font.BOLD,40));
        add(l1);
        Label l2=new Label("Jai Hanuman");
        l2.setBackground(Color.ORANGE);
        l2.setForeground(Color.WHITE);
        l2.setFont(new Font("verdana",Font.PLAIN,30));
        add(l2);

        //Evenet Handling
        //Register component for Event Listener
        //Register this window for WindowListener
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

