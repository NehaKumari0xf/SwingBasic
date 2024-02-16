import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.FileReader;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class viewStudentRecord extends JFrame {
    JLabel name, fname, gender, hindi, english, math, science, sscience, total, percentage, result, totalRecordValue ,timerLbl;
    JButton nextBtn, preBtn;
    String data[];
    int totalRecord, vRecordNo;

    public viewStudentRecord() {
        setTitle("View Records");
        setSize(400, 600);
        setLayout(new BorderLayout());
        JLabel l1 = new JLabel("Student Record");
        l1.setFont(new Font("verdana", Font.BOLD | Font.ITALIC, 22));
        add(l1, BorderLayout.NORTH);

        JPanel centerPanel = new JPanel(new GridLayout(12, 1));

        // Name
        JPanel namePanel = new JPanel(new GridLayout(1, 2));
        JLabel namelbl = new JLabel("Student's Name:");
        name = new JLabel("");
        namePanel.add(namelbl);
        namePanel.add(name);

        centerPanel.add(namePanel);

        // father's name
        JPanel fnamePanel = new JPanel(new GridLayout(1, 2));
        JLabel fnamelbl = new JLabel("Father's Name:");
        fname = new JLabel("");
        fnamePanel.add(fnamelbl);
        fnamePanel.add(fname);

        centerPanel.add(fnamePanel);

        // gender
        JPanel genderPanel = new JPanel(new GridLayout(1, 2));
        JLabel genderlbl = new JLabel("Gender: ");
        gender = new JLabel("");
        genderPanel.add(genderlbl);
        genderPanel.add(gender);

        centerPanel.add(genderPanel);

        // Marks
        JPanel hindiPanel = new JPanel(new GridLayout(1, 2));
        JLabel hidnilbl = new JLabel("Hindi :");
        hindi = new JLabel("");
        hindiPanel.add(hidnilbl);
        hindiPanel.add(hindi);

        centerPanel.add(hindiPanel);

        JPanel englishPanel = new JPanel(new GridLayout(1, 2));
        JLabel englishlbl = new JLabel("English :");
        english = new JLabel("");
        englishPanel.add(englishlbl);
        englishPanel.add(english);

        centerPanel.add(englishPanel);

        JPanel mathsPanel = new JPanel(new GridLayout(1, 2));
        JLabel mathslbl = new JLabel("Maths :");
        math = new JLabel("");
        mathsPanel.add(mathslbl);
        mathsPanel.add(math);

        centerPanel.add(mathsPanel);

        JPanel sciencePanel = new JPanel(new GridLayout(1, 2));
        JLabel sciencelbl = new JLabel("Science :");
        science = new JLabel("");
        sciencePanel.add(sciencelbl);
        sciencePanel.add(science);

        centerPanel.add(sciencePanel);

        add(centerPanel, BorderLayout.CENTER);

        JPanel ssciencePanel = new JPanel(new GridLayout(1, 2));
        JLabel ssciencelbl = new JLabel("Social Science :");
        sscience = new JLabel("");
        ssciencePanel.add(ssciencelbl);
        ssciencePanel.add(sscience);

        centerPanel.add(ssciencePanel);

        JPanel totalPanel = new JPanel(new GridLayout(1, 2));
        JLabel totallbl = new JLabel("Total :");
        total = new JLabel("");
        totalPanel.add(totallbl);
        totalPanel.add(total);

        centerPanel.add(totalPanel);

        JPanel percentagePanel = new JPanel(new GridLayout(1, 2));
        JLabel percentagelbl = new JLabel("Percentage :");
        percentage = new JLabel("");
        percentagePanel.add(percentagelbl);
        percentagePanel.add(percentage);
        centerPanel.add(percentagePanel);

        JPanel resultPanel = new JPanel(new GridLayout(1, 2));
        JLabel resultlbl = new JLabel("Result :");
        result = new JLabel("");
        resultPanel.add(resultlbl);
        resultPanel.add(result);
        centerPanel.add(resultPanel);

        totalRecordValue = new JLabel("Total Record :"+totalRecord);
        centerPanel.add(totalRecordValue);
        add(centerPanel, BorderLayout.CENTER);

        // button
        JPanel buttonPanel = new JPanel(new GridLayout(1, 2));
        preBtn = new JButton("<Previous");
        nextBtn = new JButton("Next>");
        buttonPanel.add(preBtn);
        buttonPanel.add(nextBtn);

        add(buttonPanel, BorderLayout.SOUTH);
        // LOAD DATA FROM FILE
        try {
            FileReader reader = new FileReader("studentInfo.txt");
            BufferedReader bReader = new BufferedReader(reader);
            data = new String[1000];
            totalRecord = 0;
            String record;
            while ((record = bReader.readLine()) != null) {
                data[totalRecord++] = record;
            }
            bReader.close();
            reader.close();
            vRecordNo = 0;
            viewRecord(data[vRecordNo]);

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage());
        }

        nextBtn.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                if (vRecordNo == totalRecord - 1) {
                    JOptionPane.showMessageDialog(viewStudentRecord.this, "Already on last record!");
                } else {
                    vRecordNo++;
                    viewRecord(data[vRecordNo]);
                }
            }

        });

        preBtn.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                if (vRecordNo == 0) {
                    JOptionPane.showMessageDialog(viewStudentRecord.this, "Already on 1st record");
                } else {
                    vRecordNo--;
                    viewRecord(data[vRecordNo]);

                }
            }

        });
    }

    void viewRecord(String record) {

        // record-> name~fname~
        // 1 extract name from record
        int tildePos1 = -1, tildePos2 = -1;
        // find 1st ~ position
        tildePos1 = record.indexOf("~", 0);
        String nameData = record.substring(0, tildePos1);
        name.setText(nameData);

        // extract fname from record
        // find the position of ~ after fname
        tildePos2 = record.indexOf("~", tildePos1 + 1);
        String fnameData = record.substring(tildePos1 + 1, tildePos2);
        fname.setText(fnameData);

        // extract gender record
        String genderData = record.substring(tildePos2 + 1, tildePos2 + 2);
        gender.setText(genderData);

        // extract paper 1
        tildePos1 = tildePos2 +2;
        tildePos2 = record.indexOf("~", tildePos1 + 1);
        String p1Data = record.substring(tildePos1 + 1, tildePos2);
        hindi.setText(p1Data);

        // extract paper 2  
        tildePos1 = tildePos2 ;
        tildePos2 = record.indexOf("~", tildePos1 + 1);
        String p2Data = record.substring(tildePos1 + 1, tildePos2);
        english.setText(p2Data);

        // extract paper 3
        tildePos1 = tildePos2 ;
        tildePos2 = record.indexOf("~", tildePos1 + 1);
        String p3Data = record.substring(tildePos1 + 1, tildePos2);
        math.setText(p3Data);

        // extract paper 4
        tildePos1 = tildePos2;
        tildePos2 = record.indexOf("~", tildePos1 + 1);
        String p4Data = record.substring(tildePos1 + 1, tildePos2);
        science.setText(p4Data);
        
        // extract paper 5
        //tildePos1 = tildePos2;
        //tildePos2 = record.indexOf("~", tildePos1 + 1);
        String p5Data = record.substring(tildePos1+4 , tildePos2+3);
        sscience.setText(p5Data);
        
        //total marks
        int p1=Integer.parseInt(p1Data),p2=Integer.parseInt(p2Data),p3=Integer.parseInt(p3Data),p4=Integer.parseInt(p4Data),p5=Integer.parseInt(p5Data);
        int totalmarks= p1+p2+p3+p4+p5;
        //totalmarks=record.substring(tildePos1+1 , tildePos2);
        total.setText(Integer.toString(totalmarks));

        //percentage
        int per=totalmarks/5;
        percentage.setText(Integer.toString(per) + "%");

        //resilt
        if(per>=30)
        result.setText(("Pass"));
        else
        result.setText(("Fail"));

        totalRecordValue.setText("Current Record Status: "+vRecordNo +" 0f " + totalRecord );

        class TimerThread extends Thread
        {
            @Override
            public void run()
            {
                int h=0,m=0,s=0;
            do
            {
                
                timerLbl.setText(h+":"+m+":"+s);
                s++;
                if(s==60)
                {
                    m++;
                    s=0;
                }
                if(m==60)
                {
                    m=0;
                    h++;
                }
                try
                {
                    Thread.sleep(1000);
                }catch(Exception ex)
                {
    
                }
            }while(true);
            }
        }
    
        
    }
}
