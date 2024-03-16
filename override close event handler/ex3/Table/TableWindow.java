import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.awt.TextField;
import java.awt.Button;
import java.awt.Color;
public class TableWindow extends Frame
{
    TextField n1;
    Label result;
    public TableWindow()
    {
        super("Table");
        setSize(1000,700);

        setLayout(new GridLayout(5,2));
        addWindowListener(new WindowHandler());
        setResizable(false);
        Font f=new Font("verdana",Font.BOLD,40);
        Label l1=new Label("Enter number:");
        l1.setFont(f);
        add(l1);
        n1=new TextField();
        n1.setFont(f);
        add(n1);
        Button table=new Button("Table");
        table.setFont(f);
        add(table);

        Button reset=new Button("Reset");
        reset.setFont(f);
        add(reset);

        Label l2=new Label("Result");
        l2.setFont(f);
        add(l2);
        result=new Label();
        result.setFont(f);
        add(result);

        //register add button for actionListener
        table.addActionListener(new AddButtonHandler());
        //register reset button for actionlistener
        reset.addActionListener(new ResetButtonHandler());

    }

    class WindowHandler implements WindowListener
    {

        @Override
        public void windowOpened(WindowEvent e) {
            }

        @Override
        public void windowClosing(WindowEvent e) {
            System.exit(0);
            }

        @Override
        public void windowClosed(WindowEvent e) {
            }

        @Override
        public void windowIconified(WindowEvent e) {
            }

        @Override
        public void windowDeiconified(WindowEvent e) {
            }

        @Override
        public void windowActivated(WindowEvent e) {
            }

        @Override
        public void windowDeactivated(WindowEvent e) {
            }

    }

    class AddButtonHandler implements ActionListener
    {

        @Override
        public void actionPerformed(ActionEvent e) {
            try{
                String sn1=n1.getText();
                int vn1=Integer.parseInt(sn1);

                for(int i=1;i<=10;i++){
                   // result.setText(result.getText()+vn1+" * "+i+" = "+(vn1*i)+"\n");
    
                    Label tableLine = new Label(vn1+" * "+i+" = "+(vn1*i)+"\n");  
                   add(tableLine);
                }                           
            }catch(NumberFormatException ex){
                result.setText(ex.getMessage());
            }
        }
        
    }

    class ResetButtonHandler implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            n1.setText("0");
            result.setText("0");   
            n1.requestFocus(); 
        }

    }
}
