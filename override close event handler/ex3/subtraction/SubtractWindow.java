import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.awt.TextField;
import java.awt.Button;
import java.awt.Color;
public class SubtractWindow extends Frame
{
    TextField n1;
    TextField n2;
    Label result;
    public SubtractWindow()
    {
        super("Subtraction");
        setSize(700,700);

        setLayout(new GridLayout(5,2));
        addWindowListener(new WindowHandler());
        setResizable(false);
        Font f=new Font("verdana",Font.BOLD,40);
        Label l1=new Label("Enter 1st number:");
        l1.setFont(f);
        add(l1);
        n1=new TextField();
        n1.setFont(f);
        add(n1);
        Label l2=new Label("Enter 2nd number:");
        l2.setFont(f);
        add(l2);
        n2=new TextField();
        n2.setFont(f);
        add(n2);
        Button sub=new Button("Subtract");
        sub.setFont(f);
        
        add(sub);
        Button reset=new Button("Reset");
        
        reset.setFont(f);
        add(reset);
        Label l3=new Label("Result");
        
        l3.setFont(f);
        add(l3);
        result=new Label();
        result.setFont(f);
        add(result);

        //register add button for actionListener
        sub.addActionListener(new AddButtonHandler());
        //register reset button for actionlistener
        reset.addActionListener(new ResetButtonHandler());

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

    class AddButtonHandler implements ActionListener
    {

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
                r=vn1-vn2;
                //display result on result label
                result.setText(r+"");



            }catch(NumberFormatException ex)
            {
                result.setText(ex.getMessage());
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
