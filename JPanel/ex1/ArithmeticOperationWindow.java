import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class ArithmeticOperationWindow extends JFrame
{
    JTextField tn1,tn2;
    JLabel l1,l2,result;
    JButton addBtn,subBtn,multBtn,divBtn,resetBtn,reset2;
    public ArithmeticOperationWindow()
    {
        setTitle("Arithmetic Operations");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400,600);
        setLayout(new GridLayout(4,1));

        Font f=new Font("verdana",Font.PLAIN,24);
        l1=new JLabel("Enter 1st number:");
        tn1=new JTextField();
        l1.setFont(f);
        tn1.setFont(f);

        JPanel p1=new JPanel();
        p1.setLayout(new GridLayout(1,2));
        p1.add(l1);
        p1.add(tn1);
        add(p1);

        l2=new JLabel("Enter 2nd number:");
        l2.setFont(f);
        tn2=new JTextField();
        tn2.setFont(f);
        JPanel p2=new JPanel(new GridLayout());
        p2.add(l2);
        p2.add(tn2);
        add(p2);

        addBtn=new JButton("Add");
        addBtn.setFont(f);
        subBtn=new JButton("Subtract");
        subBtn.setFont(f);
        multBtn=new JButton("Multiply");
        multBtn.setFont(f);
        divBtn=new JButton("Divide");
        divBtn.setFont(f);
        resetBtn=new JButton("Reset");
        resetBtn.setFont(f);
        reset2=new JButton("Reset2");
        reset2.setFont(f);
        JPanel p3=new JPanel(new GridLayout(1,5));
        p3.add(addBtn);
        p3.add(subBtn);
        p3.add(multBtn);
        p3.add(divBtn);
        JPanel p4=new JPanel(new GridLayout(2,1));
        p4.add(resetBtn);
        p4.add(reset2);
        p3.add(p4);
        add(p3);
        result=new JLabel("Result Will Appear Here");
        result.setFont(f);
        result.setBackground(Color.GREEN);
        add(result);

        addBtn.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(ArithmeticOperationWindow.this, "I will perform addition operation");
                        }

        });
        subBtn.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(ArithmeticOperationWindow.this, "I will perform subtraction operation");
            }

        });
        multBtn.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(ArithmeticOperationWindow.this, "I will perform Multiplication operation");
        }
            
        });
        addBtn.addMouseListener(new MouseListener() {

            @Override
            public void mouseClicked(MouseEvent e) {
                }

            @Override
            public void mousePressed(MouseEvent e) {
                }

            @Override
            public void mouseReleased(MouseEvent e) {
                }

            @Override
            public void mouseEntered(MouseEvent e) {
            addBtn.setBackground(Color.GREEN);    
            }

            @Override
            public void mouseExited(MouseEvent e) {
                addBtn.setBackground(Color.BLUE);
                }
            
        });
    }
   
  } 