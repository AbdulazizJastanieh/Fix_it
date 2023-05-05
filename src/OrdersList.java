import javax.swing.*;
import java.awt.*;

public class OrdersList extends JFrame {

    JFrame frameorder = new JFrame();
    ImageIcon icon = new ImageIcon("logo2.png");

    JPanel panel = new JPanel();
    JPanel panel2 = new JPanel();

    JLabel label = new JLabel();
    JLabel labeltemp = new JLabel();
    
    OrdersList(){

        label.setIcon(icon);
        label.setHorizontalTextPosition(JLabel.LEFT);
        labeltemp.setText("Orders");
        labeltemp.setFont(new Font(null,Font.PLAIN,100));
        labeltemp.setForeground(new Color(232, 214, 162));


        panel.setBounds(0, 0, 150, 125);
        panel.setBackground(new Color(70, 97, 61));
        panel2.setBounds(150,0,550,125);
        panel2.setBackground(new Color(76, 102, 67));

        frameorder.setLayout(null);
        frameorder.setTitle("Fix it");
        frameorder.setSize(600, 600);
        frameorder.setResizable(false);
        frameorder.setVisible(true);
        frameorder.getContentPane().setBackground(new Color(232, 214, 162));
        frameorder.setIconImage(icon.getImage());
        panel.add(label);
        panel2.add(labeltemp);
        frameorder.add(panel);
        frameorder.add(panel2);
    }

}
