import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculator extends JFrame{
    JLabel expDisplay;
    JTextField display;
    JButton buttons[];
    Double op1,op2,result;
    String optr;
    public Calculator()
    {
        setTitle("Calculator");
        setSize(400,600);
        //setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        JPanel displayPanel=new JPanel(new BorderLayout());
        expDisplay=new JLabel("Expression will appear here");
        display=new JTextField("0");
        expDisplay.setHorizontalAlignment(JLabel.RIGHT);
        display.setHorizontalAlignment(JTextField.RIGHT);
        display.setFont(new Font("Verdan",Font.BOLD,35));

        displayPanel.add(expDisplay,BorderLayout.NORTH);
        displayPanel.add(display,BorderLayout.CENTER);

        add(displayPanel,BorderLayout.NORTH);

        //create JButton array
        buttons=new JButton[24];
        //create 24 buttons and add to button panel
        JPanel buttonPanel=new JPanel(new GridLayout(6,4));
        String buttonLabel[]={"%","CE","C","<-","1/x","x^2","sqrt","/","7","8","9","X","4","5","6","-","1","2","3","+","+/-","0",".","="};
        ButtonHandler btnHandler=new ButtonHandler();
        for(int i=0;i<24;i++)
        {
            buttons[i]=new JButton(buttonLabel[i]);
            buttonPanel.add(buttons[i]);
            //register button for ActionListener
            buttons[i].addActionListener(btnHandler);

        }
        //add buttonPanel to Frame's center area
        add(buttonPanel,BorderLayout.CENTER);
    }
    class ButtonHandler implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            
            //JOptionPane.showMessageDialog(Calculator.this, "You have clicked button:"+e.getActionCommand());
            String clickedButton=e.getActionCommand();
            if(clickedButton.equals("0")
            ||clickedButton.equals("1")
            ||clickedButton.equals("2")
            ||clickedButton.equals("3")
            ||clickedButton.equals("4")
            ||clickedButton.equals("5")
            ||clickedButton.equals("6")
            ||clickedButton.equals("7")
            ||clickedButton.equals("8")
            ||clickedButton.equals("9"))
            {
                if(display.getText().equals("0"))
                display.setText(clickedButton);
                else
                display.setText(display.getText()+clickedButton);
            }
            else if(clickedButton.equals("."))
            {
                if(display.getText().indexOf(".")==-1)
                display.setText(display.getText()+".");
            }
            else if(clickedButton.equals("<-"))
            {
                display.setText(display.getText().substring(0,display.getText().length()-1));
                if(display.getText().isEmpty())
                display.setText("0");
            }
            else if(clickedButton.equals("+")||clickedButton.equals("-")||clickedButton.equals("X")||clickedButton.equals("/"))
            {
                op1=Double.parseDouble(display.getText());
                optr=clickedButton;
                display.setText("0");
            }
            else if(clickedButton.equals("="))
            {
                op2=Double.parseDouble(display.getText());
                switch(optr)
                {
                    case "+":result=op1+op2;break;
                    case "-":result=op1-op2;break;
                    case "X":result=op1*op2;break;
                    case "/":
                    try{
                        result=op1/op2;
                    }catch(Exception ex)
                    {
                        result=0.0;
                    }
                }
                display.setText(""+result);
            }
        }

    }
}