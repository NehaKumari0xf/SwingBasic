import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JSpinner;
import javax.swing.JTextField;
import javax.swing.SpinnerNumberModel;
import javax.swing.SpinnerDateModel;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Calendar;
import java.util.Date;


public class JSpinnerExampleWindow extends JFrame
{
    JTextField ageTfield;
    JSpinner ageSpinner;
    JSpinner dobSpinner;
    JLabel l3;
    public JSpinnerExampleWindow()
    {
        setTitle("JSpinner Example");
        setSize(400,500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(4,2));
        JLabel l1=new JLabel("Enter age:");
        ageTfield=new JTextField();
        add(l1);
        add(ageTfield);
        JLabel l2=new JLabel("Enter age:");
        SpinnerNumberModel smodel=new SpinnerNumberModel(10, 0, 100, 2);
        ageSpinner=new JSpinner(smodel);
        
        
        add(l2);
        add(ageSpinner);       

        JButton btn=new JButton("Check");
        add(btn);

         l3=new JLabel("Neha Kuamri");
        add(l3);
        btn.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(JSpinnerExampleWindow.this, "Entered age is:"+ageSpinner.getValue());
            }
            
        });

        ageSpinner.addChangeListener(new ChangeListener() {

            @Override
            public void stateChanged(ChangeEvent e) {
                l3.setFont(new Font("Verdana",Font.PLAIN,Integer.parseInt(ageSpinner.getValue().toString())));
               }
            
        });

        SpinnerDateModel sdm=new SpinnerDateModel(new Date(), null, null, Calendar.DAY_OF_MONTH);
        dobSpinner=new JSpinner(sdm);
        add(dobSpinner);       
    }
}