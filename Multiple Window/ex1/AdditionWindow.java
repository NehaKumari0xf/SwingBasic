import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AdditionWindow extends JFrame{
    JTextField n1,n2;
    JLabel result;
    public AdditionWindow()
    {
        super("Addition");
        setSize(400,400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(4,2));
        Font f=new Font("Viner Hand ITC Regular",Font.PLAIN,20);

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

        JButton add,reset;
        
        add=new JButton("Add");
        add.setFont(f);
        add(add);

        reset=new JButton("Reset");
        reset.setFont(f);
        add(reset);

        JLabel l3=new JLabel("Result");
        l3.setFont(f);
        add(l3);
        
        result=new JLabel("");
        result.setFont(f);
        add(result);
        
        //event handling
        add.addActionListener(new AddButtonHandler());
        reset.addActionListener(new ResetButtonHandler());

    }

    class AddButtonHandler implements ActionListener
    {

        @Override
        public void actionPerformed(ActionEvent e) {
            double nv1=0,nv2=0,res=0;
            if(n1.getText().isEmpty())
            {
                result.setText("Please Enter 1st number");
                n1.requestFocus();
                return;
            }    
            try{
                nv1=Double.parseDouble(n1.getText());
            }catch(Exception ex)
            {
                result.setText("Enter a valid number in 1st number");
                n1.setText("");
                n1.requestFocus();
                return;
            }

            if(n2.getText().isEmpty())
            {
                result.setText("Please enter 2nd number");
                n2.requestFocus();
                return;
            }

            try{
                nv2=Double.parseDouble(n2.getText());
            }catch(Exception ex)
            {
                result.setText("Please enter valid numbe in second number");
                n2.setText("");
                n2.requestFocus();
                return;
            }
            res=nv1+nv2;
            //display result on result label
            result.setText(res+"");


        }
        
    }
    class ResetButtonHandler implements ActionListener
    {

        @Override
        public void actionPerformed(ActionEvent e) {
            n1.setText("");
            n2.setText("");
            result.setText("");
            n1.requestFocus();    
        }
        
    }
}