/*import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
*/
import java.awt.*;
public class windowEx
{
    public static void main(String...args)
    {
        //craete a top level comtainer
        //Frame is the top level container of AWT
        Frame window=new Frame();
        window.setSize(400,400);
        window.setTitle("Jai Sri Ganesh");
        window.setLayout(new FlowLayout());
        
        Label l1=new Label("My first window");
        //Any component must be added on conteiner to become visible
        //add() is used to add any component on container
        window.add(l1);
        Label l2=new Label("Neha Kumari");
        l2.setBackground(Color.GREEN);
        window.add(l2);
        Label l3=new Label("Kajal Kumari");
        l3.setBackground(Color.BLUE);
        l3.setForeground(Color.white);
        window.add(l3);

        Label l4=new Label("Anshu Mala");
        l4.setBackground(Color.yellow);
        l4.setForeground(Color.green);
        l4.setFont(new Font("Brush Script m7",Font.BOLD,30));
        window.add(l4);
        TextField f1=new TextField();
        window.add(f1);

        window.setResizable(false);
        window.setVisible(true);


    }
}