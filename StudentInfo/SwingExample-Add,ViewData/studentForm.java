//Write a Java (GUI) application that will accept name,fathers name, gender and marks of 5 subject of student and save date to text file.

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;

public class studentForm extends JFrame {
    JPanel p1, p2, gPanel;
    JLabel l1, sn, fn, lmaths, leng, lsci, lsst, lhindi;
    JTextField sname, fname;
    JSpinner maths, eng, sci, sst, hindi;
    JRadioButton m, f, o;
    ButtonGroup gender;

    public studentForm(){
        setTitle("Marksheet");
        setSize(500,700);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);        

        l1=new JLabel("Student Information");
        l1.setForeground(Color.BLUE);
        l1.setFont(new Font("Brush Script m7",Font.CENTER_BASELINE,50));
        add(l1, BorderLayout.NORTH);
    
        p1=new JPanel(new GridLayout(9, 2));
        add(p1, BorderLayout.CENTER);

        sn=new JLabel("Enter Student Name:");
        sname=new JTextField();
        p1.add(sn);
        p1.add(sname);
        fn=new JLabel("Enter Father's Name: ");
        fname=new JTextField();
        p1.add(fn);
        p1.add(fname);
        
        JLabel gen=new JLabel("Select Gender:");
        p1.add(gen);
        
        gender=new ButtonGroup();
        gPanel=new JPanel(new GridLayout(1, 3));
        m=new JRadioButton("Male");
        f=new JRadioButton("Female");
        o=new JRadioButton("Other");
        gender.add(m);
        gender.add(f);
        gender.add(o);
        gPanel.add(m);
        gPanel.add(f);
        gPanel.add(o);
        p1.add(gPanel);
        
        lmaths=new JLabel("Enter Obtained Marks OF Hindi:");
        SpinnerNumberModel smaths=new SpinnerNumberModel(0,0,100,0);
        maths=new JSpinner(smaths);
        p1.add(lmaths);
        p1.add(lmaths);
        p1.add(maths);
        leng=new JLabel("Enter Obtained Marks OF English:");
        SpinnerNumberModel seng=new SpinnerNumberModel(0,0,100,0);
        eng=new JSpinner(seng);
        p1.add(leng);
        p1.add(eng);
        lsci=new JLabel("Enter Obtained Marks OF Maths:");
        SpinnerNumberModel ssci=new SpinnerNumberModel(0,0,100,0);
        sci=new JSpinner(ssci);
        p1.add(lsci);
        p1.add(sci);
        lsst=new JLabel("Enter Obtained Marks OF Science:");
        SpinnerNumberModel ssst=new SpinnerNumberModel(0,0,100,0);
        sst=new JSpinner(ssst);
        p1.add(lsst);
        p1.add(sst);
        lhindi=new JLabel("Enter Obtained Marks OF Social Science:");
        SpinnerNumberModel shindi=new SpinnerNumberModel(0,0,100,0);
        hindi=new JSpinner(shindi);
        p1.add(lhindi);
        p1.add(hindi);

        p2=new JPanel(new GridLayout(2, 1));
        add(p2, BorderLayout.SOUTH);
        
        //load data to file
        
        JButton btn1=new JButton("Submit");
        btn1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                validateData();             
            }
        });
        p2.add(btn1);

        JButton btn2=new JButton("Reset");
        btn2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ressetData();
            }
        });
        p2.add(btn2);
    }

    void validateData(){
        if (sname.getText().isEmpty()) {
            JOptionPane.showMessageDialog(studentForm.this, "This field is required! ");
            sname.requestFocus();
            return;
        }if (fname.getText().isEmpty()) {
            JOptionPane.showMessageDialog(studentForm.this, "This field is required! ");
            fname.requestFocus();
            return;
        }if (eng.getValue().toString().equals("0")) {
            JOptionPane.showMessageDialog(studentForm.this, "This field is required! ");
            hindi.requestFocus();
            return;
        }if (hindi.getValue().toString().equals("0")) {
            JOptionPane.showMessageDialog(studentForm.this, "This field is required! ");
            hindi.requestFocus();
            return;
        }if (maths.getValue().toString().equals("0")) {
            JOptionPane.showMessageDialog(studentForm.this, "This field is required! ");
            hindi.requestFocus();
            return;
        }if (sci.getValue().toString().equals("0")) {
            JOptionPane.showMessageDialog(studentForm.this, "This field is required! ");
            hindi.requestFocus();
            return;
        }if (sst.getValue().toString().equals("0")) {
            JOptionPane.showMessageDialog(studentForm.this, "This field is required! ");
            hindi.requestFocus();
            return;
        }
        //load data to file
        try {
            FileWriter fWriter=new FileWriter("studentInfo.txt",true);
            String gender;
                if (m.isSelected())
                    gender = "M";
                else if (f.isSelected())
                    gender = "F";
                else
                    gender = "O";
                // Prepare data to write to file
                String data = sname.getText() + "~" + fname.getText() + "~" + gender + "~"
                    + hindi.getValue().toString()
                    + "~" + eng.getValue().toString()
                    + "~" + maths.getValue().toString() + "~"
                    + sci.getValue().toString()
                    + "~" + sst.getValue().toString() + "\n";
                fWriter.write(data);
            fWriter.close();
            JOptionPane.showMessageDialog(studentForm.this, "Submiited!");
            ressetData();
        } catch (Exception ex) {
                JOptionPane.showMessageDialog(studentForm.this, "Error: "+ex.getMessage());
        }
    }

    void ressetData(){
        sname.setText("");
        fname.setText("");
        gender.clearSelection();
        m.setSelected(true);
        hindi.setValue(0);
        eng.setValue(0);
        maths.setValue(0);
        sci.setValue(0);
        sst.setValue(0);
        sname.requestFocus();
    }
}