import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyWindow extends JFrame
{
    JRadioButton m,f,o;
    ButtonGroup genderGroup;
    public MyWindow()
    {
        setTitle("Radio Button Example");
        setSize(300,400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        setLayout(new GridLayout(5,1));
        genderGroup=new ButtonGroup();
        m=new JRadioButton("Male");
        f=new JRadioButton("Female");
        o=new JRadioButton("Other");
        genderGroup.add(m);
        genderGroup.add(f);
        genderGroup.add(o);
        add(m);
        add(f);
        add(o);
        
        JButton btn=new JButton("Check");
        add(btn);
        btn.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e) {
                if(m.isSelected())
                {
                    JOptionPane.showMessageDialog(MyWindow.this, "You have selected MALE");
                }  
                else if(f.isSelected()) 
                {
                    JOptionPane.showMessageDialog(MyWindow.this, "You have selected FEMALE");
                }   else if(o.isSelected())
                {
                    JOptionPane.showMessageDialog(MyWindow.this, "You have selected OTHERS");
                }   else
                {
                    JOptionPane.showMessageDialog(MyWindow.this, "You haven't Selected any gender");
                }        
            }
            
        });



    }
}