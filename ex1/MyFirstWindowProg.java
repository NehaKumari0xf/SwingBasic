import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;

public class MyFirstWindowProg {
    public static void main(String[] args) {
        Frame windowFrame=new Frame();
        windowFrame.setSize(610,450);
        windowFrame.setTitle("Family Details");
        windowFrame.setLayout(new FlowLayout());
        windowFrame.setBackground(Color.DARK_GRAY);
        Label l1=new Label("My Family Details");
        l1.setForeground(Color.green);
        l1.setFont(new Font("Brush Script m7",Font.CENTER_BASELINE,50));
        windowFrame.add(l1);

        Label l2=new Label("----------------------------------------------------");
        l2.setForeground(Color.cyan);
        l2.setFont(new Font("Brush Script m7",Font.BOLD,30));
        windowFrame.add(l2);

        Label l3=new Label("I am Neha.");
        l3.setFont(new Font("Brush Script m7",Font.ROMAN_BASELINE,30));
        l3.setForeground(Color.white);
        windowFrame.add(l3);

        Label l4=new Label("I come from a small family.");
        l4.setFont(new Font("Brush Script m7",Font.ROMAN_BASELINE,30));
        l4.setForeground(Color.white);
        windowFrame.add(l4);
        Label l5=new Label("There are 4 members in my family.");
        l5.setFont(new Font("Brush Script m7",Font.ROMAN_BASELINE,30));
        l5.setForeground(Color.white);
        windowFrame.add(l5);


        Label l6=new Label("My Father's name is Mr. Anil Kumar.");
        l6.setFont(new Font("Brush Script m7",Font.ROMAN_BASELINE,30));
        l6.setForeground(Color.white);
        windowFrame.add(l6);

        Label l7=new Label("My Mother's name is Mrs. Manju Devi.");
        l7.setFont(new Font("Brush Script m7",Font.ROMAN_BASELINE,30));
        l7.setForeground(Color.white);
        windowFrame.add(l7);

        Label l8=new Label("My Brother's name is Abhishek Kumar.");
        l8.setFont(new Font("Brush Script m7",Font.ROMAN_BASELINE,30));
        l8.setForeground(Color.white);
        windowFrame.add(l8);
        
        windowFrame.setResizable(false);
        windowFrame.setVisible(true);        
    }
}
