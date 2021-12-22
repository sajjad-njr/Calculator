import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.math.BigInteger;

import static java.lang.Double.parseDouble;

public class Cal extends JFrame implements ActionListener {

    JPanel panel1,panel2,panel3;
    JTextField tf1;
    JButton btn1,btn2,btn3,btn4,btn5 ,btn6,btn7,btn8,btn9,btn0,btnDot,btnEqual,btnClr ,btnAdd,btnSub,btnDiv,btnMul,btnPercent,btnBack;
    JButton btnSin,btnCos,btnTan,btnSqurt,btnPower,btnLog,btnIn ,Fac;

    String textRecive , powString , FacStr;
    double previousOpreationValue = 0,afterOperationValue = 0 , powerValue = 0;
    int flag = 0;

    Cal()
    {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400,525);
        setLocationRelativeTo(null);
        setLayout(null);

        Font font = new Font("Arial",Font.BOLD,22);
        Font font3 = new Font("Arial",Font.BOLD,30);

        Font font2 = new Font("Arial",Font.BOLD,28);

        panel1 = new JPanel();
        panel1.setBounds(0,0,400,80);
        panel1.setBackground(Color.DARK_GRAY);
        panel1.setLayout(null);
        tf1 = new JTextField();
        tf1.setBounds(10,10,365,60);
        tf1.setFont(font);

        panel1.add(tf1);
        add(panel1);

        panel2 = new JPanel();
        panel2.setBounds(0,85,300,400);
        panel2.setBackground(Color.GRAY);
        panel2.setLayout(null);
        panel2.setLayout(new GridLayout(5,4,3,3));
        add(panel2);


        panel3 = new JPanel();
        panel3.setBounds(300,85,100,400);
        panel3.setLayout(new GridLayout(5,1,3,3));
        panel3.setBackground(Color.LIGHT_GRAY);
        add(panel3);



              // btnPower,btnLog,btnIn;

        btnSin = new JButton("sin");btnSin.setFont(font);panel2.add(btnSin); btnSin.setBackground(Color.BLACK);btnSin.setForeground(Color.white);
        btnCos = new JButton("cos");btnCos.setFont(font);panel2.add(btnCos);btnCos.setBackground(Color.BLACK);btnCos.setForeground(Color.white);
        btnTan = new JButton("tan"); btnTan.setFont(font);panel2.add(btnTan);btnTan.setBackground(Color.BLACK);btnTan.setForeground(Color.white);
        btnBack    = new JButton("<--"); btnBack.setFont(font);  panel2.add(btnBack);btnBack.setBackground(Color.BLACK);btnBack.setForeground(Color.white);
        btnSqurt = new JButton("Sqr");  btnSqurt.setFont(font);panel2.add( btnSqurt);btnSqurt.setBackground(Color.BLACK);btnSqurt.setForeground(Color.white);

        btn1 = new JButton("1");btn1.setFont(font3); panel2.add(btn1); btn1.setBackground(Color.white);

       // btn1.setBackground(Color.yellow);
        btn2 = new JButton("2"); btn2.setFont(font3); panel2.add(btn2); btn2.setBackground(Color.white);
        btn3 = new JButton("3"); btn3.setFont(font3); panel2.add(btn3); btn3.setBackground(Color.white);
        btnPower = new JButton("x^n");   btnPower.setFont(font);panel2.add( btnPower);btnPower.setBackground(Color.BLACK);btnPower.setForeground(Color.white);

        btn4 = new JButton("4"); btn4.setFont(font3); panel2.add(btn4); btn4.setBackground(Color.white);
        btn5 = new JButton("5"); btn5.setFont(font3); panel2.add(btn5); btn5.setBackground(Color.white);
        btn6 = new JButton("6"); btn6.setFont(font3); panel2.add(btn6); btn6.setBackground(Color.white);

        btnLog = new JButton("log");    btnLog.setFont(font);panel2.add(  btnLog);btnLog.setBackground(Color.BLACK);btnLog.setForeground(Color.white);
        btn7 = new JButton("7"); btn7.setFont(font3); panel2.add(btn7); btn7.setBackground(Color.white);
        btn8 = new JButton("8"); btn8.setFont(font3); panel2.add(btn8); btn8.setBackground(Color.white);
        btn9 = new JButton("9"); btn9.setFont(font3); panel2.add(btn9); btn9.setBackground(Color.white);
        btnClr = new JButton("C"); btnClr.setFont(font2); panel2.add(btnClr);btnClr.setBackground(Color.yellow);


        btn0 = new JButton("0"); btn0.setFont(font); panel2.add(btn0);btn0.setBackground(Color.blue);btn0.setForeground(Color.white);

        btnDot     = new JButton("."); btnDot.setFont(font); panel2.add(btnDot);btnDot.setBackground(Color.blue);btnDot.setForeground(Color.white);
        btnEqual   = new JButton("="); btnEqual.setFont(font); panel2.add(btnEqual);btnEqual.setBackground(Color.blue);btnEqual.setForeground(Color.white);





