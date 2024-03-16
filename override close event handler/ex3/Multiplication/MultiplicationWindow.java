import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class MultiplicationWindow extends JFrame
{
    JTextField n1;
    JTextField n2;
    JLabel result;
    public MultiplicationWindow(){
        super("Multiplication");
        setSize(800,600);
        setLayout(new GridLayout(5, 2));
        setResizable(false);
        Font f=new Font("Consolas",Font.BOLD,40);

        JLabel l1=new JLabel("Enter 1st number:");
        l1.setFont(f);
        add(l1);
        n1=new JTextField();
        n1.setFont(f);
        add(n1);

        JLabel l2=new JLabel("Enter 2nd number:");
        l2.setFont(f);
        add(l2);
        n2=new JTextField();
        n2.setFont(f);
        add(n2);

        JButton mul=new JButton("Multiply");
        mul.setFont(f);
        mul.setForeground(Color.green);
        add(mul);

        JButton reset=new JButton("Reset");
        reset.setFont(f);
        reset.setForeground(Color.RED);
        add(reset);

        JLabel l3=new JLabel("Result");
        l3.setFont(f);
        l3.setForeground(Color.BLUE);
        add(l3);
        result=new JLabel();
        result.setFont(f);
        add(result);

        addWindowListener(new WindowHandler());
        //register add button for actionListener
        mul.addActionListener(new MultiplyButtonHandler());
        //register reset button for actionlistener
        reset.addActionListener(new ResetButtonHandler());

    }
    
    class WindowHandler implements WindowListener{
        @Override
        public void windowClosing(WindowEvent e) {
            System.exit(0);
            }
            @Override
            public void windowOpened(WindowEvent e) {
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

    class MultiplyButtonHandler implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            try
            {
                String sn1,sn2;
                sn1=n1.getText();
                sn2=n2.getText();
                double vn1,vn2;
                vn1=Double.parseDouble(sn1);
                vn2=Double.parseDouble(sn2);
                double r=0;
                r=vn1*vn2;
                //display result on result label
                result.setText(r+"");

            }catch(NumberFormatException ex){
                result.setText("Invalid input.\n Please Enter Integer value.");            
            }
        }
    }

    class ResetButtonHandler implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            n1.setText("0");
            n2.setText("0");
            result.setText("0");   
            n1.requestFocus(); 
        }
    }
}
