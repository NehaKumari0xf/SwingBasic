
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class StudentRecordMainWindow extends JFrame {
    studentForm sInfo;
    viewStudentRecord viewWindow;

    public StudentRecordMainWindow() {
        setTitle("Student Records");
        setSize(400, 450);
        setLayout(new GridLayout(2, 1));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JButton addNewButton, viewButton;
        addNewButton = new JButton("Add New Student");
        viewButton = new JButton("View Students");
        add(addNewButton);
        add(viewButton);
        addNewButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                if (sInfo == null)
                    sInfo = new studentForm();

                sInfo.setVisible(true);
            }

        });
        viewButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                if (viewWindow == null) {
                    viewWindow = new viewStudentRecord();
                }
                viewWindow.setVisible(true);
            }

        });
    }
}