        btnAdd = new JButton("+"); btnAdd.setFont(font2); panel3.add(btnAdd);btnAdd.setBackground(Color.LIGHT_GRAY);
        btnSub = new JButton("-"); btnSub.setFont(font2); panel3.add(btnSub);btnSub.setBackground(Color.green);
        btnMul = new JButton("*"); btnMul.setFont(font2); panel3.add(btnMul);btnMul.setBackground(Color.green);
        btnDiv = new JButton("/"); btnDiv.setFont(font2); panel3.add(btnDiv);btnDiv.setBackground(Color.green);
        btnPercent = new JButton("%"); btnPercent.setFont(font2); panel3.add(btnPercent);btnPercent. setBackground(Color.blue);btnPercent.setForeground(Color.white);
       //   Fac = new JButton("x!"); Fac.setFont(font2);  panel3.add(Fac);Fac.setBackground(Color.LIGHT_GRAY);Fac.setForeground(Color.BLACK);


        tf1.addActionListener(this);
        btn1.addActionListener(this);btn2.addActionListener(this);btn3.addActionListener(this);
        btn4.addActionListener(this);btn5.addActionListener(this);btn6.addActionListener(this);btn7.addActionListener(this);
        btn8.addActionListener(this);btn9.addActionListener(this);btn0.addActionListener(this);btnDot.addActionListener(this);
        btnEqual.addActionListener(this);btnPercent.addActionListener(this);btnBack.addActionListener(this);
        //Fac.addActionListener(this);


        btnAdd.addActionListener(this);btnSub.addActionListener(this);btnDiv.addActionListener(this);
        btnClr.addActionListener(this);btnMul.addActionListener(this);

        btnSin.addActionListener(this);btnCos.addActionListener(this);btnTan.addActionListener(this);
        btnSqurt.addActionListener(this);btnPower.addActionListener(this);btnLog.addActionListener(this);

