import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import javax.swing.JOptionPane;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
public class calculator extends JFrame
{
    JTextField l1,l2;
    JLabel la,lb;
    JButton btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,btn10,btn11,btn12,btn13,btn14,btn15,btn16,btn17,btn18,btn19,btn20,btn21,btn22,btn23,btn24,btn25,btn26,btn27,btn28,btn29,btn30;
    double op1,op2,result;
    String optr;
    public calculator()
    {
        setTitle("Calculator");
        setSize(500,500);
        setLayout(new GridLayout(9,1));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Font f =new Font("verdana",Font.PLAIN,24);
        
        la=new JLabel("Standards");
        la.setFont(f);
        add(la);

        l1=new JTextField("0");
        l1.setFont(f);
        l1.setEditable(false);
        l1.setHorizontalAlignment(JTextField.RIGHT);
        add(l1);

        btn1=new JButton("MC");
        btn1.setFont(f);
        btn2=new JButton("MR");
        btn2.setFont(f);
        btn3=new JButton("M+");
        btn3.setFont(f);
        btn4=new JButton("M-");
        btn4.setFont(f);
        btn5=new JButton("MS");
        btn5.setFont(f);
        btn6=new JButton("M");
        btn6.setFont(f);
        JPanel p=new JPanel(new GridLayout(1,6));
        p.add(btn1);
        p.add(btn2);
        p.add(btn3);
        p.add(btn4);
        p.add(btn5);
        p.add(btn6);
        add(p);

        btn7=new JButton("%");
        btn7.setFont(f);
        btn8=new JButton("CE");
        btn8.setFont(f);
        btn9=new JButton("C");
        btn9.setFont(f);
        btn10=new JButton("CLR");
        btn10.setFont(f);
        JPanel p1=new JPanel(new GridLayout(1,4));
        p1.add(btn7);
        p1.add(btn8);
        p1.add(btn9);
        p1.add(btn10);
        add(p1);

        btn11=new JButton("1/x");
        btn11.setFont(f);
        btn12=new JButton("sqr");
        btn12.setFont(f);
        btn13=new JButton("x^2");
        btn13.setFont(f);
        btn14=new JButton("/");
        btn14.setFont(f);
        JPanel p2=new JPanel(new GridLayout(1,4));
        p2.add(btn11);
        p2.add(btn12);
        p2.add(btn13);
        p2.add(btn14);
        add(p2);

        btn15=new JButton("7");
        btn15.setFont(f);
        btn16=new JButton("8");
        btn16.setFont(f);
        btn17=new JButton("9");
        btn17.setFont(f);
        btn18=new JButton("*");
        btn18.setFont(f);
        JPanel p3=new JPanel(new GridLayout(1,4));
        p3.add(btn15);
        p3.add(btn16);
        p3.add(btn17);
        p3.add(btn18);
        add(p3);

        btn19=new JButton("4");
        btn19.setFont(f);
        btn20=new JButton("5");
        btn20.setFont(f);
        btn21=new JButton("6");
        btn21.setFont(f);
        btn22=new JButton("-");
        btn22.setFont(f);
        JPanel p4=new JPanel(new GridLayout(1,4));
        p4.add(btn19);
        p4.add(btn20);
        p4.add(btn21);
        p4.add(btn22);
        add(p4);

        btn23=new JButton("1");
        btn23.setFont(f);
        btn24=new JButton("2");
        btn24.setFont(f);
        btn25=new JButton("3");
        btn25.setFont(f);
        btn26=new JButton("+");
        btn26.setFont(f);
        JPanel p5=new JPanel(new GridLayout(1,4));
        p5.add(btn23);
        p5.add(btn24);
        p5.add(btn25);
        p5.add(btn26);
        add(p5);

        btn27=new JButton("+/-");
        btn27.setFont(f);
        btn28=new JButton("0");
        btn28.setFont(f);
        btn29=new JButton(".");
        btn29.setFont(f);
        btn30=new JButton("=");
        btn30.setFont(f);
        btn30.setBackground(Color.CYAN);
        JPanel p6=new JPanel(new GridLayout(1,4));
        p6.add(btn27);
        p6.add(btn28);
        p6.add(btn29);
        p6.add(btn30);
        add(p6);

        btn9.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent ae){
                l1.setText("0");
            }
        });

        btn10.addActionListener(new ActionListener() {
            @Override
                public void actionPerformed(ActionEvent e) {              
                //handle backspace
                String text = l1.getText();
                if (text.length() > 1) {
                    l1.setText(text.substring(0, text.length() - 1));
                } else {
                    l1.setText("0");
                }
            }
        }); 

        btn12.addActionListener(new ActionListener(){
            @Override
                public void actionPerformed(ActionEvent ae){
                //read data from disply and store in oprand1 variable
                op1=Double.parseDouble(l1.getText());
                l1.setText("0");
                //store + in operator
                optr="sqr";
            }
        });

        btn14.addActionListener(new ActionListener(){
            @Override
                public void actionPerformed(ActionEvent ae){
                //read data from disply and store in oprand1 variable
                op1=Double.parseDouble(l1.getText());
                l1.setText("0");
                //store + in operator
                optr="/";
            }
        });
            
        btn15.addActionListener(new ActionListener(){                    
            @Override
            public void actionPerformed(ActionEvent e){
            if(l1.getText().equals("0"))
                l1.setText("7");
            else
                l1.setText(l1.getText()+"7");
            }
        });
                    
        btn16.addActionListener(new ActionListener(){        
            @Override
            public void actionPerformed(ActionEvent e){
            if(l1.getText().equals("0"))
                l1.setText("8");
            else
                l1.setText(l1.getText()+"8");
            }
        });
                    
        btn17.addActionListener(new ActionListener(){                    
            @Override
            public void actionPerformed(ActionEvent e){
            if(l1.getText().equals("0"))
                l1.setText("9");
            else
                l1.setText(l1.getText()+"9");
            }
        });

        btn18.addActionListener(new ActionListener(){
            @Override
                public void actionPerformed(ActionEvent ae){
                //read data from disply and store in oprand1 variable
                op1=Double.parseDouble(l1.getText());
                l1.setText("0");
                //store + in operator
                optr="*";
            }
        });
            
        btn19.addActionListener(new ActionListener(){        
            @Override
            public void actionPerformed(ActionEvent e){
            if(l1.getText().equals("0"))
                l1.setText("4");
            else
                l1.setText(l1.getText()+"4");
            }
        });
                    
        btn20.addActionListener(new ActionListener(){        
            @Override
            public void actionPerformed(ActionEvent e){
            if(l1.getText().equals("0"))
                l1.setText("5");
            else
                l1.setText(l1.getText()+"5");
            }
        });
                    
        btn21.addActionListener(new ActionListener(){        
            @Override
            public void actionPerformed(ActionEvent e){
            if(l1.getText().equals("0"))
                l1.setText("6");
            else
                l1.setText(l1.getText()+"6");
            }
        });

        btn22.addActionListener(new ActionListener(){
            @Override
                public void actionPerformed(ActionEvent ae){
                //read data from disply and store in oprand1 variable
                op1=Double.parseDouble(l1.getText());
                l1.setText("0");
                //store - in operator
                optr="-";
            }
        });
                        
        btn23.addActionListener(new ActionListener(){                    
            @Override
            public void actionPerformed(ActionEvent e){
            if(l1.getText().equals("0"))
                l1.setText("1");
            else
                l1.setText(l1.getText()+"1");
            }
        });
                
        btn24.addActionListener(new ActionListener(){                
            @Override
            public void actionPerformed(ActionEvent e){
            if(l1.getText().equals("0"))
                l1.setText("2");
            else
                l1.setText(l1.getText()+"2");
            }
        });
                    
        btn25.addActionListener(new ActionListener(){                    
        @Override
            public void actionPerformed(ActionEvent e){
            if(l1.getText().equals("0"))
                l1.setText("3");
            else
                l1.setText(l1.getText()+"3");
            }
        });
                            
        btn26.addActionListener(new ActionListener(){
            @Override
                public void actionPerformed(ActionEvent ae){
                //read data from disply and store in oprand1 variable
                op1=Double.parseDouble(l1.getText());
                l1.setText("0");
                //store + in operator
                optr="+";
            }
        });

        btn27.addActionListener(new ActionListener(){
            @Override
                public void actionPerformed(ActionEvent ae){
                //add - to display number if not present or remove - if present
                String displayNumber=l1.getText();
                if(displayNumber.charAt(0)=='-'){
                    //remove -
                    l1.setText(displayNumber.substring(1));
                }
                else{
                    //add minus
                    l1.setText("-"+displayNumber);
                }
            }
        });                    
                    
        btn28.addActionListener(new ActionListener(){         
            @Override
                public void actionPerformed(ActionEvent e){
                if(l1.getText().equals("0"))
                    l1.setText("0");
                else
                    l1.setText(l1.getText()+"0");
            }
        });
                    
        btn29.addActionListener(new ActionListener(){            
            @Override
                public void actionPerformed(ActionEvent e){
                //check . is available in number or not
                //it not the add to number
                String displayNumber=l1.getText();
                if(displayNumber.indexOf(".")==-1){
                    l1.setText(l1.getText()+".");
                }                 
            }
        });

        btn30.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent ae){
            //read data from display and store in operand2 variable
            op2=Double.parseDouble(l1.getText());
            //perform operation and put result on display
            switch(optr){
                case "+":result=op1+op2;break;
                case "-":result=op1-op2;break;
                case "*":result=op1*op2;break;
                case "/":
                try{
                    result=op1/op2;
                }catch(Exception ex){
                    result=0;
                }               
                }
                l1.setText(result+"");
            }
        });
    }
} 