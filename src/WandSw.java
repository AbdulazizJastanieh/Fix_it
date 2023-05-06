import javax.swing.*;
import java.awt.*;

public class WandSw extends JFrame {

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

    JLabel labeltemp = new JLabel();

    Customer cus;
    Worker wor;

    WandSw(Worker wor){

        this.wor = wor;
        panel.setBounds(0, 0, 150, 125);
        panel.setBackground(new Color(70, 97, 61));
        panel2.setBounds(150,0,550,125);
        panel2.setBackground(new Color(76, 102, 67));

        label.setIcon(icon);
        labeltemp.setText("Wallet");
        labeltemp.setFont(new Font(null,Font.PLAIN,100));
        label.setHorizontalTextPosition(JLabel.LEFT);
        labeltemp.setForeground(new Color(232, 214, 162));


        label2.setText("Your balance:  "+wor.getBalance());
        label2.setBounds(175,200,400,50);
        label2.setFont(new Font(null,Font.PLAIN,30));

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


    }


}
