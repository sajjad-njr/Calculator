import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Cal extends JFrame implements ActionListener {

    JPanel panel1,panel2,panel3;
    JTextField tf1;
    JButton btn1,btn2,btn3,btn4,btn5 ,btn6,btn7,btn8,btn9,btn0,btnDot,btnEqual,btnClr ,btnAdd,btnSub,btnDiv;
    Cal()
    {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400,500);
        setLocationRelativeTo(null);
        setLayout(null);

        Font font = new Font("Arial",Font.BOLD,16);

        panel1 = new JPanel();
        panel1.setBounds(0,0,400,80);
        panel1.setBackground(Color.DARK_GRAY);
        panel1.setLayout(null);
        tf1 = new JTextField();
        tf1.setBounds(10,5,365,70);
        tf1.setFont(font);

        panel1.add(tf1);
        add(panel1);

        panel2 = new JPanel();
        panel2.setBounds(0,80,300,380);
        panel2.setBackground(Color.GRAY);
        panel2.setLayout(null);
        panel2.setLayout(new GridLayout(4,3,2,2));
        add(panel2);


        panel3 = new JPanel();
        panel3.setBounds(300,80,100,380);
        panel3.setLayout(new GridLayout(4,1,1,1));
        panel3.setBackground(Color.LIGHT_GRAY);
        add(panel3);


        btn1 = new JButton("1");btn1.setFont(font); panel2.add(btn1);
        btn2 = new JButton("2");btn2.setFont(font); panel2.add(btn2);
        btn3 = new JButton("3");btn3.setFont(font); panel2.add(btn3);
        btn4 = new JButton("4");btn4.setFont(font); panel2.add(btn4);
        btn5 = new JButton("5");btn5.setFont(font); panel2.add(btn5);
        btn6 = new JButton("6");btn6.setFont(font); panel2.add(btn6);
        btn7 = new JButton("7");btn7.setFont(font); panel2.add(btn7);
        btn8 = new JButton("8");btn8.setFont(font); panel2.add(btn8);
        btn9 = new JButton("9");btn9.setFont(font); panel2.add(btn9);
        btn0 = new JButton("0");btn0.setFont(font); panel2.add(btn0);

        btnDot = new JButton(".");btnDot.setFont(font);panel2.add(btnDot);
        btnEqual = new JButton("=");btnEqual.setFont(font);panel2.add(btnEqual);



        btnAdd = new JButton("+");btnAdd.setFont(font);panel3.add(btnAdd);
        btnSub = new JButton("-");btnSub.setFont(font);panel3.add(btnSub);
        btnDiv = new JButton("/");btnDiv.setFont(font);panel3.add(btnDiv);
        btnClr = new JButton("C");btnClr.setFont(font);panel3.add(btnClr);

        tf1.addActionListener(this);
        btn1.addActionListener(this);
        btn2.addActionListener(this);
        btn3.addActionListener(this);
        btn4.addActionListener(this);
        btn5.addActionListener(this);
        btn6.addActionListener(this);
        btn7.addActionListener(this);
        btn8.addActionListener(this);
        btn9.addActionListener(this);
        btn0.addActionListener(this);
        btnDot.addActionListener(this);
        btnEqual.addActionListener(this);


        btnAdd.addActionListener(this);
        btnSub.addActionListener(this);
        btnDiv.addActionListener(this);
        btnClr.addActionListener(this);

        setVisible(true);
        setResizable(false);
    }

    public static void main(String[] args) {

        new Cal();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String textRecive;

        double previousOpreationValue,afterOperationValue;


        if(e.getSource() == btn1)
        {

            textRecive = tf1.getText() + btn1.getText();

            tf1.setText(textRecive) ;
        }
        if(e.getSource() == btn2)
        {
            textRecive = tf1.getText() +  btn2.getText(); ;

            tf1.setText(textRecive) ;
        }
        if(e.getSource() == btn3)
        {

            textRecive = tf1.getText() + btn3.getText();

            tf1.setText(textRecive) ;
        }
        if(e.getSource() == btn4)
        {
            textRecive = tf1.getText() +  btn4.getText(); ;

            tf1.setText(textRecive) ;
        }
        if(e.getSource() == btn5)
        {

            textRecive = tf1.getText() + btn5.getText();

            tf1.setText(textRecive) ;
        }
        if(e.getSource() == btn6)
        {
            textRecive = tf1.getText() +  btn6.getText(); ;

            tf1.setText(textRecive) ;
        }
        if(e.getSource() == btn7)
        {

            textRecive = tf1.getText() + btn7.getText();

            tf1.setText(textRecive) ;
        }
        if(e.getSource() == btn8)
        {
            textRecive = tf1.getText() +  btn8.getText(); ;

            tf1.setText(textRecive) ;
        }
        if(e.getSource() == btn9)
        {
            textRecive = tf1.getText() +  btn9.getText(); ;

            tf1.setText(textRecive) ;
        }
        if(e.getSource() == btn0)
        {
            textRecive = tf1.getText() +  btn0.getText(); ;

            tf1.setText(textRecive) ;
        }
        if(e.getSource() == btnDot)
        {
            textRecive = tf1.getText() +  btnDot.getText(); ;

            tf1.setText(textRecive) ;
        }



        if(e.getSource() == btnAdd)
        {
//            previousOpreationValue = Double.parseDouble(tf1.getText());
//            tf1.setText("");

        }
        if(e.getSource() == btnSub)
        {
//            previousOpreationValue = Double.parseDouble(tf1.getText());
//            tf1.setText("");

        }
        if(e.getSource() == btnDiv)
        {
//            previousOpreationValue = Double.parseDouble(tf1.getText());
//            tf1.setText("");

        }
        if(e.getSource() == btnClr)
        {

            tf1.setText(null);

        }
    }
}
