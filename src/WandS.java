import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
//v1
public class WandS extends JFrame implements ActionListener {
    
    //stands for wallet and shop (not real shop just a design)

    JFrame frameWandS = new JFrame();
    ImageIcon icon = new ImageIcon("logo2.png");
    ImageIcon icon2 = new ImageIcon("coins.png");
    ImageIcon icon3 = new ImageIcon("128small.png");
    ImageIcon icon4 = new ImageIcon("128large.png");

    JPanel panel = new JPanel();
    JPanel panel2 = new JPanel();
    JPanel panel3 = new JPanel();
    JPanel panel4 = new JPanel();
    JPanel panel5 = new JPanel();

    JLabel label = new JLabel();
    JLabel label2 = new JLabel();
    JLabel label3 = new JLabel();
    JLabel label4 = new JLabel();
    JLabel label5 = new JLabel();
    JLabel label6 = new JLabel();
    JLabel label7 = new JLabel();
    JLabel label8 = new JLabel();
    JLabel label9 = new JLabel();
    JLabel labeltemp = new JLabel();

    JButton buy1 = new JButton();
    JButton buy2 = new JButton();
    JButton buy3 = new JButton();
    JButton Go = new JButton();
    
    Customer cus;
    Worker wor;
    
    WandS(Customer customer){
        
        this.cus = customer;
        panel.setBounds(0, 0, 150, 125);
        panel.setBackground(new Color(70, 97, 61));
        panel2.setBounds(150,0,550,125);
        panel2.setBackground(new Color(76, 102, 67));

        label.setIcon(icon);
        labeltemp.setText("Wallet");
        labeltemp.setFont(new Font(null,Font.PLAIN,100));
        label.setHorizontalTextPosition(JLabel.LEFT);
        labeltemp.setForeground(new Color(232, 214, 162));


        label2.setText("Your balance:  "+cus.getBalance());
        label2.setBounds(175,200,400,50);
        label2.setFont(new Font(null,Font.PLAIN,30));
        label3.setText("Need more?");
        label3.setBounds(270,350,150,50);
        label3.setFont(new Font(null,Font.PLAIN,20));

        Go.setText("Shop");
        Go.setBackground(new Color(70, 97, 61));
        Go.setForeground(new Color(245, 245, 245));
        Go.setFont(new Font(null,Font.PLAIN,20));
        Go.setBounds(270,400,100,50);
        Go.setFocusable(false);
        Go.addActionListener(this);


        frameWandS.setLayout(null);
        frameWandS.setTitle("Fix it");
        frameWandS.setSize(650, 600);
        frameWandS.setResizable(false);
        frameWandS.setVisible(true);
        frameWandS.getContentPane().setBackground(new Color(232, 214, 162));
        frameWandS.setIconImage(icon.getImage());
        panel.add(label);
        panel2.add(labeltemp);
        frameWandS.add(panel);
        frameWandS.add(panel2);
        frameWandS.add(label2);
        frameWandS.add(label3);
        frameWandS.add(Go);
        
        
        
        
        
        
        
        
    }

    WandS(){

        panel.setBounds(0, 0, 150, 125);
        panel.setBackground(new Color(70, 97, 61));
        panel2.setBounds(150,0,750,125);
        panel2.setBackground(new Color(76, 102, 67));
        panel3.setBounds(50, 175, 200,200);
        panel3.setBackground(new Color(196, 178, 124));
        panel4.setBounds(265, 175, 200,200);
        panel4.setBackground(new Color(196, 178, 124));
        panel5.setBounds(480, 175, 200,200);
        panel5.setBackground(new Color(196, 178, 124));


        label.setIcon(icon);
        labeltemp.setText("Shop");
        labeltemp.setFont(new Font(null,Font.PLAIN,100));
        label.setHorizontalTextPosition(JLabel.LEFT);
        labeltemp.setForeground(new Color(232, 214, 162));
        label4.setIcon(icon3);
        label4.setText("500 COIN");
        label4.setFont(new Font(null,Font.PLAIN,20));
        label4.setVerticalTextPosition(JLabel.BOTTOM);
        label4.setHorizontalTextPosition(JLabel.CENTER);
        label5.setText("9.99$");
        label5.setBounds(110,300,100,200);
        label5.setFont(new Font(null,Font.PLAIN,30));
        label6.setIcon(icon2);
        label6.setText("2500 COIN");
        label6.setFont(new Font(null,Font.PLAIN,20));
        label6.setVerticalTextPosition(JLabel.BOTTOM);
        label6.setHorizontalTextPosition(JLabel.CENTER);
        label7.setText("17.99$");
        label7.setBounds(325,300,100,200);
        label7.setFont(new Font(null,Font.PLAIN,30));
        label8.setIcon(icon4);
        label8.setText("5000 COIN");
        label8.setFont(new Font(null,Font.PLAIN,20));
        label8.setVerticalTextPosition(JLabel.BOTTOM);
        label8.setHorizontalTextPosition(JLabel.CENTER);
        label8.setIconTextGap(11);
        label9.setText("34.99$");
        label9.setBounds(540,300,100,200);
        label9.setFont(new Font(null,Font.PLAIN,30));


        buy1.setBounds(100,450, 100, 50);
        buy1.setText("BUY");
        buy1.setBackground(new Color(70, 97, 61));
        buy1.setForeground(new Color(245, 245, 245));
        buy1.setFocusable(false);
        buy2.setBounds(315,450, 100, 50);
        buy2.setText("BUY");
        buy2.setBackground(new Color(70, 97, 61));
        buy2.setForeground(new Color(245, 245, 245));
        buy2.setFocusable(false);
        buy3.setBounds(530,450, 100, 50);
        buy3.setText("BUY");
        buy3.setBackground(new Color(70, 97, 61));
        buy3.setForeground(new Color(245, 245, 245));
        buy3.setFocusable(false);




        frameWandS.setLayout(null);
        frameWandS.setTitle("Fix it");
        frameWandS.setSize(750, 650);
        frameWandS.setResizable(false);
        frameWandS.setVisible(true);
        frameWandS.getContentPane().setBackground(new Color(232, 214, 162));
        frameWandS.setIconImage(icon.getImage());
        panel.add(label);
        panel2.add(labeltemp);
        panel3.add(label4);
        panel4.add(label6);
        panel5.add(label8);
        frameWandS.add(panel);
        frameWandS.add(panel2);
        frameWandS.add(panel3);
        frameWandS.add(panel4);
        frameWandS.add(panel5);
        frameWandS.add(label5);
        frameWandS.add(label7);
        frameWandS.add(label9);
        frameWandS.add(buy1);
        frameWandS.add(buy2);
        frameWandS.add(buy3);



    }


    @Override
    public void actionPerformed(ActionEvent e) {

        if(e.getSource() == Go){

            new WandS();
        }
    }
}
