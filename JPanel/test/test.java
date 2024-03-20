import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculator extends JFrame {
    JTextField l1;
    JLabel la;
    JButton btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, btn10, btn11, btn12, btn13, btn14, btn15, btn16, btn17, btn18, btn19, btn20, btn21, btn22, btn23, btn24, btn25, btn26, btn27, btn28, btn29, btn30;
    double op1, op2, result;
    String optr;

    public Calculator() {
        setTitle("Calculator");
        setSize(500, 500);
        setLayout(new GridLayout(9, 1));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Font f = new Font("verdana", Font.PLAIN, 24);

        la = new JLabel("Standards");
        la.setFont(f);
        add(la);
        l1 = new JTextField("0");
        l1.setFont(f);
        l1.setEditable(false);
        l1.setHorizontalAlignment(JTextField.RIGHT);
        add(l1);

        btn1 = new JButton("MC");
        btn1.setFont(f);
        btn2 = new JButton("MR");
        btn2.setFont(f);
        btn3 = new JButton("M+");
        btn3.setFont(f);
        btn4 = new JButton("M-");
        btn4.setFont(f);
        btn5 = new JButton("MS");
        btn5.setFont(f);
        btn6 = new JButton("M");
        btn6.setFont(f);
        JPanel p = new JPanel(new GridLayout(1, 6));
        p.add(btn1);
        p.add(btn2);
        p.add(btn3);
        p.add(btn4);
        p.add(btn5);
        p.add(btn6);
        add(p);

        btn7 = new JButton("%");
        btn7.setFont(f);
        btn8 = new JButton("CE");
        btn8.setFont(f);
        btn9 = new JButton("C");
        btn9.setFont(f);
        btn10 = new JButton("CLR");
        btn10.setFont(f);
        JPanel p1 = new JPanel(new GridLayout(1, 4));
        p1.add(btn7);
        p1.add(btn8);
        p1.add(btn9);
        p1.add(btn10);
        add(p1);

        btn11 = new JButton("1/x");
        btn11.setFont(f);
        btn12 = new JButton("sqr");
        btn12.setFont(f);
        btn13 = new JButton("x^2");
        btn13.setFont(f);
        btn14 = new JButton("/");
        btn14.setFont(f);
        JPanel p2 = new JPanel(new GridLayout(1, 4));
        p2.add(btn11);
        p2.add(btn12);
        p2.add(btn13);
        p2.add(btn14);
        add(p2);

        btn15 = new JButton("7");
        btn15.setFont(f);
        btn16 = new JButton("8");
        btn16.setFont(f);
        btn17 = new JButton("9");
        btn17.setFont(f);
        btn18 = new JButton("*");
        btn18.setFont(f);
        JPanel p3 = new JPanel(new GridLayout(1, 4));
        p3.add(btn15);
        p3.add(btn16);
        p3.add(btn17);
        p3.add(btn18);
        add(p3);

        btn19 = new JButton("4");
        btn19.setFont(f);
        btn20 = new JButton("5");
        btn20.setFont(f);
        btn21 = new JButton("6");
        btn21.setFont(f);
        btn22 = new JButton("-");
        btn22.setFont(f);
        JPanel p4 = new JPanel(new GridLayout(1, 4));
        p4.add(btn19);
        p4.add(btn20);
        p4.add(btn21);
        p4.add(btn22);
        add(p4);

        btn23 = new JButton("1");
        btn23.setFont(f);
        btn24 = new JButton("2");
        btn24.setFont(f);
        btn25 = new JButton("3");
        btn25.setFont(f);
        btn26 = new JButton("+");
        btn26.setFont(f);
        JPanel p5 = new JPanel(new GridLayout(1, 4));
        p5.add(btn23);
        p5.add(btn24);
        p5.add(btn25);
        p5.add(btn26);
        add(p5);

        btn27 = new JButton("+/-");
        btn27.setFont(f);
        btn28 = new JButton("0");
        btn28.setFont(f);
        btn29 = new JButton(".");
        btn29.setFont(f);
        btn30 = new JButton("=");
        btn30.setFont(f);
        btn30.setBackground(Color.blue);
        JPanel p6 = new JPanel(new GridLayout(1, 4));
        p6.add(btn27);
        p6.add(btn28);
        p6.add(btn29);
        p6.add(btn30);
        add(p6);

        btn10.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                handleBackspace();
            }
        });
    }

    // Method to handle backspace functionality
    private void handleBackspace() {
        String currentText = l1.getText();
        if (currentText.length() > 1) {
            l1.setText(currentText.substring(0, currentText.length() - 1));
        } else {
            l1.setText("0");
        }
    }

    // ... (Your existing methods)

    public static void main(String[] args) {
        // Create an instance of the Calculator class and make it visible
        Calculator calculator = new Calculator();
        calculator.setVisible(true);
    }
}
