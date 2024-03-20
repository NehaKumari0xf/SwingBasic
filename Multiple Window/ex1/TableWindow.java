import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class TableWindow extends JFrame {
    JTextField un;
    JButton btn;
    JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9,l10;
    public TableWindow()
    {
        super("Table");
        setSize(400,400);
        setLayout(new GridLayout(12,1));
       Font f=new Font("Verdana",Font.PLAIN,30);
       un=new JTextField();
       un.setFont(f);
       btn=new JButton("Print Table");
       btn.setFont(f);
       l1=new JLabel("");
       l1.setFont(f);
       l2=new JLabel("");
       l2.setFont(f);
       l3=new JLabel("");
       l3.setFont(f);
       l4=new JLabel("");
       l4.setFont(f);
       l5=new JLabel("");
       l5.setFont(f);
       l6=new JLabel("");
       l6.setFont(f);
       l7=new JLabel("");
       l7.setFont(f);
       l8=new JLabel("");
       l8.setFont(f);
       l9=new JLabel("");
       l9.setFont(f);
       l10=new JLabel("");
       l10.setFont(f); 
        //add all component to container
        add(un);
        add(btn);
        add(l1);
        add(l2);
        add(l3);
        add(l4);
        add(l5);
        add(l6);
        add(l7);
        add(l8);
        add(l9);
        add(l10);

        btn.addActionListener(new BtnHandler());

    }
    
    class BtnHandler implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            int n=0;
            try{
                n=Integer.parseInt(un.getText());
            }catch(Exception ex)
            {
                //create message box and display error message on it
                JOptionPane.showMessageDialog(TableWindow.this, "Please Enter valid number");
                un.setText("");
                l1.setText("");
                l2.setText("");
                l3.setText("");
                l4.setText("");
                l5.setText("");
                l6.setText("");
                l7.setText("");
                l8.setText("");
                l9.setText("");
                l10.setText("");
                un.requestFocus();

                return ;
            }
            //print table
            l1.setText(n+" * 1 = "+(n*1));
            l2.setText(n+" * 2 = "+(n*2));
            l3.setText(n+" * 3 = "+(n*3));
            l4.setText(n+" * 4 = "+(n*4));
            l5.setText(n+" * 5 = "+(n*5));
            l6.setText(n+" * 6 = "+(n*6));
            l7.setText(n+" * 7 = "+(n*7));
            l8.setText(n+" * 8 = "+(n*8));
            l9.setText(n+" * 9 = "+(n*9));
            l10.setText(n+" * 10 = "+(n*10));

        }

    }
}