        setVisible(true);
       // setResizable(false);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if(e.getSource() == btnSin)
        {
            try {
                flag = 12;
                tf1.setText("");
            }catch (Exception e1)
            {
                tf1.setText("    No Insetr Number after operation");
            }
        }
        else if(e.getSource() == btnCos)
        {
            try {
                flag = 13;
                tf1.setText("");
            }catch (Exception e1)
            {
                tf1.setText("    Insetr Number ");
            }
           // tf1.setText(tf1.getText() + btnCos.getText()) ;
        }
        else if(e.getSource() == btnTan)
        {

            try {
                flag = 14;
                tf1.setText("");
            }catch (Exception e1)
            {
                tf1.setText("    Insetr Number");
            }
            //tf1.setText(tf1.getText() + btnTan.getText()) ;
        }
        else if(e.getSource() == btnBack)
        {
           //Idea from JvatT
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
        else if(e.getSource() == btnSqurt)
        {

           // tf1.setText(tf1.getText() + btnSqurt.getText() + " ") ;
            flag = 15;
            tf1.setText("");
        }

        else if(e.getSource() == btnPower)
        {

          //  tf1.setText(tf1.getText() + btnPower.getText()) ;
            powString = tf1.getText();
            powerValue = parseDouble(powString);
            flag = 11;
            tf1.setText("");
        }

        else if(e.getSource() == btn1)
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
        else if (e.getSource() == btnLog)
        {
            flag = 16;
            tf1.setText("");
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
        else if(e.getSource() == btnClr)
        {
            tf1.setText(null);
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
            try {
                previousOpreationValue = parseDouble(tf1.getText());
                flag = 1;
                tf1.setText("");
            }catch (Exception e1)
            {
                tf1.setText("Please insetr Number first");
                //e1.printStackTrace();
            }

        }
        else if(e.getSource() == btnSub)
        {
            try {
                previousOpreationValue = parseDouble(tf1.getText());
                flag = 2;
                tf1.setText("");
            }catch (Exception e1)
            {
                tf1.setText("    Insetr Number first");
                //e1.printStackTrace();
            }
        }
        else if(e.getSource() == btnMul)
        {
            try {
                previousOpreationValue = parseDouble(tf1.getText());
                flag = 3;
                tf1.setText("");
            }catch (Exception e1)
            {
                tf1.setText("    Insetr Number first");
                //e1.printStackTrace();
            }
        }
        else if(e.getSource() == btnDiv)
        {
            try {
                previousOpreationValue = parseDouble(tf1.getText());
                flag = 4;
                tf1.setText("");
            }catch (Exception e1)
            {
                tf1.setText("    Insetr Number first");
                //e1.printStackTrace();
            }

        }
        else if(e.getSource() == btnPercent)
        {
            try {
                previousOpreationValue = parseDouble(tf1.getText());
                previousOpreationValue /= 100;
                flag = 5;
                tf1.setText("");
            }catch (Exception e1)
            {
                tf1.setText("    Insetr Number first");
                //e1.printStackTrace();
            }
        }
        else if(e.getSource() == Fac)
        {
            try {

                FacStr = tf1.getText();
                previousOpreationValue = parseDouble(tf1.getText());
                 flag = 20;
                tf1.setText("");
            }catch (Exception e1)
            {
                tf1.setText("    Insetr Number first");
                //e1.printStackTrace();
            }
        }



        else if(e.getSource() == btnEqual)
        {

        //    tf1.setText("");
            if(flag == 1)
            {
                try {
                    String s2 = tf1.getText();
                    double af  = parseDouble(s2);
                    double total = previousOpreationValue + af ;
                    // tf1.setText("Flag inside one 1");
                    tf1.setText(Double.toString(total));
                }catch (Exception ej)
                {
                    tf1.setText("Nothing insert");
                }
            }
            else if (flag == 2)
            {
                String s2 = tf1.getText();
                double af  = parseDouble(s2);
                double total = previousOpreationValue - af ;
                // tf1.setText("Flag inside one 1");
                tf1.setText(Double.toString(total));
            }
            else if (flag == 3)
            {
                String s2 = tf1.getText();
                double af  = parseDouble(s2);
                double total = previousOpreationValue * af ;
                // tf1.setText("Flag inside one 1");
                tf1.setText(Double.toString(total));
            }
            else if (flag == 4)
            {
                String s2 = tf1.getText();
                double af  = parseDouble(s2);
                double total = previousOpreationValue / af ;
                // tf1.setText("Flag inside one 1");
                tf1.setText(Double.toString(total));
            }
            else if (flag == 5)
            {
                String s2 = tf1.getText();
                if(s2.isEmpty())
                {

                    tf1.setText(Double.toString( previousOpreationValue));
                }
                else
                {
                    double af  = parseDouble(s2);
                    double total = previousOpreationValue / af ;
                    // tf1.setText("Flag inside one 1");
                    tf1.setText(Double.toString(total));
                }

            }


            else if(flag == 11)
            {
                String s2 = tf1.getText();
                double af  = parseDouble(s2);
                double total =  Math.pow(powerValue, af);

                tf1.setText(Double.toString(total));
            }
            else if(flag == 12)
            {
                try {
                    String s2 = tf1.getText();
                    double af  = parseDouble(tf1.getText());
                    double total =  Math.sin(af) ;
                    tf1.setText("sin "+s2+" = "+Double.toString(total));
                }catch (Exception ej)
                {
                    tf1.setText("Nothing insert after Sin press");
                }

            }
            else if(flag == 13)
            {

                try {
                    String s2 = tf1.getText();
                    double af  = parseDouble(tf1.getText());
                    double total =  Math.cos(af) ;

                    tf1.setText("cos "+s2+" = "+Double.toString(total));

                }catch (Exception ej)
                {
                    tf1.setText("Nothing insert after Cos press");
                }

            }
            else if(flag == 14)
            {
                try {
                    String s2 = tf1.getText();
                    double af  = parseDouble(tf1.getText());
                    double total =  Math.tan(af) ;

                    tf1.setText("sin "+s2+" = "+Double.toString(total));

                }catch (Exception ej)
                {
                    tf1.setText("Nothing insert after Tan press");
                }

            }
            else if(flag == 15)
            {

                try {
                    String s2 = tf1.getText();
                    double af  = parseDouble(tf1.getText());
                    double total =  Math.sqrt(af) ;

                    tf1.setText("sqrt"+s2+" = "+Double.toString(total));

                }catch (Exception ej)
                {
                    tf1.setText("Nothing insert after Sqrt press");
                }

            }
            else if(flag == 16)
            {
                try {
                    String s2 = tf1.getText();
                    double af  = parseDouble(tf1.getText());
                    double total =  Math.log(af) ;
                    tf1.setText("log"+s2+" = "+Double.toString(total));
                }catch (Exception ej)
                {
                    tf1.setText("Nothing insert after Sqrt press");
                }

            }
//            else if(flag == 20)
//            {
//                try {
//
//                   doble result2;
//                    public static BigInteger getFactorial(int num) {
//                        BigInteger result = BigInteger.ONE;
//                        for (int i = 1; i <= num; i++)
//                            result = result.multiply(BigInteger.valueOf(i));
//                        //return result;
//
//                        result2 = (doble) result;
//                    }
//
//
//
//
//                    tf1.setText(FacStr+"! = "+BigInteger.toString(result2));
//                }catch (Exception ej)
//                {
//                    tf1.setText("Nothing insert after Sqrt press");
//                }
//            }

            else
            {
                tf1.setText(" Out side on Flag");
            }
        }
    }
    public static void main(String[] args) {

        new Cal();
    }
}
