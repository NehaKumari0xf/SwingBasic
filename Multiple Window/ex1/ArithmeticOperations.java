import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class ArithmeticOperations extends JFrame {
    JButton addBtn,subBtn,multBtn,divBtn,tableBtn;
    public ArithmeticOperations()
    {
        setTitle("Arithmetic Operations");
        setSize(400,600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(5,1));
        addBtn=new JButton("Addition");
        subBtn=new JButton("Subtraction");
        multBtn=new JButton("Multiplication");
        divBtn=new JButton("Division");
        tableBtn=new JButton("Table");

        add(addBtn);
        add(subBtn);
        add(multBtn);
        add(divBtn);
        add(tableBtn);
        addBtn.addActionListener(new AddButtonHandler());
        subBtn.addActionListener(new SubButtonHandler());
        multBtn.addActionListener(new MultButtonHandler());
        divBtn.addActionListener(new DivButtonHandler());
        tableBtn.addActionListener(new TableButtonHandler());
    }

    class AddButtonHandler implements ActionListener
    {

        @Override
        public void actionPerformed(ActionEvent e) {
            AdditionWindow aw=new AdditionWindow();
            aw.setVisible(true);
        }
        
    }
     
    class SubButtonHandler implements ActionListener
    {

        @Override
        public void actionPerformed(ActionEvent e) {
            SubtractionWindow sw=new SubtractionWindow();
            sw.setVisible(true);    
        }
        
    }
    
    class MultButtonHandler implements ActionListener
    {

        @Override
        public void actionPerformed(ActionEvent e) {
        MultiplicationWindow mw=new MultiplicationWindow();
        mw.setVisible(true);    
        }
        
    }

    class DivButtonHandler implements ActionListener
    {

        @Override
        public void actionPerformed(ActionEvent e) {
        DivisionWindow dw=new DivisionWindow();
        dw.setVisible(true);    
        }
        
    }

    class TableButtonHandler implements ActionListener
    {

        @Override
        public void actionPerformed(ActionEvent e) {
            TableWindow tw=new TableWindow();
            tw.setVisible(true);
        }
        
    }
}
