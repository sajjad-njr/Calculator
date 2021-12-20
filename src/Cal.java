import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Cal extends JFrame implements ActionListener {

    JPanel panel1,panel2,panel3;
    JTextField tf1;
    JButton btn1,btn2,btn3,btn4,btn5 ,btn6,btn7,btn8,btn9,btn0,btnDot,btnEqual,btnClr ,btnAdd,btnSub,btnDiv,btnMul,btnPercent,btnBack;
    Cal()
    {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400,500);
        setLocationRelativeTo(null);
        setLayout(null);

        Font font = new Font("Arial",Font.BOLD,22);

        Font font2 = new Font("Arial",Font.BOLD,20);

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
        panel2.setLayout(new GridLayout(5,3,2,2));
        add(panel2);


        panel3 = new JPanel();
        panel3.setBounds(300,80,100,380);
        panel3.setLayout(new GridLayout(5,1,3,3));
        panel3.setBackground(Color.LIGHT_GRAY);
        add(panel3);


        btn1 = new JButton("1");btn1.setFont(font); panel2.add(btn1);
       // btn1.setBackground(Color.yellow);
        btn2 = new JButton("2"); btn2.setFont(font); panel2.add(btn2);
        btn3 = new JButton("3"); btn3.setFont(font); panel2.add(btn3);
        btn4 = new JButton("4"); btn4.setFont(font); panel2.add(btn4);
        btn5 = new JButton("5"); btn5.setFont(font); panel2.add(btn5);
        btn6 = new JButton("6"); btn6.setFont(font); panel2.add(btn6);
        btn7 = new JButton("7"); btn7.setFont(font); panel2.add(btn7);
        btn8 = new JButton("8"); btn8.setFont(font); panel2.add(btn8);
        btn9 = new JButton("9"); btn9.setFont(font); panel2.add(btn9);
        btn0 = new JButton("0"); btn0.setFont(font); panel2.add(btn0);

        btnDot     = new JButton("."); btnDot.setFont(font); panel2.add(btnDot);
        btnEqual   = new JButton("="); btnEqual.setFont(font); panel2.add(btnEqual);
        btnPercent = new JButton("%"); btnPercent.setFont(font); panel2.add(btnPercent);
        btnBack    = new JButton("<--"); btnBack.setFont(font);  panel2.add(btnBack);




        btnAdd = new JButton("+"); btnAdd.setFont(font2); panel3.add(btnAdd);
        btnSub = new JButton("-"); btnSub.setFont(font2); panel3.add(btnSub);
        btnMul = new JButton("*"); btnMul.setFont(font2); panel3.add(btnMul);
        btnDiv = new JButton("/"); btnDiv.setFont(font2); panel3.add(btnDiv);
        btnClr = new JButton("C"); btnClr.setFont(font2); panel3.add(btnClr);

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
        btnPercent.addActionListener(this);
        btnBack.addActionListener(this);



        btnAdd.addActionListener(this);
        btnSub.addActionListener(this);
        btnDiv.addActionListener(this);
        btnClr.addActionListener(this);
        btnMul.addActionListener(this);

        setVisible(true);
       // setResizable(false);
    }

    public static void main(String[] args) {

        new Cal();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String textRecive;

        double previousOpreationValue = 0,afterOperationValue = 0;
         int flag = 0;


        if(e.getSource() == btn1)
        {

            tf1.setText(tf1.getText() + btn1.getText()) ;
        }
        else if(e.getSource() == btn2)
        {

            tf1.setText(tf1.getText() +  btn2.getText()) ;
        }
        else if(e.getSource() == btn3)
        {

            tf1.setText(tf1.getText() + btn3.getText()) ;
        }
        else if(e.getSource() == btn4)
        {
            tf1.setText(tf1.getText() +  btn4.getText()) ;
        }
        else if(e.getSource() == btn5)
        {

            tf1.setText(tf1.getText() + btn5.getText()) ;
        }
        else  if(e.getSource() == btn6)
        {

            tf1.setText(tf1.getText() +  btn6.getText()) ;
        }
        else if(e.getSource() == btn7)
        {
            tf1.setText(tf1.getText() + btn7.getText()) ;
        }
        else if(e.getSource() == btn8)
        {
            tf1.setText(tf1.getText() +  btn8.getText()) ;
        }
        else if(e.getSource() == btn9)
        {
            tf1.setText(tf1.getText() +  btn9.getText()) ;
        }
        else if(e.getSource() == btn0)
        {

            tf1.setText( tf1.getText() +  btn0.getText()) ;
        }
        else if(e.getSource() == btnDot)
        {
            tf1.setText(tf1.getText() +  btnDot.getText()) ;
        }



        else if(e.getSource() == btnAdd)
        {
            previousOpreationValue = Double.parseDouble(tf1.getText());
            flag = 1;
            tf1.setText("");


        }
        else if(e.getSource() == btnSub)
        {
            previousOpreationValue = Double.parseDouble(tf1.getText());
            flag = 2;
            tf1.setText("");


        }
        else if(e.getSource() == btnMul)
        {
            previousOpreationValue = Double.parseDouble(tf1.getText());
            flag = 3;
            tf1.setText("");


        }
        else if(e.getSource() == btnDiv)
        {
            previousOpreationValue = Double.parseDouble(tf1.getText());
            flag = 4;
            tf1.setText("");


        }

        else if(e.getSource() == btnClr)
        {

            tf1.setText(null);

        }
        else if(e.getSource() == btnBack)
        {
            int len = tf1.getText().length();
            //int num = tf1.getText().length() - 1;
            int num = tf1.getText().length() - 1;
            String store;

            if(len > 0)
            {
                StringBuilder ba = new StringBuilder(tf1.getText());
                ba.deleteCharAt(num);
                store = ba.toString();
                tf1.setText(store);
            }
        }
        else if(e.getSource() == btnEqual)
        {

        //    tf1.setText("");
            if(flag == 1)
            {
                String s2 = tf1.getText();
                double af  = Double.parseDouble(s2);
                double total = previousOpreationValue + af ;

               // tf1.setText("Flag inside one 1");
                tf1.setText(Double.toString(total));
            }
            else if (flag == 2)
            {
                tf1.setText("Flag 2 here");
            }
            else
            {
                tf1.setText(" Out side on Flag");
            }
        }
    }
}
