

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Cal4 extends JFrame implements ActionListener {
    //JPanel panel1,panel2,panel3;
    Double a,b,c;
    int flag;
  //  JFrame f;
    JTextField txt;
    JButton btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,btn0,btndiv,btnmul,btnsub,btnadd,btnDot,btnEqual,btndel,btnclr;
    Cal4(){
        setTitle("Calculator");
         setSize(350,500);
         setDefaultCloseOperation(3);
         setLayout(null);
        setLocationRelativeTo(null);
        setResizable(false);


        Font font = new Font("Arial",Font.BOLD,30);


        txt = new JTextField();
        txt.setBounds(30,40,280,30);
        txt.setFont(font);
        add(txt);


        btn1 = new JButton("1");
        btn1.setBounds(40,240,50,40);
        btn1.setBackground(Color.BLACK);
        btn1.setForeground(Color.WHITE);
        btn2 = new JButton("2");
        btn2.setBounds(110,240,50,40);
        btn2.setBackground(Color.BLACK);
        btn2.setForeground(Color.WHITE);
        btn3 = new JButton("3");
        btn3.setBounds(180,240,50,40);
        btn3.setBackground(Color.BLACK);
        btn3.setForeground(Color.WHITE);
        btn4 = new JButton("4");
        btn4.setBounds(40,170,50,40);
        btn4.setBackground(Color.BLACK);
        btn4.setForeground(Color.WHITE);
        btn5 = new JButton("5");
        btn5.setBounds(110,170,50,40);
        btn5.setBackground(Color.BLACK);
        btn5.setForeground(Color.WHITE);
        btn6 = new JButton("6");
        btn6.setBounds(180,170,50,40);
        btn6.setBackground(Color.BLACK);
        btn6.setForeground(Color.WHITE);
        btn7 = new JButton("7");
        btn7.setBounds(40,100,50,40);
        btn7.setBackground(Color.BLACK);
        btn7.setForeground(Color.WHITE);
        btn8 = new JButton("8");
        btn8.setBounds(110,100,50,40);
        btn8.setBackground(Color.BLACK);
        btn8.setForeground(Color.WHITE);
        btn9 = new JButton("9");
        btn9.setBounds(180,100,50,40);
        btn9.setBackground(Color.BLACK);
        btn9.setForeground(Color.WHITE);
        btn0 = new JButton("0");
        btn0.setBounds(110,310,50,40);
        btn0.setBackground(Color.BLACK);
        btn0.setForeground(Color.WHITE);

        btndiv = new JButton("/");
        btndiv.setBounds(250,100,50,40);
        btndiv.setBackground(Color.BLACK);
        btndiv.setForeground(Color.WHITE);
        btnmul = new JButton("*");
        btnmul.setBounds(250,170,50,40);
        btnmul.setBackground(Color.BLACK);
        btnmul.setForeground(Color.WHITE);
        btnsub = new JButton("-");
        btnsub.setBounds(250,240,50,40);
        btnsub.setBackground(Color.BLACK);
        btnsub.setForeground(Color.WHITE);
        btnadd = new JButton("+");
        btnadd.setBounds(250,100,50,40);
        btnadd.setBackground(Color.BLACK);
        btnadd.setForeground(Color.WHITE);
        btnDot = new JButton(".");
        btnDot.setBounds(40,310,50,40);
        btnDot.setBackground(Color.BLACK);
        btnDot.setForeground(Color.WHITE);
        btnEqual = new JButton("=");
        btnEqual.setBounds(180,310,50,40);
        btnEqual.setBackground(Color.BLACK);
        btnEqual.setForeground(Color.WHITE);
        btndel = new JButton("Delete");
        btndel.setBounds(60,380,100,40);
        btndel.setBackground(Color.BLACK);
        btndel.setForeground(Color.WHITE);
        btnclr = new JButton("Clear");
        btnclr.setBounds(180,380,100,40);
        btnclr.setBackground(Color.BLACK);
        btnclr.setForeground(Color.WHITE);




        add(btn1);
        add(btn2);
        add(btn3);
        add(btn4);
        add(btn5);
        add(btn6);
        add(btn7);
        add(btn8);
        add(btn9);
        add(btn0);
        add(btndiv);
        add(btnmul);
        add(btnsub);
        add(btnadd);
        add(btnDot);
        add(btnEqual);
        add(btndel);
        add(btnclr);


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
        btndiv.addActionListener(this);
        btnmul.addActionListener(this);
        btnsub.addActionListener(this);
        btnadd.addActionListener(this);
        btnDot.addActionListener(this);
        btnEqual.addActionListener(this);
        btndel.addActionListener(this);
        btnclr.addActionListener(this);




        setVisible(true);
    }
    public void actionPerformed(ActionEvent e){
        try{
            if(e.getSource() == btn1){
                txt.setText(txt.getText()+"1");
            }
            if(e.getSource() == btn2){
                txt.setText(txt.getText()+"2");
            }
            if(e.getSource() == btn3){
                txt.setText(txt.getText()+"3");
            }
            if(e.getSource() == btn4){
                txt.setText(txt.getText()+"4");
            }
            if(e.getSource() == btn5){
                txt.setText(txt.getText()+"5");
            }
            if(e.getSource() == btn6){
                txt.setText(txt.getText()+"6");
            }
            if(e.getSource() == btn7){
                txt.setText(txt.getText()+"7");
            }
            if(e.getSource() == btn8){
                txt.setText(txt.getText()+"8");
            }
            if(e.getSource() == btn9){
                txt.setText(txt.getText()+"9");
            }
            if(e.getSource() == btn0){
                txt.setText(txt.getText()+"0");
            }
            if(e.getSource() == btnDot){
                txt.setText(txt.getText()+".");
            }
            if(e.getSource() == btnadd){
                String s = txt.getText();
                a = Double.parseDouble(s);
                txt.setText(" ");
                flag = 1;
            }
            if(e.getSource() == btnsub){
                String s = txt.getText();
                a = Double.parseDouble(s);
                txt.setText(" ");
                flag = 2;
            }
            if(e.getSource() == btnmul){
                String s = txt.getText();
                a = Double.parseDouble(s);
                txt.setText(" ");
                flag = 3;
            }
            if(e.getSource() == btndiv){
                String s = txt.getText();
                a = Double.parseDouble(s);
                txt.setText(" ");
                flag = 4;
            }
            if(e.getSource() == btnEqual){
                if(flag == 1){
                    String s2 = txt.getText();
                    b = Double.parseDouble(s2);
                    c = a + b;
                    txt.setText(Double.toString(c));
                }
            }
            if(e.getSource() == btnEqual){
                if(flag == 2){
                    String s2 = txt.getText();
                    b = Double.parseDouble(s2);
                    c = a - b;
                    txt.setText(Double.toString(c));
                }
            }
            if(e.getSource() == btnEqual){
                if(flag == 3){
                    String s2 = txt.getText();
                    b = Double.parseDouble(s2);
                    c = a * b;
                    txt.setText(Double.toString(c));
                }
            }
            if(e.getSource() == btnEqual){
                if(flag == 4){
                    String s2 = txt.getText();
                    b = Double.parseDouble(s2);
                    c = a / b;
                    txt.setText(Double.toString(c));
                }
            }
            if(e.getSource() == btnclr){
                txt.setText(" ");
            }
            if(e.getSource() == btndel){
                String s = txt.getText();
                txt.setText(" ");
                for(int i=0; i<s.length()-1; i++){
                    txt.setText(txt.getText()+s.charAt(i));
                }
            }
        } catch(Exception e2){
            txt.setText("Error" +e2);//ata ami andaji likhsi
        }
    }

    public static void main(String[] args) {

        new Cal4();
    }
}