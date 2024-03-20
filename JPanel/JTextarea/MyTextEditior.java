import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;

public class MyTextEditior extends JFrame
{
    JTextArea textArea;
    JButton saveButton;
    public MyTextEditior()
    {
        setTitle("Text Editor");
        setSize(400,600);
        setLayout(new BorderLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        textArea=new JTextArea();
        JScrollPane jsp=new JScrollPane(textArea);
        add(jsp,BorderLayout.CENTER);
        saveButton=new JButton("Save");
        add(saveButton,BorderLayout.SOUTH);

        //load data from file
        try
        {
            //open file in read mode
            FileReader fr=new FileReader("anshu.txt");
            BufferedReader br=new BufferedReader(fr);
            String data="";
            String data1="";
            data1=br.readLine();
             while(data1!=null)
             {
                data=data+data1+"\n";
                data1=br.readLine();
             }
             br.close();
             textArea.setText(data);

        }catch(Exception ex)
        {
            JOptionPane.showMessageDialog(this, "Error:"+ex.getMessage());
        }
        
        saveButton.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent ae)
            {
             try
             {
                FileWriter fr=new FileWriter("anshu.txt");
                fr.write(textArea.getText());
                fr.close();
                JOptionPane.showMessageDialog(MyTextEditior.this, "Data saved to file successfully!");                

             }catch(Exception ex)
             {
                JOptionPane.showMessageDialog(MyTextEditior.this, "Error:"+ex.getMessage());
             }   
            }
        });


        
    }
}